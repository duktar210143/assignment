package Assignment1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    JLabel first_num, second_num;
    JTextField first1,second1;
    JButton Result;
    JMenuBar menuBar;
    JButton result,back;
    View(){
        first_num = new JLabel("First_number");
        first_num.setBounds(50,50,100,30);
        first_num.setFont(new Font("Aeriel",Font.BOLD,13));
        add(first_num);

        first1 = new JTextField();
        first1.setBounds(170,50,100,30);
        add(first1);

        second_num = new JLabel("Second_number");
        second_num.setBounds(50,90,120,30);
        second_num.setFont(new Font("Aeriel",Font.BOLD,13));
        add(second_num);

        second1 = new JTextField();
        second1.setBounds(170,90,100,30);
        add(second1);

        Result = new JButton("SUM");
        Result.setBounds(290,70,100,30);
        add(Result);

        Result.addActionListener(this);

        menuBar = new JMenuBar();
        add(menuBar);

        back = new JButton("BACK");
        menuBar.add(back);
        back.addActionListener(this);

        setJMenuBar(menuBar);


        setTitle("ADDITION");
        setBounds(300,300,600,300);
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);



    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Result)){
            int f = Integer.parseInt(first1.getText());
            int s = Integer.parseInt(second1.getText());
            Arhematic arhematic = new Arhematic(f,s);
            JOptionPane.showMessageDialog(null, arhematic.add());
            dispose();
        }

    }
    public static void main(String[] args) {
        View addition = new View();
        addition.setVisible(true);
    }
}
