import java.awt.*;

import javax.swing.JFrame;
public class Challenge4 extends Canvas
	{

	public static void main(String[] args)
		{
		Challenge4 canvas = new Challenge4();
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
		graphics.drawRect(800, 800, 100, 100);
		graphics.setColor(Color.yellow);
		graphics.fillRect(801, 801, 99, 99);
		}

	}
