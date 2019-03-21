package Experience_1_3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServerController extends ControllerFather{

	@Override
	String execute(String text) {
		Connection connection = new ServerConnection().link_sql();
		try {
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery(text);
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
