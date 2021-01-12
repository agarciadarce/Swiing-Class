/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author axele
 */
public class PrimeraVentana {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Mi primera GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        JButton botón = new JButton("Presionar");
        JTextField texto = new JTextField("aiuda");
        botón.addActionListener(new Escuchador());
        botón.setBounds(60, 60, 220, 20);
        texto.setBounds(10, 10, 250, 30);
        frame.add(botón);
        frame.add(texto);
        frame.setVisible(true);
    }
}
// https://docs.oracle.com/javase/8/docs/api/java/util/EventListener.html
class Escuchador implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Distes un click");
    }
    
}

class TeclaEscuchador implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Evento keytyped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Evento keypressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Evento keyreleased");
    }
    
}
