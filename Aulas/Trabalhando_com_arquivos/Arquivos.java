package Aulas.Trabalhando_com_arquivos;

/*import java.io.IOException -> caso queira usar o throws IO Exception no main;*/
import java.nio.file.*;
import java.util.List;

public class Arquivos {
    public static void main(String[] args){
        
        Path directory = Paths.get("C:/Users/Usuário/Desktop/Programacao/github/Java_estudos/Aulas/Trabalhando_com_arquivos");
        Path arquivo = Paths.get("C:/Users/Usuário/Desktop/Programacao/github/Java_estudos/Aulas/Trabalhando_com_arquivos/Cesinha.txt");

        if(Files.isDirectory(directory)){
            System.out.println("O diretório existe");
        }else{
            System.out.println("O diretório não existe");
        }

        if(Files.exists(arquivo)){
            System.out.println("O arquivo existe\n");
        }else{
            System.out.println("O arquivo não existe");
        }
        try {
            List<String> linhas = Files.readAllLines(arquivo);
            
            linhas.forEach(linha -> System.out.println(linha));
            
            /*for(String linha:linhas){
                System.out.println(linha);
            }*/
        } catch (Exception e) {
            System.out.println("Erro");
        }   




    }
}
