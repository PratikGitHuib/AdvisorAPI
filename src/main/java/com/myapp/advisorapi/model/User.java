package com.myapp.advisorapi.model;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class User {
    private String userName;
    private String email;
    private String password;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    User user = new User();
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String hashedPassword = passwordEncoder.encode(user.getPassword());
    

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String hashedPassword) {
        this.password = hashedPassword;
    }
    public String getUserName() {
        return userName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    
}
