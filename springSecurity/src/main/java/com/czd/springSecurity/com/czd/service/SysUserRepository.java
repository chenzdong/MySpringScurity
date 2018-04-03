package com.czd.springSecurity.com.czd.service;

import com.czd.springSecurity.com.czd.domain.SysRole;
import com.czd.springSecurity.com.czd.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户Repository
 *
 * @author: czd
 * @create: 2018/4/3 10:21
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long>{
    SysUser findByUsername(String username);
}
