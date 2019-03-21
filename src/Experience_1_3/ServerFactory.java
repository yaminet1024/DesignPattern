package Experience_1_3;

public class ServerFactory extends FactoryFather{
	@Override
	ConnectionFather createConnection() {
		return new ServerConnection();
	}
	
	@Override
	ControllerFather createController() {
		return new ServerController();
	}

}
