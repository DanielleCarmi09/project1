public class Spongebob extends Fish implements ProfessionalBasketBallPlayer{
    public Spongebob(String name, int age, String favoriteFood){
        super(name, age, favoriteFood);
    }
    @Override
    public void goToWork(){
        takeTheCar();
    }

    public void playBasketball(){System.out.println("I'm playing basketball");}
}