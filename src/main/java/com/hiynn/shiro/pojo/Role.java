package com.hiynn.shiro.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Title: Role
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * Date: 2017年11月8日 上午11:33:05
 * 
 * @author lvjie@hiynn.com
 * @version 1.0
 *          </p>
 *          Significant Modify： Date Author Content
 *          ==========================================================
 *          2017年11月8日 lvjie@hiynn.com 创建文件,实现基本功能
 * 
 *          ==========================================================
 */
public class Role implements Serializable{

	private static final long serialVersionUID = 242934688367926917L;
	
	private Integer id;
	private String name;
	private List<Permission> permissions;
	
	public Role(Integer id, String name, List<Permission> roles) {
		super();
		this.id = id;
		this.name = name;
		this.permissions = roles;
	}

	public Role() {
		super();
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

	public List<Permission> getRoles() {
		return permissions;
	}

	public void setRoles(List<Permission> roles) {
		this.permissions = roles;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", permissions=" + permissions + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((permissions == null) ? 0 : permissions.hashCode());
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
		Role other = (Role) obj;
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
		if (permissions == null) {
			if (other.permissions != null)
				return false;
		} else if (!permissions.equals(other.permissions))
			return false;
		return true;
	}
}
