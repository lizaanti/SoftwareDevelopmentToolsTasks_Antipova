import java.util.Objects;

abstract class GeometricObject {
    public abstract double getArea();
    public abstract double getPerimeter();
}

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {
        this.side = 0.0;
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Клонирование не поддерживается", e);
        }
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Octagon octagon = (Octagon) o;
        return Double.compare(octagon.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "Octagon{" +
                "side=" + side +
                '}';
    }

    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5);
        System.out.println("Площадь: " + octagon1.getArea());
        System.out.println("Периметр: " + octagon1.getPerimeter());

        Octagon octagon2 = octagon1.clone();
        System.out.println("Площадь клонированного восьмиугольника: " + octagon2.getArea());
        System.out.println("Сравнение: " + octagon1.compareTo(octagon2));
    }
}
