package com.hiynn.shiro.realm;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.hiynn.shiro.pojo.Permission;
import com.hiynn.shiro.pojo.Role;
import com.hiynn.shiro.pojo.User;
import com.hiynn.shiro.service.UserService;

/**
 * <p>Title: UserRealm </p>
 * <p>Description: 自定义扩展Realm </p>
 * Date: 2017年11月7日 下午4:17:49
 * @author lvjie@hiynn.com
 * @version 1.0 </p> 
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年11月7日         lvjie@hiynn.com         创建文件,实现基本功能
 * 
 * ==========================================================
 */
public class UserRealm extends AuthorizingRealm{
	
	@Autowired
	private UserService userService;

	/**
	 * 授权时调用的方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection paramPrincipalCollection) {
		
		System.out.println("进行授权");
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//从subject中获取用户
		Subject subject = SecurityUtils.getSubject();
		User user = (User) subject.getPrincipal();
		//根据用户去查询用户的角色和权限信息
		List<Role> roles = userService.findRoleByUser(user);
		//向管理器中添加角色和权限信息
		for (Role role : roles) {
			info.addRole(role.getName());
			for (Permission permission : role.getRoles()) {
				info.addStringPermission(permission.getName());
			}
		}
		return info;
	}

	/**
	 * 认证时调用的方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken paramAuthenticationToken)
			throws AuthenticationException {
		
		System.out.println("进行认证。。。。");
		//从token里面取出数据去数据库查询
		UsernamePasswordToken token = (UsernamePasswordToken) paramAuthenticationToken;
		User user = userService.findByUsername(token.getUsername());
		//判断是否能从数据库查询到数据
		if(user != null){
			/**
			 * 参数说明：
			 * 1、表示需要保存到subject里面的数据
			 * 2、把查询到的密码交给shiro去认证
			 * 3、返回realm的名称
			 */
			return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
		}
		return null;
	}

}
