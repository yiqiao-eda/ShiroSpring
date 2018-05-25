package com.hiynn.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * <p>Title: IndexController </p>
 * <p>Description: 基础应用的Controller </p>
 * Date: 2017年11月7日 下午3:22:28
 * @author lvjie@hiynn.com
 * @version 1.0 </p> 
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年11月7日         lvjie@hiynn.com         创建文件,实现基本功能
 * 
 * ==========================================================
 */
@Controller
public class IndexController {
	
	/**
	 * <p>Title: index </p>
	 * <p>Description: 初始化首页 </p>
	 * @return
	 */
	@RequestMapping("/index")
	public String index(){
		
		return "login";
	}
	
	
	/**
	 * <p>Title: index </p>
	 * <p>Description: 退出登录 </p>
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(){
		
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "login";
	}
	
	/**
	 * <p>Title: login </p>
	 * <p>Description: 登录 </p>
	 * @param username
	 * @param password
	 * @param model
	 * @return
	 */
	@RequestMapping("/login")
	public String login(String username,String password,boolean rememberMe,Model model){
		
		String message = null;
		//通过shiro进行登录管理
		Subject subject = SecurityUtils.getSubject();
		AuthenticationToken token = new UsernamePasswordToken(username, password,rememberMe);
		try {
			subject.login(token);
			return "success";
		} catch (Exception e) {
			if(e instanceof UnknownAccountException){
				message = "用户名不存在";
			}
			if(e instanceof IncorrectCredentialsException){
				message = "密码错误";
			}
			model.addAttribute("error",message);
			//e.printStackTrace();
			return "login";
		}
	}
}
