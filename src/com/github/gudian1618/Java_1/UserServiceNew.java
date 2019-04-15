package com.github.gudian1618.Java_1;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @company www.github.com
 * @date 2019/4/15 16:12
 * @description
 *
 *
 */
public class UserServiceNew {
    
    public User Login(String username, String password)throws MyException {
        
        if (!"admin".equals(username)) {
            throw new MyException("用户名错误");
        } else if (!"12345".equals(password)) {
            throw new MyException("密码错误");
        }
        User user = new User("admin", "12345", 18, "男");
        return user;
    }
    
}
