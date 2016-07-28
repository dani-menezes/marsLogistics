package com.github.cloud.common.dao;

import javax.ejb.Stateless;

import com.coffey.architecture.exception.CommonException;
import com.github.cloud.common.AbstractCommonProjectDAO;
import com.github.cloud.common.bean.Destiny;

@Stateless
public class DestinyDAO extends AbstractCommonProjectDAO<Destiny> {

	/** */
	private static final long serialVersionUID = 1L;

	@Override
	public void delete(Integer arg0) throws CommonException {
	}

	@Override
	protected Class<Destiny> getEntityClass() {
		return Destiny.class;
	}

	
}
