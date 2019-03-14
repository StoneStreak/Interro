

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;





public class SimpleFrame extends JFrame {



    public SimpleFrame() {
        super();
        build();
    }

    void build()
    {
        setTitle("Convert Celsius to Fahrenheit");
        setSize(300, 100);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(buildContentPane());
    }

    Container buildContentPane()
    {
        JLabel label = new JLabel("Celsius");
        getContentPane().add(label, BorderLayout.EAST);

        JTextArea textArea = new JTextArea(1, 10);
        getContentPane().add(textArea, BorderLayout.WEST);
        textArea.setEditable(true);

        JTextField result = new JTextField();
        result.setEditable(false);
        getContentPane().add(result, BorderLayout.SOUTH);


        JButton button = new JButton("Convert");
        getContentPane().add(button, BorderLayout.SOUTH);


        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String name;
                int n;

                name = textArea .getText();
                n = Integer.parseInt(name);
                int res = CtoF.fahrenheit(n);
                String result = String.valueOf(res);
                label.setText(result + " Fahrenheit"); 
            }
        });


        return getContentPane();


    }
}
