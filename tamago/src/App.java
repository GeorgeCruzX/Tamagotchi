import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // play();
       // menu();
       //playAll();
       menuAll();
    }

    public static void playAll(){
                // Criando o gerenciador de Tamagotchis
                ListaDeTamagotchi manager = new ListaDeTamagotchi();

                // Criando alguns Tamagotchis
                Tamagotchi t1 = new Tamagotchi("Tama", "Gato", 2);
                Tamagotchi t2 = new Tamagotchi("Choco", "Cachorro", 3);
                Tamagotchi t3 = new Tamagotchi("Bicho Grilo","Crocodilo",1);
        
                // Adicionando os Tamagotchis ao gerenciador
                manager.adicionarTamagotchi(t1);
                manager.adicionarTamagotchi(t2);
                manager.adicionarTamagotchi(t3);
                // Listando os Tamagotchis
                manager.listarTamagotchis();
    }

    public static void play(){
        System.out.println("Meu Tamagotchi ");
        Tamagotchi pet = new Tamagotchi("Marye", "Felina", 8);
        pet.mostrarStatus(); 
        pet.brincar();
        pet.dormir();
        pet.brincar();
        pet.mostrarStatus();
    }

    public static void menu(){
        char op;
        String nome, especie;
        int idade;
        try (Scanner teclado = new Scanner(System.in)) {
            Tamagotchi pet = new Tamagotchi("vazio","nenhum",0);
            do{
            System.out.println("Seu Tamagotchi!");
            System.out.println("""
                                c- Criar/Recriar Tamagotchi; 
                                f- Alimentar Tamagotchi;
                                p-Brincar com Tamagotchi;
                                s-Dormir
                                w-acordar
                                v- ver como est\u00e1
                                q- sair
                                Informe Op\u00e7\u00e3o:""");
            op = teclado.next().charAt(0);
            switch (op) {
                case 'c' -> {
                    System.out.println("Novo Tamagotchi!\n Informe Nome - Especie - idade:");
                    nome = teclado.next();
                    especie = teclado.next();
                    idade=teclado.nextInt();
                    pet = new Tamagotchi(nome, especie, idade);
                    pet.mostrarStatus();
                    }
                case 'v' -> pet.mostrarStatus();
                case 'f' -> pet.alimentar();
                case 's' -> pet.dormir();
                case 'p' -> pet.brincar();
                case 'w' -> pet.acordar();
                default -> System.out.println("ops...");
                }
            }
            while(op!='q');
        }
    }

    public static void menuAll() {
        try (Scanner teclado = new Scanner(System.in)) {
            ListaDeTamagotchi manager = new ListaDeTamagotchi();
            char op;
   
            do {
                System.out.println("\nGerenciador de Tamagotchis:");
                System.out.println(" c - Criar novo Tamagotchi");
                System.out.println(" l - Listar todos os Tamagotchis");
                System.out.println(" f - Alimentar um Tamagotchi");
                System.out.println(" p - Brincar com um Tamagotchi");
                System.out.println(" s - Fazer um Tamagotchi dormir");
                System.out.println(" w - Acordar um Tamagotchi");
                System.out.println(" v - Ver status de um Tamagotchi");
                System.out.println(" q - Sair");
                System.out.print("Escolha uma opção: ");
                op = teclado.next().charAt(0);
   
                switch (op) {
                    case 'c' -> {
                        System.out.println("Informe nome, espécie e idade:");
                        String nome = teclado.next();
                        String especie = teclado.next();
                        int idade = teclado.nextInt();
                        Tamagotchi novo = new Tamagotchi(nome, especie, idade);
                        manager.adicionarTamagotchi(novo);
                    }
                    case 'l' -> manager.listarTamagotchis();
                    case 'f' -> {
                        manager.listarTamagotchis();
                        System.out.print("Informe o índice do Tamagotchi para alimentar: ");
                        int idxF = teclado.nextInt();
                        manager.getTamagotchi(idxF).alimentar();
                    }
                    case 'p' -> {
                        manager.listarTamagotchis();
                        System.out.print("Informe o índice do Tamagotchi para brincar: ");
                        int idxP = teclado.nextInt();
                        manager.getTamagotchi(idxP).brincar();
                    }
                    case 's' -> {
                        manager.listarTamagotchis();
                        System.out.print("Informe o índice do Tamagotchi para dormir: ");
                        int idxS = teclado.nextInt();
                        manager.getTamagotchi(idxS).dormir();
                    }
                    case 'w' -> {
                        manager.listarTamagotchis();
                        System.out.print("Informe o índice do Tamagotchi para acordar: ");
                        int idxW = teclado.nextInt();
                        manager.getTamagotchi(idxW).acordar();
                    }
                    case 'v' -> {
                        manager.listarTamagotchis();
                        System.out.print("Informe o índice do Tamagotchi para ver status: ");
                        int idxV = teclado.nextInt();
                        manager.getTamagotchi(idxV).mostrarStatus();
                    }
                    case 'q' -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (op != 'q');
        }
    }
    
}
