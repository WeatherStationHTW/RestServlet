import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Test;


@Path("/PushData")
//Dann unter http://localhost:8080/RestFul/Wetter/PushData erreichbar


public class Get {
	
	
	 
	 @POST
	 @Consumes(MediaType.APPLICATION_JSON)
	  public Response getData(WeatherData entity){
		
		String output = entity.getStationid(); 
		 
	  Response response = Response.status(200).entity(output).build();
	  
	  
	  return response;
	 }
	 
}
