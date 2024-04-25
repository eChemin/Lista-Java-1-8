public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void aumentarPontuacao(int valor) {
        pontuacao += valor;
        System.out.println("Pontuação aumentada para " + pontuacao);
    }

    public void subirNivel() {
        nivel++;
        System.out.println("O jogador " + nome + " subiu para o nível " + nivel);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}