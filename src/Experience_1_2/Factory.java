package Experience_1_2;

public class Factory {
	
	private String text;
	
	public Factory(String text) {
		this.text = text;
	}
	
	public LogFather getLog(){
		if(text.contains("jdbc:mysql")){
			return new DatabaseLog();
		}else if(text.contains(":\\")){
			return new FileLog();
		}else{
			System.out.println("读取mysql日志成功");
			return null;
		}
	}

}
