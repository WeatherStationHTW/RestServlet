import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/PushData")
//Dann unter http://localhost:8080/RestFul/Wetter/PushData erreichbar

public class Get {
	
	 private Gson gson;
	 @POST
	 @Consumes(MediaType.APPLICATION_JSON)
	  public Response getData(String entity){
		
		 gson = new Gson();
		 WeatherData wd = gson.fromJson(entity, WeatherData.class);
		 String output="";
		try 
		{
			output = dbconn.SetDBrecord(wd);
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		 Response response = Response.status(200).entity(output).build();
		 return response;
	 }
	 
}

