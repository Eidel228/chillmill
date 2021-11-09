package chillmill.util;

public class Point {
    private int x;
    private int y;

    private Point(int y, int x){
        this.x = x;
        this.y = y;
    }
    private Point(double y, double x){
        this.x = (int)(x*1000);
        this.y = (int)(y*1000);
    }


    public Point setPoint(double y, double x){
        return new Point(y,x);
    }


    public Point setPoint(int y, int x){
        return new Point(y,x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}