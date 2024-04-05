import java.util.Scanner;

public class ExeContaSaqueDeposito {

    public static void main(String[] args) {
        //--Chamar Métodos e Funções--
        Conta conta = new Conta(); // Instanciando um objeto da classe Conta

        conta.inicializarAtributos();
        Scanner input = new Scanner(System.in);
        System.out.println("----Ações---- \n [1] Para depositar.\n [2] Para sacar.\n [3] Para alterar nome.\n [4] Para alterar número da conta.\n [5] Para alterar saldo.");
        System.out.println("Digite o número correspondente com a ação que deseja realizar:");
        int acao = Integer.parseInt(input.nextLine());
        switch (acao) {
            case 1:
                conta.depositar(conta.pegarQuantidade());
                break;
            case 2:
                conta.sacar(conta.pegarQuantidade());
                break;
            case 3:
                conta.alterarAtributoNome(conta.nome);
                break;
            case 4:
                conta.alterarAtributoNumConta(conta.numConta);
                break;
            case 5:
                conta.alterarAtributoSaldo(conta.saldo);
                break;
            default:
                System.out.println("Número não correspondente com nenhuma ação!");

        }

    }



    public static class Conta {
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

        void depositar(double quantidade) {
            this.saldo = this.saldo + quantidade;
            System.out.println("Você depositou R$ " + quantidade);
            System.out.println("Seu saldo atual é: " + saldo);
        }

        void sacar(double quantidade) {
            if (saldo >= quantidade) {
                this.saldo = this.saldo - quantidade;
                System.out.println("Você sacou R$ " + quantidade);
                System.out.println("Seu saldo atual é: " + saldo);
            } else {
                System.out.println("Saldo Indisponivel");
            }
        }

        void alterarAtributoNome(String nome) {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite seu novo nome: ");
            nome = input.nextLine();
            System.out.println("Atualizado para: " + nome);

        }

        public void alterarAtributoNumConta(int numConta) {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite novo numero da conta: ");
            numConta = Integer.parseInt(input.nextLine());
            System.out.println("Atualizado para: " + numConta);

        }

        void alterarAtributoSaldo(double saldo) {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite novo saldo: ");
            saldo = Double.parseDouble(input.nextLine());
            System.out.println("Atualizado para: " + saldo);
        }

        void inicializarAtributos() {
            Scanner input = new Scanner(System.in);

            System.out.println("Atributos da conta");

            System.out.println("Digite seu nome: ");
            this.nome = input.nextLine();

            System.out.println("Digite o numero da conta: ");
            this.numConta = Integer.parseInt(input.nextLine());

            System.out.println("Digite o saldo: ");
            this.saldo = Double.parseDouble(input.nextLine());

        }

        Double pegarQuantidade() {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite a quantidade: ");
            Double quantidade = Double.valueOf(input.nextLine());
            return quantidade;
        }
    }

}
