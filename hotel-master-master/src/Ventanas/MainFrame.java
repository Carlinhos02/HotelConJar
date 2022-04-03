package Ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainFrame extends JFrame {
    private JTextField textUsuario;
    private JPasswordField textContraseña;
    private JButton limpiarButton;
    private JButton entrarButton;
    private JPanel primerPanel;
    private JLabel validaContraseña;

    public MainFrame(){
        setContentPane(primerPanel);
        setTitle("Hotel Montealegre**");
        setBounds(450,300,500,270);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUsuario.setText(null);
                textContraseña.setText(null);
                validaContraseña.setText(null);
            }
        });
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = "1";
                String contraseña = "1";
                if(textUsuario.getText().equals(usuario) && textContraseña.getText().equals(contraseña)){
                    dispose();
                    Reservas reserva1 = null;
                    try {
                        reserva1 = new Reservas();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    reserva1.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos, prueba otra vez.", "Error",JOptionPane.ERROR_MESSAGE );
                }
            }
        });
    }



    public static void main(String[] args) {
        MainFrame firstFrame=new MainFrame();
    }
}
