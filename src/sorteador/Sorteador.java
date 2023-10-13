package sorteador;

import java.security.SecureRandom;

public class Sorteador {
    private int numero;

    public Sorteador() {
    }

    public Sorteador(int numero) {
        this.numero = numero;
    }

    public int numeroAleatorioNivel1() {
        SecureRandom random = new SecureRandom();
        return 1 + random.nextInt(10);
    }

    public int numeroAleatorioNivel2() {
        SecureRandom random = new SecureRandom();
        return 1 + random.nextInt(1000);
    }


}
