import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.TextArea;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.*;

public class ez { 
    public static void main(String[] args) {
 
    try {  Frame frame = new Frame("Example Frame");

 
  // Create a component to add to the frame; in this case a text area with sample text
 
  Component textArea = new TextArea();
 
  // Add the components to the frame; by default, the frame has a border layout
 
  frame.add(textArea, BorderLayout.CENTER);
 
  // Show the frame
 
  int width = 25;
 
  int height = 25;
 
  frame.setSize(width, height);
 
  frame.setVisible(true);
  

 
  Robot robot = new Robot(); 

  robot.delay(2000);
  //click ethnicity 
  click(340,620);

  robot.delay(500); 

  click(250,390); 

  robot.delay(500); 

  //click language 

  click(340,720); 

  robot.delay(500); 

  click(260,380);

  robot.delay(500); 

  //generate ID 
  click(920,290); 
  
  

  click(240,670);

  

  paste();
  
  robot.delay(1000); 
  //make self 

  click(930,870); 

  robot.delay(2000); 

  click(800,790);
  
  robot.delay(2500); 

  //chart face and inactive 

  click(300,170); 

  robot.delay(1000); 

  click(930,766); 

  robot.delay(1000); 

  click(250,420);

  robot.delay(1000); 

  click(250,180); 
  
  System.exit(0);


  System.out.println("do it again");





}catch (AWTException e) {
 
    System.out.println("Low level input control is not allowed " + e.getMessage());
    
            }
        }
      public static void click(int x, int y) throws AWTException{
        Robot bot = new Robot();
        bot.mouseMove(x, y);    
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
     public static void click2(int x, int y) throws AWTException{
        Robot bot = new Robot();
        bot.mouseMove(x, y);    
        bot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
    }
     public static void paste() throws AWTException{
         Robot bot = new Robot(); 
         bot.keyPress(KeyEvent.VK_H);
         bot.keyRelease(KeyEvent.VK_H);
         bot.keyPress(KeyEvent.VK_U);
         bot.keyRelease(KeyEvent.VK_U);
         bot.keyPress(KeyEvent.VK_M);
         bot.keyRelease(KeyEvent.VK_M);
         bot.keyPress(KeyEvent.VK_A);
         bot.keyRelease(KeyEvent.VK_A);
         bot.keyPress(KeyEvent.VK_N);
         bot.keyRelease(KeyEvent.VK_N);
    
      }
    }

	