package mx.udg.cucea.interfazgrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener{
    // Incializar atributos
    private JLabel labelNum01, labelNum02, labelOperacion, labelSigno, labelResultado;
    private JTextField textBox1, textBox2;
    private JButton btnSumar, btnRestar, btnMul, btnDiv;
    
    // Método constructor
    Calculadora(){
        // Aspectos de la ventana
        // Establecemos el titulo a la ventana
        setTitle("Calculadora");
        
        // Establecemos un tamaño mínimo para la ventana
        setMinimumSize(new Dimension(240, 170));
        
        // Establecemos la posición incial de la ventana
        setLocationRelativeTo(null);
        
        // Establecemos que el programa termine cuando se cierre la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Aspectos del panel
        // Creamos un panel
        JPanel panel01 = new JPanel();
        
        // Desactivamos el diseño/layout
        panel01.setLayout(null);
        
        // Agregamos el panel a la ventana
        getContentPane().add(panel01);
        
        
        // --Línea 1
        labelNum01 = new JLabel("Número 1");
        
        // Establecemos la posición de la etiqueta y el tamaño
        labelNum01.setBounds(10, 10, 100, 30);
        
        // Agregamos la etiqueta al panel
        panel01.add(labelNum01);
        
        // Creamos la caja de texto
        textBox1 = new JTextField();
        
        // Establecemos la posición de la caja de texto y el tamaño
        textBox1.setBounds(75, 10, 50, 30);
        
        // Alíneamos el cursor al cetro de la caja de texto
        textBox1.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Agregamos la caja de texto al panel
        panel01.add(textBox1);
        
        
        // Línea de enmedio
        labelOperacion = new JLabel("");
        
        // Establecemos la posición de la etiqueta y el tamaño
        labelOperacion.setBounds(95, 30, 100, 30);
        
        // Agregamos color a la etiqueta
        labelOperacion.setForeground(Color.blue);
        
        // Agregamos la etiqueta al panel
        panel01.add(labelOperacion);
        
        
        // --Línea 2
        labelNum02 = new JLabel("Número 2");
        
        // Establecemos la posición de la etiqueta y el tamaño
        labelNum02.setBounds(10, 50, 100, 30);
        
        // Agregamos la etiqueta al panel
        panel01.add(labelNum02);
        
        // Creamos la caja de texto
        textBox2 = new JTextField();
        
        // Establecemos la posición de la caja de texto y el tamaño
        textBox2.setBounds(75, 50, 50, 30);
        
        // Alíneamos el cursor al cetro de la caja de texto
        textBox2.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Agregamos la caja de texto al panel
        panel01.add(textBox2);
        
        
        // Signo de igual
        labelSigno = new JLabel("=");
        
        // Establecemos la posición de la etiqueta y el tamaño
        labelSigno.setBounds(130, 30, 50, 30);
        
        // Agregamos la etiqueta al panel
        panel01.add(labelSigno);
        
        
        // Resultado
        labelResultado = new JLabel("");
        
        // Establecemos la posición de la etiqueta y el tamaño
        labelResultado.setBounds(145, 10, 80, 70);
        
        // Alíneamos el cursor al cetro de la caja de texto
        labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Agregamos color a la etiqueta
        labelResultado.setForeground(Color.green);
        
        // Establecemos poder cambiar el color de fondo de la etiqueta
        labelResultado.setOpaque(true);
        
        // Agregamos color de fondo
        labelResultado.setBackground(Color.black);
        
        // Creamos un objeto tipo fuente
        Font miFuente = new Font("Calibri", Font.PLAIN, 35);
        
        // Añadimos el tipo de fuente a la etiqueta
        labelResultado.setFont(miFuente);
        
        // Agregamos la etiqueta al panel
        panel01.add(labelResultado);
        
        
        // Botones (Operaciones) SUMA
        btnSumar = new JButton("+");
        
        // Establecemos la posición del boton y el tamaño
        btnSumar.setBounds(40, 90, 41, 41);
        
        // Activamos el botón
        btnSumar.addActionListener(this);
        
        // Agregamos el boton al panel
        panel01.add(btnSumar);
        
        // RESTA
        btnRestar = new JButton("-");
        
        // Establecemos la posición del boton y el tamaño
        btnRestar.setBounds(80, 90, 41, 41);
        
        // Activamos el botón
        btnRestar.addActionListener(this);
        
        // Agregamos el boton al panel
        panel01.add(btnRestar);
        
        // DIVISIÓN
        btnDiv = new JButton("÷");
        
        // Establecemos la posición del boton y el tamaño
        btnDiv.setBounds(120, 90, 41, 41);
        
        // Activamos el botón
        btnDiv.addActionListener(this);
        
        // Agregamos el boton al panel
        panel01.add(btnDiv);
        
        // MULTIPLICACION
        btnMul = new JButton("x");
        
        // Establecemos la posición del boton y el tamaño
        btnMul.setBounds(160, 90, 41, 41);
        
        // Activamos el botón
        btnMul.addActionListener(this);
        
        // Agregamos el boton al panel
        panel01.add(btnMul);
    }
    
    public static void main(String[] args) {
        // Creamos un objeto tipo calculadora
        Calculadora ventana01 = new Calculadora();
        
        // Hacemos visible la ventana
        ventana01.setVisible(true);
    }

    // Método para escuchar
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener valores introducidos por las cajas de texto
        double num1 = Double.parseDouble(textBox1.getText());
        double num2 = Double.parseDouble(textBox2.getText());
        
        // Incializamos el resultado
        double resultado = 0;
        
        String operacion = "";
        
        JButton fuente = (JButton) e.getSource();
        
        //JOptionPane.showMessageDialog(null, "Valor que capturo: " + fuente.getText());
        
        // Switch para el tipo de operacion
        switch (fuente.getText()) {
            case "+":
                resultado = num1 + num2;
            break;
            
            case "-":
                resultado = num1 - num2;
            break;
            
            case "x":
                resultado = num1 * num2;
            break;
            
            case "÷":
                resultado = num1 / num2;
            break;
            
            default:
                throw new AssertionError();
        }
        
        // Asignamos la operación que se hizo a la etiqueta
        labelOperacion.setText(fuente.getText());
        
        // Asignamos el resultado a la etiqueta
        labelResultado.setText(String.valueOf(resultado));
    }
} // Clase calculadora