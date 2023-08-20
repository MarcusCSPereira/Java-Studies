package Exercicios.TreinoGUI.src;

import javax.swing.*;

class Principal {
    
    private String nomeUsuario;

    public Principal(String nomeUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void mostrarJanela() {
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nomeUsuario + "!", "Mensagem de Boas-vindas", JOptionPane.PLAIN_MESSAGE);
        Principal.main(null);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Cesinha", null, 0);
    }
}
