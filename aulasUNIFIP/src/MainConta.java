import java.util.Scanner;

public class MainConta{
    static void main(String[] args) {


        //criação dos clientes
        Cliente anderson = new Cliente("84515445846", "Anderson","Sitio São José");
        Conta minhaConta = new Conta(anderson, 1000);

        Cliente wesley = new Cliente ("123456","Wesley", "Coremas");
        Conta conta2 = new Conta(wesley, 1000);


        //algumas variaveis que usaremos com frequencia
        String erro = "Erro na operação";
        String sucess = "Operação realizada com sucesso!";
        double valor = 0;
        int option = 0;
        String destino = "";
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("MENU");
            System.out.println("1 - SAQUE");
            System.out.println("2 - DEPOSITO");
            System.out.println("3 - TRANFERENCIA");
            System.out.println("4 - RESUMO");
            System.out.println("5 - SAIR");
            System.out.println("Digite uma das opções acima:");

            option = input.nextInt();

            switch (option){
                case 1:
                    //Saque
                    System.out.println("----SAQUE----");
                    System.out.println("Digite o valor que deseja sacar: ");
                    valor = input.nextInt();
                    if(minhaConta.sacar(valor)){
                        System.out.println(sucess);
                    }
                    else{
                        System.out.println(erro);
                    }
                    break;
                case 2:
                    System.out.println("----DEPOSITO----");
                    System.out.println("Digite o valor que deseja depositar: ");
                    valor = input.nextInt();
                    if(minhaConta.deposito(valor)){
                        System.out.println(sucess);
                    }
                    else{
                        System.out.println(erro);
                    }
                    break;
                case 3:
                    //TRANFERENCIA
                    System.out.println("----TRANSFERÊNCIA----");
                    System.out.println("Valor: ");
                    valor = input.nextDouble();
                    if(minhaConta.tranferir(conta2,valor)){
                        System.out.println(sucess);
                    }
                    else{
                        System.out.println(erro);
                    }
                    break;
                case 4:
                    //RESUMO
                    System.out.println("----RESUMO----");
                    String resumo = minhaConta.getResumo();
                    System.out.println(resumo);

                    break;
                case 5:
                    System.out.println("Saindo...");
            }




        }while(option !=5);

    }
}