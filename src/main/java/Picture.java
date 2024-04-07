
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ,
 * converted for use with Replit
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class Picture {
  private Square wall;
  private Square door;
  private Square sky;
  private Square grass;
  private Square window;
  private Triangle roof;
  private Triangle tree1;
  private Triangle tree2;
  private Triangle tree3;
  private Triangle tree4;
  private Triangle tree5;
  private Triangle tree6;
  private Triangle tree7;
  private Circle sun;

  /**
   * Constructor for objects of class Picture
   */
  public Picture() {
    // nothing to do... instance variables are automatically set to null
  }

  /**
   * Draw this picture.
   */
  public void draw() {
   
    sky = new Square();
    sky.changeColor("blue");
    sky.changeSize(400);
    sky.moveHorizontal(-70);
    sky.moveVertical(-150);
    sky.makeVisible();

    grass = new Square();
    grass.changeColor("green");
    grass.changeSize(400);
    grass.moveHorizontal(-70);
    grass.moveVertical(150);
    grass.makeVisible();
    
    wall = new Square();
    wall.moveVertical(80);
    wall.changeSize(100);
    wall.makeVisible();

    window = new Square();
    window.changeColor("black");
    window.moveHorizontal(20);
    window.moveVertical(100);
    window.makeVisible();

   

    door = new Square();
    door.changeSize(40);
    door.changeColor("black");
    door.moveHorizontal(20);
    door.moveVertical(100);
    door.makeVisible();

    roof = new Triangle();
    roof.changeColor("yellow");
    roof.changeSize(50, 140);
    roof.moveHorizontal(60);
    roof.moveVertical(70);
    roof.makeVisible();

    sun = new Circle();
    sun.changeColor("yellow");
    sun.moveHorizontal(180);
    sun.moveVertical(-10);
    sun.changeSize(60);
    sun.makeVisible();

    tree1 = new Triangle();
    tree1.changeSize(50, 30);
    tree1.moveHorizontal(180);
    tree1.moveVertical(150);
    tree1.makeVisible();

    tree2 = new Triangle();
    tree2.changeSize(50, 30);
    tree2.moveHorizontal(150);
    tree2.moveVertical(150);
    tree2.makeVisible();

    tree3 = new Triangle();
    tree3.changeSize(50, 30);
    tree3.moveHorizontal(210);
    tree3.moveVertical(150);
    tree3.makeVisible();

    tree4 = new Triangle();
    tree4.changeSize(50, 30);
    tree4.moveHorizontal(120);
    tree4.moveVertical(150);
    tree4.makeVisible();

    tree5 = new Triangle();
    tree5.changeSize(50, 30);
    tree5.moveHorizontal(0);
    tree5.moveVertical(150);
    tree5.makeVisible();

    tree6 = new Triangle();
    tree6.changeSize(50, 30);
    tree6.moveHorizontal(-30);
    tree6.moveVertical(150);
    tree6.makeVisible();

    tree7 = new Triangle();
    tree7.changeSize(50, 30);
    tree7.moveHorizontal(240);
    tree7.moveVertical(150);
    tree7.makeVisible();

    
  }

  /**
   * Change this picture to black/white display
   */
  public void setBlackAndWhite() {
    if (wall != null) // only if it's painted already...
    {
      wall.changeColor("black");
      window.changeColor("white");
      roof.changeColor("black");
      sun.changeColor("white");
    }
  }

  /**
   * Change this picture to use color display
   */
  public void setColor() {
    if (wall != null) // only if it's painted already...
    {
      wall.changeColor("red");
      window.changeColor("black");
      roof.changeColor("green");
      sun.changeColor("yellow");
    }
  }//To finish commit message

}