package Exercicios.Desafio;

import javax.swing.JOptionPane;

public class CursoJava {
    public static void main(String[] args) {
        
        String nome;
        final char[] gabarito={'C','E','B','A','E'};
        Object[] respostas={'A','B','C','D','E'};
        Object escolha;
        int nota=0,controle=0;
        
        nome = JOptionPane.showInputDialog(null, "Digite seu Nome: ","Prova_1" ,JOptionPane.QUESTION_MESSAGE);

        escolha = JOptionPane.showInputDialog(null, "Qual o valor de 10 + 10?\r\n"+//
        "\r\n"+//
        "A) 10 \r\n"+//
        "B) 30 \r\n"+//
        "C) 20 \r\n"+//
        "D) 1010 \r\n"+//
        "E) 100\r\n"+//
        "\r\n"+//
        "","Questão 1:",JOptionPane.INFORMATION_MESSAGE, null,respostas, respostas[0]);
        
        if(escolha.toString().charAt(0)== gabarito[controle]){
            nota+=2;
            controle++;
        }else{
            controle++;
        }

        escolha = JOptionPane.showInputDialog(null, "Qual o valor de 10 x 10?\r\n"+//
        "\r\n"+//
        "A) 10 \r\n"+//
        "B) 30 \r\n"+//
        "C) 40 \r\n"+//
        "D) 1010 \r\n"+//
        "E) 100\r\n"+//
        "\r\n"+//
        "","Questão 2:",JOptionPane.INFORMATION_MESSAGE, null,respostas, respostas[0]);
        
        if(escolha.toString().charAt(0)== gabarito[controle]){
            nota+=2;
            controle++;
        }else{
            controle++;
        }

        escolha = JOptionPane.showInputDialog(null, "Qual o maior planeta do sistema solar ?\r\n"+//
        "\r\n"+//
        "A) Terra\r\n"+ //
        "B) Júpiter\r\n" + //
        "C) Saturno \r\n" + //
        "D) Mercúrio \r\n" + //
        "E) Vênus\r\n"+//
        "\r\n"+//
        "","Questão 3:",JOptionPane.INFORMATION_MESSAGE, null,respostas, respostas[0]);
        
        if(escolha.toString().charAt(0)== gabarito[controle]){
            nota+=2;
            controle++;
        }else{
            controle++;
        }
        
        escolha = JOptionPane.showInputDialog(null, "(Enem-2018) Companhias que fabricam jeans usam cloro para o clareamento, seguido de lavagem. \r\n" + //
        "Algumas estão substituindo o cloro por subst\u00E2ncias ambientalmente mais seguras como per\u00F3xidos, que podem \r\n" + //
        "ser degradados por enzimas chamadas peroxidases. Pensando nisso, pesquisadores inseriram genes codificadores \r\n" + //
        "de peroxidases em leveduras cultivadas nas condi\u00E7\u00F5es de clareamento e lavagem dos jeans e selecionaram \r\n" + //
        "as sobreviventes para produ\u00E7\u00E3o dessas enzimas. \r\n" + //
        "Nesse caso, o uso dessas leveduras modificadas objetiva: \r\n" + //
        "\r\n" + //
        "A) Reduzir a quantidade de resíduos tóxicos nos efluentes da lavagem \r\n" + //
        "B) Eliminar a necessidade de tratamento da água consumida \r\n" + //
        "C) Elevar a capacidade de clareamento dos jeans. \r\n" + //
        "D) Aumentar a resistência do jeans a peróxidos \r\n" +//
        "E) Associar ação bactericida ao clareamento.\r\n\r\n"+//
        "\r\n"+//
        "","Questão 4:",JOptionPane.INFORMATION_MESSAGE, null,respostas, respostas[0]);
        
        if(escolha.toString().charAt(0)== gabarito[controle]){
            nota+=2;
            controle++;
        }else{
            controle++;
        }
        
        escolha = JOptionPane.showInputDialog(null, "(ENEM 2022) Ao escutar a notícia de que um filme recém-lançado \r\n" + //
        "arrecadou, no primeiro mês de lançamento, R$ 1,35 bilhão em bilheteria, um estudante \r\n" + //
        "escreveu corretamente o número que representa essa quantia, com todos os seus algarismos.\r\n" + //
        "\r\n" + //
        "O número escrito pelo estudante foi:\r\n" + //
        "\r\n" + //
        "A) 135 000,00.\r\n" + //
        "B) 1 350 000,00.\r\n" + //
        "C) 13 500 000,00.\r\n" + //
        "D) 135 000 000,00.\r\n" + //
        "E) 1 350 000 000,00\r\n"+ //
        "\r\n"+//
        "","Questão 5:",JOptionPane.INFORMATION_MESSAGE, null,respostas, respostas[0]);

        if(escolha.toString().charAt(0)== gabarito[controle]){
            nota+=2;
            controle++;
        }else{
            controle++;
        }

        switch(nota){
            case 10: case 8: case 6:
            JOptionPane.showMessageDialog(null, "Parabéns "+ nome + " você foi aprovado com nota : " + nota , "Resultado da Prova_1:", JOptionPane.NO_OPTION);
            break;
            case 4:
            JOptionPane.showMessageDialog(null,nome + " você terá que fazer recuperação por que tirou nota : " + nota , "Resultado da Prova_1:", JOptionPane.NO_OPTION);
            break;
            case 2: case 0:
            JOptionPane.showMessageDialog(null,nome + " você foi reprovado por que tirou nota : " + nota + " terá que repetir o ano" , "Resultado da Prova_1:", JOptionPane.NO_OPTION);
            break;
        }
        
    }
}
