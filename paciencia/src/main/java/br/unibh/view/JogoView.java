package br.unibh.view;

import java.util.Scanner;

import br.unibh.controller.Jogo;

public class JogoView {
    private Jogo jogo;

    public JogoView() {
        jogo = Jogo.getInstance();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            exibirEstadoDoJogo();
            System.out.println("Digite um comando: ");
            String comando = scanner.nextLine();
            processarComando(comando);
        }
    }

    private void exibirEstadoDoJogo() {
        System.out.println("Estado do Jogo:");
        for (int i = 0; i < jogo.getColunas().length; i++) {
            System.out.println("Coluna " + i + ": " + jogo.getColunas()[i]);
        }
        for (int i = 0; i < jogo.getFundacoes().length; i++) {
            System.out.println("Fundação " + i + ": " + jogo.getFundacoes()[i]);
        }
        System.out.println();
    }

    private void processarComando(String comando) {
        String[] partes = comando.split(" ");
        String acao = partes[0];
        switch (acao) {
            case "mover":
                int origem = Integer.parseInt(partes[1]);
                int numCartas = Integer.parseInt(partes[2].replace("c", ""));
                int destino = Integer.parseInt(partes[3]);
                jogo.moverCartas(origem, numCartas, destino);
                break;
            case "puxar":
                jogo.puxarCartaDoBaralho();
                break;
            case "fundacao":
                int coluna = Integer.parseInt(partes[1]);
                jogo.moverParaFundacao(coluna);
                break;
            default:
                System.out.println("Comando inválido.");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Como jogar: \nO comando 'puxar' vai adicionar uma carta nova em cada coluna. \nO comando 'mover' vai mover uma ou mais cartas entre as colunas, exemplo: 'mover 1 3c 5'  irá mover 3 cartas da coluna 1 para a coluna 5. \nO comando 'fundacao' funciona da seguinte forma: 'fundacao 1'  Sendo 1 o índice da coluna de onde a carta será movida para a fundação correspondente ao naipe da carta no topo dessa coluna. Utilize para organizar seus naipes de forma eficiente.");
        JogoView jogoView = new JogoView();
        jogoView.iniciar();
    }
}
