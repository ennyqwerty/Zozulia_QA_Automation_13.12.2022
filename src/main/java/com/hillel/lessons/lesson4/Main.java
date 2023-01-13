package com.hillel.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Арифметичні оператори.
        // Додавання, віднімання, множення, ділення
        System.out.println(10 + 3); // харкод, краще використовувати змінні
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        System.out.println(a /(double) b);
        System.out.println((double) a / b);
        System.out.println((double) a /(double) b);


        // Цікавіші арифметичні операції:
        //Ділення із відкиданням дробової частини
        System.out.println((double) a); // в консолі буде виводитись 10.0
        System.out.println((int) 10.45687);  // в консолі буде виводитись 10, залишок просто відкидається

        // Залишок від ділення - використовується для визначення парності числа, задопомогою символа %
        System.out.println(a % b); //3*3=9   10-9=1

        System.out.println(10 % 2); //5*2=10  10-10
        System.out.println(10 % 3); //3*3=9   10-9=1
        System.out.println(10 % 4); //2*4=8   10-8=2
        System.out.println(10 % 5); //0 2*5= 10  10-10=0
        System.out.println(10 % 6); //4 1*6=6   10-6=4
        System.out.println(10 % 7); //3
        System.out.println(10 % 8); //2
        System.out.println(10 % 9); //1   1*9=9  10-9=1
        System.out.println(10 % 10); //0  1*10=10   10-10=0

        //Скороченні оператори

        int c = 10;
        int d = 3;

        c = c + 5; // 10 +5
        System.out.println(c);
        c = c + 5; // 15 +5
        System.out.println(c);
        c = c + 5; // 20 +5
        System.out.println(c);  // довга форма запису, нижче буде описано як записувати сорочено

        System.out.println("Скороченні оператори:");

        d += 5; // += говорить джаві, що ми до змнної d додаємо число 5 і автоматично кладемо у нашу змінну, 3+5=8
        System.out.println(d);

        d += 5 + 10 * 2; // 8+5+10*2=33, бо в попередньому прикладі ми вже перезаписали значення змінної на 8.
        System.out.println(d);

        d -= 3; // 33-3=30
        System.out.println(d);

        d *= 2; // 30*2=60
        System.out.println(d);

        d /= 6; // 60/6=10
        System.out.println(d);


        //Пріоритет обчислення як в матиматиці
        System.out.println("Пріоритет:");

        int e = 10;
        int f = 5;

        System.out.println(e + f * e - f); // 55
        System.out.println((e + f) * e - f); // 145
        System.out.println((e + f) * (e - f)); // 75

        //Префіксний та постфіксний інкремент та декремент - використовується в лічильниках для циклів

        int g = 10;
        int h =3;

        g = g + 1; //найдовша операція
        System.out.println(g);
        g += 1; //коротша операція
        System.out.println(g);
        System.out.println("постфіксний інкремент g++:");
        g++;  //найкоротша операція - інкремент
        System.out.println(g);

        System.out.println("постфіксний декремент h--:");
        h--;  //найкоротша операція - декремент
        h--;
        System.out.println(h);


        System.out.println("Постфіксний інкремент j++:");
        int j =10;
        int k = 5;
        System.out.println("before j" + j); // 10

        System.out.println(10 + j++); // 20

        System.out.println("after j" + j); // 11

        //Префіксний інкремент
        System.out.println("Префіксний інкремент ++k:");
        System.out.println("before k " + k); // 5

        System.out.println(10 + ++k); // 16

        System.out.println("after k " + k); // 6

        int a1 = 10;
        int b1 = 3;

        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);

        System.out.println(a1++ + b1++ - a1--); // 10+3-11

        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);

        int a2 = 10;
        int b2 = 3;

        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);

        System.out.println(--a2 + b2++ + ++b2 - a2++); //9+3+5-9

        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);

        int a3 = 10;
        int b3 = 10;

        System.out.println(--a3); //9
        System.out.println(--a3); //8
        System.out.println(--a3); //7
        System.out.println(--a3); //6

        System.out.println(b3--); //10
        System.out.println(b3--); //9
        System.out.println(b3--); //8
        System.out.println(b3--); //7
        System.out.println(b3);

        int a4 = 10;
        int b4 = 3;

        System.out.println("a4 = " + a4);
        System.out.println("b4 = " +b4);

        System.out.println(--a4 + (a4++ + --b4) + b4--); // 9 + (9 +2) + 2 = 22 - операції йдуть почергово, а при розрахунку йде за математичним пріоритетом (спочатку в дужках...)

        System.out.println("a4 = " + a4);
        System.out.println("b4 = " +b4);

        // Операції з класу Math. https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println((int) 10.7);
        System.out.println(Math.round(10.45)); // 10
        System.out.println(Math.round(10.4)); // 10
        System.out.println(Math.round(10.6)); //11

        System.out.println(Math.abs(-10)); //10
        System.out.println(Math.abs(10)); //10

        System.out.println("max = " + Math.max(22, 11));

        System.out.println("min = " + Math.min(22, 11));

        System.out.println("sqrt = " + Math.sqrt(26));
        System.out.println("піднесення до степення " + (int) Math.pow(3, 2)); // 9
        System.out.println("піднесення до степення " +  Math.pow(3, 2)); // 9.0

        // від  0.0 до 0.99999999999999999999999999
        System.out.println("рандомні числа від 0 до 0.9999999999");
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        //від 0 до 10
        // 0.00 * 11 = 0 min
        // 0.99999 * 11 = 10,9999999 (int) = 10 - max
        System.out.println("рандомні числа від 0 до 10");
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));


        //від 15 до 30
        // 0.00 * 11 + 15 = 15 min
        // 0.99999 * 31 = 10,9999999 (int) = 10 - max

        int min = 15;
        int max = 30;
        System.out.println("рандомні числа від 15 до 30, розрахунок на яке треба помножити рандом, щоб вийшло від 15 до 30 ");
        System.out.println(max - min + 1);

        System.out.println("рандомні числа від 15 до 30");

        System.out.println((int) (min + (Math.random() * (max - min +1))));
        System.out.println((int) (15 + (Math.random() * 16)));
        System.out.println((int) (15 + (Math.random() * 16)));
        System.out.println((int) (15 + (Math.random() * 16)));
        System.out.println((int) (15 + (Math.random() * 16)));
        System.out.println((int) (15 + (Math.random() * 16)));
        System.out.println((int) (15 + (Math.random() * 16)));
        System.out.println((int) (15 + (Math.random() * 16)));
        System.out.println((int) (15 + (Math.random() * 16)));

        //task1
