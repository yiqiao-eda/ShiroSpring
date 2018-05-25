package com.hiynn.shiro.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Title: User
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * Date: 2017年11月7日 下午4:03:56
 * 
 * @author lvjie@hiynn.com
 * @version 1.0
 *          </p>
 *          Significant Modify： Date Author Content
 *          ==========================================================
 *          2017年11月7日 lvjie@hiynn.com 创建文件,实现基本功能
 * 
 *          ==========================================================
 */
public class User implements Serializable{

	private static final long serialVersionUID = -4052815224293297681L;
	
	private Integer id;
	private String name;
	private String password;
	private List<Role> roles;
	
	public User(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public User(Integer id, String name, String password, List<Role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.roles = roles;
	}

	public User() {
		super();
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		return true;
	}
	
}
