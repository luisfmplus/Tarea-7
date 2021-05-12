import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textinstruccion;
	private JTextField textMensaje;
	private Ejecutar MAIN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		
		MAIN = new Ejecutar();
		
		getContentPane().setBackground(new Color(153, 255, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		int largoPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		 
		setSize(9*anchoPantalla/10, 9*largoPantalla/10);
		setLocation(anchoPantalla/20, largoPantalla/20);
		getContentPane().setLayout(null);
		
		textinstruccion = new JTextField();
		textinstruccion.setText("Orden de precionado: Centro, Izquierda, Derecha");
		textinstruccion.setFont(new Font("Arial", Font.PLAIN, 25));
		textinstruccion.setEditable(false);
		textinstruccion.setBounds(55, 34, 575, 41);
		getContentPane().add(textinstruccion);
		textinstruccion.setColumns(10);
		
		textMensaje = new JTextField();
		textMensaje.setEditable(false);
		textMensaje.setBackground(new Color(204, 204, 102));
		textMensaje.setFont(new Font("Arial", Font.BOLD, 25));
		textMensaje.setText("Secuencia completada: excelente trabajo");
		textMensaje.setBounds(55, 128, 773, 60);
		getContentPane().add(textMensaje);
		textMensaje.setColumns(10);
		textMensaje.setVisible(false);
		
		
		JButton btnNumero1 = new JButton("Boton");
		btnNumero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				MAIN.setBoton1(!(MAIN.getBoton1()));
			
				if (MAIN.evaluarBotones() == 2110){
					
					textMensaje.setText("Secuencia correcta: excelente trabajo");
					textMensaje.setVisible(true);
					
				} else {
				
					textMensaje.setText("Secuencia Erronea: se reiniciara el proceso");
					textMensaje.setVisible(true);
			
				}
			}
		});
		btnNumero1.setFont(new Font("Arial", Font.PLAIN, 43));
		btnNumero1.setBackground(new Color(255, 153, 51));
		btnNumero1.setBounds(55, 236, 217, 89);
		getContentPane().add(btnNumero1);
		
		JButton btnNumero2 = new JButton("Boton");
		btnNumero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				MAIN.setBoton2(!(MAIN.getBoton2()));
				
					
				if ((MAIN.evaluarBotones() == 2010) ){
			
					textMensaje.setText("Secuencia correcta: excelente trabajo");
					textMensaje.setVisible(true);
					
				} else {
				
					textMensaje.setText("Secuencia Erronea: se reiniciara el proceso");
					textMensaje.setVisible(true);
				
				}
			
			}
		});
		btnNumero2.setFont(new Font("Arial", Font.PLAIN, 43));
		btnNumero2.setBackground(new Color(255, 153, 51));
		btnNumero2.setBounds(348, 236, 217, 89);
		getContentPane().add(btnNumero2);
		
		JButton btnNumero3 = new JButton("Boton");
		btnNumero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				MAIN.setBoton3(!(MAIN.getBoton3()));
				
				if (MAIN.evaluarBotones() == 2111){
					
					
					textMensaje.setText("Secuencia completada: excelente trabajo");
					textMensaje.setVisible(true);
					
				} else {
				
					textMensaje.setText("Secuencia Erronea: se reiniciara el proceso");
					textMensaje.setVisible(true);
					
				}
			
			
			}
		});
		btnNumero3.setFont(new Font("Arial", Font.PLAIN, 43));
		btnNumero3.setBackground(new Color(255, 153, 51));
		btnNumero3.setBounds(611, 236, 217, 89);
		getContentPane().add(btnNumero3);
	}
}
