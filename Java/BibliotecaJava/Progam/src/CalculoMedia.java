import java.util.Scanner;


//Aula Java 26/03
public class CalculoMedia {

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


    Scanner input;

    private float n1;
    private float n2;
    private float n3;
    private float media;
    private char conceito;

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public char getConceito() {
        return conceito;
    }

    public void setConceito(char conceito) {
        this.conceito = conceito;
    }

    public float calcularMedia() {
        this.media = (n1 + n2 + n3) / 3;
        System.out.println(media);
        return media;
    }


    public char definirConceito(float media){
        if(media >= 9 && media <=10){
            setConceito('A');
        } else if (media >= 8 && media < 9) {
            conceito = 'B';
        } else if (media >= 7 && media < 8) {
            conceito = 'C';
        } else if (media >= 6 && media < 7) {
            conceito = 'D';
        }else {
            conceito = 'E';
        }
        return conceito;
    }
    public void apresentarNota(char conceito){
        switch (conceito){
            case 'A':
                System.out.println("Paraboins tu tirou A, A de avião, voa ");
                break;
            case 'B':
                System.out.println("Foi bom B");
                break;
            case 'C':
                System.out.println("Foi bem MÉ C");
                break;
            case 'D':
                System.out.println("No Limite. Tirou D");
                break;
            case 'E':
                System.out.println("Foi de F. Tirou E");
                break;

        }
    }
}
