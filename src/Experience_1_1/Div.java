package Experience_1_1;

public class Div extends Father {


	
	@Override
	public float getResult(int numberA,int numberB) throws Exception {
		if(numberB == 0){
			System.out.println("除数不能为0");
			throw new Exception();
		}else{
			return numberA/numberB;
		}
	}

}
