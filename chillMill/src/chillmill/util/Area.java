package chillmill.util;

public class Area {

    boolean[][] XPosYPosAndZeroes;

    boolean[][] XPosYNeg;

    boolean[][] XNegYNeg;

    boolean[][] XNegYPos;

    private Area(int max){
        this.XPosYNeg = new boolean[max][max];
        this.XPosYPosAndZeroes = new boolean[max][max];
        this.XNegYPos = new boolean[max][max];
        this.XNegYNeg = new boolean[max][max];
    }

    public static Area createArea(int max){
        return new Area(max);
    }

    public void setPoint(Point point){
        //Lambda?
        if(point.getY()>=0){
            if(point.getX()>=0){
                XPosYPosAndZeroes[point.getY()][point.getX()]=true;
            }
            else XNegYPos[point.getY()][point.getX()]=true;
        }
        else if (point.getX()<0)
        array[(point.getY()>0)][point.getX()]=true;
    }
}
