package hatebreeder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SaveTo(fileName = "a.txt")
public class TextContainer {
	private String str = "Hello, I'm string!";

	public TextContainer() {
		super();
	}

	public TextContainer(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	@Saver
	public void save(String fileName){
		try(BufferedWriter bw=new BufferedWriter(new
FileWriter(fileName))) {
			bw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
