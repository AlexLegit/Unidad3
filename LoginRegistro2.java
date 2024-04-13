package registroLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginRegistro2 {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblContrasea;
    private JLabel lblUsuario;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginRegistro2 window = new LoginRegistro2();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginRegistro2() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 128, 192));
        frame.setBounds(100, 100, 620, 497);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Iniciar Sesion");
        lblNewLabel.setBackground(new Color(192, 192, 192));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBounds(244, 24, 116, 32);
        lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
        lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(254, 130, 96, 32);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(254, 242, 96, 32);
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        lblContrasea = new JLabel("Contraseña");
        lblContrasea.setOpaque(true);
        lblContrasea.setBounds(244, 186, 116, 32);
        lblContrasea.setVerticalAlignment(SwingConstants.CENTER);
        lblContrasea.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(lblContrasea);

        lblUsuario = new JLabel("Usuario");
        lblUsuario.setOpaque(true);
        lblUsuario.setBackground(new Color(255, 255, 255));
        lblUsuario.setBounds(244, 80, 116, 26);
        lblUsuario.setVerticalAlignment(SwingConstants.CENTER);
        lblUsuario.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(lblUsuario);

        btnNewButton = new JButton("Acceder");
        btnNewButton.setBounds(257, 298, 89, 23);
        btnNewButton.setHorizontalAlignment(JLabel.CENTER);
        btnNewButton.setVerticalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(btnNewButton);

        btnNewButton_1 = new JButton("Registrarse");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Registro registroWindow = new Registro();
                registroWindow.setVisible(true);
                
                frame.getContentPane().remove(lblNewLabel);
                frame.getContentPane().repaint();
                frame.getContentPane().revalidate();
            }
        });
        btnNewButton_1.setBounds(238, 401, 128, 32);
        btnNewButton_1.setVerticalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(btnNewButton_1);

        lblNewLabel_1 = new JLabel("No Tienes con una Cuenta? Registrate ");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(174, 345, 256, 32);
        lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
        lblNewLabel_1.setVerticalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(lblNewLabel_1);
    }
}

class Registro extends JFrame {
    private JTextField textField;
    private JTextField textField_1;

    public Registro() {
        initialize();
    }

    private void initialize() {
        getContentPane().setBackground(new Color(0, 128, 255));
        setBounds(100, 100, 676, 508);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("REGISTRO");
        lblNewLabel.setBackground(new Color(192, 192, 192));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
        lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
        lblNewLabel.setBounds(203, 11, 256, 32);
        getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(235, 133, 202, 32);
        getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
        lblNewLabel_1_1.setBounds(274, 196, 128, 32);
        lblNewLabel_1_1.setHorizontalAlignment(JLabel.CENTER);
        lblNewLabel_1_1.setOpaque(true);
        getContentPane().add(lblNewLabel_1_1);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(235, 244, 202, 32);
        getContentPane().add(textField_1);

        JButton btnNewButton = new JButton("Crear Cuenta");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        btnNewButton.setHorizontalAlignment(JLabel.CENTER);
        btnNewButton.setBounds(274, 300, 128, 32);
        getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Iniciar Sesion");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnNewButton_1.setHorizontalAlignment(JLabel.CENTER);
        btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
        btnNewButton_1.setBounds(260, 363, 160, 32);
        getContentPane().add(btnNewButton_1);

        JLabel lblNewLabel_1_1_1 = new JLabel("Nombre de Usuario");
        lblNewLabel_1_1_1.setOpaque(true);
        lblNewLabel_1_1_1.setBounds(260, 83, 160, 32);
        lblNewLabel_1_1_1.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(lblNewLabel_1_1_1);
    }
}
