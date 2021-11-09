package chillmill.shapes;

import chillmill.util.Area;
import chillmill.util.Point;

public class Rounding extends AbstractCircle {

    //Fields
    private AbstractShape shapeA;

    private AbstractShape shapeB;

    //Setters, getters
    public AbstractShape getShapeA() {
        return shapeA;
    }

    public void setShapeA(AbstractShape shapeA) {
        this.shapeA = shapeA;
    }

    public AbstractShape getShapeB() {
        return shapeB;
    }

    public void setShapeB(AbstractShape shapeB) {
        this.shapeB = shapeB;
    }

    @Override
    public Area calculatePoints() {
        return new Point[];
    }
}