/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listeners;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;

import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author axele
 */
public class MouseListener implements java.awt.event.MouseListener{

    JTextField texto;
    public MouseListener(JTextField texto) {
        this.texto = texto;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Border blackline = BorderFactory.createLineBorder(Color.red);
        texto.setBorder(blackline);
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        texto.setBorder(null);
    }
    
}
