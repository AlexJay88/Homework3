public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }



    public static void task1 () {
        System.out.println("Задача 1");
        byte apple=1;
        System.out.println("Яблоко "+apple+" штука");
        short bananas=100;
        System.out.println("Бананов "+bananas+" кг");
        int population=145000000;
        System.out.println("Население России "+population+" человек");
        long temperature=-60L;
        System.out.println("Температура зимой в Якутии опускается до "+temperature+" градусов по цельсию");
        float milk=1.5f;
        System.out.println("Я купил "+milk+" литра молока");
        double serial=2.5;
        System.out.println("Есть такой сериал "+serial+" человека");


    }

    public static void task2 () {
        System.out.println("Задача 2");

        float numberOne = 27.12f;
        System.out.println(numberOne);
        long numberTwo=987678965549L;
        System.out.println(numberTwo);
        float  numberThree= 2.786f;
        System.out.println(numberThree);
        short numberFour =569;
        System.out.println(numberFour);
        short numberFive =-159;
        System.out.println(numberFive);
        short numberSix =27897;
        System.out.println(numberSix);
        byte numberSeven=67;
        System.out.println(numberSeven);

    }

        public static void task3 () {
            System.out.println("Задача 3");
            byte LyudmilaPavlovnaStudents=23;
            byte AnnaSergeevnaStudents=27;
            byte EkaterinaAndreevnaStudents=30;
            short AllPaperSheets=480;
            int AllStudents=LyudmilaPavlovnaStudents+AnnaSergeevnaStudents+EkaterinaAndreevnaStudents;
            int PaperForEveryone=AllPaperSheets/AllStudents;
            System.out.println("На каждого ученика рассчитано "+PaperForEveryone+" листов бумаги ");
        }

            public static void task4 () {
                System.out.println("Задача 4");
                byte bottlesPerMinute=16/2;
                int in20MinutesPerfomance=bottlesPerMinute* 20;
                System.out.println("За 20 минут машина произвела "+in20MinutesPerfomance+" штук бутылок");
                short oneDayInMinutes = 1440;
                short threeDayInMinutes = 4320;
                int oneMonthInMinutes = 43200;
                long oneDayPerfomance=bottlesPerMinute*oneDayInMinutes;
                System.out.println("За сутки машина произвела "+oneDayPerfomance+" штук бутылок");
                long threeDaysPerfomance=bottlesPerMinute*threeDayInMinutes;
                System.out.println("За 3 дня машина произвела "+threeDaysPerfomance+" штук бутылок");
                long oneMonthPerfomance=bottlesPerMinute*oneMonthInMinutes;
                System.out.println("За 1 месяц машина произвела "+oneMonthPerfomance+" штук бутылок");

            }
                public static void task5 () {
                    System.out.println("Задача 5");
                    byte consumptionOfWhitePaintPerClass=2;
                    byte consumptionOfBrownPaintPerClass=4;
                    byte allClasses=120/6;
                    System.out.println("Всего классов в школе "+allClasses);
                    int AllWhitePaint=allClasses*consumptionOfWhitePaintPerClass;
                    int AllBrownPaint=allClasses*consumptionOfBrownPaintPerClass;
                    System.out.println("В школе, где "+allClasses+" классов ,нужно " +AllWhitePaint+" банок белой краски и "+AllBrownPaint+" банок коричневой краски");
                }

                    public static void task6 () {
                        System.out.println("Задача 6");
                        short bananas=5*80;
                        short milk=105*2;
                        short iceCream=100*2;
                        short eggs=4*70;
                        int breakfast=bananas+milk+iceCream+eggs;
                        System.out.println("Всего спортзавтрака "+breakfast+" грамм  ");
                        float allKg=breakfast/1000f;
                        System.out.println("Всего спортзавтрака "+allKg+" килограмм ");
                    }
                    public static void task7 () {
                        System.out.println("Задача 7");
                        short everyDayVersionOne=250;
                        short everyDayVersionTwo=500;
                        short needToLoseWeight=7*1000;
                        int daysOfWeightLossVersionOne=needToLoseWeight/everyDayVersionOne;
                        System.out.println("На похудение уйдет "+daysOfWeightLossVersionOne+" дней,если спортсмен будет терять каждый день по 250 грамм ");
                        int daysOfWeightLossVersionTwo=needToLoseWeight/everyDayVersionTwo;
                        System.out.println("На похудение уйдет "+daysOfWeightLossVersionTwo+" дней,если спортсмен будет терять каждый день по 500 грамм ");
                        int totalNumberOfDays=daysOfWeightLossVersionOne+daysOfWeightLossVersionTwo;
                        int averageNumberOfDays=totalNumberOfDays/2;
                        System.out.println("На похудение уйдет "+averageNumberOfDays+" дней в среднем,чтобы добиться результата похудения ");
                    }
                    public static void task8 () {
                        System.out.println("Задача 8");
                        int salaryMasha=67760;
                        int salaryDenis=83690;
                        int salaryChristina=76230;
                        int salaryMashaAfterARaise=67760/10+67760;
                        int salaryDenisAfterARaise=83690/10+83690;
                        int salaryChristinaAfterARaise=76230/10+76230;
                        int salaryMashaInOneYear=salaryMasha*12;
                        int salaryDenisInOneYear=salaryDenis*12;
                        int salaryChristinaInOneYear=salaryChristina*12;
                        int salaryMashaInOneYearAfter=salaryMashaAfterARaise*12;
                        System.out.println("Зарплата Маши в год после повышения составляет "+salaryMashaInOneYearAfter+" рублей ");
                        int salaryDenisInOneYearAfter=salaryDenisAfterARaise*12;
                        System.out.println("Зарплата Дениса в год после повышения составляет "+salaryDenisInOneYearAfter+" рублей ");
                        int salaryChristinaInOneYearAfter=salaryChristinaAfterARaise*12;
                        System.out.println("Зарплата Кристины в год после повышения составляет "+salaryChristinaInOneYearAfter+" рублей ");
                        int salaryDifferenceMasha=salaryMashaInOneYearAfter-salaryMashaInOneYear;
                        System.out.println("Маша теперь получает "+salaryMashaAfterARaise+" рублей в месяц,годовой доход вырос на "+salaryDifferenceMasha+" рублей");
                        int salaryDifferenceDenis=salaryDenisInOneYearAfter-salaryDenisInOneYear;
                        System.out.println("Денис теперь получает "+salaryDenisAfterARaise+" рублей в месяц,годовой доход вырос на "+salaryDifferenceDenis+" рублей");
                        int salaryDifferenceChristina=salaryChristinaInOneYearAfter-salaryChristinaInOneYear;
                        System.out.println("Кристина теперь получает "+salaryChristinaAfterARaise+" рублей в месяц,годовой доход вырос на "+salaryDifferenceChristina+" рублей");
                    }
}




































