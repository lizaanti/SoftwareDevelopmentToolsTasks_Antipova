import java.util.Objects;

class Triplet<A> {
    private final A first;
    private final A second;
    private final A third;

    public Triplet(A first, A second, A third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Проверка наличия объекта в триплете
    public boolean contains(A obj) {
        return Objects.equals(first, obj) || Objects.equals(second, obj) || Objects.equals(third, obj);
    }

    // Возвращение наибольшего элемента триплета (для Comparable)
    public A getMaxElement() {
        if (first instanceof Comparable && second instanceof Comparable && third instanceof Comparable) {
            A max = first;
            if (((Comparable<A>) second).compareTo(max) > 0) {
                max = second;
            }
            if (((Comparable<A>) third).compareTo(max) > 0) {
                max = third;
            }
            return max;
        }
        throw new IllegalArgumentException("Элементы не реализуют интерфейс Comparable");
    }

    // Сложение элементов триплета
    public double sumElements() {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            return ((Number) first).doubleValue() +
                    ((Number) second).doubleValue() +
                    ((Number) third).doubleValue();
        }
        throw new IllegalArgumentException("Элементы не являются числами");
    }

    // Строковое представление триплета
    @Override
    public String toString() {
        return first + " " + second + " " + third;
    }
}

// Тестирование
public class Main {
    public static void main(String[] args) {
        // Создание триплета
        Triplet<Integer> triplet = new Triplet<>(5, 10, 15);

        // Проверка наличия элемента
        System.out.println("Содержит ли 10: " + triplet.contains(10)); // true
        System.out.println("Содержит ли 20: " + triplet.contains(20)); // false

        // Наибольший элемент
        System.out.println("Наибольший элемент: " + triplet.getMaxElement()); // 15

        // Сумма элементов
        System.out.println("Сумма элементов: " + triplet.sumElements()); // 30.0

        // Строковое представление
        System.out.println("Строковое представление: " + triplet); // 5 10 15
    }
}
