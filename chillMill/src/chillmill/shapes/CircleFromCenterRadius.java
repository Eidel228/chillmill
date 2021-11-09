package chillmill.shapes;

import chillmill.util.Area;
import chillmill.util.Point;

import java.util.Optional;

public class CircleFromCenterRadius extends AbstractCircle {

    //Fields
    private Point center;

    //Setters, getters
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    //Calculations
    @Override
    public Area calculatePoints() {
        int a = getRadius();
        double doubleA = a / 1000.0;
        int line = 0;
        Area area = Area.createArea(getRadius());
        double dec = 1.0 / a;
        do {
            a--;
            doubleA-=0.001;

            Point point = Math.sin(dec*a);
            boolean[][].setX(Math.sin(a / getRadius())
                    *getRadius());
        }while (a>0);
            return array;
    }
}