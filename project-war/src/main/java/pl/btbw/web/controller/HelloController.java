package pl.btbw.web.controller;

import pl.btbw.EjbConfig;
import pl.btbw.TestHelloServiceRemote;
import pl.btbw.web.service.HelperSmallService;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloController {

	@Inject
	private HelperSmallService helperSmallService;

	@EJB(lookup = EjbConfig.TEST_HELLO)
	private TestHelloServiceRemote testHelloServiceRemote;

	@GET
	@Path("/")
	public String doHome() {
		return "-<a href='ejb'>ejb</a><br/>-<a href='inject'>inject</a>";
	}

	@GET
	@Path("/ejb")
	@Produces(MediaType.APPLICATION_JSON)
	public Response doHiEjb() {
		return new Response(testHelloServiceRemote.getSomeText());
	}

	@GET
	@Path("/inject")
	@Produces(MediaType.APPLICATION_JSON)
	public Response doHiInject() {
		return new Response(helperSmallService.getSomeText());
	}
}
