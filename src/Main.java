
//ДОМАШНЕЕ ЗАДАНИЕ 1
//задача 1
public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Вам еще нет 18, нужно немного подождать.");
        }

        //задача 2
        int age_1 = 19;
        if (age_1 >= 7 && age_1 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age_1 >= 18 && age_1 < 24) {
            System.out.println("Вы закончили школу и поступаете в институт.");
        }
        if (age_1 > 24) {
            System.out.println("Вам пора устраиваться на работу.");
        }

        //Задача 3
        int van = 60;
        if (van < 60) {
            System.out.println("В вагоне еще есть сидячие места.");
        }
        if (van >= 60 && van < 102) {
            System.out.println("В вагоне остались только стоячие места");
        }
        if (van >= 102) {
            System.out.println("Вагон полный, свободные места отсутствуют. Подождите следующий поезд.");
        }

        //ДОМАШНЕЕ ЗАДАНИЕ 2
        //Задание 1

        int age_3 = 119;
        if (age_3 >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        } else {
            System.out.println("Вам еще нет 18, нужно немного подождать.");
        }


        //задача 2
        int age_4 = 2;
        if (age_4 >= 7 && age_4 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age_4 >= 18 && age_4 < 24) {
            System.out.println("Вы закончили школу и поступаете в институт.");
        } else {
            System.out.println("Вам пора устраиваться на работу.");
        }

        //Задача 3
        int van_1 = 10;
        if (van_1 >= 0 && van_1 <= 60) {
            System.out.println("В вагоне еще есть сидячие места.");
        } else
            System.out.println("Вагон полный, свободные места отсутствуют. Подождите следующий поезд.");
        {
            if (van_1 > 60 && van_1 < 102)
                System.out.println("В вагоне остались только стоячие места");
        }


        //ДОМАШНЕЕ ЗАДАНИЕ 3
        //Задача 1
        int age_5 = 30;
        boolean goToWork = age_5 >= 24;
        if (age_5 >= 2 && age_5 <= 6) {
            System.out.println("Если возраст человека равен " + age_5 + " , то ему нужно ходить в садик.");
        } else if (age_5 >= 7 && age_5 <= 18) {
            System.out.println("Если возраст человека равен " + age_5 + " , то ему нужно ходить в школу.");
        } else if (age_5 >= 18 && age_5 <= 24) {
            System.out.println("Если возраст человека равен " + age_5 + " , то ему нужно ходить в университет.");
        } else if (goToWork) {
            System.out.println("Если возраст человека более 24 лет, то ему нужно ходить на работу.");
        }


        //Задача 2

        int ageChildren = 16;
        if (ageChildren <= 5){
            System.out.println("Ребенок в возрасте "+ ageChildren +" лет, не может кататься на аттракционах.");
        }
        else if (ageChildren > 5 && ageChildren <= 14){
            System.out.println("Ребенок в возрасте "+ ageChildren +" лет, может кататься на аттракционах только в сопровождении взрослых.");
        } else {
            System.out.println("Ребенок в возрасте "+ ageChildren +" лет, может кататься на аттракционах, без сопровоздения");
        }


        //Задача 3

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two)
        {
            if (three > one)
                System.out.println(three);
            else
                System.out.println(one);
        }
        if (three > two)
        {
            if (three > one)
                System.out.println(three);
            else
                System.out.println(one);
        }



    }
}