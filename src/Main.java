public class Main {
    public static void main(String[] args) {
        lesson1();
        lesson2();
        System.out.println();
        lesson3();
        System.out.println();
        lesson4();
        System.out.println();
        lesson5();
        System.out.println();
        lesson6();
        System.out.println();
        lesson7();
    }

    private static void lesson1() {
        // Задача 1: Объявите переменные типа int, byte, short, long, float, double.
        int intVariable = 2147483647;
        byte byteVariable = 127;
        short shortVariable = 32767;
        long longVariable = 9223372036854775807L;
        float floatVariable = 22.22222f;
        double doubleVariable = 22.2222222222222222;
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);
    }

    private static void lesson2() {
        // Задача 2: Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.

        /* Значения:
        27.12
        987 678 965 549
        2,786
        569
        -159
        27897
        67
         */

        float floatVariable = 27.12f;
        long longVariable = 987678965549L;
        float floatVariable2 = 2.786f;
        short shortVariable = 569; //Ну или int.
        short shortVariable2 = -159;
        short shortVariable3 = 27897;
        byte byteVariable = 67; // Полагаю это единственный случай. когда этот тип уместен.
    }

    private static void lesson3() {
        // Задача 3:
        /*Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги». */

        int ludmilaPavlovnasStudents = 23;
        int annaSergeevnasStudents = 27;
        int ecaterinaAndreevnaStudents = 30;

        int totalStudents = ludmilaPavlovnasStudents + annaSergeevnasStudents + ecaterinaAndreevnaStudents;
        int totalPappers = 480;

        double pappersPerStudent =  (double) totalPappers / totalStudents;

        System.out.println("На каждого ученика рассчитано " + pappersPerStudent + " листов бумаги");
    }

    private static void lesson4() {
        // Задача 4:
        /* Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
                за 20 минут,
                в сутки,
                за 3 дня,
                за 1 месяц?
                Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
                Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        Для объявления переменных не используйте тип var. */

        int bottlesPerTwoMinutes = 16;
        float bottlesPerMinute = (float) 16 / 2;
        int bottlesPerTwentyMinutes = (int) (bottlesPerMinute * 20);
        int bottlesPerDay = (int) (bottlesPerMinute * 60 * 24);
        int bottlesPerThreeDays = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;
        int bottlesPerMonthAnother = bottlesPerDay * 31;
        int bottlesPerMonthOneMore = bottlesPerDay * 28;

        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок");
        System.out.println("В сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonthOneMore + " штук бутылок (28 дневный месяц)");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок (30 дневный месяц)");
        System.out.println("За месяц машина произвела " + bottlesPerMonthAnother + " штук бутылок (31 дневный месяц)");
    }

    private static void lesson5() {
        // Задача 5:
        /* На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
           Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
           Для объявления переменных не используйте тип var. */

        int totalBottleOfPaint = 180;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;

        System.out.println("Если на 1 класс уходит 2 банки белой краски и 4 коричневой, а всего мы имеем 180 банок, то:");
        System.out.println("Мы получим следующее уравнение: 2x + 4x = 180");
        System.out.println("6x = 180");
        System.out.println("x = 180/6 = 30 (шт) Классов в школе");
        int classesTotal = 30;
        System.out.println("2 * 30 = 60 (шт) Белой краски было куплено");
        int whitePaintTotal = 60;
        System.out.println("4 * 30 = 120 (шт) Коричневой краски было куплено");
        int brownPaintTotal = 120;
        System.out.println("Ответ: В школе, где " + classesTotal + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски.");
    }

    private static void lesson6() {
        // Задача 6:
        /* Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
                Бананы — 5 штук (1 банан — 80 грамм).
                Молоко — 200 мл (100 мл = 105 грамм).
                Мороженое-пломбир — 2 брикета по 100 грамм.
                Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
                Смешать всё в блендере — и готово.
        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
                Результат в граммах и килограммах напечатайте в консоль. */

        System.out.println("Дано: рецепт.");
        int bananasWeightTotal = 5 * 80;
        float milkWeightTotal = (float) 200 / 100 * 105;
        int iceCreamWeightTotal = 2 * 100;
        int eggsWeightTotal = 4 * 70;

        float weightOfDishTotalInGrams = bananasWeightTotal + milkWeightTotal + iceCreamWeightTotal + eggsWeightTotal;
        float weightOfDishTotalInKilograms = weightOfDishTotalInGrams / 1000;

        System.out.println("Итоговый вес блюда равен: " + weightOfDishTotalInKilograms + " кг");
    }

    private static void lesson7() {
        // Задача 7:
        /*
        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой
        категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог
        терять в весе от 250 до 500 грамм в день.

        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.
        */

        int plannedWeightLossInKG = 7;
        int plannedWeightLossInGram = 7 * 1000;

        int minPlannedWeightLoss = 250;
        int maxPlannedWeightLoss = 500;

        float daysOfWeightLossWithMinimalEffort = (float) plannedWeightLossInGram / minPlannedWeightLoss;
        float daysOfWeightLossWithMaximumEffort = (float) plannedWeightLossInGram / maxPlannedWeightLoss;
        float daysOfWeightLossOnAverage = (float) plannedWeightLossInGram / ((float) (minPlannedWeightLoss + maxPlannedWeightLoss) / 2);

        System.out.println("Дней похудения при минимальных усилиях: " + daysOfWeightLossWithMinimalEffort);
        System.out.println("Дней похудения при максимальных усилиях: " + daysOfWeightLossWithMaximumEffort);
        System.out.println("Дней похудения в среднем: " + daysOfWeightLossOnAverage);
    }
}