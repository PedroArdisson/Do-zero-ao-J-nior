package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimesTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Death Note", "TV", 12, "Ação");
        anime.imprime();
    }


}
