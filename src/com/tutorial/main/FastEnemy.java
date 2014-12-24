/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Mike
 */
public class FastEnemy extends GameObject{

    private Handler handler;
   
   
    public FastEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        
        this.handler = handler;
        velX = 7;
        velY = 9;
    }
    
    public Rectangle getBounds(){
        return new Rectangle((int) x,(int) y, 16,16);
    }
    
    public void tick() {
        x += velX;
        y += velY;
        
        if(y <= 0 || y >= Game.HEIGHT-40) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH-24) velX *= -1;
        
        handler.addObject(new Trail((int) x,(int) y, ID.Trail, Color.CYAN, 24, 24, 0.02f, handler));
        
    }

    public void render(Graphics g) {
        
        //Graphics2D g2d = (Graphics2D) g;   
        g.setColor(Color.CYAN);
        g.fillRect((int) x,(int) y, 24, 24);
        
    }
    
    
}
