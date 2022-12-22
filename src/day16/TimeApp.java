package day16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeApp {

    public static void main(String[] args) {

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action Performed called");

            }
        };
       // ActionListener listener1 = e -> {
         //   System.out.println("Action Performed called");
       // };

      //  Timer timer = new Timer(5000, e -> {
        // System.out.println("Action Performed called");
        //  };);
        //timer.start();

        Timer timer = new Timer(5000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}
