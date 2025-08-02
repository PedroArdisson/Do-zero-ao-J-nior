package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimesTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Death Note", "TV", 12, "Ação");
        Anime anime2 = new Anime("Ponyo", "TV", 1, "Infantil", "Ghibli" );

        anime.imprime();
        System.out.println("------------------");
        anime2.imprime();
    }


}
