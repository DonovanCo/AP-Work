import java.awt.*;

import javax.swing.JFrame;
public class Challenge3 extends Canvas
	{

	public static void main(String[] args)
		{
		Challenge3 canvas = new Challenge3();
        JFrame frame = new JFrame();
        frame.setSize(260, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas).setBackground(Color.white);
        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
        frame.setResizable(false);
        frame.setVisible(true);

		}
	public void paint(Graphics graphics)
		{
		graphics.setColor(Color.red);
        graphics.drawRect(0, 0, 250, 250);
		}

	}
