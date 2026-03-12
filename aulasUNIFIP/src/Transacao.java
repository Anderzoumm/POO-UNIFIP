import java.lang.classfile.instruction.StackInstruction;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Transacao {
    private String tipo;
    private double valor;
    private Date data;
    private String detalhe;



    public Transacao(String tipo, double valor, Date data, String detalhe){
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.detalhe = detalhe;
    }

    public String getTipo(){
        return tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public Date getData(){
        return data;
    }

    public String getDetalhes(){
        return this.detalhe ;
    }

    public String getDataFormatada() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }

}
