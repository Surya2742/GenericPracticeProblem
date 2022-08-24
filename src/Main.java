public class Main {
    public static void main(String[] args) {
        Integer[] i = {8, 10, 4, 4535, 867, 9234, 8347, 234, 4675};
        Float[] f = {20.1f, 9.2f, 6.9f, 5.5f};
        String[] s = {"Mohammad", "Rajdeep", "Jaydeep", "Jitendra", "Ashkar"};
        new MaxData(i).maxElement();
        new MaxData(f).maxElement();
        new MaxData(s).maxElement();
    }
}
