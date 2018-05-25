package com.hiynn.shiro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiynn.shiro.mapper.UserMapper;
import com.hiynn.shiro.pojo.Role;
import com.hiynn.shiro.pojo.User;

/**
 * <p>Title: UserService </p>
 * <p>Description: 操作用户的service </p>
 * Date: 2017年11月7日 下午3:59:34
 * @author lvjie@hiynn.com
 * @version 1.0 </p> 
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年11月7日         lvjie@hiynn.com         创建文件,实现基本功能
 * 
 * ==========================================================
 */
@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * <p>Title: findByUsername </p>
	 * <p>Description: 根据用户名查询用户信息 </p>
	 * @param username
	 * @return
	 */
	public User findByUsername(String username){
		
		User user = null;
		if(!"".equals(username)){
			user = userMapper.findByUsername(username);
		}
		return user;
	}

	/** 
	 * <p>Title: getAll </p>
	 * <p>Description: 查询全部用户 </p>
	 * @return
	 */
	public List<User> getAll() {
		
		return userMapper.getAll();
	}

	/** 
	 * <p>Title: addUser </p>
	 * <p>Description: 增加用户 </p>
	 * @param user
	 */
	public void addUser(User user) {
		
		userMapper.addUser(user);
	}

	/** 
	 * <p>Title: findRoleByUser </p>
	 * <p>Description: 根据用户查询该用户的角色和权限 </p>
	 * @param user
	 * @return
	 */
	public List<Role> findRoleByUser(User user) {
		
		List<Role> roles = userMapper.findRoleByUser(user.getId());
		return roles;
	}
}
