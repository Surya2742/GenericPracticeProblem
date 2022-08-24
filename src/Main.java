public class Main {
    public static void main(String[] args) {
        new MaxData(5, 6, 7).maxElement();
        new MaxData(8, 10, 4).maxElement();
        new MaxData(20, 9, 6).maxElement();
        System.out.println("");
        new MaxData(5.4f, 6.7f, 7.9f).maxElement();
        new MaxData(8.7f, 10.2f, 4.4f).maxElement();
        new MaxData(20.1f, 9.2f, 6.9f).maxElement();
        System.out.println("");
        new MaxData("Ajay", "Abhishek", "Arif").maxElement();
        new MaxData("Mohammad", "Rajdeep", "Jaydeep").maxElement();
        new MaxData("Kaushal", "Jitendra", "Ashkar").maxElement();
    }
}
