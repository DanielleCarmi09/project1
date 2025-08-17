public class Patrick extends Fish implements ProfessionalBasketBallPlayer{
    public Patrick(String name, int age, String favoriteFood) {
        super(name, age, favoriteFood);
    }
    @Override
    public void goToWork() {
        walkByFoot();
    }

    public void playBasketball(){System.out.println("I'm playing basketball with Spongebob");}
}