//        Дано: зарплати трьох працівників за 1 місяць (a, b, c)
//        Розрахувати:
//        1. для кожного працівника суму зарплати за 10 років
//        2. відняти 5% податок
//        3. порахувати середнє арифметичне за трьома сумами за 10 років
//        4. вивести суми зарплат за 10 років з урахуванням вирахування податків та
//        середнє арифм.

        int a5 = 500;
        int b5 = 1500;
        int c5 = 3500;

        int years = 10*12;

        int employeeA5Salary10years = years * a5;
        int employeeB5Salary10years = years * b5;
        int employeeC5Salary10years = years * c5;

        System.out.println("Працівник a5 отримає за 10 років " + employeeA5Salary10years + "$");
        System.out.println("Працівник b5 отримає за 10 років " + employeeB5Salary10years + "$");
        System.out.println("Працівник c5 отримає за 10 років " + employeeC5Salary10years + "$");

        double withoutTax = 0.05;
        double employeeA5Salary10yearsWithoutTax = employeeA5Salary10years - (employeeA5Salary10years * withoutTax);
        double employeeB5Salary10yearsWithoutTax = employeeB5Salary10years - (employeeB5Salary10years * withoutTax);
        double employeeC5Salary10yearsWithoutTax = employeeC5Salary10years - (employeeC5Salary10years * withoutTax);

        System.out.println("Працівник a5 отримає за 10 років з відрахуванням податків " + employeeA5Salary10yearsWithoutTax + "$");
        System.out.println("Працівник b5 отримає за 10 років з відрахуванням податків " + employeeB5Salary10yearsWithoutTax + "$");
        System.out.println("Працівник c5 отримає за 10 років з відрахуванням податків " + employeeC5Salary10yearsWithoutTax + "$");

        int count = 3;
        double avgWithoutTax = (employeeA5Salary10years + employeeB5Salary10years + employeeC5Salary10years) / (double) count;
        double avgWithTax = (employeeA5Salary10yearsWithoutTax + employeeB5Salary10yearsWithoutTax + employeeC5Salary10yearsWithoutTax) / (double) count;

        System.out.println("Середня арифметична зп працівників за 10 років без відрахування податків " + avgWithoutTax + "$");
        System.out.println("Середня арифметична зп працівників за 10 років з відрахуванням податків " + avgWithTax + "$");

    }
}
