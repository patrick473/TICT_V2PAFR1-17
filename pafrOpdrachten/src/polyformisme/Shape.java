package polyformisme;

/**
 * Created by patrick on 11/13/2017.
 */
public class Shape {
    private int newx;
    private int newy;

    public Shape(int newx, int newy) {
        this.newx = newx;
        this.newy = newy;
    }

    public int getX() {
        return newx;
    }

    public void setX(int newx) {
        this.newx = newx;
    }

    public int getY() {
        return newy;
    }

    public void setY(int newy) {
        this.newy = newy;
    }
    void draw(){
        System.out.println("printing shape at x="+getX()+" y="+getY());
    }
    void rMoveTo(int x, int y){
        setX(x);
        setY(y);
    }
}
