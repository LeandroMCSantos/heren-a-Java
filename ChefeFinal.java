import java.util.Random;

public class ChefeFinal extends Guerreiro {
    public ChefeFinal(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }
    @Override
    public void curar() {
        Random random = new Random();
        int cura = random.nextInt(50) + 20; 
        setVida(getVida() + cura);
        System.out.println(getNome() + " (Chefe Final) regenerou " + cura + " pontos de vida.");
    }
}
