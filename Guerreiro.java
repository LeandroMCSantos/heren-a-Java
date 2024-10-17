import java.util.Random;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public void curar() {
        Random random = new Random();
        int cura = random.nextInt(20) + 10; 
        setVida(getVida() + cura);
        System.out.println(getNome() + " curou " + cura + " pontos de vida.");
    }
}
