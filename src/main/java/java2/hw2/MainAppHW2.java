package java2.hw2;

import java.util.Arrays;

public class MainAppHW2 {

    public static void main(String[] args) {

        // корректный массив
        String [][] arr = { {"00", "01", "02", "03"},
                            {"10", "11", "12", "13"},
                            {"20", "21", "22", "23"},
                            {"30", "31", "32", "33"} };

        // некорректный массив 1
        String [][] arr1 =
                { {"00", "01", "02", "03"},
                  {"10", "11", "12", "13"},
                  {"20", "21", "22", "23", "24"},
                  {"30", "31", "32", "33"} };

        // некорректный массив 2
        String [][] arr2 =
                      { {"00", "01", "02", "03"},
                        {"10", "11", "12", "13"},
                        {"20", "21", "22", "23"},
                        {"30", "31", "32", "33"},
                        {"40", "41", "42"}};

        // некорректный массив 3
        String [][] arr3 =
                { {"00", "01", "02", "03"},
                  {"10", "11", "12", "13"},
                  {"20", "aa", "22", "23"},
                  {"30", "31", "32", "33"} };

        try {
        cheсkArrSum(arr);
        }
        catch (MyArrayDataException e) {
            System.out.println("Массив некорректный. Строка: " + e.getI() + "Столбец: " + e.getJ());
        }
        catch (MyArraySizeException  e) {
            System.out.println("Размер массива некорректный");
        }

        try {
            cheсkArrSum(arr1);
        }
        catch (MyArrayDataException e) {
            System.out.println("Массив некорректный. Строка: " + e.getI() + "Столбец: " + e.getJ());
        }
        catch (MyArraySizeException  e) {
            System.out.println("Размер массива некорректный");
        }

        try {
            cheсkArrSum(arr2);
        }
        catch (MyArrayDataException e) {
            System.out.println("Массив некорректный. Строка: " + e.getI() + "Столбец: " + e.getJ());
        }
        catch (MyArraySizeException  e) {
            System.out.println("Размер массива некорректный");
        }

        try {
            cheсkArrSum(arr3);
        }
        catch (MyArrayDataException e) {
            System.out.println("Массив некорректный. Строка: " + e.getI() + " Столбец: " + e.getJ());
        }
        catch (MyArraySizeException  e) {
            System.out.println("Размер массива некорректный");
        }

        //cheсkArrSum(arr);
        //cheсkArrSum(arr1);
        //cheсkArrSum(arr2);
        //cheсkArrSum(arr3);

    }

    // печать массива строк 4х4 c преоборазованием в int с суммированием членов массива
    public static void cheсkArrSum(String[][] arr) throws MyArrayDataException, MyArraySizeException{
        int sum=0;
        boolean arrGood=true;

        finish:
        for (int i = 0; i < arr.length; i++) {

//            try {
                if (arr.length != 4) {
                    throw new MyArraySizeException(i);
                }
//            }
//            catch (MyArraySizeException e) {
//                    System.out.println("Массив недопустимого размера. Колличество строк не равно 4.");
//                    arrGood=false;
//                    break;
//            }

            for (int j = 0; j < arr[i].length; j++) {

//                try {
                    if (arr[i].length != 4) {
                        throw new MyArraySizeException(i);
                     }
//                }
//                catch (MyArraySizeException e) {
//                    System.out.println("Массив недопустимого размера. Колличество элементов в строке не равно 4.");
//                    System.out.println("Строка: " + e.getLine());
//                    arrGood=false;
//                    break finish;
//                }

                // System.out.printf("%s ", arr[i][j]); // строка для контрольной печати массива

                try {
                    sum+=Integer.parseInt (arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
//                    System.out.printf("Массив некорректный. В строке %d столбец %d не число. %n", i, j);
//                    arrGood=false;
//                    break finish;
                }

            }
            // System.out.println(); // строка для контрольной печати массива
        }
        if (arrGood) {
            System.out.printf("Массив корректный. Сумма элементов массива равна %d. %n", sum);
        }
    }
}
