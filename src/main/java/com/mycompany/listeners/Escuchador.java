/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author axele
 */
public class Escuchador implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Distes un click");
    }

}
