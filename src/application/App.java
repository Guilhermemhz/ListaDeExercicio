package application;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import model.entities.Professor;

public class App {
    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int x = 999;

        while (x != 100) {
            
            System.out.println();
            System.out.print("Escolha o número do exercicio para resolver: ");
            x = sc.nextInt();
            System.out.println();
        
            switch (x) {
                case 1:
                    exec1(sc);
                    break;
                case 2: 
                    exec2(sc);
                    break;
                case 3: 
                    exec3(sc);
                    break;
                case 4:
                    exec4(sc);
                    break;  
                case 5:
                    exec5(sc);
                    break;
                case 6:
                    exec6(sc);
                    break;
                case 7:
                    exec7(sc);
                    break;
                case 8:
                    exec8(sc);
                    break;
                case 9:
                    exec9(sc);
                    break;
                case 10:
                    exec10(sc);
                    break;  
                case 11:
                    exec11(sc);
                    break;
                case 12:
                    exec12(sc);
                    break;
                case 13:
                    exec13(sc);
                    break;
                case 14: 
                    exec14(sc);
                    break;
                case 15:
                    exec15(sc);
                    break;
                case 16:
                    exec16(sc);
                    break;
                case 17:
                    exec17(sc);
                    break;
                case 18:
                    exec18(sc);
                    break;
                case 19:
                    exec19(sc);
                    break;
                case 20:
                    exec20(sc);
                    break;
                case 21:
                    exec21(sc);
                    break;
                case 22: 
                    exec22(sc);
                    break;
                case 23:
                    exec23(sc);
                    break;
                case 24:
                    exec24(sc);
                    break;
                default:
                    System.out.println("NUMERO DE FUNÇÃO INEXISTENTE");
                    break;
            }
        }
        
