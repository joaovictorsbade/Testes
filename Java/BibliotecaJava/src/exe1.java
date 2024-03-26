//Rm: 555446 João Victor dos Santos Barbosa


import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {
        //--Chamar Métodos e Funções--

    }

    public class Conta {
        private String nome;
        private int numConta;
        private double saldo;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNumConta() {
            return numConta;
        }

        public void setNumConta(int numConta) {
            this.numConta = numConta;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public void depositar(double quantidade){
            this.saldo = this.saldo + quantidade;
            System.out.println("Você depositou R$ " + quantidade);
        }

        public void sacar(double quantidade){
            if(saldo >= quantidade){
                this.saldo = this.saldo - quantidade;
                System.out.println("Você sacou R$ " + quantidade);
            }else{
                System.out.println("Saldo Indisponivel");
            }
        }

        public void alterarAtributoNome(String nome){
            Scanner input = new Scanner(System.in);

            System.out.println("Digite o novo nome: ");
            String newNome = input.nextLine();
            this.nome = newNome;
        }
        public void alterarAtributoNumConta(int numConta){
            Scanner input = new Scanner(System.in);

            System.out.println("Digite novo numero da conta: ");
            int newNumConta = Integer.parseInt(input.nextLine());
            this.numConta = newNumConta;
        }
        public void alterarAtributoSaldo(double saldo){
            Scanner input = new Scanner(System.in);

            System.out.println("Digite novo saldo: ");
            double newSaldo = Double.parseDouble(input.nextLine());
            this.saldo = newSaldo;
        }

        void inicializarAtributos() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Atributos da conta");

            System.out.println("Digite seu nome: ");
            this.nome = scanner.nextLine();

            System.out.println("Digite o numero da conta: ");
            this.numConta = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite o saldo: ");
            this.saldo = Double.parseDouble(scanner.nextLine());

        }
        public Double pegarQuantidade(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            Double quantidade = Double.valueOf(scanner.nextLine());
            return quantidade;
        }
    }

}
