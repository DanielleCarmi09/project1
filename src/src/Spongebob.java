public class Spongebob extends Fish{
    public Spongebob(String name, int age, String favoriteFood){
        super(name, age, favoriteFood);
    }
    @Override
    public void goToWork(){
        takeTheCar();
    }
}