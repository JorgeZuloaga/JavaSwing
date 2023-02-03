package CONTROL;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import VISTA.Principal;

public class EventoClick implements ActionListener{

	private Principal principal;

	public EventoClick(Principal principal) {
		this.principal = principal;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Cuando se pulsa un botón, se comprueba cuál ha sido
		//mediante un if anidado. En todos los casos, se usa el getter
		//de la caja donde se escriben los números y se convierte el texto
		//a double para poder operar con ellos.
		//Se crea también una excepción para el caso en que no se introduzca
		//alguno de los números correctamente y se imprime el mensaje de error en rojo
		if (e.getSource() == principal.getBotonSuma()) {//Caso suma
			try {
				double m1 = Double.parseDouble(principal.getTexto().getText());
				double m2 = Double.parseDouble(principal.getTexto2().getText());
				principal.getResultado().setText("Resultado: "+ String.valueOf(m1+m2));
				principal.getResultado().setForeground(new Color(0, 0, 0));
				principal.getBotonSuma().setBackground(Color.YELLOW);
				principal.getBotonResta().setBackground(Color.white);
				principal.getBotonMulti().setBackground(Color.white);
				principal.getBotonDivi().setBackground(Color.white);
				principal.getBoton2().setBackground(Color.white);
				principal.getBoton3().setBackground(Color.white);


			}catch(NumberFormatException exception) {
				//Excepción para el caso en que se deje vacío o se introducen letras
				principal.getResultado().setText("Por favor, introduce un número");
				principal.getResultado().setForeground(new Color(255, 0, 0));
			}
		}
		
		else if(e.getSource() == principal.getBotonResta()) {//Caso resta
			try {
				double m1 = Double.parseDouble(principal.getTexto().getText());
				double m2 = Double.parseDouble(principal.getTexto2().getText());
				principal.getResultado().setText("Resultado: "+ String.valueOf(m1-m2));
				principal.getResultado().setForeground(new Color(0, 0, 0));
				principal.getBotonResta().setBackground(Color.YELLOW);
				principal.getBotonSuma().setBackground(Color.white);
				principal.getBotonMulti().setBackground(Color.white);
				principal.getBotonDivi().setBackground(Color.white);
				principal.getBoton2().setBackground(Color.white);
				principal.getBoton3().setBackground(Color.white);

			}catch(NumberFormatException exception) {
				//Excepción para el caso en que se deje vacío o se introducen letras
				principal.getResultado().setText("Por favor, introduce un número");
				principal.getResultado().setForeground(new Color(255, 0, 0));
			}
		}
		
		else if(e.getSource() == principal.getBotonMulti()) {//Caso multiplicación
			try {
				double m1 = Double.parseDouble(principal.getTexto().getText());
				double m2 = Double.parseDouble(principal.getTexto2().getText());
				principal.getResultado().setText("Resultado: "+ String.valueOf(m1*m2));
				principal.getResultado().setForeground(new Color(0, 0, 0));
				principal.getBotonMulti().setBackground(Color.YELLOW);
				principal.getBotonSuma().setBackground(Color.white);
				principal.getBotonResta().setBackground(Color.white);
				principal.getBotonDivi().setBackground(Color.white);
				principal.getBoton2().setBackground(Color.white);
				principal.getBoton3().setBackground(Color.white);

			}catch(NumberFormatException exception) {
				//Excepción para el caso en que se deje vacío o se introducen letras
				principal.getResultado().setText("Por favor, introduce un número");
				principal.getResultado().setForeground(new Color(255, 0, 0));
			}
		}
		
		else if(e.getSource() == principal.getBotonDivi()) { //Caso división
			try {
				double m1 = Double.parseDouble(principal.getTexto().getText());
				double m2 = Double.parseDouble(principal.getTexto2().getText());
				principal.getResultado().setText("Resultado: "+ String.valueOf(m1/m2));
				principal.getResultado().setForeground(new Color(0, 0, 0));
				principal.getBotonDivi().setBackground(Color.YELLOW);
				principal.getBotonSuma().setBackground(Color.white);
				principal.getBotonResta().setBackground(Color.white);
				principal.getBotonMulti().setBackground(Color.white);
				principal.getBoton2().setBackground(Color.white);
				principal.getBoton3().setBackground(Color.white);

			}catch(NumberFormatException exception) {
				//Excepción para el caso en que se deje vacío o se introducen letras
				principal.getResultado().setText("Por favor, introduce un número");
				principal.getResultado().setForeground(new Color(255, 0, 0));
			}
		}
		
		else if(e.getSource() == principal.getBoton2()) { //Caso raíz cuadrada
			
			JOptionPane.showMessageDialog(null, "Operación no disponible", "Raíz Cuadrada",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		else if(e.getSource() == principal.getBoton3()) { //Caso raíz cúbica
			//Se crea una ventana para gestionar la contraseña:
			JPasswordField pass = new JPasswordField(10);
			String[] options = new String[]{"Aceptar"};
			JPanel panel = new JPanel();
			JLabel label = new JLabel("Contraseña:");
			panel.add(label);
			panel.add(pass);
			int option = JOptionPane.showOptionDialog(null, panel, "Raíz Cúbica",
                    JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, null);
			try {
				if (option==0) { //Si pulsamos aceptar
					//Guardamos el valor introducido
					String contrasena=new String (pass.getPassword());	
					//Comprobamos si es correcta
					if (contrasena.equals("premium")){
						double m1 = Double.parseDouble(principal.getTexto().getText());
						principal.getResultado().setText("Resultado: "+ String.valueOf(Math.cbrt(m1)));
						principal.getResultado().setForeground(new Color(0, 0, 0));
						principal.getBoton3().setBackground(Color.YELLOW);
						principal.getBotonSuma().setBackground(Color.white);
						principal.getBotonResta().setBackground(Color.white);
						principal.getBotonMulti().setBackground(Color.white);
						principal.getBotonDivi().setBackground(Color.white);
						principal.getBoton2().setBackground(Color.white);
					}
					else {
						//Si la contraseña es incorrecta o se cierra la ventana, mensaje de error
						JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "",  
								JOptionPane.ERROR_MESSAGE);
					}
				}else { //Si cerramos la caja de dialogo
					System.out.println("Raíz cúbica: acción cancelada");
				}

			}catch(NumberFormatException exception) {
				//Excepción para el caso en que se deje vacío o se introducen letras
				principal.getResultado().setText("Por favor, introduce un número");
				principal.getResultado().setForeground(new Color(255, 0, 0));
			}
		}
		
		//Tras darle a cualquier botón, se pone el foco en el número 1
		principal.getTexto().requestFocus();

		
	}

}
