package MyPack;

import javax.swing.*;

class MyguiClass{
	public static void main(String args[])throws Exception{
		JFrame frame = new JFrame("My Frame");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//frame.setLocationRelativeTo();
		System.out.println(frame.getRootPane());
		frame.setVisible(true);
	}
}