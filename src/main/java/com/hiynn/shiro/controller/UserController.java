package com.hiynn.shiro.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hiynn.shiro.pojo.User;
import com.hiynn.shiro.service.UserService;

/**
 * <p>Title: UserController </p>
 * <p>Description: 对用户进行操作的Controller </p>
 * Date: 2017年11月8日 下午3:30:33
 * @author lvjie@hiynn.com
 * @version 1.0 </p> 
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年11月8日         lvjie@hiynn.com         创建文件,实现基本功能
 * 
 * ==========================================================
 */
@Controller
@Transactional
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * <p>Title: getAll </p>
	 * <p>Description: 查询所有用户 </p>
	 * @param model
	 * @return
	 */
	@RequestMapping("/userList")
	public String getAll(Model model){
		
		List<User> users = userService.getAll();
		model.addAttribute("users", users);
		return "userList";
	}
	
	/**
	 * <p>Title: addUser </p>
	 * <p>Description: 添加用户 </p>
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("/userAdd")
	@RequiresPermissions("user:add")	//需要拥有对用户增加的权限
	public String addUser(User user,Model model){

		String message = "添加成功";
		try {
			userService.addUser(user);
		} catch (Exception e) {
			message = "添加失败";
			e.printStackTrace();
		}
		model.addAttribute("message", message);
		return "userAdd";
	}
	
}
