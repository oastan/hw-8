public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + deposit;
            total = total + total / 100;
            System.out.println("Месяц " + month++ + " , сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a = a + 1;
        }
        System.out.println();
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
        System.out.println();
        System.out.println("Задача 4");
        double total1 = deposit;
        double savings = 12000000.0;
        double rate = 1.07;
        int month1 = 0;
        while (total1 < savings) {
            total *= rate;
            month1++;
        }

        System.out.println();
        System.out.println("Задача 5");
        double total2 = deposit;
        double savings1 = 12000000.0;

        for (int month2 = 1; total2 < savings1; month2++) {
            total2 *= 1.07;
            if (month2 % 6 == 0) {
                System.out.println("В месяце " + month2 + "сумма накоплений равна " + month2);

                System.out.println("Задача 6");

                int deposit3 = 15000;
                int total3 = 0;
                int year2 = 9;
                int month3 = 1;
                int monthInYear = 12;
                int monthTotal = year2 * monthInYear;

                while (month3 <= monthTotal ) {
                    total3 = total3 + deposit3;
                    total3 = total3 + (total3 * 7) / 100;
                    if (month2 % 6 == 0)
                    {
                        System.out.println( month3 + " сумма накоплений равна " + total3);
                    }
                    month3++;




                System.out.println();
                System.out.println("Задача 7");

                int firstFriday = 1;
                int day = 0;
                int daysPerMonth = 31;
                for (day = firstFriday; day <= daysPerMonth; day += 7) {
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");

                    System.out.println();
                    System.out.println("Задача 8");
                    int yearBefore = 2024 - 200;
                    int yearAfter = 2024 + 100;
                    int year1 = 0;
                    for (year1 = yearBefore; year1 < yearAfter; year1++) {
                        if (year1 % 79 == 0) {
                            System.out.println(year1);
                        }
                    }

                    }

                }
            }
        }
    }}
