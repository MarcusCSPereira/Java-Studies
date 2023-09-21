package TreinoGUI.src;

import javax.swing.*;
import java.awt.*;

public class LoadingScreen {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SplashScreen splashScreen = new SplashScreen();
            splashScreen.showSplash(() -> {
                // Após a conclusão do splash screen, execute a classe principal do segundo arquivo
                Login.main(null);
            });
        });
    }
}

class SplashScreen extends JWindow {

    private JProgressBar progressBar;

    public SplashScreen() {
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);

        JLabel loadingLabel = new JLabel("Loading...");
        loadingLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.add(loadingLabel, BorderLayout.NORTH);
        contentPane.add(progressBar, BorderLayout.CENTER);

        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
    }

    public void showSplash(Runnable onCompletion) {
        setVisible(true);

        Thread loadingThread = new Thread(() -> {
            for (int progress = 0; progress <= 100; progress++) {
                final int finalProgress = progress;
                SwingUtilities.invokeLater(() -> progressBar.setValue(finalProgress));
                try {
                    Thread.sleep(50); // Simulating loading delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            SwingUtilities.invokeLater(() -> {
                setVisible(false);
                dispose();
                if (onCompletion != null) {
                    onCompletion.run();
                }
            });
        });

        loadingThread.start();
    }
}
