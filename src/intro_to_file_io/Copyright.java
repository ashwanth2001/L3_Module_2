package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class Copyright {
	public static void main(String[] args) {
		String s = "Copyrights are cool";
		
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/Copyright.java", true);
			fw.write("//"+s);	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/Decrypt.java", true);
			fw.write("//"+s);	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/Encrypt.java", true);
			fw.write("//"+s);	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/IntroToFileIO.java", true);
			fw.write("//"+s);	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/TodoList.java", true);
			fw.write("//"+s);	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//Copyrights are cool