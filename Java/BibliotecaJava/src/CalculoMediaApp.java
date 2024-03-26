import java.util.Scanner;

public class CalculoMediaApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CalculoMedia cm = new CalculoMedia();

        System.out.println("N1: ");
        float n1 = input.nextFloat();
        cm.setN1(n1);

        System.out.println("N2: ");
        float n2 = input.nextFloat();
        cm.setN2(n2);

        System.out.println("N3: ");
        float n3 = input.nextFloat();
        cm.setN3(n3);

        cm.apresentarNota(cm.definirConceito(cm.calcularMedia()));
    }
}
