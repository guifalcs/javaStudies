public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Album caminho = new Album("Caminho", "Psalms");
        caminho.addSong("Caminho", 3.5);
        caminho.addSong("Três Dias", 4.0);

        System.out.println(caminho.findSong("Caminho"));
    }

}