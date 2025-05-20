public class Tamagotchi {
private String nome;
private String especie;
private int idade;
private int felicidade; // 0 a 100
private int fome;       // 0 a 100 (quando maior, mais faminto)
private boolean estaDormindo;

public Tamagotchi(String nome, String especie, int idade) {
    this.nome = nome;
            this.especie = especie;
            this.idade = idade;
            this.felicidade = 70;
            this.fome = 50;
            this.estaDormindo = false;
}

public void alimentar() {
    if (estaDormindo) {
    System.out.println(nome + " está dormindo e não pode comer agora.");
    } else {
    fome -= 20;
    if (fome < 0) fome = 0;
    System.out.println
    ("Você alimentou " + nome + ". Fome agora está em " + fome + ".");
    }
}

public void brincar() {
    if (estaDormindo) {
    System.out.println(nome + " está dormindo e não quer brincar agora.");
    } else {
    felicidade += 15;
    fome += 10;
    if (felicidade > 100) felicidade = 100;
    if (fome > 100) fome = 100;
    System.out.println("Você brincou com " + nome +
    "! Felicidade: " + felicidade + ", Fome: " + fome);
    }
    }

    public void dormir() {
        if (!estaDormindo) {
        estaDormindo = true;
        System.out.println(nome + " foi dormir. Zzz...");
        } else {
        System.out.println(nome + " já está dormindo.");
        }
        }

        public void acordar() {
            if (estaDormindo) {
            estaDormindo = false;
            System.out.println(nome + " acordou! Bom dia!");
            } else {
            System.out.println(nome + " já está acordado.");
            }
            }

        public void mostrarStatus() {
        System.out.println("\n Status de " + nome + ":");
        System.out.println("Especie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Fome: " + fome);
        System.out.println("Está dormindo? " + (estaDormindo ? "Sim" : "Não"));
        
    }

    /* Getters e Setters
public String getNome() { return nome; }
public String getEspecie() { return especie; }
public int getIdade() { return idade; }
public int getFelicidade() { return felicidade; }
public int getFome() { return fome; }
public boolean isEstaDormindo() { return estaDormindo; }
*/

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return boolean return the estaDormindo
     */
    public boolean isEstaDormindo() {
        return estaDormindo;
    }

    /**
     * @param estaDormindo the estaDormindo to set
     */
    public void setEstaDormindo(boolean estaDormindo) {
        this.estaDormindo = estaDormindo;
    }

}