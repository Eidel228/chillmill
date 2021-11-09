package chillmill.shapes;

import chillmill.util.Area;
import chillmill.util.Point;

public class LineFromTwoPoints extends AbstractShape {

    //Fields
    Point pointA;

    Point pointB;

    //Setters, getters
    public Point getPointA() {
        return pointA;
    }

    public void  setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    @Override
    public Area calculatePoints() {
        Area area = new Area();
        return new Area();
    }


}
