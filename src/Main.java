import java.util.Scanner;


class Animal {
    private String nome;
    private String especie;
    private int idade;     

    // Construtor da classe Animal
    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
    }


    public void atualizarIdade(int novaIdade) {
        this.idade = novaIdade;
        System.out.println("Idade atualizada com sucesso!");
    }
}

  class AplicacaoAnimais {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("insira o nome do animal: ");
         String nome = scanner.nextLine();

         System.out.print("insira a espécie do animal: ");
         String especie = scanner.nextLine();

         System.out.print("insira a idade do animal: ");
         int idade = scanner.nextInt();


         Animal animal = new Animal(nome, especie, idade);


         System.out.println("Informações do Animal:");
         animal.exibirInformacoes();


         System.out.print("insira a nova idade do animal: ");
         int novaIdade = scanner.nextInt();
         animal.atualizarIdade(novaIdade);


         System.out.println("Informações Atualizadas do Animal:");
         animal.exibirInformacoes();


         scanner.close();
     }
 }

