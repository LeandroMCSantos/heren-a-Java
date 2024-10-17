import java.util.Random;

public abstract class Personagem implements Atacavel {
    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract void curar();

    public void atacar(Personagem p) {
        Random random = new Random();
        int dano = random.nextInt(this.forca);
        p.receberDano(dano);
        System.out.println(this.nome + " atacou " + p.getNome() + " causando " + dano + " de dano.");
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }
}
