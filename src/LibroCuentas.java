import java.util.ArrayList;

public class LibroCuentas {
    private final static int TOP = 0;
    private ArrayList<Gasto> collection = new ArrayList<Gasto>();

    public int tamano() {
        return collection.size();
    }

    public void push(Gasto element) {
        collection.add(element);
    }

    public Gasto pop() {
        return collection.remove(TOP);
    }

    @Override
    public String toString() {
        String out = "TOP -> ";

        for (Gasto element: collection) {
            out += element.toString() + " | ";
        }
        return out;
    }
}