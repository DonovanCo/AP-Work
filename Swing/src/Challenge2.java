import java.awt.*;

import javax.swing.JFrame;
public class Challenge2 extends Canvas
	{

	public static void main(String[] args)
		{
		Challenge2 canvas = new Challenge2();
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
		 graphics.setColor(Color.blue);
	     graphics.fillRect(10, 10, 800, 100);
		}

	}
