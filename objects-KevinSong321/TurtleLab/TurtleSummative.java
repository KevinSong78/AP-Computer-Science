/* 
 * Kevin Song
 * Summative Turtle Lab
 * 9-4-18
 */
import java.awt.Color;

public class TurtleSummative
{
    public static void makeAwesomeTurtlePattern()
    {
        World myWorld = new World(900,800 );
        Turtle kevin = new Turtle(myWorld);
        Turtle crush = new Turtle(myWorld);
       
        crush.setBodyColor(Color.RED);
        crush.setWidth(100);
        crush.setHeight(100);
        crush.penUp();
        crush.forward(60); // The BIG CRUSH
        
        kevin.penUp();
        kevin.moveTo(10,10); // The teleporting turtle
        kevin.penDown();
        
        kevin.setPenWidth(5);
        kevin.turn(129);
        kevin.setPenColor( Color.BLACK);
        kevin.forward(500);
        kevin.setBodyColor(Color.YELLOW); // The color turtle
        kevin.penUp();
        
        // The lightning turtle
        kevin.penDown();
        kevin.turn(-15);
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(20);
        kevin.penUp();
        kevin.backward(140);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(16);
        kevin.penUp();
        kevin.backward(160);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(16);
        kevin.penUp();
        
        // The other lightning turtle
        kevin.penUp();
        kevin.moveTo(10,10); 
        kevin.penDown();
        
        kevin.turn(8);
        kevin.setPenColor( Color.BLACK);
        kevin.forward(500);
        kevin.setBodyColor(Color.YELLOW); 
        kevin.penUp();
        kevin.turn(14);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.turn(-20);
        kevin.penUp();
        kevin.backward(135);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.turn(-16);
        kevin.penUp();
        kevin.backward(160);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.penUp();
        
        // Replicate code for the second corner
        kevin.penUp();
        kevin.moveTo(890,10); 
        kevin.penDown();
        
        kevin.setPenWidth(5);
        kevin.turn(78);
        kevin.setPenColor( Color.BLACK);
        kevin.forward(500);
        kevin.setBodyColor(Color.YELLOW);
        kevin.penUp();
        
        kevin.penDown();
        kevin.turn(-15);
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(20);
        kevin.penUp();
        kevin.backward(140);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(16);
        kevin.penUp();
        kevin.backward(160);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(16);
        kevin.penUp();
        
        kevin.penUp();
        kevin.moveTo(890,10); 
        kevin.penDown();
        
        kevin.turn(8);
        kevin.setPenColor( Color.BLACK);
        kevin.forward(500);
        kevin.setBodyColor(Color.YELLOW); 
        kevin.penUp();
        kevin.turn(14);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.turn(-20);
        kevin.penUp();
        kevin.backward(135);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.turn(-16);
        kevin.penUp();
        kevin.backward(160);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.penUp();
        
        // Replicate code for 3rd corner
        kevin.penUp();
        kevin.moveTo(10,790); 
        kevin.penDown();
        
        kevin.setPenWidth(5);
        kevin.turn(152);
        kevin.setPenColor( Color.BLACK);
        kevin.forward(580);
        kevin.setBodyColor(Color.YELLOW); 
        kevin.penUp();
        
        kevin.penDown();
        kevin.turn(-15);
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(20);
        kevin.penUp();
        kevin.backward(140);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(16);
        kevin.penUp();
        kevin.backward(160);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(16);
        kevin.penUp();
        
        kevin.penUp();
        kevin.moveTo(10,790); 
        kevin.penDown();
        
        kevin.setPenWidth(5);
        kevin.turn(8);
        kevin.setPenColor( Color.BLACK);
        kevin.forward(580);
        kevin.setBodyColor(Color.YELLOW); 
        kevin.turn(18);
        kevin.penUp();
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.turn(-20);
        kevin.penUp();
        kevin.backward(135);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.turn(-16);
        kevin.penUp();
        kevin.backward(160);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.penUp();
        
        // Replicate code for corner 4
        kevin.penUp();
        kevin.moveTo(890,790); 
        kevin.penDown();
        
        kevin.setPenWidth(5);
        kevin.turn(-117);
        kevin.setPenColor( Color.BLACK);
        kevin.forward(580);
        kevin.setBodyColor(Color.YELLOW); 
        kevin.penUp();
        
        kevin.penDown();
        kevin.turn(-15);
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(20);
        kevin.penUp();
        kevin.backward(140);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(16);
        kevin.penUp();
        kevin.backward(160);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(65);
        kevin.forward(30);
        kevin.turn(105);
        kevin.forward(70);
        kevin.turn(-165);
        kevin.forward(95);
        kevin.turn(-115);
        kevin.forward(35);
        kevin.turn(95);
        kevin.forward(65);
        kevin.turn(16);
        kevin.penUp();
        
        kevin.penUp();
        kevin.moveTo(890,790); 
        kevin.penDown();
        
        kevin.setPenWidth(5);
        kevin.turn(8);
        kevin.setPenColor( Color.BLACK);
        kevin.forward(580);
        kevin.setBodyColor(Color.YELLOW);
        kevin.turn(18);
        kevin.penUp();
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.turn(-20);
        kevin.penUp();
        kevin.backward(135);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.turn(-16);
        kevin.penUp();
        kevin.backward(160);
        
        kevin.penDown();
        kevin.backward(80);
        kevin.turn(-65);
        kevin.forward(30);
        kevin.turn(-105);
        kevin.forward(70);
        kevin.turn(165);
        kevin.forward(95);
        kevin.turn(115);
        kevin.forward(35);
        kevin.turn(-95);
        kevin.forward(65);
        kevin.penUp();
        
        kevin.hide();
        
        int count = 1; // CHARGING THE TURTLE
        while (count < 6000013) { 
            crush.turn(10);
            count += 1;
        }
    }
}