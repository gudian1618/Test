package com.github.gudian1618;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @company www.github.com
 * @date 2019/4/15 16:14
 * @description
 *
 *
 */
public class User {
    
    private String username;
    private String password;
    private int age;
    private String sex;
    
    public User() {
        super();
    }
    
    public User(String username, String password, int age, String sex) {
        super();
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
