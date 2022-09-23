
package evento;

import java.util.ArrayList;

public class Eventos {
    private int capacidade_maxima;
    private String nome;
    private String data;
    public double valor_unico;
    public ArrayList<Ingresso> ingressos_vendidos = new ArrayList<Ingresso>();
    
    public Eventos(int capacidade, String nome, String data, double valor_unico){
        this.capacidade_maxima = capacidade;
        this.nome = nome;
        this.data = data;
        this.valor_unico = valor_unico;
    }
    
    public void resumo(Ingresso ingresso){
        System.out.println("Nome: " + ingresso.nome); 
        System.out.println("CPF: " + ingresso.cpf);
        System.out.println("Evento: " + this.nome);
        System.out.println("data: " + this.data);
    }
    
    public void venderIngresso(Ingresso ingresso){
        if(this.ingressos_vendidos.size() > this.capacidade_maxima){
            System.out.println("Erro: excedeu a capacidade!");
            return;
        }
        
        this.ingressos_vendidos.add(ingresso);
    }
    
    public void verQuantidadeIngresso(){
        System.out.println("Quantidade de Ingressos vendidos: " + this.ingressos_vendidos.size());
    }
}
