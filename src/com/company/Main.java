package com.company;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static int alunosAprovados = 0;
    public static void main(String[] args) {
	// write your code here

        /* 1 - Baby Steps*/

        //String Planeta = "Plutão";
        //System.out.println("Ex 01 " +Planeta);

        /*
        2 -  Hello Clarice
         */

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");*/

        /*
        3 - A Bit of Information
        */

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + ", sua idade é " + idade + " anos.");
        */

        /*
            4 - A Bit of Geometry
        */

        //Retangulo

        /* Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);
        */

        //Quadrado

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);*/

        //losango

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();

        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losango é: " + area);*/

        //Paralelogramo

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do paralelogramo: ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do paralelogramo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A area do paralelogramo é: " + area);*/

        //Triangulo

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);*/

        //Circulo

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);*/

        //5 - 1, 2 e 3

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número informado é positivo.");
        } else if (numero < 0) {
            System.out.println("O número informado é negativo.");
        } else {
            System.out.println("O número informado é neutro (zero).");
        }*/

        //6 - Qual o maior?

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int maior = num1;

        if(num2 > maior){
            maior = num2;
        }

        if (num3 > maior){
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);*/

        // 6.1 - Qual o maior? (4 vezes pior)

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num4 = scanner.nextInt();

        int maior = num1;

        if(num2 > maior){
            maior = num2;
        }

        if (num3 > maior){
            maior = num3;
        }

        if (num4 > maior){
            maior = num4;
        }

        System.out.println("O maior número é: " + maior);*/

        // 7 - Qual o quê?

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int maior1 = num1;
        int maior2 = num2;

        if (num3 > maior1) {
            maior2 = maior1;
            maior1 = num3;
        } else if (num3 > maior2) {
            maior2 = num3;
        }

        int soma = maior1 + maior2;

        System.out.println("A soma dos dois maiores números é: " + soma);*/

        //7.1 - 5 vezes?

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num4 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num5 = scanner.nextInt();

        int maior1 = num1;
        int maior2 = num2;

        if (num3 > maior1) {
            maior2 = maior1;
            maior1 = num3;
        } else if (num3 > maior2) {
            maior2 = num3;
        }

        if(num4 > maior1){
            maior2 = maior1;
            maior1 = num4;
        } else if (num4 > maior2){
            maior2 = num4;
        }

        if(num5 > maior1){
            maior2 = maior1;
            maior1 = num5;
        } else if(num5 > maior2){
            maior2 = num5;
        }

        int soma = maior1 + maior2;

        System.out.println("A soma dos dois maiores números é: " + soma);*/

        // 8 - Enquanto isso

        /*Scanner scanner = new Scanner(System.in);
        //DecimalFormat para formatar o resultado
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        double valor2;
        do{
            System.out.println("Digite o segundo valor (n pode ser zero ou negativo: ");
            valor2 = scanner.nextDouble();
        }while (valor2 <= 0);

        double result = valor1/valor2;

        System.out.println("O resultado da divisão é: " + df.format(result));*/



        //9 -  Cansar de Digitar

        /*Scanner scanner = new Scanner(System.in);

        int totalValor = 10;
        int soma = 0;

        System.out.println("Digite 10 valores: ");

        for(int i = 1; i <= totalValor; i++){
            System.out.println("Digite o valor " + i + ": ");
            int valor = scanner.nextInt();
            soma += valor;
        }

        double media = (double) soma/totalValor;

        System.out.println("\n Valores informados: ");
        for (int i = 1; i <= totalValor; i++){
            System.out.println(i + ": " + scanner.nextInt() + " ");
        }

        System.out.println("\nA média aritmética dos valores é: " + media);*/

        //10 - Parabéns

        /*Scanner scanner = new Scanner(System.in);

        double n1, n2, n3, n4;
        double media;

        System.out.println("Digite a nota da primeira avaliação: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda avaliação: ");
        n2 = scanner.nextDouble();

        System.out.println("Digite a nota da terceira avaliação: ");
        n3 = scanner.nextDouble();

        System.out.println("Digite a nota da quarta avaliação: ");
        n4 = scanner.nextDouble();

        media = (n1 + n2 + n3 + n4)/ 4;

        System.out.println("\nMédia do semestre: " + media);

        if(media >= 6.0){
            System.out.println("PARABÉNS! Você foi aprovado!");
        }else{
            System.out.println("REPROVADO");
        }*/

        //11 - BOOOOMMM

        /*for (int i = 30; i >= 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("EXPLOSÃO! ");*/

        //12 - 10, 9, 8, 7, 6, 5, 4, 3, 2, 1...

        /*for(int i = 10; i>= 1; i--){
            System.out.println(i);
        }*/

        //13 - De quanto até quanto?

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int pnum = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int snum = scanner.nextInt();

        int soma = 0;
        int qtdnum = 0;

        for (int i = pnum; i <= snum; i++){
            soma += i;
            qtdnum++;
        }

        double media = (double) soma / qtdnum;

        System.out.print("A média aritmetica dos números informados é "+ media);

        scanner.close();*/

        //14 - Passou no Teste?

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as 6 notas do aluno:");

        double soma = 0;
        for (int i = 1; i<=6; i++){
            System.out.println("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma/6;
        System.out.println("A média final do aluno é:" + media);

        if (media >= 6.5) {
            System.out.println("Aluno aprovado!");
            alunosAprovados++;
        } else {
            System.out.println("Aluno reprovado.");
        }

        System.out.print("Calcular a média de outro aluno? (S/N): ");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("S")) {
            main(args);
        } else {
            System.out.println("=-=-=-=-=-=-=-=-");
            System.out.println("Programa encerrado.");
            System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
        }

        scanner.close();*/

        //15 - Uma Brincadeira Sobre Alturas

        /*double altAnacleto = 1.50;
        double altFelisberto = 1.10;
        int anoAtual = 0;

        while(altFelisberto <= altAnacleto){
            altAnacleto += 0.02;
            altFelisberto += 0.03;
            anoAtual++;
        }

        System.out.printf("Serão necessários %d anos para que Felisberto seja maior que Anacleto.%n", anoAtual);*/

        //16. O Voto é secreto

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite a quantidade de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite a quantidade de votos válidos: ");
        int votosValidos = scanner.nextInt();

        System.out.print("Digite a quantidade de votos nulos: ");
        int votosNulos = scanner.nextInt();

        double prctVotosBrancos = (double) votosBrancos/ totalEleitores * 100;
        double prctVotosValidos = (double) votosValidos / totalEleitores * 100;
        double prctVotosNulos = (double) votosNulos / totalEleitores * 100;

        System.out.printf("Porcentagem de votos brancos: %.2f%%%n", prctVotosBrancos);
        System.out.printf("Porcentagem de votos válidos: %.2f%%%n", prctVotosValidos);
        System.out.printf("Porcentagem de votos nulos: %.2f%%%n", prctVotosNulos);

        scanner.close();*/

        //17. Custa quanto?

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fabrica do carro: ");
        double custofabrica = scanner.nextDouble();

        double custodistribuidor = custofabrica * 0.28;

        double custoImpostos = custofabrica * 0.45;

        double custofinal = custofabrica + custodistribuidor + custoImpostos;

        System.out.println("O custo final ao consumidor é: R$ "+ custofinal);

        scanner.close();*/

        //18. A pagar

        /*Scanner input = new Scanner(System.in);

        double salarioFixo = 5000.0;
        double comissaoFixa = 200.0;
        double percentualAdicional = 0.05;

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = input.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = input.nextDouble();

        double comissaoFixaTotal = carrosVendidos * comissaoFixa;

        double percentualAdicionalTotal = valorTotalVendas * percentualAdicional;

        double salarioFinal = salarioFixo + comissaoFixaTotal + percentualAdicionalTotal;

        System.out.println("\nDetalhes das vendas: ");
        for (int i = 1; i <= carrosVendidos; i++){
            System.out.printf("Venda %d: R$ %.2f%n",
                    i, valorTotalVendas / carrosVendidos);
        }

        System.out.printf("Comissão fixa total: R$ %.2f%n", comissaoFixaTotal);

        System.out.printf("Percentual adicional (5%%): R$ %.2f%n", percentualAdicionalTotal);

        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);

        input.close();*/

        //19. É o quê?
        /*Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double ladoA = input.nextDouble();

        System.out.println("Digite o valor de B: ");
        double ladoB = input.nextDouble();

        System.out.println("Digite o valor de C: ");
        double ladoC = input.nextDouble();

        if(ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            System.out.println("Os valores informados formam um triângulo.");
        }else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        input.close();*/

        //20. CPF na nota?

        /*Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeproduto = input.nextLine();

        System.out.print("Digite a quantidade adquirida do produto: ");
        int qtd = input.nextInt();

        System.out.print("Digite o preço do produto: ");
        double prcDoProduto = input.nextDouble();

        double valorVenda = qtd * prcDoProduto;

        double percentualDesconto;
        if (qtd <= 5){
            percentualDesconto = 0.02;
        }else if (qtd <= 10){
            percentualDesconto = 0.03;
        }else{
            percentualDesconto = 0.05;
        }

        double valorDesconto = valorVenda * percentualDesconto;

        double valorImposto = valorVenda * 0.20;

        double totalPagar = valorVenda - valorDesconto;

        System.out.println("\n\t\tNOTA FISCAL");
        System.out.println("Produto: " + nomeproduto);
        System.out.printf("Quantidade: %d%n", qtd);
        System.out.printf("Preço unitário: R$ %.2f%n", prcDoProduto);
        System.out.printf("Valor da venda: R$ %.2f%n", valorVenda);
        System.out.printf("Desconto (%.0f%%): R$ %.2f%n", percentualDesconto * 100, valorDesconto);
        System.out.printf("Imposto (20%%): R$ %.2f%n", valorImposto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);

        input.close();*/

        //21. Descanso merecido

        /*Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do empregado (código): ");
        int numEmpregado = input.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = input.nextInt();

        System.out.print("Digite o ano de ingresso do empregado na empresa: ");
        int anoIngresso = input.nextInt();

        int anoAtual = 2024;
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        System.out.printf("Idade do empregado: %d anos%n", idade);
        System.out.printf("Tempo de trabalho do empregado: %d anos%n", tempoTrabalho);

        if(idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)){
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        input.close();*/

        //22. Conta comigo

        /*int primeiroNumero = 1;
        int proximoNumero = 1;

        while (primeiroNumero <= 20){
            System.out.print("(" + primeiroNumero + ", ");

            for (int i = 1; i <= 10; i++){
                System.out.print(primeiroNumero + " ");
                primeiroNumero++;
            }

            System.out.println(")");
            primeiroNumero++;
        }*/

        //23. Não Conta comigo

        /*for (int primeiroNumero = 1; primeiroNumero <= 20; primeiroNumero++){
            System.out.print("(" + primeiroNumero + ", ");

            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }

            System.out.println(")");
        }*/

        //24. Jornada de trabalho

        /*Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int hrsTrabalhadas = input.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salPorHora = input.nextDouble();

        int hrsNormais = 40 * 4;
        int hrsExtras = hrsTrabalhadas - hrsNormais;
        double salExtra = 0;

        if (hrsExtras > 0){
            double vlHoraExtra = salPorHora * 1.5;
            salExtra = hrsExtras * vlHoraExtra;
        }

        double salNormal = hrsNormais * salPorHora;

        double salTotal = salNormal + salExtra;

        System.out.printf("Salário normal: R$ %.2f%n", salNormal);
        System.out.printf("Salário extra: R$ %.2f%n", salExtra);
        System.out.printf("Salário total: R$ %.2f%n", salTotal);

        input.close();*/

        //25. Invertendo tudo

        /*Scanner input = new Scanner(System.in);

        String[] nums = new String[12];

        for(int i = 0; i < 12; i++){
            System.out.print("Digite um número ou caractere: ");
            nums[i] = input.next();
        }

        System.out.println("Saída 1:");
        for(int i = 11; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("Saída 2:");
        for (int i = 11; i >= 0; i--){
            try{
                int numero = Integer.parseInt(nums[i]);
                System.out.print(numero + " ");
            } catch (NumberFormatException e){
                System.out.print(nums[i] + " ");
            }
        }

        input.close();*/
    }
}
