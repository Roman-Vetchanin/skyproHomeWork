public class Main {
    public static void main(String[] args) {
        //задача №1
        byte a = 122;
        short b = 30000;
        int c = 123123123;
        long d = 123123123123L;
        float e = 123123.12234f;
        double f = 123.1241243132;
        System.out.println("Значение переменной a с типом byte = "+a);
        System.out.println("Значение переменной b с типом short = "+b);
        System.out.println("Значение переменной c с типом int = "+c);
        System.out.println("Значение переменной d с типом long = "+d);
        System.out.println("Значение переменной e с типом float= "+e);
        System.out.println("Значение переменной f с типом double= "+f);

        //задача №2
        float g = 27.12f;
        long h = 987678965549L;
        float i = 2786f;
        short j = 569;
        short k = 27897;
        byte l = 67;

        //задача №3
        byte studentsLudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        short sheetsOfPaper = 480;
        int totalStudents = studentsLudmilaPavlovna+studentsAnnaSergeevna+studentsEkaterinaAndreevna;
        int amountOfPaperPerStudent = sheetsOfPaper /totalStudents;
        System.out.println("На каждого ученика рассчитано "+amountOfPaperPerStudent+" листов бумаги");

        //задача №4
        byte bottlesPerMinute = 16/2;
        short bottlesIn20minutes = (short) (20*bottlesPerMinute);
        byte minutesToHours = 60;
        short minuteIn24Hours = (short) (24*minutesToHours);
        short bottlesIn24Hours = (short) (bottlesPerMinute*minuteIn24Hours);
        int bottlesIn3days = bottlesIn24Hours*3;
        int bottlesInMonth = bottlesIn24Hours*30;
        System.out.println("За 20 минут машина произвела " + bottlesIn20minutes+ " штук бутылок");
        System.out.println("За сутки (24 часа) машина произвела "+ bottlesIn24Hours+ " штук бутылок");
        System.out.println("За 3 дня машина произвела "+ bottlesIn3days+ " штук бутылок");
        System.out.println("За месяц (30 дней) машина произвела "+ bottlesInMonth+ " штук бутылок");

        //задача №5
        byte cansOfWhitePaintPerOffice = 2;
        byte cansOfBrownPaintPerOffice = 4;
        byte totalAmountOfPaint = 120;
        byte totalOfOffice = (byte) (totalAmountOfPaint/(cansOfBrownPaintPerOffice+cansOfWhitePaintPerOffice));
        byte totalOfCansOfWhitePaint = (byte) (totalOfOffice*cansOfWhitePaintPerOffice);
        byte totalOfCansOfBrownPaint = (byte) (totalOfOffice*cansOfBrownPaintPerOffice);
        System.out.println("В школе, где " +totalOfOffice+ " классов, нужно "+totalOfCansOfWhitePaint+ " банок белой краски и "+totalOfCansOfBrownPaint+" банок коричневой краски");

        //задача №6
        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;
        byte quantityBanana = 5;
        byte quantityMilk = 2;
        byte quantityIceCream = 2;
        byte quantityEggs = 4;
        short weight5Bananas = (short) (weightBanana*quantityBanana);
        short weight200mlMilk = (short) (weightMilk*quantityMilk);
        short weight2IceCream = (short) (weightIceCream*quantityIceCream);
        short weight4Eggs = (short) (weightEgg*quantityEggs);
        short totalWeight = (short) (weight5Bananas+weight200mlMilk+weight2IceCream+weight4Eggs);
        System.out.println("Вес спортивного завтрака "+totalWeight+ " грамм");
        short gramsInKilogram = 1000;
        float weightInKilogram = (float) totalWeight/gramsInKilogram;
        System.out.println("Вес спортивного завтрака "+weightInKilogram+" кг");

        //задача №7
        byte quantityKilograms = 7;
        short minus250Gramm = 250;
        short minus500Gramm = 500;
        short gramsPerDay250 = (short) (quantityKilograms*gramsInKilogram/minus250Gramm);
        short gramsPerDay500 = (short) (quantityKilograms*gramsInKilogram/minus500Gramm);
        short averageNumberOfDays = (short) ((gramsPerDay250+gramsPerDay500)/2);
        System.out.println("Если спортсмен будет худеть по "+minus250Gramm+" грамм то потребуется "+gramsPerDay250+" дней, а если будет худеть по "+minus500Gramm+" грамм то потребуется "+gramsPerDay500+" дней. Срденее количество дней "+ averageNumberOfDays);

        //задача №8
        variables-part2
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float percentage = 0.1f;

        int percentForMasha = (int) (masha+(masha*percentage));
        int percentForDenis = (int) (denis+(denis*percentage));
        int percentForKristina = (int) (kristina+(kristina*percentage));

        int monthInYear = 12;

        int incomeInYearMashaOld = masha*monthInYear;
        int incomeInYearDenisOld = denis*monthInYear;
        int incomeInYearKristinaOld = kristina*monthInYear;

        int incomeInYearMashaNew = percentForMasha*monthInYear;
        int incomeInYearDenisNew = percentForDenis*monthInYear;
        int incomeInYearKristinaNew = percentForKristina*monthInYear;

        int incomeDifferenceMasha = incomeInYearMashaNew-incomeInYearMashaOld;
        int incomeDifferenceDenis = incomeInYearDenisNew-incomeInYearDenisOld;
        int incomeDifferenceKristina = incomeInYearKristinaNew-incomeInYearKristinaOld;

        System.out.println("Маша теперь получает "+percentForMasha+" рублей. Годовой доход вырос на "+incomeDifferenceMasha+" рублей");
        System.out.println("Денис теперь получает "+percentForDenis+" рублей. Годовой доход вырос на "+incomeDifferenceDenis+" рублей");
        System.out.println("Кристина теперь получает "+percentForKristina+ " рублей. Годовой доход вырос на "+incomeDifferenceKristina+" рублей");

        var amountOfHours = 640;
        var hoursPerWorker = 8;
        var workers = amountOfHours/hoursPerWorker;
        System.out.println("Всего работников в компании — "+workers+ " человек");
        workers = workers+94;
        var lessHours = hoursPerWorker*workers;
        System.out.println("Если в компании работает "+workers+ " человек, то всего "+lessHours+" часов работы может быть поделено между сотрудниками.");

    }
}