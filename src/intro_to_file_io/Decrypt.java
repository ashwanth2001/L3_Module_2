package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Decrypt {
	
	public static void main(String[] args) {
		String fin = "";
		int a = 0;
		int num = 0;
		String s = JOptionPane.showInputDialog("Type in a message to be decrypted.");
		
			for(int j = 0; j<s.length(); j++) {
				if(s.charAt(j)!= ' ') {
					a += (s.charAt(j)-48)*(Math.pow(10, num));
					num++;
				}
				else {
					a = Reverse(a);
					if(num>=2&&a<10) {
						a*=10;
					}
					if(num>=3&&a<100) {
						a*=10;
					}
					char c = (char)a;
					fin += c;
					num = 0;
					a = 0;
				}
			}
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test4.txt");
			fw.write(fin);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int Reverse(int value) {
	    int resultNumber = 0;
	    for (int i = value; i !=0; i /= 10) {
	        resultNumber = resultNumber * 10 + i % 10;
	    }
	    return resultNumber;        
	}
	
}
