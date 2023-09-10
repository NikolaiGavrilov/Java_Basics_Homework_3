// Задание 3
// Анализатор списка
// Напишите функцию analyzeNumbers, которая принимает
// на вход целочисленный список arr и:
// Сортирует его по возрастанию и выводит на экран
// Находит минимальное значение в списке и выводит на экран - Minimum is {число}
// Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Answer {
    public static void main(String[] args) {
        Integer [] userArr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        analyzeNumbers(userArr);
    }
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList <Integer> arrList = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        ArrayList <Integer> arrSortedList = new ArrayList<>(arrList.size());
        Collections.sort(arrList);
        for(int element: arrList){  
            arrSortedList.add(element); 
         }
        System.out.println(arrSortedList);
        int minVal = arrSortedList.get(0);
        int maxVal = arrSortedList.get(arrSortedList.size() - 1);
        int summ = 0;
        for (int i = 0; i < arrSortedList.size(); i++) {
            summ +=arrSortedList.get(i);
        }
        int arithmeticMean = summ / arrSortedList.size();
        System.out.print("Minimum is " + minVal);
        System.out.println();
        System.out.print("Maximum is " + maxVal);
        System.out.println();
        System.out.print("Average is = " + arithmeticMean);
    }
}
