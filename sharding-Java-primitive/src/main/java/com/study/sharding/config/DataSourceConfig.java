package com.study.sharding.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shardingsphere.api.config.sharding.KeyGeneratorConfiguration;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.InlineShardingStrategyConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.StandardShardingStrategyConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DataSourceConfig {

    private static final String HOST = "localhost";
    private static final int PORT = 3306;
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static DataSource createDataSource(final String dataSourceName) {
        DruidDataSource result = new DruidDataSource();
        result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
        result.setUrl(String.format("jdbc:mysql://%s:%s/%s", HOST, PORT, dataSourceName));
        result.setUsername(USER_NAME);
        result.setPassword(PASSWORD);
        return result;
    }

    private static Map<String, DataSource> createDataSourceMap() {
        Map<String, DataSource> result = new HashMap<>();
        result.put("ds0", createDataSource("ds0"));
        result.put("ds1", createDataSource("ds1"));
        return result;
    }

    public static DataSource dataSource() throws SQLException {
        //创建分片规则配置类
        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();

        //创建分表规则配置类
        TableRuleConfiguration tableRuleConfig = new TableRuleConfiguration("user", "ds${0..1}.user${0..1}");

        //创建分布式主键生成配置类
        Properties properties = new Properties();
        properties.setProperty("worker.id", "33");
        KeyGeneratorConfiguration keyGeneratorConfig = new KeyGeneratorConfiguration("SNOWFLAKE", "id", properties);
        tableRuleConfig.setKeyGeneratorConfig(keyGeneratorConfig);
        shardingRuleConfig.getTableRuleConfigs().add(tableRuleConfig);

        //根据性别分库，一共分为 2 个库
        shardingRuleConfig.setDefaultDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("sex", "ds${sex % 2}"));

        //根据用户 ID 分表，一共分为 2 张表
        //shardingRuleConfig.setDefaultTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("id", "user${id % 2}"));
        shardingRuleConfig.setDefaultTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("id", "user${id % 2}"));

        //通过工厂类创建具体的 DataSource
        return ShardingDataSourceFactory.createDataSource(createDataSourceMap(), shardingRuleConfig, new Properties());
    }


}
