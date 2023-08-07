package com.conversor;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Sistema de Conversão de Moedas\n");
        System.out.println(
                "A seguir veja as Moedas disponiveis para conversão:\n USD - Dólar Americano\n EUR - Euro\n CAD - Dólar Canadense\n ARS - Peso Argentino\n UYU - Peso Uruguaio\n CLP - Peso Chileno\n CNY - Yuan Chineze\n");
        System.out.println("Escolha a moeda que deseja converter:\n"); // qual moeda vai ser converdida

        String fromMoeda = sc.nextLine();
        System.out.println("Agora escolha para qual moeda voce deseja converter a moeda " + fromMoeda + ": \n");
        String toMoeda = sc.nextLine(); // para qual moeda vai virar

        System.out.println("Qual o valor que deseja converter?: \n");
        double valor = sc.nextDouble(); // valor a ser convertido
        sc.nextLine(); // Limpar o buffer de quebra de linha

        CurrencyConverter cc = new CurrencyConverter();
        double resultado = cc.convertCurrency(valor, fromMoeda, toMoeda);
        DecimalFormat df = new DecimalFormat("0.00");
        String resultadoFormatado = df.format(resultado);

        System.out.println("Resultado: " + resultadoFormatado);

        sc.close();
    }
}
