package com.github.cloud.common.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.coffey.architecture.exception.CommonException;
import com.github.cloud.common.bean.Destiny;
import com.github.cloud.common.bean.Package;
import com.github.cloud.common.bean.PushPackageDTO;
import com.github.cloud.common.dao.DestinyDAO;
import com.github.cloud.common.dao.PackageDAO;

@Stateless
public class PackageBusiness {
	
	@EJB
	private PackageDAO packageDAO;
	@EJB
	private DestinyDAO destinyDAO;
	
	
	/**
	 * Persiste a lista de pacotes e adiciona ao {@link Destiny} 
	 * @param pushPackageDTO
	 */
	public void pushPackage(PushPackageDTO pushPackageDTO) {
		try {
			Integer vehicleId = pushPackageDTO.getVehicleId();
			Destiny destiny = destinyDAO.findById(vehicleId);
			if (destiny == null) {
				destiny = new Destiny();
				List<Package> packageList = new ArrayList<Package>();
				destiny.setPackages(packageList);
			}
			List<Package> list = pushPackageDTO.getPackageList();
			for (Package pack : list) {
				packageDAO.saveOrUpdate(pack);
			}
			destiny.setPackages(list);
			destinyDAO.saveOrUpdate(destiny);
		}catch (CommonException e ) {
			e.printStackTrace();
		}
	}
}
