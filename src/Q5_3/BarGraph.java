package Q5_3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BarGraph  extends JPanel {
	private static int redWidth,yellowWidth,blueWidth;

	public BarGraph(){
		//		// TODO Auto-generated constructor stub		
		JTextField textfield1 = new JTextField("0");	
		JTextField textfield2 = new JTextField("0");
		JTextField textfield3 = new JTextField("0");


		setLayout(null);

		textfield1.setBounds(325,0,40,40);
		textfield2.setBounds(325, 40, 40, 40);
		textfield3.setBounds(325, 80, 40, 40);

		add(textfield1);
		add(textfield2);
		add(textfield3);

		KeyListener check = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent event) {
				//				// TODO Auto-generated method stub
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub				
			}

			@Override
			public void keyReleased(KeyEvent event) {
				// TODO Auto-generated method stub
				int redNumber = 0, yellowNumber = 0, blueNumber = 0;
				try {
					redNumber = Integer.parseInt(textfield1.getText());				
					yellowNumber = Integer.parseInt(textfield2.getText());
					blueNumber = Integer.parseInt(textfield3.getText());
				} catch (NumberFormatException e) {
					System.out.println("invalid value");					
				}

				//				if(redNumber >= 0 && yellowNumber >= 0 && blueNumber >= 0) {
				//					if(redNumber <= 100 && yellowNumber <= 100 && blueNumber <= 100) {
				//						redWidth = redNumber*3;					 
				//						yellowWidth = yellowNumber*3;
				//						blueWidth = blueNumber*3;
				//		                 
				//		                
				//		            }
				//				}else {
				//					redWidth = 0;					 
				//					yellowWidth = 0;
				//					blueWidth = 0;
				//					
				//				}
				//				repaint();							
				if(redNumber < 0 ) {
					redWidth = 0;
				}
				if(yellowNumber < 0 ) {
					yellowWidth = 0;
				}
				if(blueNumber < 0 ) {
					blueWidth = 0;
				}
				if(redNumber >= 0 && redNumber <= 100) {
					redWidth = redNumber;	
				}else if(redNumber > 100) {
					redWidth = 100;
				}
				if(yellowNumber >= 0 && yellowNumber <= 100) {
					yellowWidth = yellowNumber;
				}else if(yellowNumber > 100) {
					yellowWidth = 100;
				}
				if(blueNumber >= 0 && blueNumber <= 100) {
					blueWidth = blueNumber;
				}else if(blueNumber > 100) {
					blueWidth = 100;
				}			

				repaint();
			}
		};

		textfield1.addKeyListener(check);
		textfield2.addKeyListener(check);
		textfield3.addKeyListener(check);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//adding the bar chart with specified colour
		g.setColor(Color.RED);
		g.fillRect(10, 5, redWidth*3, 30);

		g.setColor(Color.YELLOW);
		g.fillRect(10, 45, yellowWidth*3, 30);

		g.setColor(Color.BLUE);
		g.fillRect(10, 85, blueWidth*3, 30);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BarGraph graph = new BarGraph();
		JFrame graphBox = new JFrame("Bar Graph");
		JLabel showPlease = new JLabel("Keep numbers in [0-100]");

		graphBox.add(graph, BorderLayout.CENTER);
		graphBox.add(showPlease, BorderLayout.PAGE_START);

		graphBox.setSize(400,180);
		graphBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		graphBox.setVisible(true);

	}

}
