package com.github.cloud.common.bean;

import com.coffey.architecture.common.CommonBean;

public class Step implements CommonBean {

	private Integer id;
	private Package package_;
	private Step from;
	private Step to;
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
	 * @return the package_
	 */
	public Package getPackage_() {
		return package_;
	}
	/**
	 * @param package_ the package_ to set
	 */
	public void setPackage_(Package package_) {
		this.package_ = package_;
	}
	/**
	 * @return the from
	 */
	public Step getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(Step from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public Step getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(Step to) {
		this.to = to;
	}
}
