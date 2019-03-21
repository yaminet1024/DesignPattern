package Experience_1_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServerConnection extends ConnectionFather {
	@Override
	Connection link_sql() {
		try {
			Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\projects\\上课实验\\DesignPattern\\src\\Experience_1_3\\sqllite.db");
			System.out.println("连接sqlite数据库成功!");
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
