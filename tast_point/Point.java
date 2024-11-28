package org.example.tast_point;

public class Point implements Movable{
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return this.y;
    }

    @Override
    public void moveUp() {
        this.y = getY() - 1;
    }

    @Override
    public void moveDown() {
        this.y = getY() + 1;
    }

    @Override
    public void moveLeft() {
        this.x = getX() - 1;
    }

    @Override
    public void moveRight() {
        this.x = getX() + 1;
    }
}
