import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/HalloWelt")
//Dann unter http://localhost:8080/RestFul/Wetter/HalloWelt erreichbar


public class Get {
	static private String name = " John Doe";
	 @GET
	 @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	        + "<body><h1>" + "Hello" + name + "</body></h1>" + "</html> ";
	  }
	 @POST
	 //@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response getUsername(){
		 
		 name = "KlausMeter";
		 
	  Response response = Response.status(200).build();
	  
	  System.out.println(name);
	  return response;
	 }
	 
}
