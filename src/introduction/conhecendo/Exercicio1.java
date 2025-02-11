package introduction.conhecendo;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /* Faça um programa que receba como entrada um valor que represente uma temperatura em
        graus Celsius e imprima esse valor convertido em Kelvin e Fahrenheit

        K = C + 273.15
        F = C * 1.8 + 32
        */

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite uma temperatura em graus Celsius(°C): ");
        double temperaturaCelsius = scanner.nextDouble();

        double kelvin = temperaturaCelsius + 273.15;
        double fahrenheit = temperaturaCelsius * 1.8 + 32;

        System.out.println("A temperatura em Kelvin é: " + kelvin + "°K");
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
    }
}
