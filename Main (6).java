import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {10, 5, 8, 12};
        int[] b = {6, 2, 4, 3};

        try {
            int[] diffArr = differenceArrays(a, b);
            System.out.println("Difference of arrays: " + Arrays.toString(diffArr));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        String[][] arr = {{"1", "2", "3", "4", "5"}, {"6", "7", "8", "9", "10"}, {"11", "12", "13", "14", "15"}};

        try {
            int sum = sum2d(arr);
            System.out.println("Sum of 2D array: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid value in 2D array: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int[] differenceArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Arrays have different lengths");
        }

        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }

        return result;
    }

    public static int sum2d(String[][] arr) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }

        return sum;
    }
}

/*
В этом коде могут возникнуть три исключения:

NullPointerException, если переданный массив является null или какой-либо из его элементов является null.
NumberFormatException, если строка, переданная в метод parseInt, не может быть преобразована в целочисленный тип.
ArrayIndexOutOfBoundsException, если в массиве arr не хватает элементов для доступа к элементу с индексом j или i.
*/