import java.util.ArrayList;
import java.util.Date;

    public class Conta {
    /*
    Esse classe foi criada na primeira aula de Classes e instancias de POO 24/02/2026

    a classe é como a planta de um projeto, a ideia do projeto, vamos supor que e a planta de uma casa

    a especificação da planta é quem vai criar o objeto ( a casa )

    a casa em si nao é criada na classe (na planta) sim no main!!!!

    a classe é um conjunto de atributos (caracteriticas , variaveis) e metodos(ações , funções)

    objeto em termos tecnicos sao chamdos de instancias

    */


        // ATRIBUTOS
        private static int identificador; /* esse atribudo usa static, ou seja, ele é estatico durante toda a classe, independente do objeto
        com isso, podemos criar um identificador, que sera apenas alterado quando criarmos uma nova conta (quando o construtor for usado)
       */
        private int numero;
        Cliente cliente = new Cliente();
        private double saldo;
        public static ArrayList<Conta> contas = new ArrayList<>();
        public ArrayList<Transacao> transacoes;

        // CONSTRUTOR

        /*
        Construtores sao o que vao definir como um novo objeto ira iniciar
        nesse abaixo estamos dizendo que sempre que uma conta for iniciada ela deve ter como parametro um clinte
        dessa forma, nunca existirá uma conta que nao seja vinculada com um cliente;
         */

        public Conta(Cliente cliente, double saldo){
            contas.add(this);
            this.saldo = saldo;
            this.cliente = cliente;
            identificador++; // identificador adiciona +1 para a sequencia
            this.numero = identificador;
            this.saldo = saldo;
            this.transacoes = new ArrayList<>();
        }




        //METODOS (legal que seja sempre verbos no infinitivo)

        // o void diz que essa função nao retornará nada !!!
        public boolean sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                transacoes.add(new Transacao("Saque",valor,new Date(), ""));
                return true;
            }
            return false;
        }

        public boolean deposito(double valor) {
            if (valor > 0) {
                saldo += valor;
                transacoes.add(new Transacao("Deposito",valor,new Date(), ""));
                return true;
            }
            return false;
        }

        public boolean tranferir(Conta destino, double valor) {
            if (this.sacar(valor)) {
                destino.deposito(valor);
                transacoes.add(new Transacao("Tranferencia",valor,new Date(), "Anderson Tranferiu para Wesley"));
                return true;
            }
            return false;
        }


        public String getResumo() {

            String resultado = "";

            resultado += "================= RESUMO DA CONTA =================\n";
            resultado += "Conta: " + numero + "\n";
            resultado += "Cliente: " + cliente.getNome() + "\n";
            resultado += "Saldo atual: R$" + saldo;

            resultado += "\n------------------ TRANSAÇÕES ---------------------\n\n";
            resultado += "  Tipo            Valor        Data           Detalhe\n";
            resultado += "-----------------------------------------------------\n";

            for (Transacao t : transacoes) {
                resultado += String.format("%-15s R$ %-10s %-15s %-30s\n",
                        t.getTipo(),
                        t.getValor(),
                        t.getDataFormatada(),
                        t.getDetalhes()
                );
            }

            resultado += "\n==================================================\n";

            return resultado;
        }

        public double getSaldo(){
            return this.saldo;
        }
        public int getIdentificador(){
            return identificador; //identificador não se usa this.
        }
    }


    /* Na aula 2 estamos estudando metodos de encapusulamento.
    No mercado de trabalho nos vamos mexer com muitos codigos legados.
    Para garantir a segurança de um codigo, usamos metodos de encapsulamento
    sao eles o privat( esconde o atributo) , public(qualquer outra classe dentro do projeto pode acessar) ou default (quase um public)
    Para evitar inconsistnecia na classe, nos escondemos os atributos
    assim, apenas a classe pode alterar os atributos
    Para outras classes alterarem algum atributo, isso deve ser feito atraves de metodos



     */