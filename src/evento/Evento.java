/*- 
*Armazenar dados de Evento: evento deverá ter como atributos, nome, data, valor único, capacidade máxima e uma lista 
de ingressos vendidos essas informações são obrigatórias.
- *Armazenar dados de Ingresso: todo ingresso deverá ser nominal, portanto deverá ter o nome, CPF e o evento relacionado
- *Devem existir 3 categorias de ingresso, Ingresso Pista, Ingresso VIP e Ingresso Camarote
- *Nas classes de Ingressos, devem existir um método de calcular valor do ingresso, onde Pista é o valor único do evento, 
no VIP deve-se adicionar 30% sobre o valor único do evento e no Camarote adicionar 60%
- *Para ingresso é preciso também um método mostrar resumo, onde mostrará o nome e o CPF do dono do ingresso e os dados do 
evento, como nome do evento e a data.
- *Para cada tipo de ingresso, crie um método imprimirValor que retorna o tipo do ingresso com o valor calculado.
- *Para evento deve existir um método vender ingresso, no qual irá adicionar o ingresso criado na lista, verificando se não 
excede a capacidade máxima do evento
- *Para evento deve existir também um método pra mostrar a quantidade de ingressos vendidos.*/


package evento;


public class Evento {
    
    public static void main(String[] args) {
        System.out.println("-------------------------ROCK IN RIO----------------------------");
        Eventos evento = new Eventos(5000, "ROCK IN RIO","22/09/2022", 450.00);
        IngressoVip ingresso_vip = new IngressoVip("Devair","44487777777", evento );
        ingresso_vip.calcularValorIngresso();
        ingresso_vip.imprimirValor();
        evento.resumo(ingresso_vip);
        evento.venderIngresso(ingresso_vip);
        
        System.out.println("--------------------------------------------------------");
        
        IngressoPista ingresso_pista = new IngressoPista("Patricia", "46111111101", evento);
        ingresso_pista.calcularValorIngresso();
        ingresso_pista.imprimirValor();
        evento.resumo(ingresso_pista);
        evento.venderIngresso(ingresso_pista);
        
        System.out.println("--------------------------------------------------------");
        
        IngressoCamarote ingresso_camarote = new IngressoCamarote("Marcelo", "44412587458", evento);
        ingresso_camarote.calcularValorIngresso();
        ingresso_camarote.imprimirValor();
        evento.resumo(ingresso_camarote);
        evento.venderIngresso(ingresso_camarote);
        System.out.println("--------------------------------------------------------");
        evento.verQuantidadeIngresso();
         
        
    }
}
