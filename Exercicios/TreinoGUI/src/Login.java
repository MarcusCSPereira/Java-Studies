package TreinoGUI.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
        
    private static JTextField campoNome;
    private static JPasswordField campoSenha;
    private static JFrame frame;

    public static void main(String[] args) {


        //criando o frame
        frame = new JFrame("Login Screen");
        {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // seta o tratamento na tentativa de fechar
            frame.setUndecorated(true); // seta o frame sem os botões de cime
        
            frame.setLayout(new GridBagLayout());   // seta o layout do frame como gridBag
        
            // instanciando painel1
            JPanel panel1 = new JPanel();
            {
                panel1.setBackground(new Color(153, 255, 102));
                panel1.setBorder(BorderFactory.createLineBorder(new Color(102, 255, 204), 2));
                panel1.setMinimumSize(new Dimension(400, 300));
                panel1.setPreferredSize(new Dimension(400, 300));
                panel1.setLayout(new GridBagLayout());// define o painel um com layout GBL;
                // posicionando painel1
                GridBagConstraints gridBagConstraints1 = new GridBagConstraints();//esse se torna o GBL do painel 1 esta relacionado a linha 120
                gridBagConstraints1.gridx = 0;
                gridBagConstraints1.gridy = 0;
                gridBagConstraints1.fill = GridBagConstraints.BOTH;
                gridBagConstraints1.weightx = 1.0;
                gridBagConstraints1.weighty = 1.0;
                frame.add(panel1, gridBagConstraints1);// posicionando painel 1 com essas caracteristicas no layout da linha 20;

                JPanel panel2 = new JPanel();
                {
                    panel2.setBackground(new Color(204, 255, 204));
                    panel2.setMinimumSize(new Dimension(60, 60));
                    panel2.setPreferredSize(new Dimension(100, 100));
                    
                    panel2.setLayout(new GridBagLayout());// defina o layout do painel 2

                    GridBagConstraints gridBagConstraints2 = new GridBagConstraints(); // esta relacionado a linha 29 que é o layout do painel1
                    gridBagConstraints2.gridx = 0;
                    gridBagConstraints2.gridy = 0;
                    gridBagConstraints2.fill = GridBagConstraints.BOTH;
                    gridBagConstraints2.weightx = 1.0;
                    panel1.add(panel2, gridBagConstraints2);//posicionando painel 2 com essas caracteristicas no layout da linha 29;

                    JLabel label1_2 = new JLabel();
                    label1_2.setFont(new Font("Segoe UI", 1, 40));
                    label1_2.setHorizontalAlignment(SwingConstants.CENTER);
                    label1_2.setText("Login Screen:");//personalização do label
                    GridBagConstraints gridBagConstraintsL1 = new GridBagConstraints(); // cria o construtor desse label para posiciona-ló no layout definido na linha 44.
                    gridBagConstraintsL1.gridx = 0;
                    gridBagConstraintsL1.gridy = 0;
                    gridBagConstraintsL1.fill = GridBagConstraints.BOTH;
                    gridBagConstraintsL1.weightx = 1.0;
                    panel2.add(label1_2, gridBagConstraintsL1);//posicionando label1 com essas caracteristicas no layout da linha 45;
                }     
                // panel 3:
                JPanel panel3 = new JPanel();
                {
                    panel3.setBackground(new Color(204, 255, 204));
                    panel3.setMinimumSize(new Dimension(50, 50));
                    panel3.setPreferredSize(new Dimension(100, 100));
                    panel3.setLayout(new GridBagLayout());//seta o layout do painel 3

                    GridBagConstraints gridBagConstraints3 = new GridBagConstraints(); // cria o construtor do painel 3 que está relacionado a linha 29 também.
                    gridBagConstraints3.gridx = 0;
                    gridBagConstraints3.gridy = 1;
                    gridBagConstraints3.fill = GridBagConstraints.BOTH;
                    gridBagConstraints3.weightx = 1.0;
                    gridBagConstraints3.weighty = 1.0;
                    panel1.add(panel3, gridBagConstraints3);//posicionando painel 3 com essas caracteristicas no layout da linha 29;

                    JLabel label3_1 = new JLabel();
                    label3_1.setHorizontalAlignment(SwingConstants.CENTER);
                    label3_1.setText("Nome:");

                    GridBagConstraints gridBagConstraintsL3_1 = new GridBagConstraints();//se relaciona com a linha 71;
                    gridBagConstraintsL3_1.gridx = 0;
                    gridBagConstraintsL3_1.gridy = 0;
                    gridBagConstraintsL3_1.insets = new Insets(5, 5, 5, 5);
                    panel3.add(label3_1, gridBagConstraintsL3_1);//posicionando label3_1 com essas caracteristicas no layout da linha 71;

                    JLabel label3_2 = new JLabel();
                    label3_2.setText("Senha:");
                    GridBagConstraints gridBagConstraintsL3_2 = new GridBagConstraints();// se relaciona com a linha 71;

                    gridBagConstraintsL3_2.gridx = 0;
                    gridBagConstraintsL3_2.gridy = 1;
                    gridBagConstraintsL3_2.insets = new Insets(5, 5, 5, 5);
                    panel3.add(label3_2, gridBagConstraintsL3_2);//posicionando label3_2 com essas caracteristicas no layout da linha 71;

                    campoNome = new JTextField();
                    campoNome.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            campoNomeActionPerformed(evt);
                        }
                    });
                    GridBagConstraints gridBagConstraintsCN = new GridBagConstraints();//se relaciona com a linha 71;
                    gridBagConstraintsCN.gridx = 1;
                    gridBagConstraintsCN.gridy = 0;
                    gridBagConstraintsCN.fill = GridBagConstraints.HORIZONTAL;
                    gridBagConstraintsCN.weightx = 1.0;
                    gridBagConstraintsCN.insets = new Insets(5, 5, 5, 5);
                    panel3.add(campoNome, gridBagConstraintsCN);//posicionando CN com essas caracteristicas no layout da linha 71;
                    campoNome.getAccessibleContext().setAccessibleName("");

                    campoSenha = new JPasswordField();

                    campoSenha.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            campoSenhaActionPerformed(evt);
                        }
                    });

                    GridBagConstraints gridBagConstraintsCs = new java.awt.GridBagConstraints();// se relaciona com a linha 71
                    gridBagConstraintsCs.gridx = 1;
                    gridBagConstraintsCs.gridy = 1;
                    gridBagConstraintsCs.fill = java.awt.GridBagConstraints.HORIZONTAL;
                    gridBagConstraintsCs.weightx = 1.0;
                    gridBagConstraintsCs.insets = new java.awt.Insets(5, 5, 5, 5);
                    panel3.add(campoSenha, gridBagConstraintsCs);//posicionando CS com essas caracteristicas no layout da linha 71;

                }
                JPanel panel4 = new JPanel();
                {
                    panel4.setBackground(new Color(204, 255, 204));
                    panel4.setMinimumSize(new Dimension(50, 50));
                    panel4.setPreferredSize(new Dimension(50, 50));
                    panel4.setLayout(new GridBagLayout());// seta o layout do painel 4

                    GridBagConstraints gridBagConstraints4 = new GridBagConstraints(); // se relaciona com linha 29
                    gridBagConstraints4.gridx = 0;
                    gridBagConstraints4.gridy = 2;
                    gridBagConstraints4.fill = GridBagConstraints.BOTH;
                    gridBagConstraints4.weightx = 1.0;
                    panel1.add(panel4, gridBagConstraints4);//posicionando painel 4 com essas caracteristicas no layout da linha 29;

                    JButton jButton1 = new JButton();

                    jButton1.setText("Logar");
                    jButton1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            jButton1ActionPerformed(evt);
                        }

                    });

                    GridBagConstraints gridBagConstraintsB1 = new GridBagConstraints(); // se relaciona com a linha 137
                    gridBagConstraintsB1.gridx = 0;
                    gridBagConstraintsB1.gridy = 0;
                    gridBagConstraintsB1.fill = GridBagConstraints.BOTH;
                    gridBagConstraintsB1.weightx = 1.0;
                    gridBagConstraintsB1.weighty = 1.0;
                    gridBagConstraintsB1.insets = new Insets(10, 30, 10, 30);
                    panel4.add(jButton1, gridBagConstraintsB1);//posicionando button1 com essas caracteristicas no layout da linha 137;

                    JButton jButton2 = new JButton();

                    jButton2.setText("Sair");
                    jButton2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            jButton2ActionPerformed(evt);
                        }
                    });
                    GridBagConstraints gridBagConstraintsB2 = new GridBagConstraints(); // se relaciona com a linha 137
                    gridBagConstraintsB2.gridx = 1;
                    gridBagConstraintsB2.gridy = 0;
                    gridBagConstraintsB2.fill = GridBagConstraints.BOTH;
                    gridBagConstraintsB2.weightx = 1.0;
                    gridBagConstraintsB2.weighty = 1.0;
                    gridBagConstraintsB2.insets = new Insets(10, 30, 10, 30);
                    panel4.add(jButton2, gridBagConstraintsB2);//posicionando button2 com essas caracteristicas no layout da linha 137;
                }
            }
        

            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

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
        if (senhaDigitada.equals("admin")) {
            String nomeUsuario = campoNome.getText(); // Armazenar nome de usuário
            String senhaUsuario = senhaDigitada; // Armazenar senha
            frame.dispose(); // Fechar a janela de login
            Principal principal = new Principal(nomeUsuario, senhaUsuario);
            principal.mostrarJanela();// Mostrar nova janela
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta", "Confirmação", JOptionPane.WARNING_MESSAGE);
            campoSenha.setText("");
        }
    }


    private static void jButton2ActionPerformed(ActionEvent evt) {
        int controle = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do programa?", "Cuidado", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,null);
        if(controle==0){
            System.exit(0);
        }
    }

}
