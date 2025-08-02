package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // if else, switch,

        String sexo = "M";
        switch (sexo){
            case "M":
                System.out.println("Homem");
                break;

            case "F":
                System.out.println("Mulher");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
