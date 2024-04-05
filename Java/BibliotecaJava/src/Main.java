import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //--Chamar Métodos e Funções--

        //SwitchCase();
        //LacoDeRepeticao();
        //ScannerInput();

    }


    //Switch Case
    public static void SwitchCase(){
        Scanner input = new Scanner(System.in);
        String diaSemana;
        System.out.print("Digite um número de 1 a 7: ");
        int num = input.nextInt();
        switch (num){
            case 1:
                diaSemana = "Segunda-Feira";
                break;
            case 2:
                diaSemana = "Terça-Feira";
                break;
            case 3:
                diaSemana = "Quarta-Feira";
                break;
            case 4:
                diaSemana = "Quinta-Feira";
                break;
            case 5:
                diaSemana = "Sexta-Feira";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Inválido";

        }
        System.out.println("Dia: " + diaSemana);

    }
    //Switch Case


    //Laço de Repetição
    public static void LacoDeRepeticao(){
        System.out.println("Laço de Repetição");
        for (int i = 1; i <= 5; ++i) {
            System.out.println("i = " + i);
        }
    }//Laço de Repetição

    //Scanner
    public static void ScannerInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = input.nextLine();
        System.out.println("Você digitou: " + texto);
        input.close();
    }//Scanner



}