public class Main {
    public static void main(String[] args) {
        // задача №1
        int age = 14;
        if (age <= 18) {
            System.out.println("Товй возраст " + age + " , нужно немного подождать");
        } else {
            System.out.println("Товй возраст " + age + " , ты достиг совершеннолетия!");
        }
        //задача №2
        int temperature = 2;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градуса(ов), нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градуса(ов), можно идти без шапки");
        }
        //Задача №3
        int speed = 62;
        if (speed <= 60) {
            System.out.println("Ваша скрость " + speed + " км/ч, можно ездить спокойно");
        } else {
            System.out.println("Ваша скрость " + speed + " км/ч, приедется заплатить штраф");
        }
        //Задача №4 переменная age взята из первой задачи
        boolean kindergarten = age >= 2 && age <= 6;
        boolean school = age >= 7 && age <= 18;
        boolean university = age >= 18 && age <= 24;
        boolean workAge = age >= 24;

        if (kindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else {
            if (school) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else {
                if (university) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                } else {
                    if (workAge) {
                        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                    }
                }
            }

        }

        //Задача №5 переменная age взята из первой задачи
        if (age <5){
            System.out.println("Если возраст ребенка равен "+age+" то ему нельзя кататься на аттрационе");
        }else {
            if (age >=5 && age <=14){
                System.out.println("Если возраст ребенка равен "+age+" можно кататься на аттрационе, но в сопровождении взрослого");
            }else {
                if (age >14){
                    System.out.println("Если возраст ребенка равен "+age+" можно кататься на аттракционе без сопровождения взрослого");
                }
            }
        }
        //Задача №6
        int capacity = 102;
        int passengers = 10;
        if(passengers < 60){
            System.out.println("В вагоне еще есть сидячие места");
        }else {
            if (passengers >= 60 && capacity>passengers){
                System.out.println("В вагоне остались стоячие места");
            }else {
                System.out.println("В вагоне нет мест");
            }
        }
        //Задача №7
        int one = 3;
        int two = 3;
        int three = 3;

        if (one > two && one > three){
            System.out.println("Число one больше");
        }else {
            if (two>one && two > three) {
                System.out.println("Число two больше");
            }else {
                if (three > one && three > two){
                    System.out.println("Число three больше");
                }
            }
        }
    }
}