package com.flawden.module2.homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    /*
    ## Задание 1

    Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
    Код должен работать с любой последовательностью и объемом списка чисел.
    В качестве отладочной информации можете использовать список чисел:

    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))
     */
    private static void task1() {
        System.out.println(nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
    }

    /*
    ## Задание 2

    Напишите код, с помощью которого можно напечатать только четные числа без повторений в
    порядке возрастания. Код должен работать с любой последовательностью и объемом списка
    чисел.
    В качестве отладочной информации можете использовать список чисел:

    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))
     */
    private static void task2() {
        System.out.println(new HashSet<>(nums).stream().toList().stream().sorted().collect(Collectors.toList()));
    }

    /*
    ## Задание 3

    Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором
    могут встречаться дубли. Код должен работать с любой последовательностью и объемом списка
    слов.
    В качестве отладочной информации возьмите произвольный набор слов или текст, в котором
    встречаются повторения.
     */
    private static void task3() {

    }

    /*
    ## Задание 4

    Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
    Код должен работать с любой последовательностью и объемом списка слов.
    В качестве отладочной информации используйте:

    List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

     Если вы используете предложенный нами пример, то в консоли должно в произвольном порядке
     распечататься:

     1
     2
     3
     */
    private static void task4() {

    }

}
