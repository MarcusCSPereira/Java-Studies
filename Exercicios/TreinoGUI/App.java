package Exercicios.TreinoGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
        
    private static JTextField campoNome;
    private static JPasswordField campoSenha;

    public static void main(String[] args) {

        //criando o frame
        JFrame frame = new JFrame("Login Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // seta o tratamento na tentativa de fechar
        frame.setLayout(new GridBagLayout());   // seta o layout do frame como gridBag
        frame.setUndecorated(true); // seta o frame sem os botões de cime

        GridBagConstraints gridBagConstraints = new GridBagConstraints(); // crio o formatador do JFrame

        // instanciando painel1
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(153, 255, 102));
        panel1.setBorder(BorderFactory.createLineBorder(new Color(102, 255, 204), 2));
        panel1.setMinimumSize(new Dimension(400, 300));
        panel1.setPreferredSize(new Dimension(400, 300));
        panel1.setLayout(new GridBagLayout());// seto o grid bag layout do panel1;
        // posicionando painel1
        gridBagConstraints = new GridBagConstraints();//esse se torna o GBL do painel 1
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        frame.add(panel1, gridBagConstraints);

        JPanel panel2 = new JPanel();
        {
            panel2.setBackground(new Color(204, 255, 204));
            panel2.setMinimumSize(new Dimension(60, 60));
            panel2.setPreferredSize(new Dimension(100, 100));
            panel2.setLayout(new GridBagLayout());

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.weightx = 1.0;
            panel1.add(panel2, gridBagConstraints);

            JLabel label1_2 = new JLabel();
            label1_2.setFont(new Font("Segoe UI", 1, 40));
            label1_2.setHorizontalAlignment(SwingConstants.CENTER);
            label1_2.setText("Login Screen:");
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = GridBagConstraints.BOTH;
            gridBagConstraints.weightx = 1.0;
            panel2.add(label1_2, gridBagConstraints);

            // panel 3:
            JPanel panel3 = new JPanel();
            {
                panel3.setBackground(new Color(204, 255, 204));
                panel3.setMinimumSize(new Dimension(50, 50));
                panel3.setPreferredSize(new Dimension(100, 100));
                panel3.setLayout(new GridBagLayout());

                gridBagConstraints = new GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.fill = GridBagConstraints.BOTH;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.weighty = 1.0;
                panel1.add(panel3, gridBagConstraints);

                JLabel label3_1 = new JLabel();
                label3_1.setHorizontalAlignment(SwingConstants.CENTER);
                label3_1.setText("Nome:");

                gridBagConstraints = new GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.insets = new Insets(5, 5, 5, 5);
                panel3.add(label3_1, gridBagConstraints);

                JLabel label3_2 = new JLabel();
                label3_2.setText("Senha:");
                gridBagConstraints = new GridBagConstraints();

                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.insets = new Insets(5, 5, 5, 5);
                panel3.add(label3_2, gridBagConstraints);

                campoNome = new JTextField();
                campoNome.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        campoNomeActionPerformed(evt);
                    }
                });
                gridBagConstraints = new GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.insets = new Insets(5, 5, 5, 5);
                panel3.add(campoNome, gridBagConstraints);
                campoNome.getAccessibleContext().setAccessibleName("");

                campoSenha = new JPasswordField();

                campoSenha.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        campoSenhaActionPerformed(evt);
                    }
                });

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                panel3.add(campoSenha, gridBagConstraints);

            }
            JPanel panel4 = new JPanel();
            {
                panel4.setBackground(new Color(204, 255, 204));
                panel4.setMinimumSize(new Dimension(50, 50));
                panel4.setPreferredSize(new Dimension(50, 50));
                panel4.setLayout(new GridBagLayout());

                gridBagConstraints = new GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.fill = GridBagConstraints.BOTH;
                gridBagConstraints.weightx = 1.0;
                panel1.add(panel4, gridBagConstraints);

                JButton jButton1 = new JButton();

                jButton1.setText("Logar");
                jButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }

                });

                gridBagConstraints = new GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = GridBagConstraints.BOTH;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.weighty = 1.0;
                gridBagConstraints.insets = new Insets(10, 30, 10, 30);
                panel4.add(jButton1, gridBagConstraints);

                JButton jButton2 = new JButton();

                jButton2.setText("Sair");
                jButton2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });
                gridBagConstraints = new GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = GridBagConstraints.BOTH;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.weighty = 1.0;
                gridBagConstraints.insets = new Insets(10, 30, 10, 30);
                panel4.add(jButton2, gridBagConstraints);
            }
        }

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    
    private static void campoNomeActionPerformed(ActionEvent evt) {
        JTextField campo = (JTextField) evt.getSource();
        String textoDigitado = campo.getText();
        JOptionPane.showMessageDialog(null, "Texto digitado: " + textoDigitado);
    }
    
    private static void campoSenhaActionPerformed(ActionEvent evt) {
        JPasswordField campo = (JPasswordField) evt.getSource();
        char[] senhaDigitada = campo.getPassword();
        String senha = new String(senhaDigitada);
        JOptionPane.showMessageDialog(null, "Texto digitado: " + senha);
    }
    
    private static void jButton1ActionPerformed(ActionEvent evt) {
        String senhaDigitada = new String(campoSenha.getPassword());
        if(campoNome.getText().trim().equals("admin") && senhaDigitada.equals("admin")){
            JOptionPane.showMessageDialog(null, "Login feito com sucesso", "Confirmação",JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos", "Confirmação",JOptionPane.WARNING_MESSAGE);
        }
    }

    private static void jButton2ActionPerformed(ActionEvent evt) {
        int controle = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do programa?", "Cuidado", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,null);
        if(controle==0){
            System.exit(0);
        }
    }

}
