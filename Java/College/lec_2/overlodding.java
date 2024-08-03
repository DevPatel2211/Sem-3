class Area {
    // Circle Area
    static double Geometric(double a) {
        return a * a * 22 / 7;
    }

    // Triangle Area
    static double Geometric(double a, double b) {
        return a * b / 2;
    }

    static int Geometric(int c) {
        return c * c;
    }

    static int Geometric(int c, int d) {
        return c * d;
    }
}

public class overlodding {
    public static void main(String[] args) {
        System.out.println(Area.Geometric(11));
        System.out.println(Area.Geometric(0.5));
        System.out.println(Area.Geometric(12, 13));
        System.out.println(Area.Geometric(0.5, 0.5));
    }
}