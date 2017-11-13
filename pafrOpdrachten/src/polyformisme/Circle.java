package polyformisme;

/**
 * Created by patrick on 11/13/2017.
 */
public class Circle extends Shape
{
    private int radius;

    // constructor
    Circle(int newx, int newy, int radius)
    {
        super(newx, newy);
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    // draw the rectangle
    @Override
    void draw()
    {
        System.out.println("Drawing a Circle at:(" + getX() + ", " + getY() +
                "), radius " + getRadius());
    }
}
