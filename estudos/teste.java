public class teste {
    public static void main(String args[]){
        String nome;
        int idade;
        String posicao;

        //primeiro jogador
        nome = "Caio César";
        idade = 38;
        posicao = "Atacante";
        jogadores A1 = new jogadores(nome,idade,posicao);

        //segundo jogador
        nome = "Alex martins";
        idade = 37;
        posicao = "Atacante";
        jogadores A2 = new jogadores(nome,idade,posicao);

        //terceiro jogador
        nome = "Carlos Almeida";
        idade = 35;
        posicao = "Goleiro";
        jogadores A3 = new jogadores(nome,idade,posicao);

        //terceiro jogador
        nome = "Rafael Luiz";
        idade = 32;
        posicao = "Zagueiro";
        jogadores A4 = new jogadores(nome,idade,posicao);
       
    }
    
}
