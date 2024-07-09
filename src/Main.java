public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int salary = 15000;
        int total = 0;
        int i = 1;
        for (; total < 2_459_000; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a = a + 1;
        }
        for (int b = 10; b > 0; b--) {
            System.out.println(b);
        }

        System.out.println("Задача 3");

        double population = 12_000_000;
        double birthRate = 17.0 / 1000;
        double mortalityRate = 8.0 / 1000;
        for (int year = 1; year <= 10; year++) {
            double birthPerYear = population * birthRate;
            double deatthsPerYear = population * mortalityRate;
            population = population + birthPerYear - deatthsPerYear;
            System.out.println("Год " + year + " численность населения оставляет " + population);
        }
        System.out.println("Задача 4");

        int deposit = 15000;
        total = 0;
        int month = 0;
        while (month > 0) {

        }
        while (total <= 12_000_000) {
            total = total + deposit;
            total = total + (total * 7) / 100;
            System.out.println("За " + month++ + " месяц сумма накоплений равна " + total);
        }

        System.out.println("Задача 5");

        deposit = 15000;
        total = 0;
        month = 0;
        while (month >= 0) {
            while (total <= 12_000_000) {

                total = total + deposit;
                total = total + (total * 7) / 100;
                if (month % 6 == 0) {
                    System.out.println("За " + month++ + " месяц сумма накоплений равна " + total);
                }
                month++;
            }
        }


            System.out.println("Задача 7");
            for (int g = 1; g < 31; g++) {
                if (g % 7 == 0) {
                    System.out.println("Сегодня пятница " + g + " -е число. Необходимо подготовить отчет");
                }
            }


        System.out.println("Задача 8");
            int yearBefore = 2024 - 200;
            int yeerAfter = 2024 + 100;
            int year = 0;
            for (year =yearBefore; year < yeerAfter; year ++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }



        }







    }