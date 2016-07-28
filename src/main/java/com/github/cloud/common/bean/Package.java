package com.github.cloud.common.bean;


//@Entity("package")
public class Package {
	
	private Integer id;
	private Double weight;
	
	/**
	 * Constructor default
	 */
	public Package() {}

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
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
}
