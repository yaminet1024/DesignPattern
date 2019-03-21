package Experience_1_2;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseLog extends LogFather{
	
	private String url;

	
	@Override
	public String LogView(String text) {
		this.url = text;
		Connection con;
		try {
			con = DriverManager.getConnection(url,"root","ycp92742520");
			java.sql.Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from dialog.log_table");
			StringBuilder stringBuilder = new StringBuilder();
			while (result.next()){
			    stringBuilder.append(result.getString(1));
            }
			return stringBuilder.toString();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
