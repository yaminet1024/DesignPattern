package Experience_1_1;

public class Operation {
	private String operation;
	
	public Operation(String operation) {
		this.operation = operation;
	}
	
	public Father getResult(){
		if(operation.equals("+")){
			return new Add();
		}else if(operation.equals("-")){
			return new Reduce();
		}else if(operation.equals("*")){
			return new Mul();
		}else if(operation.equals("/")){
			return new Div();
		}else{
			System.out.println("符号不正确");
		}
		return null;
	}

}
