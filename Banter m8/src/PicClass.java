import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PicClass extends JFrame
	{
	public static void jOutput()
		{
		final JFrame frame = new JFrame("Pokemon Selector 1");
		frame.setSize(50, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		
		final JLabel words = new JLabel("7");
		
		final JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		frame.add(panel);
		panel.add(words);
		}
	}
