public class MainConta{
    static void main(String[] args) {


        Cliente anderson = new Cliente("84515445846", "Anderson","Sitio São José");

        Conta minhaConta = new Conta(anderson);


        System.out.println("Saldo em conta: " + minhaConta.getSaldo());
        if (minhaConta.sacar(200)) {
            System.out.println("Saque realizado com sucesso!");

        } else {
            System.out.println("Erro ao sacar!");
            System.out.println("Saldo em conta:" + minhaConta.getSaldo());
        }
        if (minhaConta.deposito(1200)) {
            System.out.println("Desposito realizado com sucesso!");
        } else {
            System.out.println("Erro, valor invalido!");
        }
        System.out.println("Saldo em conta: " + minhaConta.getSaldo());

        //estudar endereços de objetos!! memoria rip!!!!!
    }
}