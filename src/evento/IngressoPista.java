
package evento;

public class IngressoPista extends Ingresso{
  
    public IngressoPista(String nome, String cpf, Eventos tipo_evento){
        this.nome = nome;
        this.cpf = cpf;
        this.tipo_evento = tipo_evento;
    }
    
    @Override
    public void calcularValorIngresso(){
        this.valor = this.tipo_evento.valor_unico;
    }
    
    @Override
    public void imprimirValor(){
        System.out.println("Tipo Ingresso: Pista");
        System.out.println("Valor: " + this.valor);
    }
    
}
