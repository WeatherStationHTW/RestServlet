import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/PullData")

public class Pull{
	@Path("GetbyDate/{d}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response PullData(@PathParam("d") String date){
		
		
		
		return null;
		
	}
	
}