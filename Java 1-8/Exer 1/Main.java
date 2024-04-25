import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Adição: " + Calculadora.adicionar(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
        
        System.out.println("Divisão por zero:");
        double resultado = Calculadora.dividir(num1, 0);
        if (Double.isNaN(resultado)) {
            System.out.println("Não é possível dividir por zero");
        } else {
            System.out.println("Resultado: " + resultado);
        }
        
        scanner.close();
    }
}