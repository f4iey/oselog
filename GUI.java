import javax.swing.*
public class GUI extends JFrame{
  public GUI(){
  //set look and feel by defaut on GTK+
  UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
    super("Oselog Contest Logger");
    setSize(1280, 720);
    setVisible(true);
  
  
}
