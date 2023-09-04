package Aulas.Trabalhando_com_arquivos;

import java.nio.file.*;

import javax.swing.JOptionPane;

public class Substituindo_arquivos {
    public static void main(String[] args) {
        
        Path logoNova = Paths.get("C:/Users/Usuário/Desktop/Programacao/github/Java_estudos/Aulas/Trabalhando_com_arquivos/starbucks_logo.jpg");

        Path logoAntiga = Paths.get("C:/Users/Usuário/Desktop/Programacao/github/Java_estudos/Aulas/Trabalhando_com_arquivos/nike_logo.jpg");

        try {
            byte [] bytesLogoNova = Files.readAllBytes(logoNova);
            byte [] bytesLogoAntiga = Files.readAllBytes(logoAntiga);
            Files.write(logoAntiga, bytesLogoNova);
            int controle = JOptionPane.showConfirmDialog(null, "Deseja voltar para a logo antiga?", "Controle de logos", JOptionPane.YES_NO_OPTION);
            if(controle == JOptionPane.YES_OPTION){
                Files.write(logoAntiga, bytesLogoAntiga);
            }
        } catch (Exception e) {
            System.out.println("ERRO");
        }
    }
}
