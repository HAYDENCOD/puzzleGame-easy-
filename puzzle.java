import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class puzzle extends JDialog implements ActionListener {
    private JPanel contentPane;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b7;
    private JButton b5;
    private JButton b6;
    private JButton b8;
    private JButton b9;
    private JButton next;
    public puzzle() {
        JFrame frame = new JFrame();
        frame.setContentPane(contentPane);
        frame.setVisible(true);
        frame.setSize(250,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);
        JOptionPane.showMessageDialog(null,"\\uD83E\\uDD5D");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next){
            String s = b1.getText();
            b1.setText(b9.getText());
            b9.setText(s);
            s = b2.getText();
            b2.setText(b8.getText());
            b8.setText(s);
            s = b3.getText();
            b3.setText(b5.getText());
            b5.setText(s);
            s = b4.getText();
            b4.setText(b6.getText());
            b6.setText(s);
        } else if(e.getSource() == b1){
            String s = b1.getText();
            if(b2.getText() == " "){
                b2.setText(s);
                b1.setText(" ");
            }else if(b4.getText() == " "){
                b4.setText(s);
                b1.setText(" ");
            }
        }
        else if(e.getSource() == b2){
            String s = b2.getText();
            if(b1.getText() == " "){
                b1.setText(s);
                b2.setText(" ");
            }else if(b3.getText() == " "){
                b3.setText(s);
                b2.setText(" ");
            }else if(b5.getText() == " "){
                b5.setText(s);
                b2.setText(" ");
            }
        }
        else if(e.getSource() == b3){
            String s = b3.getText();
            if(b2.getText() == " "){
                b2.setText(s);
                b3.setText(" ");
            }else if(b6.getText() == " "){
                b6.setText(s);
                b3.setText(" ");
            }         }
        else if(e.getSource()== b4){
            String s = b4.getText();
            if(b1.getText() == " "){
                b1.setText(s);
                b4.setText(" ");
            }else if(b5.getText() == " "){
                b5.setText(s);
                b4.setText(" ");
            }else if(b7.getText() == " "){
                b7.setText(s);
                b4.setText(" ");
            }         }
        else if(e.getSource() == b5){
            String s = b5.getText();
            if(b2.getText() == " "){
                b2.setText(s);
                b5.setText(" ");
            }else if(b4.getText() == " "){
                b4.setText(s);
                b5.setText(" ");
            }else if(b6.getText() == " "){
                b6.setText(s);
                b5.setText(" ");
            }else if(b8.getText() == " "){
                b8.setText(s);
                b5.setText(" ");
            }         }
        else if(e.getSource() == b6){
            String s = b6.getText();
            if(b3.getText() == " "){
                b3.setText(s);
                b6.setText(" ");
            }else if(b5.getText() == " "){
                b5.setText(s);
                b6.setText(" ");
            }else if(b9.getText() == " "){
                b9.setText(s);
                b6.setText(" ");
            }         }
        else if(e.getSource() == b7){
            String s = b7.getText();
            if(b4.getText() == " "){
                b4.setText(s);
                b7.setText(" ");
            }else if(b8.getText() == " "){
                b8.setText(s);
                b7.setText(" ");
            }         }
        else if(e.getSource() == b8){
            String s = b8.getText();
            if(b7.getText() == " "){
                b7.setText(s);
                b8.setText(" ");
            }else if(b5.getText() == " "){
                b5.setText(s);
                b8.setText(" ");
            }else if(b9.getText() == " "){
                b9.setText(s);
                b8.setText(" ");
            }         }
        else if(e.getSource() == b9){
            String s = b9.getText();
            if(b6.getText() == " "){
                b6.setText(s);
                b9.setText(" ");
            }else if(b8.getText() == " "){
                b8.setText(s);
                b9.setText(" ");
            }         }
        if(b1.getText() == "1" && b2.getText() == "2" &&
                b3.getText() == "3" && b4.getText() == "4" &&
                b5.getText()== "5"&&b6.getText() == "6"&& b7.getText() == "7"&&b8.getText() == "8"
                &&b9.getText() == " "){
            JOptionPane.showMessageDialog(null,"You Win:");
        }     }
    public static void main(String[] args){
       puzzle pz = new puzzle();
    }
}