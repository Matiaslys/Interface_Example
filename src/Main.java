public class Main {
    public static void main(String[] args) {
        System.out.println();

        FirePokemon pikatchu = new FirePokemon();
        pikatchu.setNavn("Pikachu");
        pikatchu.setKoen("Han");
        pikatchu.setSkade((short) 80);
        pikatchu.setNummerPokedex(25);


        System.out.println(pikatchu.toString());
        pikatchu.spyild();
    }
}
