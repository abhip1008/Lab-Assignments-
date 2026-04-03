public class IntList {
    private int[] data = new int[100];
    private int numElements = 0;

    public void add(int n) {
        data[numElements] = n;
        numElements++;
    }

    @Override
    public String toString(){
        String retVal = "";

        for(int i = 0; i < numElements; i++) {
            retVal += data[i];
            if(i < numElements - 1) {
                retVal += ", ";
            }
        }
        return retVal;
    }

    public int sum() {
        int total = 0;

        for(int i = 0; i < numElements; i++) {
            total += data[i];
        }

        return total;
    }

    public static void main(String[] args) {
        IntList a = new IntList();
        a.add(95);
        a.add(100);
        a.add(23);

        System.out.println(a.toString());
    }
}
