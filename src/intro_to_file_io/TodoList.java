package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TodoList implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Task");
	JButton remove = new JButton("Remove Task");
	JButton save = new JButton("Save");
	JButton load = new JButton("Load");
	ArrayList<String> task = new ArrayList<String>();
	int counter = 0;
	
	public static void main(String[] args) {
		TodoList list = new TodoList();
		list.createUI();
	}
	
	public void createUI() {
		panel.add(add);
		panel.add(remove);
		panel.add(save);
		panel.add(load);
		add.addActionListener(this);
		remove.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add) {
			task.add(JOptionPane.showInputDialog("Type in your task"));
			counter++;
		}
		if(e.getSource() == remove) {
			String s = JOptionPane.showInputDialog("What task would you like to remove?");
			int a = -1;
			for(int i = 0; i<counter; i++) {
				if(task.get(i).equalsIgnoreCase(s)) {
					task.remove(i);
					counter--;
					a=i;
					break;
				}
			}
			if(a==-1) {
				JOptionPane.showMessageDialog(null, "There is no task called '" + s + "' on your list.");
			}
		}
		if(e.getSource() == save) {
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/test5.txt");
				for(int i = 0; i<counter; i++) {
					fw.write(task.get(i) + "\n");
				}
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			/*for(int i = 0; i<counter; i++) {
				System.out.println(task.get(i));
			}*/
			
		}
		if(e.getSource() == load) {
			task = new ArrayList<String>();
			counter = 0;
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test6.txt"));
				
				String line = br.readLine();
				while(line != null){
					task.add(line);
					counter++;
					line = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
}
//Copyrights are cool