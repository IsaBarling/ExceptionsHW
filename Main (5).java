public class Main {
    public static void main(String[] args) {
        // вызов методов для генерации исключений
        methodOne();
        methodTwo();
        methodThree();
    }
    
    // метод, генерирующий ArithmeticException
    public static void methodOne() {
        int a = 10;
        int b = 0;
        int c = a / b; // деление на ноль
    }
    
    // метод, генерирующий ArrayIndexOutOfBoundsException
    public static void methodTwo() {
        int[] arr = new int[5];
        arr[6] = 10; // обращение к несуществующему индексу массива
    }
    
    // метод, генерирующий NullPointerException
    public static void methodThree() {
        String str = null;
        int length = str.length(); // обращение к методу объекта, равного null
    }
}
