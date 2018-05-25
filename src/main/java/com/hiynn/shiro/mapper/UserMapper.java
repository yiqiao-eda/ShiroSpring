package com.hiynn.shiro.mapper;

import java.util.List;

import com.hiynn.shiro.pojo.Role;
import com.hiynn.shiro.pojo.User;

/**
 * <p>Title: UserMapper </p>
 * <p>Description: 操作用户的Mapper </p>
 * Date: 2017年11月8日 下午3:13:00
 * @author lvjie@hiynn.com
 * @version 1.0 </p> 
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年11月8日         lvjie@hiynn.com         创建文件,实现基本功能
 * 
 * ==========================================================
 */
public interface UserMapper {

	//查询全部用户
	public List<User> getAll();

	//根据用户名查询用户
	public User findByUsername(String username);

	//添加用户
	public void addUser(User user);

	//根据用户ID查询用户角色
	public List<Role> findRoleByUser(Integer id);

}
