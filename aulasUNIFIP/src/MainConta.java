import java.util.Scanner;

public class MainConta{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Conta minhaConta = new Conta();
        minhaConta.cliente.cpf = "55188445816";
        minhaConta.cliente.nome = "Anderson Queiroga";
        minhaConta.numero = 1;
        minhaConta.saldo = 1548.48;
        minhaConta.titular = "Anderson Queiroga";
        minhaConta.cliente.endereco = "Sitio sao jose";
        System.out.println("Voce tem: " + minhaConta.saldo + "em conta atualmente.");
        if (minhaConta.sacar(200)) {
            System.out.println("Saque realizado com sucesso!");

        } else {
            System.out.println("Erro ao sacar!");
        }
        if (minhaConta.deposito(12)) {
            System.out.println("Desposito realizado com sucesso!");
        } else {
            System.out.println("Erro, valor invalido!");
        }

        System.out.println("Saldo em minhaConta atualemnte: " + minhaConta.saldo);

        Conta outraConta = new Conta();
        outraConta.numero = 2;
        outraConta.saldo = 0;
        outraConta.titular = "Teste";

        if (minhaConta.tranferir(outraConta, 200)) {
            System.out.println("Tranferencia realizada com sucesso!");
        } else {
            System.out.println("Erro de transição, tente novamente!");
        }

        System.out.println("Saldo em minhaConta atualemnte: " + minhaConta.saldo);
        System.out.println("Saldo em outraConta atualemnte: " + outraConta.saldo);

        //estudar endereços de objetos!! memoria rip!!!!!
    }
}