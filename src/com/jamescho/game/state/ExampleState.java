package com.jamescho.game.state;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by cortman on 3/21/17.
 */
public class ExampleState extends State {


    private int y = 200;
    private int x = 400;


    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(x, y, 10, 15);

    }

    @Override
    public void onClick(MouseEvent e) {

    }

    @Override
    public void onKeyPress(KeyEvent e) {
        int speed = 10;
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            y += speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            y -= speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            x -= speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x += speed;
        }


    }

    @Override
    public void onKeyRelease(KeyEvent e) {

    }
}
