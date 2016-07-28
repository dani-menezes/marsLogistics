package com.github.cloud.common.bean;

import java.util.List;

import com.coffey.architecture.common.CommonBean;

public class Destiny implements CommonBean{
	
	private Integer id;
	private String name;
	List<Package> packages;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the packages
	 */
	public List<Package> getPackages() {
		return packages;
	}
	/**
	 * @param packages the packages to set
	 */
	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}
	
}
