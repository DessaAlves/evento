
package evento;

public class IngressoPista implements IngressoInterface{
    private String nome;
    private String cpf;
    private String tipo_evento;
    
    @Override
    public float calcular(float valor){
        return valor;
    }
    
    @Override
    public void imprimirValor(){
        
    }
    
}
