import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 <applet code="UserInText" width=500 height=500>
 </applet>
 */
public class UserInText extends Frame implements ActionListener{
    TextField t1,t2;
    Button b1;
    String s1=" ";
    String s2=" ";
    @Override
    public void init(){
        Label namep=new Label("Name",Label.RIGHT);
        t1=new TextField(12);
        Label addep=new Label("Adress",Label.RIGHT);
        t1=new TextField(8);
        b1=new Button("CLEAR");
        add(namep);
        add(t1);
        add(addep);
        add(t2);
        add(b1);
        t1.addActionListener(this);
        t2.addActionListener(this);
        b1.addActionListener(this);
    }
    @Override
public void actionPerformed(ActionEvent ae){
    String str=ae.getActionCommand();
    s1=t1.getText();
    s2=t2.getText();
    s1="NAME IS:"+t1.getText()+"Length"+s1.length();
    s2="ADDRESS IS:"+t2.getText()+"Length"+s2.length();
    if(str.equals("CLEAR")){
        t1.setText(" ");
        t2.setText(" ");
        s1=" ";
        s2=" ";

    }
repaint();

}
@Override
public void paint(Graphics g){
    g.drawString("INPUT IN EACH BOX", 10, 50);
    g.drawString(s1,10,75);
    g.drawString(s2,10,100);

}
}

