import javax.swing.*;
public class GUI extends JFrame{
  public GUI(){
  super("Oselog Contest Logger");
  //set look and feel by defaut on GTK+
  try{
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
  }
  catch(Exception e){}
    setSize(1280, 720);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
   }
  
  public static void main(String[] args){
    new GUI();
  }
  
}