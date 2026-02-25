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
        int numero;
        Cliente cliente = new Cliente();
            String titular;
        double saldo;

        //METODOS (legal que seja sempre verbos no infinitivo)

        // o void diz que essa função nao retornará nada !!!
        public boolean sacar (double valor){
            if (valor <= saldo){
                saldo -= valor;
                return true;
            }
            return false;
        }

        boolean deposito (double valor){
            if (valor > 0){
                saldo += valor;
                return true;
            }
            return false;
        }

        boolean tranferir ( Conta destino, double valor){
            if (sacar(valor)) {
                destino.deposito(valor);
                return true;
            }
            return false;
        }
    }
