public class Personagem {

    String nome;
    String classe;
    int nivel;
    float vida;
    int forca;
    int mana;
    int vidaComDano;
    Habilidade habilidade1;
    Habilidade habilidade2;
    Habilidade habilidadeEspecial;

    public Personagem(String nome, String classe, int nivel, int vida, int forca, int mana) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.forca = forca;
        this.mana = mana;
        this.vidaComDano = vida;        
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Habilidade getHabilidade1() {
        return this.habilidade1;
    }
    public void setHabilidade1(Habilidade habilidade1) {
        this.habilidade1 = habilidade1;
    }
    public Habilidade getHabilidade2() {
        return this.habilidade2;
    }
    public void setHabilidade2(Habilidade habilidade2) {
        this.habilidade2 = habilidade2;
    }
    public Habilidade getHabilidadeEspecial() {
        return this.habilidadeEspecial;
    }
    public void setHabilidadeEspecial(Habilidade habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
    
    public void MostrarStatus(){
        // não esquecer de verificar se é mago para mostrar mana
        System.out.println("Personagem: "+nome+" | "+"Classe: "+classe+" | "+"Nível: "+nivel+" | "+"Vida: "+vidaComDano+" | "+"Força: "+forca+" | "+"Mana: "+mana);
    }

    public void Regeneracao(){
        double regeneracao = vidaComDano * 0.30;
        vidaComDano += regeneracao;
        if (vidaComDano > vida) {
            vidaComDano = (int) vida; 
        }
        System.out.println(nome + " se regenerou.");
        MostrarStatus();
    }

    public void ReceberDano(int dano) {
        this.vidaComDano -= dano;
        if (this.vidaComDano < 0) {
            this.vidaComDano = 0;
            System.out.println(nome + " foi derrotado!");
        }else{
            MostrarStatus();
        }
    }

    public void SubirDeNivel() {
        this.nivel++;
        this.vida += 10;
        this.forca += 2;
        System.out.println(nome + " subiu de nível!");
        MostrarStatus();
    }

    public void Ataque1(Personagem alvo) {
        habilidade1.usarHabilidade(this, alvo);
    }
    public void Ataque2(Personagem alvo) {
        habilidade2.usarHabilidade(this, alvo);
    }
    public void AtaqueEspecial(Personagem alvo) {
        habilidadeEspecial.usarHabilidade(this, alvo);
    }

    public void AtaqueAdversario(Personagem alvo) {
        int ataqueAleatorio = (int) (Math.random() * 4); 
        switch (ataqueAleatorio) {
            case 0:
                habilidade1.usarHabilidade(this, alvo);
                break;
            case 1:
                habilidade2.usarHabilidade(this, alvo);
                break;
            case 2:
                habilidadeEspecial.usarHabilidade(this, alvo);
                break;
            case 3:
                Regeneracao();
                break;
            default:
                break;
        }
    }

}
