/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Mike
 */
public class Player extends GameObject {

    Random r = new Random();
    
    public Player(int x, int y, ID id) {
        super(x, y, id);
        
        velX = r.nextInt(5) + 1;
        velY = r.nextInt(5) + 1;
        
    }

    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }
    
}
