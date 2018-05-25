package com.hiynn.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

/**
 * <p>Title: CustomRolesAuthorizationFilter </p>
 * <p>Description: TODO </p>
 * Date: 2017年12月19日 下午9:03:46
 * @author lvjie@hiynn.com
 * @version 1.0 </p> 
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年12月19日         lvjie@hiynn.com         创建文件,实现基本功能
 * 
 * ==========================================================
 */
public class CustomRolesAuthorizationFilter extends AuthorizationFilter {

	
	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		
		Subject subject = getSubject(request, response);
		String[] roles = (String[]) mappedValue;
		if(null == roles || roles.length == 0){		//如果没有指定角色，则放行
			return true;
		}
		for (String role : roles) {
			if(subject.hasRole(role)){				//只要包含指定角色的一个则放行
				return true;
			}
		}
		return false;
	}

}
