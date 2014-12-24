/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.main;

import java.util.Random;

/**
 *
 * @author Mike
 */
public class Spawn {
    
    private Handler handler;
    private HUD hud;
    private Random r = new Random();
    
    private int scoreKeep = 0;
    
    public Spawn(Handler handler, HUD hud){
        this.handler = handler;
        this.hud = hud;
    }
    
    public void tick(){
        scoreKeep++;
        
        if(scoreKeep >= 500 ){
            scoreKeep =0;
            hud.setLevel(hud.getLevel() + 1);
            
            if(hud.getLevel() == 2 ){
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-36),r.nextInt(Game.HEIGHT-36), ID.BasicEnemy, handler));
            }else if(hud.getLevel() == 3){
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-36),r.nextInt(Game.HEIGHT-36), ID.BasicEnemy, handler));
            }else if(hud.getLevel() == 4) {
                handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-36),r.nextInt(Game.HEIGHT-36), ID.FastEnemy, handler));
            }else if(hud.getLevel() == 5) {
                handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH-36),r.nextInt(Game.HEIGHT-36), ID.SmartEnemy, handler));
            }
            
        }
        
    }
}
