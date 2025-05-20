import java.util.ArrayList;

public class ListaDeTamagotchi {
    private final ArrayList<Tamagotchi> listaTamagotchis;

    public ListaDeTamagotchi() {
        this.listaTamagotchis = new ArrayList<>();
    }

    public void adicionarTamagotchi(Tamagotchi t) {
        listaTamagotchis.add(t);
    }

    public void removerTamagotchi(Tamagotchi t) {
        listaTamagotchis.remove(t);
    }

    public Tamagotchi buscarPorNome(String nome) {
        for (Tamagotchi t : listaTamagotchis) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                return t;
            }
        }
        return null; // não encontrado
    }

    public void listarTamagotchiResumido() {
        for (Tamagotchi t : listaTamagotchis) {
            System.out.println(" Nome: " + t.getNome() + ", Espécie: " + t.getEspecie());
        }
    }

    public void listarTamagotchis() {
        for (int i = 0; i < listaTamagotchis.size(); i++) {
            Tamagotchi t = listaTamagotchis.get(i);
            String status = t.isEstaDormindo() ? "Dormindo" : "Acordado";
            System.out.println(i + " - Nome: " + t.getNome() +
                               ", Espécie: " + t.getEspecie() +
                               ", Idade: " + t.getIdade() +
                               ", Status: " + status);
        }
    }
    

    public Tamagotchi getTamagotchi(int index) {
        if (index >= 0 && index < listaTamagotchis.size()) {
            return listaTamagotchis.get(index);
        } else {
            System.out.println("Índice inválido!");
            return null;
        }
    }
    
    // Getter para acesso externo se necessário
    public ArrayList<Tamagotchi> getListaTamagotchis() {
        return listaTamagotchis;
    }
}