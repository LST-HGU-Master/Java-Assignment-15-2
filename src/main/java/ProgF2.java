import java.awt.event.*;
import javax.swing.*;
/**
 * クラス ProgF2
 * 
 * @author (あなたの名前)
 * @version (日付)
 */
public class ProgF2 extends JFrame
{
    JTextField txt1, txt2, txt3;
    JButton bt1, bt2;
    JLabel lb1;

    public  ProgF2(String title) {
        super(title);
        int y1 = 20, y3 = 50, txtW = 60, txtH = 20;// 変更しない
        setLayout(null);
        setSize(380,130); // 変更しない
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txt1 = new JTextField(); txt1.setBounds(10 ,y1,txtW,txtH); add(txt1);
        txt2 = new JTextField(); txt2.setBounds(110,y1,txtW,txtH); add(txt2);
        txt3 = new JTextField(); txt3.setBounds(210,y1, 140,txtH); add(txt3);
        lb1  = new JLabel("="); lb1.setBounds(190,y1,30,txtH); add(lb1);

        int btW = 50, btH = 20;
        BtnActionLstn ma = new BtnActionLstn();
        bt1 = new JButton("＋"); bt1.addActionListener(ma);
        bt1.setBounds(20,y3,btW,btH); add(bt1);
        bt2 = new JButton("－"); bt2.addActionListener(ma);
        bt2.setBounds(80,y3,btW,btH); add(bt2);
        setVisible(true); 
    }

    public static void main(String[] args) {
        ProgF2 frm = new ProgF2("電卓0");
    }

    public class BtnActionLstn implements ActionListener {
        public void actionPerformed(ActionEvent e){
            double d1, d2; 
            JButton btn;

            d1 = Double.parseDouble(txt1.getText());
            d2 = Double.parseDouble(txt2.getText());

            btn=(JButton)e.getSource();
            if      (btn == bt1) { txt3.setText("" + (d1 + d2));}
            else if (btn == bt2) { txt3.setText("" + (d1 - d2));}
        }
    }
}