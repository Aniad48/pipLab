package entities;

public class Try {
    private double x;
    private double y;
    private int r;
    private String result;
    public Try(double x, double y, int r, String result){
        this.x=x;
        this.y=y;
        this.r=r;
        this.result=result;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public String getResult() {
        return result;
    }


}
