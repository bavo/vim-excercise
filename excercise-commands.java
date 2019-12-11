import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //TODO overload this method with a non generic parameter.

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }


    // TODO this should be private
    // TODO delete this unused parameter
    public void ensureCapa(int unused) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // TODO delte this unused parameter
    @SuppressWarnings("unchecked")
    public E get(int i, int unused) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("TODO print a good message here");
        }
        return (E) elements[i];
    }
}
