# ExceptionsHW
## Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
**файл Main(5).java**
## Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
**файл Main(6).java**
Описание ответа:
* Данный код реализует метод sum2d, который принимает в качестве аргумента двумерный массив строк arr, и возвращает сумму всех чисел в этом массиве. Для этого происходит двойной цикл, перебирающий все элементы массива и пытается преобразовать каждый элемент в целочисленное значение с помощью метода Integer.parseInt. Если элемент не может быть преобразован в целое число, то выбрасывается исключение NumberFormatException.

* Также в данном коде может возникнуть NullPointerException, если входящий массив arr равен null, или если в нём содержатся ячейки с null-значениями. В таком случае, при попытке обращения к элементам массива, возникает ошибка, что приводит к выбросу данного исключения.

* Кроме того, если размер входного массива arr не соответствует ожидаемому размеру 2 на 5, то может возникнуть исключение ArrayIndexOutOfBoundsException, т.к. переменная j будет выходить за пределы размера массива.

Итак, в этом коде могут возникнуть три типа исключений: NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException.
## Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
**файл NewClass1(1).java**
## * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
**файл MyClass.java**
