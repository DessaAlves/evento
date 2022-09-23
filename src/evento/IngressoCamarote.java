
package evento;

public class IngressoCamarote extends Ingresso {
    
    public IngressoCamarote(String nome, String cpf, Eventos tipo_evento){
        this.nome = nome;
        this.cpf = cpf;
        this.tipo_evento = tipo_evento;
        this.valor = this.tipo_evento.valor_unico + (this.tipo_evento.valor_unico*0.60);
    }
    
    @Override
    public void calcularValorIngresso(){
        this.valor = this.tipo_evento.valor_unico + (this.tipo_evento.valor_unico*0.60);
    }
    
    @Override
    public void imprimirValor(){
        System.out.println("Tipo Ingresso: Camarote");
        System.out.println("Valor: " + this.valor);
    }
}
