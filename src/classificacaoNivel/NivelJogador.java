package classificacaoNivel;

public class NivelJogador {
    private final String nome;
    private final int idade;

    public NivelJogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String nivelDeDificuldade() {
        if (getIdade() <= 12) {
            return "1";
        } else {
            return "2";
        }
    }

    public String explicandoTenativas() {
        if (nivelDeDificuldade().equalsIgnoreCase("1")) {
            return "0 e 10";
        } else {
            return "0 a 1000";
        }
    }

}
