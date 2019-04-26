package com.tutorial.main;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {
    Random r = new Random();
    Handler handler;

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;

    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH - 48);
        y = Game.clamp(y, 0, Game.HEIGHT - 70);
    }

    public void render(Graphics g) {
        if(id == ID.Player) g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);

    }
}
