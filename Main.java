public class Bed{
    private double height;
    private int Pillow_Amount;
    private String Sheet_Color;
    private double price;

    public Bed(double height, int Pillow_Amount, String Sheet_Color, double price){
        this.height = height;
        this.Pillow_Amount = Pillow_Amount;
        this.Sheet_Color = Sheet_Color;
        this.price = price;
    }

    public Bed(double height, String Sheet_Color){
        this.height = height;
        this.Pillow_Amount = 1;
        this.Sheet_Color = Sheet_Color;
        this.price = 100;
    }

    public double getHeight(){
        return this.height;
    }
    public int getPillow_Amount(){
        return this.Pillow_Amount;
    }
    public String getSheet_Color(){
        return this.Sheet_Color;
    }
    public double getPrice(){
        return this.price;
    }
    public void setSheet_Color(String Sheet_Color){
        this.Sheet_Color = Sheet_Color;
    }
}

public class Shirt{
    public int size;
    public String color;

    public Shirt(int size, String color){
        this.size = size;
        this.color = color;
    }

    public int getSize(){
        return this.size;
    }

    public String getColor(){
        return this.color;
    }
}

public class Closet{
    private Shirt[] ShirtsArr;

    public Closet(Shirt[]ShirtsArr){
        this.ShirtsArr = ShirtsArr;
    }

    public Shirt[] getShirtsArr(){
        return this.ShirtsArr
    }
    public Shirt[] getShirtsBySize(int size){
        length = 0;
        for (int i = 0; i<this.ShirtsArr.length;i++){
            if(this.ShirtsArr[i].getSize() == size) length++;
        }
        ShirtsBySizeArr = new shirt[length];
        place = 0;
        for (int i = 0; i<ShirtsArr.length;i++){
            if (this.ShirtsArr[i].getSize() == size){
                ShirtsBySizeArr[place] = this.ShirtsArr[i];
                place++;
            }
        }
        return ShirtsBySizeArr;

    }
}