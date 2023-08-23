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
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println("Переменная dog = "+dog);
        System.out.println("Переменная cat = "+cat);
        System.out.println("Переменная paper = "+paper);
        //задача №3
        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println("Переменная dog = "+dog);
        System.out.println("Переменная cat = "+cat);
        System.out.println("Переменная paper = "+paper);
        //задача №4
        var friend = 19;
        System.out.println("Переменная friend = " +friend);
        friend = friend+2;
        System.out.println("сложение " +friend);
        friend = friend/7;
        System.out.println("деление "+friend);
        //задача №5
        var frog = 3.5;
        System.out.println("Переменная frog = " + frog);
        frog = frog*10;
        System.out.println("Умножение на 10 переменной frog = "+frog);
        frog = frog/3.5;
        System.out.println("Деление на 3.5 переменной frog = "+frog);
        frog = frog+4;
        System.out.println("Сложение переменной frog = "+frog);
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
        var amountOfHours = 640;
        var hoursPerWorker = 8;
        var workers = amountOfHours/hoursPerWorker;
        System.out.println("Всего работников в компании — "+workers+ " человек");
        workers = workers+94;
        var lessHours = amountOfHours%workers;
        System.out.println("Если в компании работает "+workers+ " человек, то всего "+lessHours+" часов работы может быть поделено между сотрудниками.");
    }
}