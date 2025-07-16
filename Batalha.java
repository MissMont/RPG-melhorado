import java.util.Scanner;

public class Batalha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        Personagem jogador = new Personagem(" ", "Feiticeira", 23, 100, 30, 250);      
        Personagem personagem2 = new Personagem("Merlin", "Mago", 23, 100, 30, 250);
        
        Habilidade ricochete = new Habilidade("Ricochete", 12, 10.0f);
        Habilidade prisaoDeRaios = new Habilidade("Habilidade Especial: Prisão de Raios", 27, 10.0f);
        Habilidade espinhosDeRaio = new Habilidade("Espinhos de Raio", 17, 10.0f);
        jogador.setHabilidade1(ricochete);
        jogador.setHabilidade2(espinhosDeRaio);
        jogador.setHabilidadeEspecial(prisaoDeRaios);
        
        Habilidade Tempestade = new Habilidade("Tempestade", 12, 10.0f);
        Habilidade EscudoEstilhacos = new Habilidade("Estilhaços de Gelo", 17, 10.0f);
        Habilidade EspinghosDeGelo = new Habilidade("Espinhos de Gelo", 27, 10.0f);
        personagem2.setHabilidade1(Tempestade);
        personagem2.setHabilidade2(EscudoEstilhacos);
        personagem2.setHabilidadeEspecial(EspinghosDeGelo);


        System.out.println("Digite o nome do seu personagem:");
        jogador.nome = scanner.nextLine();

        /*System.out.println("\nO que " + jogador.nome + " irá fazer?");
        System.out.println("1. Ataque 1 - Ricochete");
        System.out.println("2. Ataque 2 - Espinhos De Raio");
        System.out.println("3. Habilidade Especial - Prisão de Raios");
        System.out.println("4. Regeneração");
        int escolha = scanner.nextInt();       */
            
       

    }
}
