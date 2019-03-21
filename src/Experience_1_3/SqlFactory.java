package Experience_1_3;

public class SqlFactory extends FactoryFather{
	
	@Override
	ConnectionFather createConnection() {
		return new SqlConnection();
	}
	
	@Override
	ControllerFather createController() {
		return new SqlController();
	}

}
