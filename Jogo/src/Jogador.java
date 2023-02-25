public class Jogador{

    private String nome;
    private int xp = 0;
    private int hp = 100;
    private boolean envenenado = false;


    public Jogador(){
        
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public void receberDano(int pontos){
        this.hp -= pontos;
    }

    public void receberCura(int pontos){
        this.hp += pontos;
    }

    public void ganharExperiencia(int pontos){
        this.xp += pontos;
    }

    public boolean isEnvenenado(){

        return envenenado;
    }

    public void receberAntidoto(){
        envenenado = !envenenado;
    }

    public int getXp() {
        return xp;
    }
    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }
}