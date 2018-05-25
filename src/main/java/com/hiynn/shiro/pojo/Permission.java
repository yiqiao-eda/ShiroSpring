package com.hiynn.shiro.pojo;

import java.io.Serializable;

/**
 * <p>Title: Permissio</p>
 * <p>Description: TODO</p>
 * Date: 2017年11月8日 上午11:32:53 
 * @author lvjie@hiynn.com
 * @version 1.0</p>
 *Significant Modify： Date Author Content
 *==========================================================
 *2017年11月8日 lvjie@hiynn.com 创建文件,实现基本功能
 * 
 *==========================================================
 */
public class Permission implements Serializable{

	private static final long serialVersionUID = -97482807497357290L;
	
	private Integer id;
	private String name;
	
	public Permission(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Permission() {
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

	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Permission other = (Permission) obj;
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
		return true;
	}

}
