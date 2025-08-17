public abstract class Fish{
    protected String name;
    protected int age;
    protected String favoriteFood;

    public Fish(String name, int age, String favoriteFood){
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    public String getName(){return  this.name;}
    public int getAge(){ return  this.age;}
    public String getFavoriteFood(){return  this.favoriteFood;}
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setFavoriteFood(String favoriteFood){this.favoriteFood = favoriteFood;}

    public void takeTheCar(){System.out.println("I'm going by car");}
    public void takeTheTrain(){System.out.println("I'm going by train");}
    public void walkByFoot(){System.out.println("I'm walking by foot");}
    public abstract void goToWork();


}