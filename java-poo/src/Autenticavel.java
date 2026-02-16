public interface Autenticavel {
    // Quem assinar este contrato OBRIGATORIAMENTE deve explicar como faz login.
    // Em interfaces, não precisamos escrever 'abstract', é automático.
    boolean login(String senha);
}