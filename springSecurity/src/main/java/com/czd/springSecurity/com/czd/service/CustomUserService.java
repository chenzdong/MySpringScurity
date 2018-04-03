package com.czd.springSecurity.com.czd.service;

import com.czd.springSecurity.com.czd.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 自定义用户service
 *
 * @author: czd
 * @create: 2018/4/3 10:24
 */
public class CustomUserService implements UserDetailsService {
    @Autowired
    SysUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user =userRepository.findByUsername(username);
        if(user == null){
            throw  new UsernameNotFoundException("用户不存在");
        }
        System.out.println("username:"+username);
        System.out.println("username:"+user.getUsername()+" password:"+user.getPassword());
        return user;
    }
}
