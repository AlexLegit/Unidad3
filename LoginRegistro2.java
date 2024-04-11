package ventanasLoginRegistro;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class LoginRegistro2 extends JFrame {

	
	private Component Userlogin;
	public LoginRegistro2() {
        setTitle("Ventana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.componentes();
        
    }
	public void componentes() {
		
		this.Userlogin();
		//this.Registro();
	}
	public void Userlogin() {

		
		JPanel login = new JPanel();
		login.setLayout(new BorderLayout());
		login.setBackground(new Color(13, 61, 131));

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(getClass().getResource("/userIcon.png")));
		login.add(img, BorderLayout.NORTH);

		JLabel img2 = new JLabel("");
		img2.setIcon(new ImageIcon(getClass().getResource("/candado.png")));
		login.add(img2, BorderLayout.CENTER);

		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(null);
		contentPanel.setBackground(new Color(13, 61, 131));
		login.add(contentPanel, BorderLayout.SOUTH);

		JLabel user = new JLabel("User Login");
		user.setBounds(280, 20, 200, 40);
		user.setFont(new Font("signPainter", Font.BOLD, 30));
		user.setForeground(Color.white);
		contentPanel.add(user);

		JLabel title = new JLabel("My account", SwingConstants.CENTER);
		title.setBounds(220, 80, 250, 100);
		title.setFont(new Font("signPainter", Font.BOLD, 40));
		title.setForeground(Color.YELLOW);
		contentPanel.add(title);

		JLabel usuario = new JLabel("Enter your username", SwingConstants.CENTER);
		usuario.setBounds(170, 170, 180, 30);
		usuario.setFont(new Font("signPainter", Font.BOLD, 12));
		usuario.setForeground(Color.white);
		contentPanel.add(usuario);

		JTextField usuarioField = new JTextField();
		usuarioField.setBounds(200, 200, 280, 30);
		contentPanel.add(usuarioField);

		JLabel contraseña = new JLabel("Enter your password", SwingConstants.CENTER);
		contraseña.setBounds(120, 250, 280, 30);
		contraseña.setFont(new Font("signPainter", Font.BOLD, 12));
		contraseña.setForeground(Color.white);
		contentPanel.add(contraseña);

		JPasswordField contraseñaField = new JPasswordField();
		contraseñaField.setBounds(200, 280, 280, 30);
		contraseñaField.setOpaque(true);
		contentPanel.add(contraseñaField);

		JButton acceder = new JButton("Acceder");
		acceder.setBounds(270, 320, 140, 50);
		acceder.setBackground(Color.YELLOW);
		contentPanel.add(acceder);

		JLabel cuenta = new JLabel("Don't have an account?", SwingConstants.CENTER);
		cuenta.setBounds(250, 380, 180, 30);
		cuenta.setForeground(Color.WHITE);
		contentPanel.add(cuenta);

		JButton registro = new JButton("Sign up");
		registro.setBounds(250, 420, 180, 30);
		registro.setBackground(Color.YELLOW);
		contentPanel.add(registro);

		JPanel login2 = new JPanel();
		login2.setBounds(100, 80, 500, 300);
		login2.setLayout(null);
		login2.setBackground(new Color(13, 54, 113));
		contentPanel.add(login2);
		
		JMenuBar barra = new JMenuBar(); 
		JMenu lista1 = new JMenu("Mas + ");
		
		JMenuItem option1 = new JMenuItem("Abrir");
		JMenuItem option2 = new JMenuItem("Nuevo");
		JMenuItem option3 = new JMenuItem("Editar");
		JMenuItem option4 = new JMenuItem("Eliminar");
		
		barra.add(lista1);
		lista1.add(option1);
		lista1.add(option2);
		lista1.add(option3);
		lista1.add(option4);
		
		this.setJMenuBar(barra);
        add(Userlogin);
        setSize(400, 512);

		this.add(login);
	
		
		
	}
			public void Registro() {

	
	JPanel Registro = new JPanel();
	Registro.setSize(400,512);
	Registro.setLayout(null);
	Registro.setBackground(Color.CYAN);
	
	 JLabel title = new JLabel("Registro");
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("SignPainter", Font.BOLD, 30));
        title.setBackground(Color.CYAN);
        title.setBounds(100, 10, 190, 40);
        title.setOpaque(true);
        Registro.add(title);
        
        JLabel usuario = new JLabel("Ingrese Nombre De Usuario:");
        usuario.setFont(new Font("Agency FB", Font.BOLD, 15));
        usuario.setBounds(5, 80, 400, 60);
        Registro.add(usuario);
        
        JTextField usuarioField = new JTextField();
        usuarioField.setBounds(10, 120, 300, 20);
        Registro.add(usuarioField);
        
        JCheckBox tipo1 = new JCheckBox("Dulce");
        tipo1.setBounds(10, 140, 70, 35);
        tipo1.setOpaque(false);
        tipo1.setBackground(Color.green);
        Registro.add(tipo1);
        
        JCheckBox tipo2 = new JCheckBox("Salada");
        tipo2.setBounds(100, 140, 70, 35);
        tipo2.setOpaque(false);
        tipo2.setBackground(Color.green);
        Registro.add(tipo2);
        
        JLabel seleccion = new JLabel("Seleccione sus Preferencias");
        seleccion.setFont(new Font("Agency FB", Font.BOLD, 15));
        seleccion.setBounds(10, 150, 300, 60);
        Registro.add(seleccion);
        
        JCheckBox opcion1 = new JCheckBox("Nutella y Fresas");
        opcion1.setBounds(10, 200, 120, 35);
        opcion1.setOpaque(false);
        opcion1.setBackground(Color.green);
        Registro.add(opcion1);
        
        JCheckBox opcion2 = new JCheckBox("MermeladaF y QuesoC");
        opcion2.setBounds(170, 200, 160, 35);
        opcion2.setOpaque(false);
        opcion2.setBackground(Color.green);
        Registro.add(opcion2);
        
        JLabel seleccion2 = new JLabel("Mas Opciones:");
        seleccion2.setFont(new Font("Agency FB", Font.BOLD, 15));
        seleccion2.setBounds(10, 220, 300, 60);
        Registro.add(seleccion2);
        
        String Opciones[] = {"Fresas Solas","Solo Chocolate","Solo Queso","Queso Chocolate","Fresas Queso"};
		
		JComboBox<Object> opciones1 = new JComboBox<Object>(Opciones);
		opciones1.setBounds(10, 270, 350, 20); 
		Registro.add(opciones1);
		
		//seleccion del menu superior de la ventana
		JMenuBar barra = new JMenuBar(); 
		JMenu lista1 = new JMenu("Mas + ");
		
		JMenuItem option1 = new JMenuItem("Abrir");
		JMenuItem option2 = new JMenuItem("Nuevo");
		JMenuItem option3 = new JMenuItem("Editar");
		JMenuItem option4 = new JMenuItem("Eliminar");
		
		barra.add(lista1);
		lista1.add(option1);
		lista1.add(option2);
		lista1.add(option3);
		lista1.add(option4);
		
		this.setJMenuBar(barra);
        add(Registro);
        setSize(400, 512);
	
	}
}