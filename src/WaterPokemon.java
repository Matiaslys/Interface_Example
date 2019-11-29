public class WaterPokemon extends Pokemon implements EX , CanFly {
    public void svim() {
        System.out.println();
    }

    @Override
    public void ex() {
        System.out.println("Jeg er ekstra sej.");
    }

    @Override
    public void fly() {
        System.out.println("jeg bruger vand til at flyve i luften.");
    }
}