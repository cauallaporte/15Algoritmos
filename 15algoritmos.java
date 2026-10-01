import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Algoritmo1();
        Algoritmo2();
        Algoritmo3();
        Algoritmo4();
        Algoritmo5();
        Algoritmo6();
        Algoritmo7();
        Algoritmo8();
        Algoritmo9();
        Algoritmo10();
        Algoritmo11();
        Algoritmo15();
    }

    // 1 - Calculadora
    private static void Algoritmo1() {

        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int operacao;
        int resultado;
        int continuar = 1;

        System.out.println("===== ALGORITMO 1 =====");

        while (continuar == 1) {

            System.out.print("Digite o primeiro numero: ");
            num1 = entrada.nextInt();

            System.out.print("Digite o segundo numero: ");
            num2 = entrada.nextInt();

            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao inteira");

            System.out.print("Escolha a operacao: ");
            operacao = entrada.nextInt();

            if (operacao == 1) {

                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);

            } else if (operacao == 2) {

                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);

            } else if (operacao == 3) {

                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);

            } else if (operacao == 4) {

                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Nao e possivel dividir por zero.");
                }

            } else {

                System.out.println("Operacao invalida.");
            }

            System.out.print("Deseja fazer outra operacao? (1 - Sim / 0 - Nao): ");
            continuar = entrada.nextInt();
        }
    }


    // 2 - Soma dos impares multiplos de 3 entre 1 e 500
    private static void Algoritmo2() {

        int soma = 0;

        System.out.println("\n===== ALGORITMO 2 =====");

        for (int i = 1; i <= 500; i++) {

            if (i % 2 != 0 && i % 3 == 0) {
                soma = soma + i;
            }
        }

        System.out.println("Soma dos numeros impares multiplos de 3: " + soma);
    }


    // 3 - Empregado mais recente e mais antigo
    private static void Algoritmo3() {

        Scanner entrada = new Scanner(System.in);

        int numeroEmpregado;
        int mesesTrabalho;

        int numeroMaisRecente = 0;
        int numeroMaisAntigo = 0;

        int menorMeses = 999999;
        int maiorMeses = 0;

        System.out.println("\n===== ALGORITMO 3 =====");

        int contador = 0;

        while (contador < 300) {

            System.out.print("Digite o numero do empregado: ");
            numeroEmpregado = entrada.nextInt();

            System.out.print("Digite os meses de trabalho: ");
            mesesTrabalho = entrada.nextInt();

            if (numeroEmpregado == 0 && mesesTrabalho == 0) {
                break;
            }

            if (mesesTrabalho < menorMeses) {
                menorMeses = mesesTrabalho;
                numeroMaisRecente = numeroEmpregado;
            }

            if (mesesTrabalho > maiorMeses) {
                maiorMeses = mesesTrabalho;
                numeroMaisAntigo = numeroEmpregado;
            }

            contador++;
        }

        System.out.println("Empregado mais recente: " + numeroMaisRecente);
        System.out.println("Meses de trabalho: " + menorMeses);

        System.out.println("Empregado mais antigo: " + numeroMaisAntigo);
        System.out.println("Meses de trabalho: " + maiorMeses);
    }


    // 4 - Altura e sexo de 15 pessoas
    private static void Algoritmo4() {

        Scanner entrada = new Scanner(System.in);

        double altura;
        double menorAltura = 999999;
        double maiorAltura = 0;

        double somaMulheres = 0;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        char sexo;
        char sexoMaisAlto = ' ';

        System.out.println("\n===== ALGORITMO 4 =====");

        for (int i = 1; i <= 15; i++) {

            System.out.print("Digite a altura da pessoa " + i + ": ");
            altura = entrada.nextDouble();

            System.out.print("Digite o sexo (M/F): ");
            sexo = entrada.next().charAt(0);

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                sexoMaisAlto = sexo;
            }

            if (sexo == 'F' || sexo == 'f') {

                somaMulheres = somaMulheres + altura;
                quantidadeMulheres++;

            } else if (sexo == 'M' || sexo == 'm') {

                quantidadeHomens++;
            }
        }

        System.out.println("Menor altura: " + menorAltura);

        if (quantidadeMulheres > 0) {
            System.out.println("Media de altura das mulheres: "
                    + (somaMulheres / quantidadeMulheres));
        } else {
            System.out.println("Nao foram informadas mulheres.");
        }

        System.out.println("Quantidade de homens: " + quantidadeHomens);
        System.out.println("Sexo da pessoa mais alta: " + sexoMaisAlto);
    }


    // 5 - Pesquisa da prefeitura
    private static void Algoritmo5() {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double somaSalarios = 0;
        int somaFilhos = 0;
        int quantidadePessoas = 0;
        double maiorSalario = 0;
        int pessoasAte250 = 0;

        System.out.println("\n===== ALGORITMO 5 =====");

        while (true) {

            System.out.print("Digite o salario (negativo para encerrar): ");
            salario = entrada.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Digite o numero de filhos: ");
            int filhos = entrada.nextInt();

            somaSalarios = somaSalarios + salario;
            somaFilhos = somaFilhos + filhos;

            quantidadePessoas++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 250) {
                pessoasAte250++;
            }
        }

        if (quantidadePessoas > 0) {

            double mediaSalario = somaSalarios / quantidadePessoas;
            double mediaFilhos = (double) somaFilhos / quantidadePessoas;
            double percentual = (pessoasAte250 * 100.0) / quantidadePessoas;

            System.out.println("Media do salario: R$ " + mediaSalario);
            System.out.println("Media de filhos: " + mediaFilhos);
            System.out.println("Maior salario: R$ " + maiorSalario);
            System.out.println("Percentual com salario ate R$250: "
                    + percentual + "%");

        } else {

            System.out.println("Nenhuma pessoa foi cadastrada.");
        }
    }


    // 6 - Valores positivos e negativos
    private static void Algoritmo6() {

        Scanner entrada = new Scanner(System.in);

        double valor;
        double soma = 0;

        int quantidade = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.println("\n===== ALGORITMO 6 =====");
        System.out.println("Digite 0 para encerrar.");

        while (true) {

            System.out.print("Digite um valor: ");
            valor = entrada.nextDouble();

            if (valor == 0) {
                break;
            }

            soma = soma + valor;
            quantidade++;

            if (valor > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        if (quantidade > 0) {

            double media = soma / quantidade;
            double percentualPositivos = (positivos * 100.0) / quantidade;
            double percentualNegativos = (negativos * 100.0) / quantidade;

            System.out.println("Media: " + media);
            System.out.println("Quantidade de positivos: " + positivos);
            System.out.println("Quantidade de negativos: " + negativos);
            System.out.println("Percentual de positivos: "
                    + percentualPositivos + "%");
            System.out.println("Percentual de negativos: "
                    + percentualNegativos + "%");

        } else {

            System.out.println("Nenhum valor foi informado.");
        }
    }


    // 7 - Media de 75 valores
    private static void Algoritmo7() {

        Scanner entrada = new Scanner(System.in);

        int valor;
        int soma = 0;
        int quantidade = 0;

        System.out.println("\n===== ALGORITMO 7 =====");

        for (int i = 1; i <= 75; i++) {

            System.out.print("Digite o " + i + " valor: ");
            valor = entrada.nextInt();

            soma = soma + valor;
            quantidade++;
        }

        double media = (double) soma / quantidade;

        System.out.println("Quantidade de numeros lidos: " + quantidade);
        System.out.println("Media: " + media);
    }


    // 8 - Turma de 15 amigos
    private static void Algoritmo8() {

        Scanner entrada = new Scanner(System.in);

        String nome;
        String nomeMaior = "";
        String nomeMenor = "";

        double altura;
        double maiorAltura = 0;
        double menorAltura = 999999;

        double somaMulheres = 0;
        double somaHomens = 0;
        double somaTurma = 0;

        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        System.out.println("\n===== ALGORITMO 8 =====");

        for (int i = 1; i <= 15; i++) {

            System.out.print("Digite o nome: ");
            nome = entrada.next();

            System.out.print("Digite a altura: ");
            altura = entrada.nextDouble();

            System.out.print("Digite o sexo (1 - Masculino / 2 - Feminino): ");
            int sexo = entrada.nextInt();

            somaTurma = somaTurma + altura;

            if (altura > maiorAltura) {

                maiorAltura = altura;
                nomeMaior = nome;

            }

            if (altura < menorAltura) {

                menorAltura = altura;
                nomeMenor = nome;

            }

            if (sexo == 1) {

                somaHomens = somaHomens + altura;
                quantidadeHomens++;

            } else if (sexo == 2) {

                somaMulheres = somaMulheres + altura;
                quantidadeMulheres++;
            }
        }

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Nome: " + nomeMaior);

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Nome: " + nomeMenor);

        if (quantidadeMulheres > 0) {
            System.out.println("Media das mulheres: "
                    + (somaMulheres / quantidadeMulheres));
        }

        if (quantidadeHomens > 0) {
            System.out.println("Media dos homens: "
                    + (somaHomens / quantidadeHomens));
        }

        System.out.println("Media da turma: " + (somaTurma / 15));
    }


    // 9 - Maior e menor nota
    private static void Algoritmo9() {

        Scanner entrada = new Scanner(System.in);

        int n;
        double nota;

        double maiorNota = 0;
        double menorNota = 15;

        System.out.println("\n===== ALGORITMO 9 =====");

        System.out.print("Digite o numero de alunos: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = entrada.nextDouble();

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }


    // 10 - Polegadas para centimetros
    private static void Algoritmo10() {

        System.out.println("\n===== ALGORITMO 10 =====");

        System.out.println("Polegadas\tCentimetros");

        for (int polegada = 1; polegada <= 20; polegada++) {

            double centimetros = polegada * 2.54;

            System.out.println(polegada + "\t\t" + centimetros);
        }
    }


    // 11 - Soma dos numeros pares de um intervalo
    private static void Algoritmo11() {

        Scanner entrada = new Scanner(System.in);

        int limiteInferior;
        int limiteSuperior;
        int soma = 0;

        System.out.println("\n===== ALGORITMO 11 =====");

        System.out.print("Digite o limite inferior: ");
        limiteInferior = entrada.nextInt();

        System.out.print("Digite o limite superior: ");
        limiteSuperior = entrada.nextInt();

        for (int i = limiteInferior; i <= limiteSuperior; i++) {

            if (i % 2 == 0) {
                soma = soma + i;
            }
        }

        System.out.println("Soma dos numeros pares: " + soma);
    }


    // 15 - Duas maiores notas
    private static void Algoritmo15() {

        Scanner entrada = new Scanner(System.in);

        int matricula;
        double nota;

        int matriculaMaior = 0;
        int matriculaSegundaMaior = 0;

        double maiorNota = -1;
        double segundaMaiorNota = -1;

        System.out.println("\n===== ALGORITMO 15 =====");

        for (int i = 1; i <= 100; i++) {

            System.out.print("Digite a matricula do aluno: ");
            matricula = entrada.nextInt();

            System.out.print("Digite a nota: ");
            nota = entrada.nextDouble();

            if (nota > maiorNota) {

                segundaMaiorNota = maiorNota;
                matriculaSegundaMaior = matriculaMaior;

                maiorNota = nota;
                matriculaMaior = matricula;

            } else if (nota > segundaMaiorNota) {

                segundaMaiorNota = nota;
                matriculaSegundaMaior = matricula;
            }
        }

        System.out.println("\nMaior nota: " + maiorNota);
        System.out.println("Matricula: " + matriculaMaior);

        System.out.println("\nSegunda maior nota: " + segundaMaiorNota);
        System.out.println("Matricula: " + matriculaSegundaMaior);
    }
}