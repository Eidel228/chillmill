package chillmill.shapes;

import chillmill.util.Area;

public abstract class AbstractShape{

    Area points = calculatePoints();

    public abstract Area calculatePoints();
}