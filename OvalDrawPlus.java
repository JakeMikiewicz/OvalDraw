// Author: Jake Mikiewicz
// Note:   Drawing an oval in a brown-ish color.

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container; 
import java.awt.Color;

// This created the Oval class
class Oval extends JPanel {
    private Color myColor;
    private Color background;
    public void setColor(int red, int green, int blue) {
        myColor = new Color(red,green,blue);
    }

    public Color getColor() {
        return myColor;
    }

    Oval() {
        setColor(255,0,0);
    }

    Oval(int red, int green, int blue) {
        setColor(red,green,blue);
        setBackground(Color.blue);       
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(myColor);
        g.fillOval(0,0,panelWidth,panelHeight);
    }
}

// Creates new frame for oval
class OvalFrame extends JFrame {
    OvalFrame() {
        setTitle("OvalDrawPlus");
        setBounds(250,150,400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Closing OvalDrawPlus...");

        Oval myOval = new Oval(200,200,50);
        Container contentPane = getContentPane();
        contentPane.add(myOval);     
    }
}


// Draws the actual oval
public class OvalDrawPlus {
    public static void main(String[] args) {
        System.out.println("Starting OvalDrawPlus...");
		OvalFrame myFrame = new OvalFrame();

		myFrame.setVisible(true);
		// Note that if setVisible is called from the constructor, the oval will
		// not draw initially on MacOS.
    }
}