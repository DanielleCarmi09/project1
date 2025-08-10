public class MrCrab extends Fish{
    public MrCrab(String name, int age, String favoriteFood){
        super(name, age, favoriteFood);
    }
    @Override
    public void goToWork(){takeTheTrain();}
}