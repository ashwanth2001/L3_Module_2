package intro_to_file_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encrypt {
	
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Type in a message to encrypt");
		try {
			FileReader fr = new FileReader("src/intro_to_file_io/test3.txt");
			int c = fr.read();
			while(c != -1){
				System.out.print((int)c);
				c = fr.read();
				
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
