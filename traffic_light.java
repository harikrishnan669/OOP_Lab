import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class trafficlt extends JPanel implements ActionListener
{
    JRadioButton r1,r2,r3;
    Color red_c,gr_c,yelo_c;
    trafficlt()
    {
        setBounds(0,0,680,450);
        r1=new JRadioButton("Red");
        r2=new JRadioButton("Yellow");
        r3=new JRadioButton("Green");
        add(r1);
        add(r2);
        add(r3);
        ButtonGroup g=new ButtonGroup();
        g.add(r1);
        g.add(r2);
        g.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(r1.isSelected()==true)
        {
            red_c=Color.red;
            yelo_c=getBackground();
            gr_c=getBackground();
        }
        else if(r2.isSelected()==true)
        {
            red_c=getBackground();
            yelo_c=Color.yellow;
            gr_c=getBackground();
        }
        else if(r3.isSelected()==true)
        {
            red_c=getBackground();
            yelo_c=getBackground();
            gr_c=Color.green;
        }
        repaint();
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawRect(320,50,50,50);
        g.drawRect(320,140,50,50);
        g.drawRect(320,230,50,50);
        g.setColor(red_c);
        g.fillRect(320,50,50,50);
        g.setColor(yelo_c);
        g.fillRect(320,140,50,50);
        g.setColor(gr_c);
        g.fillRect(320,230,50,50);
    }
}
public class traffic
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame("Traffic lights");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(680,450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        trafficlt t=new trafficlt();
        f.add(t);
    }
}
