/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author axele
 */
public class TeclaEscuchador implements KeyListener {

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
