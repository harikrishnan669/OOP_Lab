import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class sample extends JFrame implements ActionListener
{
  JPanel panel;
  JTextField textfield;
  JButton[] numberButtons,functionButtons;
  JButton addButton,subButton,mulButton,divButton;
  JButton delButton,decButton,clrButton,negButton,equButton;

  double num1,num2,result;
  char operator;
  Font myfont=new Font("SansSerif",Font.BOLD,25);

  public sample()
  {
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e)
      {
        System.exit(0);
      }
    }
    );
    this.setLayout(null);
    this.setSize(450,550);
    this.setResizable(false);

    textfield=new JTextField();
    textfield.setBounds(50,25,350,60);
    textfield.setEditable(false);
    textfield.setFont(myfont);

    panel=new JPanel();
    panel.setLayout(new GridLayout(4,4,10,10));
    panel.setBounds(50,100,350,350);
    //panel.setBackground(new Color(3,67,49));

    addButton=new JButton("+");
    subButton=new JButton("-");
    mulButton=new JButton("*");
    divButton=new JButton("/");
    decButton=new JButton(".");
    equButton=new JButton("=");
    clrButton=new JButton("clr");
    delButton=new JButton("del");
    negButton=new JButton("(-)");

    functionButtons=new JButton[9];
    functionButtons[0]=addButton;
    functionButtons[1]=subButton;
    functionButtons[2]=mulButton;
    functionButtons[3]=divButton;
    functionButtons[4]=clrButton;
    functionButtons[5]=decButton;
    functionButtons[6]=delButton;
    functionButtons[7]=equButton;
    functionButtons[8]=negButton;

    for(int i=0 ; i<9 ; i++)
    {
      functionButtons[i].addActionListener(this);
      functionButtons[i].setFocusable(false);
      functionButtons[i].setFont(myfont);
    }

    numberButtons=new JButton[10];
    for(int i=0 ; i<10 ; i++)
    {
      numberButtons[i]=new JButton(String.valueOf(i));
      numberButtons[i].addActionListener(this);
      numberButtons[i].setFont(myfont);
      numberButtons[i].setFocusable(false);
    }

    panel.add(numberButtons[1]);
    panel.add(numberButtons[2]);
    panel.add(numberButtons[3]);
    panel.add(addButton);
    panel.add(numberButtons[4]);
    panel.add(numberButtons[5]);
    panel.add(numberButtons[6]);
    panel.add(subButton);
    panel.add(numberButtons[7]);
    panel.add(numberButtons[8]);
    panel.add(numberButtons[9]);
    panel.add(mulButton);
    panel.add(decButton);
    panel.add(numberButtons[0]);
    panel.add(equButton);
    panel.add(divButton);

    clrButton.setBounds(60,460,110,50);
    delButton.setBounds(170,460,110,50);
    negButton.setBounds(280,460,110,50);

    this.add(clrButton);
    this.add(delButton);
    this.add(negButton);
    this.add(panel);
    this.add(textfield);
    this.setVisible(true);

  }
  public static void main(String[] args)
  {
    sample c=new sample();
  }
  public void actionPerformed(ActionEvent e)
  {
    for(int i=0 ; i<10 ; i++)
    {
      if(e.getSource()==numberButtons[i])
      {
        textfield.setText(textfield.getText().concat(String.valueOf(i)));
      }
    }
    if(e.getSource()==decButton)
    {
      textfield.setText(textfield.getText()+".");
    }
    if(e.getSource()==addButton)
    {
      num1=Double.parseDouble(textfield.getText());
      operator='+';
      textfield.setText("");
    }
    if(e.getSource()==subButton)
    {
      num1=Double.parseDouble(textfield.getText());
      operator='-';
      textfield.setText("");
    }
    if(e.getSource()==mulButton)
    {
      num1=Double.parseDouble(textfield.getText());
      operator='*';
      textfield.setText("");
    }
    if(e.getSource()==divButton)
    {
      num1=Double.parseDouble(textfield.getText());
      operator='/';
      textfield.setText("");
    }
    if(e.getSource()==equButton)
    {
      num2=Double.parseDouble(textfield.getText());
      switch(operator)
      {
        case '+':result=num1+num2;
                  break;
        case '-':result=num1-num2;
                 break;
        case '*':result=num1*num2;
                 break;
        case '/':result=num1/num2;
                 break;
      }
      textfield.setText(String.valueOf(result));
      num1=result;
    }
    if(e.getSource()==negButton)
    {
      double temp=Double.parseDouble(textfield.getText());
      temp*=-1;
      textfield.setText(String.valueOf(temp));
    }
    if(e.getSource()==clrButton)
    {
      textfield.setText("");
    }
    if(e.getSource()==delButton)
    {
      String str=textfield.getText();
      textfield.setText("");
      for(int i=0 ; i<str.length()-1 ; i++)
      {
        textfield.setText(textfield.getText()+str.charAt(i));
      }
    }
  }
}
