package Exercicios.JogoDaVelha;

import java.util.Scanner;
import java.security.SecureRandom;

public class JogoDaVelha {

    public static void main(String[] args) {

        String[][] jogo = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
        Scanner scan = new Scanner(System.in);
        try {
            Marcar X = new Marcar("X");
            Marcar O = new Marcar("O");
            SecureRandom rand = new SecureRandom();

            int num, escolha;
            Boolean vencedor = false, controle;
            String winner = "";

            do {
                System.out.printf("Escolha como quer jogar: [1]Jogador Vs Jogador/[2]Jogador Vs Máquina%n");
                escolha = scan.nextInt();
            } while (escolha != 1 && escolha != 2);

            if (escolha == 1) {
                imprimeMatriz(jogo);
                for (int i = 0; i < jogo.length; i++) {
                    for (int j = 0; j < jogo.length; j++) {
                        jogo[i][j] = " ";
                    }
                }

                do {
                    do {
                        System.out.printf("Jogador %s, digite uma numero de 1 a 9 para jogar: ", X.nome);
                        num = scan.nextInt();
                        controle = X.Jogar(jogo, num);
                        imprimeMatriz(jogo);
                        if (jogo[0][0] == "X" && jogo[0][1] == "X" && jogo[0][2] == "X"
                                || jogo[1][0] == "X" && jogo[1][1] == "X" && jogo[1][2] == "X"
                                || jogo[2][0] == "X" && jogo[2][1] == "X" && jogo[2][2] == "X"
                                || jogo[0][0] == "X" && jogo[1][0] == "X" && jogo[2][0] == "X"
                                || jogo[0][1] == "X" && jogo[1][1] == "X" && jogo[2][1] == "X"
                                || jogo[0][2] == "X" && jogo[1][2] == "X" && jogo[2][2] == "X"
                                || jogo[0][0] == "X" && jogo[1][1] == "X" && jogo[2][2] == "X"
                                || jogo[0][2] == "X" && jogo[1][1] == "X" && jogo[2][0] == "X") {
                            vencedor = true;
                            winner = "Vencedor X";
                            break;
                        }
                    } while (controle == false);

                    do {
                        System.out.printf("Jogador %s, digite uma numero de 1 a 9 para jogar: ", O.nome);
                        num = scan.nextInt();
                        controle = O.Jogar(jogo, num);
                        imprimeMatriz(jogo);
                        if (jogo[0][0] == "O" && jogo[0][1] == "O" && jogo[0][2] == "O"
                                || jogo[1][0] == "O" && jogo[1][1] == "O" && jogo[1][2] == "O"
                                || jogo[2][0] == "O" && jogo[2][1] == "O" && jogo[2][2] == "O"
                                || jogo[0][0] == "O" && jogo[1][0] == "O" && jogo[2][0] == "O"
                                || jogo[0][1] == "O" && jogo[1][1] == "O" && jogo[2][1] == "O"
                                || jogo[0][2] == "O" && jogo[1][2] == "O" && jogo[2][2] == "O"
                                || jogo[0][0] == "O" && jogo[1][1] == "O" && jogo[2][2] == "O"
                                || jogo[0][2] == "O" && jogo[1][1] == "O" && jogo[2][0] == "O") {
                            vencedor = true;
                            winner = "Vencedor O";
                            break;
                        }
                    } while (controle == false);

                    if (jogo[0][0] != " " && jogo[0][1] != " " && jogo[0][2] != " " && jogo[1][0] != " "
                            && jogo[1][1] != " " && jogo[1][2] != " " && jogo[2][0] != " " && jogo[2][1] != " "
                            && jogo[2][2] != " ") {
                        vencedor = true;
                        winner = "Deu velha";
                    }

                } while (vencedor == false);

                System.out.printf("O jogo acabou, Resultado: %s%n", winner);
                imprimeMatriz(jogo);

            } else {
                do {
                    System.out.println("Escolha com qual quer jogar: 1=[X] | 2=[O] ");
                    escolha = scan.nextInt();
                } while (escolha != 1 && escolha != 2);
                if (escolha == 1) {
                    imprimeMatriz(jogo);
                    for (int i = 0; i < jogo.length; i++) {
                        for (int j = 0; j < jogo.length; j++) {
                            jogo[i][j] = " ";
                        }
                    }

                    do {
                        do {
                            System.out.printf("Jogador %s, digite uma numero de 1 a 9 para jogar: ", X.nome);
                            num = scan.nextInt();
                            controle = X.Jogar(jogo, num);
                            imprimeMatriz(jogo);
                            if (jogo[0][0] == "X" && jogo[0][1] == "X" && jogo[0][2] == "X"
                                    || jogo[1][0] == "X" && jogo[1][1] == "X" && jogo[1][2] == "X"
                                    || jogo[2][0] == "X" && jogo[2][1] == "X" && jogo[2][2] == "X"
                                    || jogo[0][0] == "X" && jogo[1][0] == "X" && jogo[2][0] == "X"
                                    || jogo[0][1] == "X" && jogo[1][1] == "X" && jogo[2][1] == "X"
                                    || jogo[0][2] == "X" && jogo[1][2] == "X" && jogo[2][2] == "X"
                                    || jogo[0][0] == "X" && jogo[1][1] == "X" && jogo[2][2] == "X"
                                    || jogo[0][2] == "X" && jogo[1][1] == "X" && jogo[2][0] == "X") {
                                vencedor = true;
                                winner = "Vencedor X";
                                break;
                            }
                        } while (controle == false);

                        do {
                            do {
                                num = rand.nextInt(8) + 1;
                                controle = O.Jogar(jogo, num);
                            } while (controle == false);
                            System.out.printf("Jogador %s, escolheu jogar na posicao: %d %n", O.nome, num);
                            imprimeMatriz(jogo);
                            if (jogo[0][0] == "O" && jogo[0][1] == "O" && jogo[0][2] == "O"
                                    || jogo[1][0] == "O" && jogo[1][1] == "O" && jogo[1][2] == "O"
                                    || jogo[2][0] == "O" && jogo[2][1] == "O" && jogo[2][2] == "O"
                                    || jogo[0][0] == "O" && jogo[1][0] == "O" && jogo[2][0] == "O"
                                    || jogo[0][1] == "O" && jogo[1][1] == "O" && jogo[2][1] == "O"
                                    || jogo[0][2] == "O" && jogo[1][2] == "O" && jogo[2][2] == "O"
                                    || jogo[0][0] == "O" && jogo[1][1] == "O" && jogo[2][2] == "O"
                                    || jogo[0][2] == "O" && jogo[1][1] == "O" && jogo[2][0] == "O") {
                                vencedor = true;
                                winner = "Vencedor O";
                                break;
                            }
                        } while (controle == false);

                        if (jogo[0][0] != " " && jogo[0][1] != " " && jogo[0][2] != " " && jogo[1][0] != " "
                                && jogo[1][1] != " " && jogo[1][2] != " " && jogo[2][0] != " " && jogo[2][1] != " "
                                && jogo[2][2] != " ") {
                            vencedor = true;
                            winner = "Deu velha";
                        }

                    } while (vencedor == false);

                    System.out.printf("O jogo acabou, Resultado: %s%n", winner);
                    imprimeMatriz(jogo);

                } else {
                    imprimeMatriz(jogo);
                    for (int i = 0; i < jogo.length; i++) {
                        for (int j = 0; j < jogo.length; j++) {
                            jogo[i][j] = " ";
                        }
                    }

                    do {
                        do {
                            do {
                                num = rand.nextInt(8) + 1;
                                controle = X.Jogar(jogo, num);
                            } while (controle == false);
                            System.out.printf("Jogador %s, escolheu jogar na posicao: %d %n", X.nome, num);
                            imprimeMatriz(jogo);
                            if (jogo[0][0] == "X" && jogo[0][1] == "X" && jogo[0][2] == "X"
                                    || jogo[1][0] == "X" && jogo[1][1] == "X" && jogo[1][2] == "X"
                                    || jogo[2][0] == "X" && jogo[2][1] == "X" && jogo[2][2] == "X"
                                    || jogo[0][0] == "X" && jogo[1][0] == "X" && jogo[2][0] == "X"
                                    || jogo[0][1] == "X" && jogo[1][1] == "X" && jogo[2][1] == "X"
                                    || jogo[0][2] == "X" && jogo[1][2] == "X" && jogo[2][2] == "X"
                                    || jogo[0][0] == "X" && jogo[1][1] == "X" && jogo[2][2] == "X"
                                    || jogo[0][2] == "X" && jogo[1][1] == "X" && jogo[2][0] == "X") {
                                vencedor = true;
                                winner = "Vencedor X";
                                break;
                            }
                        } while (controle == false);

                        do {
                             System.out.printf("Jogador %s, digite uma numero de 1 a 9 para jogar: ", O.nome);
                            num = scan.nextInt();
                            controle = O.Jogar(jogo, num);
                            imprimeMatriz(jogo);
                            if (jogo[0][0] == "O" && jogo[0][1] == "O" && jogo[0][2] == "O"
                                    || jogo[1][0] == "O" && jogo[1][1] == "O" && jogo[1][2] == "O"
                                    || jogo[2][0] == "O" && jogo[2][1] == "O" && jogo[2][2] == "O"
                                    || jogo[0][0] == "O" && jogo[1][0] == "O" && jogo[2][0] == "O"
                                    || jogo[0][1] == "O" && jogo[1][1] == "O" && jogo[2][1] == "O"
                                    || jogo[0][2] == "O" && jogo[1][2] == "O" && jogo[2][2] == "O"
                                    || jogo[0][0] == "O" && jogo[1][1] == "O" && jogo[2][2] == "O"
                                    || jogo[0][2] == "O" && jogo[1][1] == "O" && jogo[2][0] == "O") {
                                vencedor = true;
                                winner = "Vencedor O";
                                break;
                            }
                        } while (controle == false);

                        if (jogo[0][0] != " " && jogo[0][1] != " " && jogo[0][2] != " " && jogo[1][0] != " "
                                && jogo[1][1] != " " && jogo[1][2] != " " && jogo[2][0] != " " && jogo[2][1] != " "
                                && jogo[2][2] != " ") {
                            vencedor = true;
                            winner = "Deu velha";
                        }

                    } while (vencedor == false);

                    System.out.printf("O jogo acabou, Resultado: %s%n", winner);
                    imprimeMatriz(jogo);
                }
            }

        } finally {
            scan.close();
        }

    }

    public static void imprimeMatriz(String[][] mtz) {
        for (int l = 0; l < mtz.length; l++) {
            System.out.printf("| ");
            for (int c = 0; c < mtz.length; c++) {
                System.out.printf("%s | ", mtz[l][c]);
            }
            System.out.printf("%n");
        }
    }
}
