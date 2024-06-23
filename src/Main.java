public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
// задание 1
        var dog = 8 ;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


// задание 2
        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4 ;
        System.out.println(cat);
        paper = paper + 4 ;
        System.out.println(paper);

        // Задание 3
        System.out.println("Задание 3");
        var result1 = dog - 3.5;
        System.out.println (result1);
        var resylt2 = cat - 1.6;
        System.out.println(resylt2);
        var rusult3 = paper - 7639;
        System.out.println(rusult3);

        // Задание 4
        System.out.println("Задание 4");
var friend = 19 ;
        System.out.println(friend);
        var result4 = friend + 2 ;
        System.out.println(result4);
        var result5 = result4 / 7;
        System.out.println(result5);

        //ЗАдание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        var result6 = frog + 10;
        System.out.println(result6);
        var result7 = result6 % 3.5 ;
        System.out.println(result7);
        var result8 = result7 + 4 ;
        System.out.println(result8);

        //Задание 6
        System.out.println("Задание 6");
        var  a = 78.2;
        var  b = 82.7;
        var result11 = a + b ;
            System.out.println("Общий вес боксеров " + result11+ " кг!");
            var result10 = b - a ;
        System.out.println("Разница между массами бойцов " + result10 + " кг!");

        System.out.println("Задание 7");
        var result12 = b % a;
        System.out.println("Остаток от деления " + result12 + " кг!");

        //Задание 8
        System.out.println("Задание 8");
        var hours = 640;
        var hoursPerEmployee = 8;

        var totalEmployees = hours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");

        var additionalEmployees = 94;
        var totalHours = (totalEmployees + additionalEmployees) * hoursPerEmployee;
        System.out.println("Если в компании работает " + (totalEmployees + additionalEmployees) + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}
