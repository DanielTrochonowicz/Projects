package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    public Main(){
        setSize(500,500); // wielkosc okna
        setTitle("Kółko i Krzyżyk");  //ustawiamy tytuł
        setVisible(true);       // widoczne okno
        setDefaultCloseOperation(3); // mozemy zamknac aplikacje
        setLayout(new GridLayout(3, 3)); //siatka 3/3

        for (int i = 0; i < 9 ; i++) {
            JButton button = new JButton("");
            add(button); //przycisk dodany do okna
            button.addActionListener(this);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }

    private int counter;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource(); //rzutowanie na Jbutton Polimorfizm

        if(counter % 2 == 0){
            button.setText("X");
        }else {
            button.setText("O");
        }counter++;
        button.setEnabled(false);
    }
}
