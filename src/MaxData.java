import java.util.Arrays;

public class MaxData <T extends Comparable<T>> {
    private T[] inputArray;

    MaxData(T[] inputArray){
        this.inputArray = inputArray;
    }

    public void  maxElement() {
        System.out.println("Original input \t: " + Arrays.deepToString(inputArray));
        Arrays.sort(inputArray);
        System.out.println("Sorted input \t: " + Arrays.deepToString(inputArray));
        System.out.println("Maximum value is : " + inputArray[inputArray.length - 1]);
    }
}
