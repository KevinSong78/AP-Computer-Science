
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class TreeViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeViewer
{
    private final int WIDTH = 1500;
    private final int HEIGHT = 1200;
    
    private int counter = 20;

    private JPanel panel = new JPanel();
    private JFrame frame = new JFrame();
    
    public static void main(String[] args)
    {
        TreeViewer viewer = new TreeViewer();
    }
    public TreeViewer()
    {
        TreeComponent tree = new TreeComponent(counter);
        panel.add(tree);
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
        
            frame.repaint();
        
    }
    
}










