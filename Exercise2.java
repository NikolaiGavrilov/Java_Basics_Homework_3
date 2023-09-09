// Задание 2
// Удаление четных элементов
// Напишите функцию removeEvenNumbers, которая принимала бы
// произвольный список целых чисел, удаляла бы из него четные
// числа и выводила список без четных чисел.

// Напишите свой код в методе removeEvenNumbers класса Answer.
// Метод removeEvenNumbers принимает на вход один параметр:

// Integer[] arr - список целых чисел

import java.util.Arrays;
import java.util.ArrayList;
class Answer {
    public static void main(String[] args) {
        Integer [] userArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeEvenNumbers(userArray);
    }
    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> arrayNew = new ArrayList<Integer>();
        for(int i : arr) {
            arrayNew.add(i);
        }
        System.out.println("Initial list");
        System.out.println(arrayNew);
        for (int i = 0; i < arrayNew.size(); i++) {
            if (arrayNew.get(i)%2 == 0){
                arrayNew.remove(arrayNew.get(i));
            }
        }
        System.out.println("Resulting list");
        System.out.println(arrayNew);
    }
}