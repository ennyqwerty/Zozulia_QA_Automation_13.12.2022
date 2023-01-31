package com.hillel.lessons.lesson11.homework14;

public class Main {
    //    Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи йому обліковий запис, приймаючи наступні параметри:
    //    Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
    //    Ім'я
    //    Дата народження (окремо день, місяць, рік)
    //    Емейл
    //    Телефон
    //    Змінювані:
    //    Прізвище
    //    Вага
    //    Тиск
    //    Кількість пройдених за день кроків
    //    Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
    //    Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
    //    Після прийому року народження - вираховувати вік користувача у внутрішню змінну age (відштовхуючись просто від 2023 року,
    //    ускладнювати тут не будемо), на яку зробити тільки геттер і виводити на екран разом з іншими полями в методі printAccountInfo();
    //    у конструкторі або геттерах/сеттерах не використовуємо виведення в консоль.
    //    У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик методу printAccountInfo();
    //    для двох користувачів змінити кілька полів та роздрукувати нові дані повторно

    public static void main(String[] args) {
        FitnessApp user1 = new FitnessApp("Enny", 15, 03, 1986,
                "ennyqwerty0@gmail.com", 380984280470L, "Tester",
                65.6,75,9090,  2023);
        user1.printAccountInfo();
        System.out.println();

        FitnessApp user2 = new FitnessApp("Enny1", 10, 04, 1976,
                "ennyqwerty01@gmail.com", 380984280479L, "Tester1",
                70,85,9000,  2023);
        user2.printAccountInfo();
        System.out.println();

        FitnessApp user3 = new FitnessApp("Enny2", 11, 11, 1991,
                "ennyqwerty02@gmail.com", 380984280490L, "Tester2",
                89,80,8200,  2023);
        user3.printAccountInfo();
        System.out.println();

        user1.setName("Anna");
        user1.setEmail("anna.zozulya01@gmail.com");
        System.out.println(user1);
        System.out.println();


        user2.setEmail("anna.zozulya02@gmail.com");
        user2.setPhoneNumber(14176668888L);
        user2.setDayBirthday(01);
        user2.setMonthBirthday(02);
        user2.setYearBirthday(1999);
        System.out.println(user2);
        System.out.println();
    }


}
