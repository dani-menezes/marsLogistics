package com.github.cloud.common.bean;

import java.util.List;

public class PushPackageDTO {
	
	private Integer vehicleId;
	private List<Package> packageList;
	
	/**
	 * @return the vehicleId
	 */
	public Integer getVehicleId() {
		return vehicleId;
	}
	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	/**
	 * @return the packageList
	 */
	public List<Package> getPackageList() {
		return packageList;
	}
	/**
	 * @param packageList the packageList to set
	 */
	public void setPackageList(List<Package> packageList) {
		this.packageList = packageList;
	}
	
}
