package com.study.sharding.pojo;

public class EncryptUser {
	
	private Long userId;
    
    private String userName;
    
    private String userNamePlain;
    
    private String pwd;
    
    private String assistedQueryPwd;
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(final Long userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(final String userName) {
        this.userName = userName;
    }
    
    public String getUserNamePlain() {
        return userNamePlain;
    }
    
    public void setUserNamePlain(final String userNamePlain) {
        this.userNamePlain = userNamePlain;
    }
    
    public String getPwd() {
        return pwd;
    }
    
    public void setPwd(final String pwd) {
        this.pwd = pwd;
    }
    
    public String getAssistedQueryPwd() {
        return assistedQueryPwd;
    }
    
    public void setAssistedQueryPwd(final String assistedQueryPwd) {
        this.assistedQueryPwd = assistedQueryPwd;
    }
    
    @Override
    public String toString() {
        return String.format("user_id: %d, user_name: %s, user_name_plain: %s, pwd: %s, assisted_query_pwd: %s", userId, userName, userNamePlain, pwd, assistedQueryPwd);
    }
}