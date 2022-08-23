public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte rose = 10;
        short tulip = 88;
        int astra = 111;
        long chamomile = 200L;
        float grainWeight = 3.5f;
        double flourWeight = 7.5;
        char plus = 43;
        System.out.println(plus);
        int man = 35;
        boolean manIsAdult = man > 18;
        System.out.println(manIsAdult);

        // Задание 2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weightOfAllBoxers = boxer1 + boxer2;
        System.out.println(weightOfAllBoxers);
        float weightDifference = boxer2 - boxer1;
        System.out.println(weightDifference);
        System.out.println(" Общий вес боксеров " + weightOfAllBoxers);
        System.out.println(" Разница в весе боксеров " + weightDifference);

        // Задание 3
        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;
        int weightOfOneBananas = 80;
        int weightOfAllBananas = bananas * weightOfOneBananas;
        System.out.println(weightOfAllBananas);
        int weightOfOnePortionMilk = 105;
        int weighOfAllMilk = weightOfOnePortionMilk * milk;
        System.out.println(weighOfAllMilk);
        int weightOfOneIceCream = 100;
        int weightOfAllIceCream = iceCream * weightOfOneIceCream;
        System.out.println(weightOfAllIceCream);
        int weightOfOneEgg = 70;
        int weightOfAllEggs = eggs * weightOfOneEgg;
        System.out.println(weightOfAllEggs);
        int weightOfAllProducts = weightOfAllBananas + weightOfAllEggs + weighOfAllMilk + weightOfAllIceCream;
        System.out.println(weightOfAllProducts);
        System.out.println(" Общий вес всех продуктов в завтраке " + weightOfAllProducts + " гр ");
        int grPerkg = 1000;
        float weightOfAllProductsInKg = weightOfAllProducts / (float)grPerkg;
        System.out.println(weightOfAllProductsInKg);
        System.out.println(" Общий вес всех продуктов в завтраке " + weightOfAllProductsInKg + " кг ");

        // Задание 4
        short weightLossPerDayGr = 250;
        short grPerKg = 1000;
        short goToLoseWeightKg = 7;
        int goToloseWeightGr = goToLoseWeightKg * grPerKg;
        int daysForWeightLoss = goToloseWeightGr / weightLossPerDayGr;
        System.out.println(" Если худеть по 250 гр в день, потребуется " + daysForWeightLoss + " дней ");
        short weightLossPerDayGr2 = 500;
        int dayForWeightLoss2 = goToloseWeightGr / weightLossPerDayGr2;
        System.out.println(" Если худеть по 500 гр в день, потребуется " + dayForWeightLoss2 + " дней ");
        int averageNumberOfDaysToLoseWeight = (daysForWeightLoss + dayForWeightLoss2) / 2;
        System.out.println(averageNumberOfDaysToLoseWeight);
        System.out.println( " В среднем для похудения на 7 кг потребуется " + averageNumberOfDaysToLoseWeight + " дней ");

        // Задание 5
        int Masha = 67760;
        int annualIncomeMasha = Masha * 12;
        int Denis = 83690;
        int annualIncomeDenis = Denis * 12;
        int Kristina = 76230;
        int annualIncomeKristina = Kristina * 12;
        int MashaIncrease = Masha*10/100;
        System.out.println(MashaIncrease);
        int MashaNew = Masha + MashaIncrease;
        System.out.println(MashaNew);
        System.out.println(" Зарплата Маши после повышения составит " + MashaNew + " рублей ");
        int annualIncomeMashaNew = MashaNew * 12;
        int differenceMasha = annualIncomeMashaNew - annualIncomeMasha;
        System.out.println(differenceMasha);
        System.out.println("Годовой доход Маши вырастет на " + differenceMasha + " рублей ");
        int DenisIncrease = Denis*10/100;
        System.out.println(DenisIncrease);
        int DenisNew = Denis + DenisIncrease;
        System.out.println(DenisNew);
        System.out.println(" Зарплата Дениса после повышения составит " + DenisNew + " рублей ");
        int annualIncomeDenisNew = DenisNew * 12;
        int differenceDenis = annualIncomeDenisNew - annualIncomeDenis;
        System.out.println(differenceDenis);
        System.out.println("Годовой доход Дениса вырастет на " + differenceDenis + " рублей ");
        int KristinaIncrease = Kristina*10/100;
        System.out.println(KristinaIncrease);
        int KristinaNew = Kristina + KristinaIncrease;
        System.out.println(KristinaNew);
        System.out.println(" Зарплата Кристины после повышения составит " + KristinaNew + " рублей ");
        int annualIncomeKristinaNew = KristinaNew * 12;
        int differenceKristina = annualIncomeKristinaNew - annualIncomeKristina;
        System.out.println(differenceKristina);
        System.out.println("Годовой доход Кристины вырастет на " + differenceKristina + " рублей ");



    }
}