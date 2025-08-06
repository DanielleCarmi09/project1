public class Bed{
    private double height;
    private int Pillow_Amount;
    private String Sheet_Color;
    private double price;
    int PRICE_CONST = 100;
    int PILLOW_AMOUNT_CONST = 1;

    public Bed(double height, int Pillow_Amount, String Sheet_Color, double price){
        this.height = height;
        this.Pillow_Amount = Pillow_Amount;
        this.Sheet_Color = Sheet_Color;
        this.price = price;
    }

    public Bed(double height, String Sheet_Color){
        this.height = height;
        this.Pillow_Amount = PILLOW_AMOUNT_CONST;
        this.Sheet_Color = Sheet_Color;
        this.price = PRICE_CONST;
    }

    public double getHeight(){
        return this.height;
    }
    public int getPillowAmount(){
        return this.Pillow_Amount;
    }
    public String getSheetColor(){
        return this.Sheet_Color;
    }
    public double getPrice(){
        return this.price;
    }
    public void setSheetColor(String Sheet_Color){
        this.Sheet_Color = Sheet_Color;
    }
}