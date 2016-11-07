import java.awt.*;
import javax.swing.*;
 
public class CirclePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	//=========================================== constructor
    public CirclePanel() {
        setPreferredSize(new Dimension(100, 100));
        setBackground(Color.red);
    }//end constructor
 
    //=========================================== paintComponent
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Try drawing some example circles.
        drawCircle(g, 30, 30, 20); // center (30,30) r=20
        drawCircle(g, 30, 30, 15); // center (30,30) r=15
        drawCircle(g, 30, 30, 10); // center (30,30) r=10
        drawCircle(g, 80, 70, 5);  // center (80,70) r=5
    }//end paintComponent
 
    //========================================== drawCircle
    // Convenience method to draw from center with radius
    public void drawCircle(Graphics cg, int xCenter, int yCenter, int r) {
        cg.drawOval(xCenter-r, yCenter-r, 2*r, 2*r);
    }//end drawCircle
} // end class CirclePanel