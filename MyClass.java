import java.util.Arrays;


public class MyClass {
    public static int[] divideArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Arrays must have the same length");
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                throw new RuntimeException("Division by zero");
            }
            result[i] = a[i] / b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {4, 8, 12};
        int[] b = {2, 0, 3};
        try {
            int[] result = divideArrays(a, b);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

