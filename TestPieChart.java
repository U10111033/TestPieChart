/**U10111033, Computer science 4, Hsueh_Hsin Lu*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class TestPieChart extends JFrame {
	// set PieChart into TestPieChart
	public TestPieChart(){
		PieChart myPie = new PieChart();
		myPie.setFont(new Font("Courie", Font.BOLD, 16));
		add(myPie);
	}
	
	// main here
	public static void main(String[] args) {
		TestPieChart frame = new TestPieChart();
		frame.setTitle("Test Pie Chart");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}

class PieChart extends JPanel {
	
	
	@Override /** Draw the Fig. */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		final int CENTER = 100;
		final int RADIUS = 300;
		int angle = 0;
		
		// Draw projects
		g.setColor(Color.red);
		g.fillArc(CENTER, CENTER, RADIUS, RADIUS, angle , (int) (360 / 100 * 25));
		g.setColor(Color.black);
		g.drawString("Projects - 20%", 270, 220);
		
		// Draw quizzes
		angle += (int) (360 / 100 * 25);
		g.setColor(Color.blue);
		g.fillArc(CENTER, CENTER, RADIUS, RADIUS, angle , (int) (360 / 100 * 15));
		g.setColor(Color.black);
		g.drawString("Quizzes - 10%", 190, 90);
		
		// Draw mid exam
		angle += (int) (360 / 100 * 15);
		g.setColor(Color.green);
		g.fillArc(CENTER, CENTER, RADIUS, RADIUS, angle , (int) (360 / 100 * 35));
		g.setColor(Color.black);
		g.drawString("Mid exam - 30%", 120, 250);
		
		// Draw final exam
		angle += (int) (360 / 100 * 35);
		g.setColor(Color.orange);
		g.fillArc(CENTER, CENTER, RADIUS, RADIUS, angle , (int) (360 / 100 * 45));
		g.setColor(Color.black);
		g.drawString("Mid exam - 40%", 230, 320);
		
		g.setColor(Color.black);
		g.drawString("U10111033, Computer science 4, Hsueh_Hsin Lu", 70, 20);
	}
}