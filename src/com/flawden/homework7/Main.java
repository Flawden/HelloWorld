package com.flawden.homework7;

public class Main {

    public static void main(String[] args) {
        task1(2_459_000D, 15000D);
        task2();
    }

    /*
    Задача 1
    Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с
    накоплениями.
    С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить
    2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать
    по 15 тысяч рублей.
    Результат программы должен быть выведен в консоль с тем количеством месяцев, которое
    необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений
    равна … рублей» .
     */
    private static void task1(double plannedTotalMoney, double onePayment) {
        double money = 0D;
        int counter = 0;
        while (money <= plannedTotalMoney) {
            money += onePayment;
            counter++;
        }
        System.out.println("Месяц " + counter + ", сумма накоплений равна " + money + " рублей.");
    }

    /*
    Задача 2
    Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
    На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
    Для обоих циклов можно использовать как одну общую переменную, так и свою в каждом цикле.
    Не забудьте выполнить переход на новую строку между двумя циклами.
    В результате программы вывод должен получиться следующим:
    1 2 3 4 5 6 7 8 9 10
    10 9 8 7 6 5 4 3 2 1
     */
    private static void task2() {
        int counter = 1;
        for (;counter <= 10;counter++) {
            System.out.print(counter + " ");
        }
        System.out.println();
        while (counter > 1) {
            System.out.print(--counter + " ");
        }
    }

    /*
    Задача 3
    В стране Y население — 12 миллионов человек.
    Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая
    численность населения будет через 10 лет, если показатели рождаемости и смертности
    постоянны.
    В консоль выведите результат операции на каждый год в формате: «Год …, численность
    населения составляет …».
     */
    private static void task3() {

    }

    /*
    Задача 4
    Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада
    добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
    Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать
    сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а
    всегда равен 7%.
    Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
     */
    private static void task4() {

    }

    /*
    Задача 5
    Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
    а только каждый шестой. Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие
    месяцы.
     */
    private static void task5() {

    }

    /*
    Задача 6
    Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма
    его накоплений каждые полгода на протяжении этих 9 лет.
    Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
    Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение
    9 лет.
     */
    private static void task6() {

    }

    /*
    Задача 7
    В компании пятница — отчетный день.
    Нужно написать программу, которая считает дни месяца по датам, определяет, какой день —
    пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
    Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число
    от 1 до 7).
    Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня
    пятница, ...-е число. Необходимо подготовить отчет».
    В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с
    напоминаниями по разным датам.
     */
    private static void task7() {

    }

    /*
    Задача 8
    Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает
    комета.
    Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
    В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также
    следующий год ее появления (ближайшие 100 лет).
    Для вычисления периода можно создать две дополнительные переменные, которые содержат год за
    200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в
    качестве завершения периода расчета.
    В результате решения задачи в консоли должен получиться следующий результат:
        -1896
        -1975
        -2054
     */
    private static void task8() {

    }

}
