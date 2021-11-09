package chillmill.shapes;

import chillmill.util.Area;

public abstract class AbstractCircle extends AbstractShape {

    private final double p = 3.1416;

    private int diameter;

    private int radius;

    private Area area;

    public int getRadius(){
        return radius;
    };

    public void setRadius(int radius){
        this.radius=radius;
        this.diameter=radius*2;
    };

    public int getDiameter(){
        return diameter;
    };

    public void setDiameter(int diameter){
        this.radius=diameter/2;
        this.diameter=diameter;
    };

}
