import java.util.Random;

public class Mago extends Personagem {
    public Mago(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public void curar() {
        Random random = new Random();
        int cura = random.nextInt(25) + 5; 
        setVida(getVida() + cura);
        System.out.println(getNome() + " usou magia e curou " + cura + " pontos de vida.");
    }
}
