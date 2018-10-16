package calculadora;
import java.awt.*;
import java.awt.event.*;
import java.awt.Label;
/**
 *
 * @author X1
 */
public class Calculadora implements WindowListener{

    private Frame f;
    private Panel p;
    private Label l;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    private double x=0,y=0,z;
    private int aux;
    
    public Calculadora(){
        f=new Frame("Calculadora");
        p=new Panel();
        l=new Label("0",Label.RIGHT);
        
        b1=new Button("CE");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l.setText("0");
            }
        });
        b2=new Button("C");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x=0;
                l.setText("0");
            }
        });
        b3=new Button("±");
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                z=(-1)*Double.parseDouble(l.getText());
                l.setText(""+z);
            }
        });
        b4=new Button("/");
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x=Double.parseDouble(l.getText());
                l.setText("0");
                aux=1;
            }
        });
        b5=new Button("7");
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"7");
            }
        });
        b6=new Button("8");
        b6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"8");
            }
        });
        b7=new Button("9");
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"9");
            }
        });
        b8=new Button("*");
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x=Double.parseDouble(l.getText());
                l.setText("0");
                aux=2;
            }
        });
        b9=new Button("4");
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"4");
            }
        });
        b10=new Button("5");
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"5");
            }
        });
        b11=new Button("6");
        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"6");
            }
        });
        b12=new Button("-");
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x=Double.parseDouble(l.getText());
                l.setText("0");
                aux=3;
            }
        });
        b13=new Button("1");
        b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"1");
            }
        });
        b14=new Button("2");
        b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"2");
            }
        });
        b15=new Button("3");
        b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"3");
            }
        });
        b16=new Button("+");
        b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x=Double.parseDouble(l.getText());
                l.setText("0");
                aux=4;
            }
        });
        b17=new Button("%");
        b17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x=Double.parseDouble(l.getText());
                l.setText("0");
                aux=5;
            }
        });
        b18=new Button("0");
        b18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(l.getText()+"0");
            }
        });
        b19=new Button(".");
        b19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    l.setText(""+l.getText()+".");
            }
        });
        b20=new Button("=");
        b20.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               switch(aux){
                   case 1:
                       y=Double.parseDouble(l.getText());
                       x=x/y;
                       l.setText(""+x);
                       break;
                   case 2:
                       y=Double.parseDouble(l.getText());
                       x=x*y;
                       l.setText(""+x);
                       break;
                   case 3:
                       y=Double.parseDouble(l.getText());
                       x=x-y;
                       l.setText(""+x);
                       break;
                   case 4:
                       y=Double.parseDouble(l.getText());
                       x=x+y;
                       l.setText(""+x);
                       break;
                   case 5:
                       y=Double.parseDouble(l.getText());
                       x=x%y;
                       l.setText(""+x);
                       break;
               }
           }
        });
        
    }
    
    public void launchFrame(){
        f.setSize(200,300);
        f.setBackground(Color.WHITE);
        
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
        f.add(l,BorderLayout.NORTH);
        
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
