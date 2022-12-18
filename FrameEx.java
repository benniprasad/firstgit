import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;


public class FrameEx extends Frame {

  
  
  public static void main(String[] args) {
    FrameEx f=new FrameEx();
    f.setSize(400,200);
    f.setVisible(true);
    f.addWindowListener(new MyListener());

    //setting  a layout
    //CardLayout fl=new CardLayout(CardLayout.CENTER,20,20 );
     //setting layout to the frame 
     //f.setLayout(fl);
     //craet a button 
    f.setBackground( Color.GRAY);
     Button b1=new Button("Red");
     //add this button to frame
     b1.setBackground(Color.RED);
     f.add("1st",b1);

     Button b2=new Button("yellow");
     b2.setBackground(Color.YELLOW);
     f.add(b2,"2nd");
     Button b3=new Button("Green");
     b3.setBackground(Color.green);
     f.add(b3,"3rd");
     Button b4=new Button("Indigo");
     b4.setBackground(Color.MAGENTA);
     f.add(b4,"4th");
     Checkbox c1=new Checkbox("click");
     c1.setBackground(Color.CYAN );
     f.add(c1," 5th");

     //fl.last(f);
  }  
}
class MyListener implements WindowListener{

  @Override
  public void windowOpened(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowClosing(WindowEvent e) {
    // TODO Auto-generated method stub
      System.exit(0);
  }

  @Override
  public void windowClosed(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowIconified(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowDeiconified(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowActivated(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  
}
