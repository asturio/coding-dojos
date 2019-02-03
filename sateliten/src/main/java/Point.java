public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Point && this.x == ((Point) other).x && this.y == ((Point) other).y;
    }
}
