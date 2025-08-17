public class SpongeBobCook extends Spongebob{
    public SpongeBobCook(String name, int age, String favoriteFood){
        super(name, age, favoriteFood);
        super.playBasketball();
    }
    @Override
    public void playBasketball(){
        super.playBasketball();
        System.out.println("after work");
    }
}