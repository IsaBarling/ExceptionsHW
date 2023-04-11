import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4};
        try {
            int[] diffArr = getDifferenceArray(arr1, arr2);
            System.out.println(Arrays.toString(diffArr));
        } 
        catch (ArrayLengthMismatchException e) {
          System.out.println("Ошибка: длины массивов не совпадают");
        }
    }

    public static int[] getDifferenceArray(int[] arr1, int[] arr2) throws ArrayLengthMismatchException {
        if (arr1.length != arr2.length) {
            throw new ArrayLengthMismatchException();
        }

        int[] diffArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            diffArr[i] = arr1[i] - arr2[i];
        }
        return diffArr;
    }
}

class ArrayLengthMismatchException extends Exception {
    public ArrayLengthMismatchException() {
        super();
    }
}
