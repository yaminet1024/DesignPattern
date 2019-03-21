package Experience_1_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class FileLog extends LogFather{
	
	private File file;
	

	
	
	@Override
	public String LogView(String text) {
		this.file = new File(text);
		System.out.println("开始读取文本日志");
		String encoding = "UTF-8";	
		Long fileLength = file.length();
		byte[] fliecontent = new byte[fileLength.intValue()];
		try {
			FileInputStream in = new FileInputStream(file);
			in.read(fliecontent);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			return new String(fliecontent,encoding);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

}
