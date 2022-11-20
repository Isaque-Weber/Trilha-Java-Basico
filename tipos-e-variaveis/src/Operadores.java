public class Operadores {
    public static void main(String[] args) {
        // -- operadores --

            // "=" atribuição

            String nome = "Isaque"; 
            int idade = 22;
            double peso = 99.8; // 
            char sexo = 'M'; //Char usa-se com '', e ele permite usar apenas um caractere
            boolean doadorOrgao = false; // ou true
            // Date dataNascimento = new Date(); // classe que receberá uma variável na sequência. Observe que deverá ser antecedido de 'new' como no exemplo

            // Aritméticos: + (adição), - (subtração), * (multiplicação) e / (divisão)

            double soma = 10.5 + 15.7;
            int subtração = 113 - 25;
            int multiplicacao = 20 * 7;
            int divisao = 15 / 3;
            int modulo = 18 % 3; // observe que o módulo calcula o resto da divisão
            double resultado = (10 * 7) + (20/4);
                // O operador '+' utilizado em variáveis do tipo string, realizará a concatenação de textos

                String nomeCompleto = "Linguagem" + "JAVA";

                System.out.println(nomeCompleto);
            
            // Unários: 
                //(+) Operador unário de valor positivo - números são positivos sem esse operador explicitamente;
                //(-) Operador unário de valor negativo - nega um número ou expressão aritmética;
                //(++) Operador unário de incremento de valor - incrementa o valor em 1 unidade;
                // (--) Operador unário de decremento de valor - decrementa o valor em uma unidade;
                //(!) Operador unário lógico de negaão - nega o valor de uma expressão booleana;
             
            // Ternário: o operador de Condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Voc~e deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.
                // é representado pelos ? : utilizados na seguinte forma:

                // <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>

                int a, b;

                a = 5;
                b = 6;

                String result = a==b ? "verdadeiro" : "falso";

                System.out.println(result);

            // Relacionais
                // == verifica se uma variável é igual À OUTRA
                // =! verifica se uma variável é diferente da outra
                // > verifica se uma variável é maior q a outra
                // >= verifica se uma variável é maior ou igual a outra
                // < verifica se uma variável é menor do que a outra
                // <= verefica se uma variável é menor ou igual a outra

                int numero1 = 1;
                int numero2 = 2;
                
                boolean simNao = numero1 == numero2;

                System.out.println("numeroUm é igual a numeroDois?" + simNao);

                simNao = numero1 != numero2;

                System.out.println("numeroUm é diferente de numeroDois?" + simNao);

                simNao = numero1 > numero2;

                System.out.println("numeroUm é maior que numeroDois?" + simNao);

                simNao = numero1 >= numero2;

                System.out.println("numeroUm é maior ou igual que numeroDois?" + simNao);

                simNao = numero1 < numero2;

                System.out.println("numeroUm é menor que numeroDois?" + simNao);
                
                simNao = numero1 <= numero2;

                System.out.println("numeroUm é menor ou igual que numeroDois?" + simNao);

            

            

    }
    
    public static void oplogc(String[] args) {
        //Operadores lógicos: && Operador lógico 'E'; || Operador lógico 'OU';

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2);
            System.out.println("As duas condições são verdadeiras");

        if(condicao1 || condicao2);
            System.out.println("Uma das condições é verdadeira");
        
        System.out.println("fim");

    }
}
