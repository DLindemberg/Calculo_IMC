import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso: ");

        float peso = sc.nextFloat();

        System.out.println("Digite a altura: ");

        float altura = sc.nextFloat();

        float calculo = peso / (altura * altura);

        String nivel = "";

        if (calculo < 18.5) {

            nivel = "abaixo do peso";

        }

        if (calculo >= 18.5 && calculo <= 24.9) {

            nivel = "no peso ideal";

        }

        if (calculo >= 25.0 && calculo <= 29.9) {

            nivel = "com sobrepeso";

        }

        if (calculo >= 30.0 && calculo <= 34.9) {

            nivel = "com obesidade nível I";

        }

        if (calculo >= 35.0 && calculo <= 39.9) {

            nivel = "com obesidade nível II";

        }

        if (calculo >= 40) {

            nivel = "com obesidade nível III (mórbido)";

        }

        System.out.println("O resultado do IMC é " + String.format("%.2f", calculo)
                + ", "
                + "você está "
                + nivel
                + ".");

    }

}
