import java.awt.*;

import javax.swing.JFrame;
public class Challenge5 extends Canvas
	{

	public static void main(String[] args)
		{
		Challenge5 canvas = new Challenge5();
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
			graphics.setColor(Color.yellow);
			graphics.fillOval(0, 0, 900, 900);
			graphics.setColor(Color.red);
			graphics.fillRect(150, 150, 100, 100);
			graphics.fillRect(500, 150, 100, 100);
			graphics.setColor(Color.black);
			graphics.fillRect(155, 155, 50, 50);
			graphics.fillRect(505, 155, 50, 50);
			graphics.setColor(Color.green);
			graphics.fillOval(300, 500, 500, 150);
			graphics.setColor(Color.blue);
			graphics.drawOval(0, 0, 900, 900);
			
		}

	}