        sc.close();
    }

    public static void exec1(Scanner sc){

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        System.out.println("A + B = " + (a + b));

        if (a + b > c) {
            System.out.println("Soma de A + B é maior que C");
        } else {
            System.out.println("Soma de A + B não é maior que C");
        }
    }

    public static void exec2(Scanner sc){

        System.out.print("Digite um valor: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.print(a + " é um número par e");
        } else {
            System.out.print(a + " é um número impar e");
        }

        if (a < 0) {
            System.out.println(" negativo");
        } else {
            System.out.println(" positivo");
        }
    }

    public static void exec3(Scanner sc){

        System.out.print("Valor de A: ");
        int a = sc.nextInt();
        System.out.print("Valor de B: ");
        int b = sc.nextInt();
        int c;
        
        c = (a == b) ? a + b : a * b;

        System.out.println(c);

    }

    public static void exec4(Scanner sc) {
        
        System.out.print("Digite um valor: ");
        int a = sc.nextInt();

        int ant = a - 1;
        int suc = a + 1;

        System.out.println("Numero antecessor: " + ant);
        System.out.println("Numero sucessor: " + suc);

    }

    public static void exec5(Scanner sc) {

        System.out.print("Digite o seu salário: ");
        double userSalary = sc.nextDouble();
        double minSalary = 1293.00;

        System.out.println("Você ganha " + String.format("%.2f", (userSalary / minSalary)) + " salarios minimos");
    }

    public static void exec6(Scanner sc) {

        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();
        double valorAjustado = valor + (valor * 0.05);
        System.out.println("O Valor com 5%: " + String.format("%.2f", valorAjustado));

    }

    public static void exec7(Scanner sc) {

        System.out.print("Enter a Boolean value (true/false): ");
        boolean a = sc.nextBoolean();
        System.out.print("Enter a Boolean value (true/false): ");
        boolean b = sc.nextBoolean();

        if (a && b) {
            System.out.println("Both values are true.");
        } else if (!a && !b) {
            System.out.println("Both values are false");
        } else {
            System.out.println("The values are different");
        }
    }
    
    public static void exec8(Scanner sc) {
        System.out.print("How many numbers will be entered? ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            list.add(number);
        }

        Collections.sort(list);

        for(Integer x : list) {
            System.out.print(x + " ");
        }
    }

    public static void exec9(Scanner sc){

        System.out.println();
        System.out.println("BMI calculator");
        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height(in meters): ");
        double height = sc.nextDouble();

        double imc = weight / Math.pow(height, 2);

        System.out.printf("Your BMI: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("You are Underweight");
        } else if (imc <= 24.9) {
            System.out.println("You are at a Healthy Weight");
        } else if (imc <= 29.9) {
            System.out.println("You are Overweight");
        } else if (imc <= 34.9) {
            System.out.println("You have obesity ");
        } else if (imc <= 39.9) {
            System.out.println("You have severe obesity");
        } else {
            System.out.println("You have morbid obesity");
        }
    }

    public static void exec10(Scanner sc){

        System.out.print("Enter grade 1: ");
        double grade1 = sc.nextDouble();
        System.out.print("Enter grade 2: ");
        double grade2 = sc.nextDouble();
        System.out.print("Enter grade 3: ");
        double grade3 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.printf("Final average: %.2f - ", average);
        if (average < 7) {
            System.out.println("FAILED");
        } else {
            System.out.println("PASSED");
        }
    }

    public static void exec11(Scanner sc){

        System.out.print("Student name: ");
        sc.nextLine(); // clear
        String name = sc.nextLine();
        System.out.print("Enter grade 1: ");
        double grade1 = sc.nextDouble();
        System.out.print("Enter grade 2: ");
        double grade2 = sc.nextDouble();
        System.out.print("Enter grade 3: ");
        double grade3 = sc.nextDouble();
        System.out.print("Enter grade 4: ");
        double grade4 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.printf("Student: %s - Final average: %.2f - ", name, average);
        if (average < 7) {
            System.out.println("FAILED");
        } else {
            System.out.println("PASSED");
        }
    }

    public static void exec12(Scanner sc){

        System.out.print("Enter name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Name: " + name + "| Age: " + age + " - Minor");
        } else {
            System.out.println("Name: " + name + " | Age: " + age + " - Adult");
        }
    }

    public static void exec13(Scanner sc){
        System.out.print("Enter the value A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value B: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    public static void exec14(Scanner sc){
        System.out.print("Nome do produto: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Preço: ");
        Double price = sc.nextDouble();

        double precoDesconto;

        System.out.println("Métodos de pagamento: ");
        System.out.println("1 - A vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - A vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");

        int metPagamento = sc.nextInt();

        if (metPagamento == 1) {
            precoDesconto = price - price * 0.15; 
            System.out.println("Pagamento à vista em dinheiro ou pix com 15% de desconto, Produto: " + name + ", Preço: R$ " + String.format("%.2f", precoDesconto));
        } else if (metPagamento == 2) {
            precoDesconto = price - price * 0.10;
            System.out.println("Pagamento à vista no cartão de crédito com 10% de desconto, Produto: " + name + ", Preço: R$ " + String.format("%.2f", precoDesconto));
        } else if (metPagamento == 3) {
            System.out.println("Pagamento parcelado no cartão em duas vezes, Produto: " + name + ", Preço: R$" + String.format("%.2f", price));
        } else if (metPagamento == 4) {
            precoDesconto = price + price * 0.10;
            System.out.println("Pagamento parcelado no cartão em três vezes ou mais com juros de 10%, Produto: " + name + ", Preço: R$" + String.format("%.2f", precoDesconto));
        }
    }

    public static void exec15(Scanner sc) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter your birthday(dd/MM/yyyy): ");
        LocalDate userBirthday = LocalDate.parse(sc.next(), fmt);
        LocalDate now = LocalDate.now();

        Period p = Period.between(userBirthday, now);
        
        System.out.printf("%d years, %d months and %d days", p.getYears(), p.getMonths() , p.getDays());
    }
    
    public static void exec16(Scanner sc) {

        System.out.println("Enter the three sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("The triangle is equilateral.");
        } else if (a == b || a == c || b == c) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The trianlge is scalene");
        }
    }

    public static void exec17(Scanner sc){

        System.out.print("Enter the temperature in Fahrenheit: ");
        int f = sc.nextInt();
        int c = (5 * (f - 32) / 9);
        System.out.println("The temperature in Celsius is " + c);
    }

    public static void exec18(Scanner sc){
        double heightFranc = 1.50;
        double growFrancPerYear = 0.02;
        double heightSara = 1.10;
        double growSaraPerYear = 0.03;
        int years = 0;

        while (heightSara < heightFranc) {
            heightFranc += growFrancPerYear;
            heightSara += growSaraPerYear;
            years++;
        }

        System.out.printf("It takes %d years for Sara to be taller than Francisco%n", years);
        System.out.println("Francisco's final height: " + String.format("%.2f",heightFranc));
        System.out.println("Sara's final height: " + String.format("%.2f",heightSara));
    }

    public static void exec19(Scanner sc){
        int n = 1;
        while (n < 11) {
            System.out.print("Tabuada do " + n + ": ");
            for(int i = 1; i < 11; i++){
                System.out.print((i * n + " "));
            }
            n++;
            System.out.println();
        }
    }

    public static void exec20(Scanner sc){
        System.out.print("Escolha um número para mostrar sua tabuada: ");
        int num = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }

    public static void exec21(Scanner sc) {
        Random ramdom = new Random();
        int numero = ramdom.nextInt(0,101);
        System.out.println(numero);
    }

    public static void exec22(Scanner sc){
        System.out.println("Digite os dois valores para a divisão: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = a / b;
        int r = a % b;

        System.out.printf("A divisao de %d por %d resulta em %d com o resto de %d", a, b, q, r);
    }

    public static void exec23(Scanner sc){
        System.out.print("Professor's name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Value per hour: ");
        double valuePerHour = sc.nextDouble();
        System.out.print("Number of Classes: ");
        int numberOfClasses = sc.nextInt();

        Professor professor = new Professor(name, valuePerHour, numberOfClasses);

        System.out.print("Net salary: $" + String.format("%.2f", professor.salary()));
    }

    public static void exec24(Scanner sc){
        System.out.print("Enter travel time (hours): ");
        double time = sc.nextDouble();
        System.out.print("Enter average speed(km/h): ");
        double speed = sc.nextDouble();

        double distance = speed * time;
        double liters = distance / 12;

        System.out.printf("Distance traveled: %.2f km%n", distance);
        System.out.printf("Fuel used: %.2f liters%n", liters);
    }
}
