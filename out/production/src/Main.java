import com.sun.jmx.mbeanserver.Util;

public class main{

}
public static void main(String[]args){
    Shirt[] shirts ={new Shirt(1,"red"), new Shirt(2,"blue")};
    Util u = new Util();
    Shirt[] newShirts = u.addShirt(shirts, new Shirt(3,"green"));
    for (int i = 0; i< newShirts.length;i++){
        System.out.println(newShirts[i]);
    }


public class Util{
    public Shirt[] addShirt(Shirt[]shirtsArr, Shirt s){
        Shirt[] newArr = new Shirt[shirtsArr.length];
        for (int i = 0; i<shirtsArr.length;i++){
            newArr[i] = shirtsArr[i];
        }
        newArr[newArr.length-1] = s;
        return newArr;
    }
}

public class Closet{
    private Shirt[] shirtsArr;

    public Closet(Shirt[]shirtsArr){
        this.shirtsArr = shirtsArr;
    }

    public Shirt[] getShirtsArr(){
        return this.shirtsArr
    }
    public Shirt[] getShirtsBySize(int size){
        length = 0;
        for (int i = 0; i<this.shirtsArr.length;i++){
            if(this.shirtsArr[i].getSize() == size) length++;
        }
        shirtsBySizeArr = new shirt[length];
        place = 0;
        for (int i = 0; i<shirtsArr.length;i++){
            if (this.shirtsArr[i].getSize() == size){
                shirtsBySizeArr[place] = this.shirtsArr[i];
                place++;
            }
        }
        return shirtsBySizeArr;

    }
    public void addShirt(Shirt s){
        Util u = new Util();
        this.shirtsArr = u.addShirt(this.shirtsArr, s);
    }
}

public class Room{
    private Closet c;
    private Bed b;

    public Room(Closet c, Bed b){
        this.c = c;
        this.b = b;
    }
    public Room(Shirt[]shirts, Bed b){
        this.c = new Closet(shirts);
        this.b = b;
    }
    public Closet getCloset(){
        return this.c;
    }
    public Bed getBed(){
        return this.b;
    }
}

