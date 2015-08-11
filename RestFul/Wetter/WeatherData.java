import java.time.LocalTime;


public class WeatherData {
	//================================================================================
    // Properties
    //================================================================================
	private String stationid;
	private double stationlong;
	private double stationlat;
	private String sensorid;
	private String sensortype;
	private String timestamp;
	private double value;
	private String unit;
	
	//================================================================================
    // Accessors
    //================================================================================
	
	public void setStationid(String id){
		this.stationid = id;
	}
	public String getStationid(){
		return this.stationid;
	}
	public void setStationlong(Double lng){
		this.stationlong = lng;
	}
	public Double getStationlong(){
		return this.stationlong;
	}
	public void setStationLat(Double lat){
		this.stationlat = lat;
	}
	public Double getStationLat(){
		return this.stationlat;
	}
	public void setSensorid(String id){
		this.sensorid = id;
	}
	public String getSensorid(){
		return this.sensorid;
	}
	public void setSensortype(String type){
		this.sensortype = type;
	}
	public String getSensortype(){
		return this.sensortype;
	}
	public void setTimestamp(String acttime){
		this.timestamp = acttime;
	}
	public String getTimestamp(){
		return this.timestamp;
	}
	public void setValue(Double val){
		this.value = val;
	}
	public Double getValue(){
		return this.value;
	}
	public void setUnit(String uunit){
		this.unit = uunit;
	}
	public String getUnit(){
		return this.unit;
	}
	
	//================================================================================
    // Constructors
    //================================================================================
	public WeatherData() {
	}
	public WeatherData(String id, Double lng, Double lat, String sid, String type, String acttime, Double val, String uunit){
		this.stationid = id;
		this.stationlong = lng;
		this.stationlat = lat;
		this.sensorid = sid;
		this.sensortype = type;
		this.timestamp = acttime;
		this.value = val;
		this.unit = uunit;
	}

}
