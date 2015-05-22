import java.awt.*;

import javax.swing.JFrame;
public class GraphicsChallenge extends Canvas
	{

	public static void main(String[] args)
		{
		 GraphicsChallenge canvas = new GraphicsChallenge();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
	        
	        
	        
		}
	public void paint(Graphics graphics) 
		{
		
        graphics.setColor(Color.green);
        graphics.drawLine(700, 0, 0, 700);
        graphics.drawLine(0, 0, 700, 700);
        
		}
	}
