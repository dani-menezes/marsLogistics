package com.github.cloud.common.dao;

import javax.ejb.Stateless;

import com.coffey.architecture.exception.CommonException;
import com.github.cloud.common.AbstractCommonProjectDAO;
import com.github.cloud.common.bean.Package;

@Stateless
public class PackageDAO extends AbstractCommonProjectDAO<Package> {

	/** */
	private static final long serialVersionUID = 1L;

	@Override
	public void delete(Integer arg0) throws CommonException {
	}

	@Override
	protected Class<Package> getEntityClass() {
		return Package.class;
	}

	
}
