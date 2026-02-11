// 1. Classe simples para representar o Documento
class Documento {
    String nome;
    int prioridade; // 1 = Urgente, 5 = Baixa prioridade

    public Documento(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "[P" + prioridade + "] " + nome;
    }
}