/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vistas;

import com.mycompany.listeners.Escuchador;
import com.mycompany.listeners.MouseListener;
import com.mycompany.listeners.TeclaEscuchador;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author axele
 */
public class Inicio extends JFrame {

    public Inicio() {
        inicializar();
    }

    private void inicializar() {

        // configurando la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setResizable(false);
        this.setLayout(null);

        // inciializando los componentes
        botón = new JButton("Presionar");
        texto = new JTextField("aiuda");
        texto2 = new JTextField("aiuda x2");

        //agregar los escuchadores
        botón.addActionListener(new Escuchador());
        texto.addKeyListener(new TeclaEscuchador());
        texto.addMouseListener(new MouseListener(texto));
        texto2.addMouseListener(new MouseListener(texto2));

        //configurando los tamaños de los componentes
        botón.setBounds(10, 60, 250, 30);
        texto.setBounds(10, 10, 250, 30);
        texto2.setBounds(10, 100, 250, 30);

        // agregamos los componentes al frame
        this.add(botón);
        this.add(texto);
        this.add(texto2);
        
    }
    
    
    JButton botón;
    JTextField texto;
    JTextField texto2;

    void ver() {
        this.setVisible(true);
    }

}
