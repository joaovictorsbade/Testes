import javax.swing.*;

public class Tests {

    public static void main(String[] args) {

        
        // Cria um rótulo com o texto "Hello World"
        JLabel label = new JLabel("Hello World");

        // Cria uma janela e adiciona o rótulo
        JFrame frame = new JFrame();
        frame.getContentPane().add(label);

        // Define o tamanho da janela automaticamente com base no conteúdo
        frame.pack();

        // Define a operação de fechamento padrão
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Exibe a janela
        frame.setVisible(true);
    }


}