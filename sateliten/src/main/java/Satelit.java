import java.util.List;

public class Satelit {
    private final List<Point> route;

    private Satelit(List<Point> route) {
        if (route == null) {
            throw new IllegalArgumentException("Not launched");
        }
        this.route = route;
    }

    public static Satelit withRoute(List<Point> route) {
        return new Satelit(route);
    }

    public boolean isOnRoute(Point p) {
        return p != null && route.contains(p);
    }

    public int whenAreYouOver(Point p) {
        for (int index = 0; index < route.size(); index++) {
            if (route.get(index).equals(p)) {
                return index;
            }
        }
        throw new PointNotInTheRouteException();
    }
}
