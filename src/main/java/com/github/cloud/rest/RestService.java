package com.github.cloud.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import com.github.cloud.common.bean.PushPackageDTO;

/**
 * [FACADE] Expõe a interface externa para acesso aos serviços REST
 * @author Daniel Menezes <tt>daniel.menezes@coffey.com</tt>
 */
@Path("/service")
public class RestService extends Application {
	
	@GET
	@Path("testCall")
	public Response testCall() {
		System.out.println("Chamou");
		return Response.ok().entity("Chamda realizada com sucesso").build();
	}
	
	
	@GET
	@Path("getPackage")
	public Response getPackage(Integer idPackage) {
		try {
			
			Response.ok().entity("").build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.serverError().build();
	}
	
	@POST
	@Path("addPackage")
	@Consumes("application/json")
	//@Produces("application/json")
	public Response addPackage(PushPackageDTO dto) {
		try {
			
			Response.ok().entity("").build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.serverError().build();
	}
	
}
