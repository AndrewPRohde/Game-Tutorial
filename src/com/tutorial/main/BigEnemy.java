package com.tutorial.main;

import java.awt.*;

public class BigEnemy extends GameObject{
    private Handler handler;

    public BigEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;

        velX = 4;
        velY = 1;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.HEIGHT - 55) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 36) velX *= -1;

        handler.addObject(new Trail(x, y, ID.Trail, Color.cyan, 32, 32, 0.02, handler));
    }

    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(x, y, 32, 32);
    }


}
