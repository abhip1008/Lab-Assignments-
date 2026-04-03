public class ObjectList {

    private Object[] myShapes;
    private int numElements;

    public ObjectList() {
        myShapes = new Object[100];
        numElements = 0;
    }

    public void add(Object nx) {
        myShapes[numElements] = nx;
        numElements++;
    }

    @Override
    public String toString() {
        String result = "";

        for(int i =0; i < numElements; i++) {
            result += myShapes[i].toString() + "\n";
        }
        return result;
    }
}
