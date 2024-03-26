import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //--Chamar Métodos e Funções--
        LacoDeRepeticao();
        //ScannerInput();

    }

    //Laço de Repetição
    public static void LacoDeRepeticao(){
        System.out.println("Laço de Repetição");
        for (int i = 1; i <= 5; ++i) {
            System.out.println("i = " + i);
        }
    }//Laço de Repetição

    //Scanner
    public static void ScannerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        System.out.println("Você digitou: " + texto);
        scanner.close();
    }//Scanner



}