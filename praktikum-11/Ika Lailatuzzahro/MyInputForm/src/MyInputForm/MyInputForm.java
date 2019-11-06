/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInputForm;

/**
 *
 * @author ELA-PC
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel cLabel2;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button2;
    private JPanel panel;
    
    public MyInputForm(){
        createTextField();
        createButton();
        createButton2();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("NIlai C: ");
        cLabel = new JLabel("Hasil: ");
        cLabel2 = new JLabel("Hasil2: ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton() {
        button = new JButton("Perkalian");//untuk membuat tombol Calculate
        class AddInterestListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int a = Integer.valueOf(aField.getText());//mengambil inputan textbox
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil: "+c);
            }
            
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    private void createPanel() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        panel.add(button2);
        panel.add(cLabel2);
        add(panel);
    }

    private void createButton2() {
        button2 = new JButton("Penambahan");//untuk membuat tombol Calculate
        class AddInterestListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int a = Integer.valueOf(aField.getText());//mengambil inputan textbox
                int b = Integer.valueOf(bField.getText());
                int c = a+b;
                cLabel2.setText("Hasil: "+c);
            }
            
        }
        ActionListener listener = new AddInterestListener();
        button2.addActionListener(listener);
    }
    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}

