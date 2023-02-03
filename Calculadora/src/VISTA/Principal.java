package VISTA;

import javax.swing.*;

import CONTROL.EventoClick;

import java.awt.*;


public class Principal extends JFrame {
	
	//Variables para los botones, cajas de texto y etiquetas
	//necesarias para la interfaz gráfica de la calculadora

	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel resultado;
	private JTextField texto;
	private JTextField texto2;
	private JButton botonSuma;
	private JButton botonResta;
	private JButton botonMulti;
	private JButton botonDivi;
	private JButton boton2;
	private JButton boton3;



	public Principal() {
		//Se crea la ventana principal de la interfaz
		setSize(560, 560);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setTitle("CALCULADORA");
		setLayout(null);
		inicializarComponentes();
		getContentPane().setBackground(Color.ORANGE);
		setVisible(true);
		texto.requestFocus();
	}

	private void inicializarComponentes() {
		//PRIMERA ETIQUETA
		etiqueta1 = new JLabel("Número 1:");
		etiqueta1.setBounds(50, 30, 100, 30);
		etiqueta1.setFont(new java.awt.Font("Tahoma", 0, 16));
		add(etiqueta1);

		//PRIMERA CASILLA Nº1

		texto = new JTextField();
		texto.setBounds(210, 27, 110, 40);
		add(texto);

		//SEGUNDA ETIQUETA

		etiqueta2 = new JLabel("Número 2:");
		etiqueta2.setBounds(50, 100, 100, 30);
		etiqueta2.setFont(new java.awt.Font("Tahoma", 0, 16));
		add(etiqueta2);

		//SEGUNDA CASILLA Nº2

		texto2 = new JTextField();
		texto2.setBounds(210, 97, 110, 40);
		add(texto2);


		//BOTÓN SUMA
		botonSuma = new JButton("Sumar");
		botonSuma.setBounds(50, 180, 170, 50);
		botonSuma.setFont(new java.awt.Font("Tahoma", 0, 16));
		botonSuma.setBackground(Color.white);
		add(botonSuma);

		//BOTÓN RESTA
		botonResta = new JButton("Restar");
		botonResta.setBounds(250, 180, 170, 50);
		botonResta.addActionListener(new EventoClick(this));
		botonResta.setFont(new java.awt.Font("Tahoma", 0, 16));
		botonResta.setBackground(Color.white);
		add(botonResta);


		//BOTÓN MULTIPLICACIÓN

		botonMulti = new JButton("Multiplicar");
		botonMulti.setBounds(50, 260, 170, 50);
		botonMulti.addActionListener(new EventoClick(this));
		botonMulti.setFont(new java.awt.Font("Tahoma", 0, 16));
		botonMulti.setBackground(Color.white);
		add(botonMulti);

		//BOTÓN DIVISIÓN

		botonDivi = new JButton("Dividir");
		botonDivi.setBounds(250, 260, 170, 50);
		botonDivi.addActionListener(new EventoClick(this));
		botonDivi.setFont(new java.awt.Font("Tahoma", 0, 16));
		botonDivi.setBackground(Color.white);
		add(botonDivi);

		//BOTÓN RAIZ 2

		boton2 = new JButton("Raíz 2");
		boton2.setBounds(50, 340, 170, 50);
		boton2.setFont(new java.awt.Font("Tahoma", 0, 16));
		boton2.setBackground(Color.white);
		add(boton2);

		//BOTÓN RAÍZ 3 DEL NÚMERO 1

		boton3 = new JButton("Raíz 3");
		boton3.setBounds(250, 340, 170, 50);
		boton3.setFont(new java.awt.Font("Tahoma", 0, 16));
		boton3.setBackground(Color.white);
		add(boton3);

		//RESULTADO

		resultado = new JLabel("Resultado:");
		resultado.setBounds(50, 440, 400, 30);
		resultado.setFont(new java.awt.Font("Tahoma", 0, 16));
		add(resultado);

	}
	
	//Manejador de eventos de los botones:
	
	public void establecerEventos(EventoClick manejador) { 
		botonSuma.addActionListener(manejador); 
		botonResta.addActionListener(manejador);
		botonMulti.addActionListener(manejador);
		botonDivi.addActionListener(manejador);
		boton2.addActionListener(manejador);
		boton3.addActionListener(manejador);
	}
	
	//Getter y Setter de los componentes para poder acceder a los valores:

	public JLabel getEtiqueta1() {
		return etiqueta1;
	}

	public void setEtiqueta1(JLabel etiqueta1) {
		this.etiqueta1 = etiqueta1;
	}

	public JLabel getEtiqueta2() {
		return etiqueta2;
	}

	public void setEtiqueta2(JLabel etiqueta2) {
		this.etiqueta2 = etiqueta2;
	}

	public JLabel getResultado() {
		return resultado;
	}

	public void setResultado(JLabel resultado) {
		this.resultado = resultado;
	}

	public JTextField getTexto() {
		return texto;
	}

	public void setTexto(JTextField texto) {
		this.texto = texto;
	}

	public JTextField getTexto2() {
		return texto2;
	}

	public void setTexto2(JTextField texto2) {
		this.texto2 = texto2;
	}

	public JButton getBotonSuma() {
		return botonSuma;
	}

	public void setBotonSuma(JButton botonSuma) {
		this.botonSuma = botonSuma;
	}

	public JButton getBotonResta() {
		return botonResta;
	}

	public void setBotonResta(JButton botonResta) {
		this.botonResta = botonResta;
	}

	public JButton getBotonMulti() {
		return botonMulti;
	}

	public void setBotonMulti(JButton botonMulti) {
		this.botonMulti = botonMulti;
	}

	public JButton getBotonDivi() {
		return botonDivi;
	}

	public void setBotonDivi(JButton botonDivi) {
		this.botonDivi = botonDivi;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public void setBoton2(JButton boton2) {
		this.boton2 = boton2;
	}

	public JButton getBoton3() {
		return boton3;
	}

	public void setBoton3(JButton boton3) {
		this.boton3 = boton3;
	} 
	

}


