public class Cliente implements Autenticavel {
    private String nome;
    private String senha; // NUNCA guarde senhas em texto puro na vida real, ok? Só para estudo!

    public Cliente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    // AQUI ESTÁ O CUMPRIMENTO DO CONTRATO
    @Override
    public boolean login(String senhaEntrada) {
        if (this.senha.equals(senhaEntrada)) {
            System.out.println("Login realizado com sucesso! Bem-vindo, " + nome);
            return true;
        } else {
            System.out.println("Senha incorreta para o cliente " + nome);
            return false;
        }
    }
}