package calculadora;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author X1
 */
public class Calculadora implements WindowListener{

    private Frame f;
    private Panel p;
    private TextField t;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    
    public Calculadora(){
        f=new Frame("Calculadora");
        p=new Panel();
        t=new TextField("0");
        b1=new Button("CE");
        b2=new Button("C");
        b3=new Button("<");
        b4=new Button("/");
        b5=new Button("7");
        b6=new Button("8");
        b7=new Button("9");
        b8=new Button("*");
        b9=new Button("4");
        b10=new Button("5");
        b11=new Button("6");
        b12=new Button("-");
        b13=new Button("1");
        b14=new Button("2");
        b15=new Button("3");
        b16=new Button("+");
        b17=new Button("%");
        b18=new Button("0");
        b19=new Button(".");
        b20=new Button("=");
        
    }
    
    public void launchFrame(){
        f.setSize(200,300);
        f.setBackground(Color.DARK_GRAY);
        
        p.setLayout(new GridLayout(5,4));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        p.add(b19);
        p.add(b20);
        
        f.add(p,BorderLayout.CENTER);
        f.add(t,BorderLayout.NORTH);
        
        f.setVisible(true);
        
        f.addWindowListener(this);
    }
    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    
    public static void main(String[] args) {
        Calculadora e=new Calculadora();
        e.launchFrame();
    }
    
}
