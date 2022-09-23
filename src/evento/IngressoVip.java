
package evento;

public class IngressoVip extends Ingresso{
    
    public IngressoVip(String nome, String cpf, Eventos tipo_evento){
        this.nome = nome;
        this.cpf = cpf;
        this.tipo_evento = tipo_evento;
    }
    
    @Override
    public void calcularValorIngresso(){
        this.valor = this.tipo_evento.valor_unico + (this.tipo_evento.valor_unico*0.30);
    }
    
    @Override
    public void imprimirValor(){
        System.out.println("Tipo Ingresso: VIP");
        System.out.println("Valor: " + this.valor);
    }
}
