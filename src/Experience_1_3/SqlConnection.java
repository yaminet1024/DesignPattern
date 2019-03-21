package Experience_1_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection extends ConnectionFather{

	@Override
	Connection link_sql() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dialog","root","ycp92742520");
			java.sql.Statement stmt = con.createStatement();
			System.out.println("连接MySql数据库成功!");
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
