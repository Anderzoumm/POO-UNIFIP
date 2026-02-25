public class Aluno {
    String nome;
    int idade;
    double nota;
    boolean ativo;

    void estudar(String materia){
        System.out.println("O aluno" + nome + "esta estudando" + materia);
    }
    
    void adicionarNota(double novaNota){
        nota = novaNota;
    }
}
