
import java.util.Scanner;

public class exe2 {
    public int Status;
    public boolean Ligar;
    public boolean Desligar;


    public boolean getLigar() {
        return Ligar;
    }
    public void setLigar(boolean Lig) {
        this.Ligar = Lig;
    }

    public boolean getDesligar() {
        return Desligar;
    }
    public void setDesligar(boolean Des) {
        this.Desligar = Des;
    }

    public void status(boolean status) {
        if (status = true) {
            System.out.println("Lâmpada ligada");
        }else {
            System.out.println("Lâmpada desligada");
        }
    }

    public static void Main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            exe2 st = new exe2();

            System.out.println("Você quer ligar ou desligar a lâmpada? ");
            boolean Lig = input.nextBoolean();
            st.setLigar(Lig);
        }

    }


}