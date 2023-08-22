public class Main {
    public static void main(String[] args) {
        // задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Переменная dog = "+dog);
        System.out.println("Переменная cat = "+cat);
        System.out.println("Переменная paper = "+paper);
        //задача №2
        var dog2 = dog+4;
        var cat2 = cat+4;
        var paper2 = paper+4;
        System.out.println("Переменная dog = "+dog2);
        System.out.println("Переменная cat = "+cat2);
        System.out.println("Переменная paper = "+paper2);
        //задача №3
        var dog3 = dog-3.5;
        var cat3 = cat-1.6;
        var paper3 = paper-7639;
        System.out.println("Переменная dog = "+dog3);
        System.out.println("Переменная cat = "+cat3);
        System.out.println("Переменная paper = "+paper3);
        //задача №4
        var friend = 19;
        System.out.println("Переменная friend = " +friend);
        var friendPlus = friend+2;
        System.out.println("сложение " +friendPlus);
        var friendDivide = friendPlus/7;
        System.out.println("деление "+friendDivide);
        //задача №5
        var frog = 3.5;
        System.out.println("Переменная frog = " + frog);
        var frogMultiplication = frog*10;
        System.out.println("Умножение на 10 переменной frog = "+frogMultiplication);
        var frogDivide = frogMultiplication/3.5;
        System.out.println("Деление на 3.5 переменной frog = "+frogDivide);
        var frogPlus = frogDivide+4;
        System.out.println("Сложение переменной frog = "+frogPlus);
        //задача №6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersWeight = boxer1+boxer2;
        var boxersDifference = boxer2-boxer1;
        System.out.println("Общий вес боксеров = "+boxersWeight+" кг");
        System.out.println("Разница веса боксеров = "+boxersDifference+" кг");
        //задача №7
        System.out.println("Разница веса боксеров = "+boxersDifference+" кг");
        var boxerRemainder = boxer2%boxer1;
        System.out.println("Остаток от деления ="+boxerRemainder+" кг");
        //задача №8
        var hours = 640;
        var workers = hours/8;
        System.out.println("Всего работников в компании — "+workers+ " человек");
        var plusWorkers = workers+94;
        var lessHours = hours/plusWorkers;
        System.out.println("Если в компании работает "+plusWorkers+ " человек, то всего "+lessHours+" часа работы может быть поделено между сотрудниками");
    }
}