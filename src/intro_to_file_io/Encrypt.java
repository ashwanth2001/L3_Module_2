package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encrypt {
	
	public static void main(String[] args) {
		String fin = "";
		String s = JOptionPane.showInputDialog("Type in a message to be encrypted.");
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			int c1 = c;
			fin+= c1 + " ";
		}
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test3.txt");
			fw.write(fin);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
//Copyrights are cool