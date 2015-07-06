import java.sql.*;
public class dbconn {

	


	
		static Connection con = null;
		static Statement stat = null;
		static ResultSet rs = null; 
		
		//Methode zum Schreiben in die Datenbank
		public static String SetDBrecord(WeatherData record)
		{
			String result = "OK";
			try
			{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wetterstation1", "root", "");
			    stat = con.createStatement();
				rs = null;
				stat.execute("INSERT INTO `Wetterstation1`.`Wetterstation` (`sensorid`, `sensortype`, `stationid`, `stationlat`, `stationlong`, `timestamp`, `unit`, `value`) "
																 + "VALUES (record.getSensorid(),record.getSensortype(),record.getStationid(),record.getStationLat(),record.getStationlong(),record.getTimestamp(),record.getUnit(),record.getValue())");
				return result;
			}
			
			catch(SQLException e)
			{
					
				result = e.toString();
				return result;
			}

		}
		

	}


