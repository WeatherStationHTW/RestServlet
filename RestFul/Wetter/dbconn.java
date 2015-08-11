import java.sql.*;
public class dbconn {
	
//Methode zum Schreiben in die Datenbank
public static String SetDBrecord(WeatherData record) throws ClassNotFoundException
	{
		Connection con = null;
		Statement stat = null;
			
		String result = "OK";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wetterstation", "root", "Hendrik1986");
			stat = con.createStatement();
			stat.execute("INSERT INTO Wetterstation.WeatherData VALUES (NULL,'"
																			   +record.getStationid()+"',"
																			   +record.getStationlong()+","
																			   +record.getStationLat()+","
																			   +record.getSensorid()+",'"
																			   +record.getSensortype()+"','"
																			   +record.getTimestamp()+"',"
																			   +record.getValue()+",'"
																			   +record.getUnit()+"')");
			return result;
			}
			
			catch(SQLException e)
			{
					
				result = e.toString();
				return result;
			}

		}
		

	}


