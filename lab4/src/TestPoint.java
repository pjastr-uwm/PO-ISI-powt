public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x=0;
        p1.y=0;
        Point p2 = new Point();
        p2.x = 3;
        p2.y = 4;
        System.out.println(p1.distance(p2));
    }
}

class Point{
    double x,y;
    double distance(Point otherPoint){
        return Math.sqrt((x-otherPoint.x)*(x-otherPoint.x)
                +(y- otherPoint.y)*(y- otherPoint.y));
    }
}
