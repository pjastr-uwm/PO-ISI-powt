package finalne.zad11;

public final class InmutablePoint {

    private final double x;
    private final double y;
    private final double z;

    public InmutablePoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "InmuablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InmutablePoint that = (InmutablePoint) o;

        if (Double.compare(x, that.x) != 0) return false;
        if (Double.compare(y, that.y) != 0) return false;
        return Double.compare(z, that.z) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

//class AdvancedInmutablePoint extends InmutablePoint {
//
//    public AdvancedInmutablePoint(double x, double y, double z) {
//        super(x-9, y+1, z);
//    }
//}
