public class Habilidade {
    String nomeHabilidade;
    int dano;
    Float consumoMana;
    int vida;
    
    public Habilidade(String nome, int dano, float consumo) {
        this.nomeHabilidade = nome;
        this.dano = dano;
        this.consumoMana = consumo;
    }

    public String getNome() {
        return this.nomeHabilidade;
    }
    public void setNome(String nome) {
        this.nomeHabilidade = nome;
    }
    public int getDano() {
        return this.dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public Float getConsumoMana() {
        return this.consumoMana;
    }
    public void setConsumoMana(Float consumoMana) {
        this.consumoMana = consumoMana;
    }

    public void usarHabilidade(Personagem usuario, Personagem alvo) {
        System.out.println("\n"+usuario.getNome() +" usou " + nomeHabilidade + " causando " + dano + " de dano a " + alvo.nome+"\n");        
        alvo.ReceberDano(dano);        
    }
}
