package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0 - Bloco de inicialização é executado quando a JVM carregar a classe
    //1 - Alocado espaço em memoria pro objeto
    //2- Cadab atributo de classe é criado e inicializado com valores default ou o que for passado
    //3- Bloca de inicialização executado
    //4- Construtor é executado
     static{
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
