public class Bed{
    private double height;
    private int pillowAmount;
    private String sheetColor;
    private double price;
    private static final int PRICE_CONST = 100;
    private static final int PILLOW_AMOUNT_CONST = 1;

    public Bed(double height, int pillowAmount, String sheetColor, double price){
        this.height = height;
        this.pillowAmount = pillowAmount;
        this.sheetColor = sheetColor;
        this.price = price;
    }

    public Bed(double height, String sheetColor){
        this.height = height;
        this.pillowAmount = PILLOW_AMOUNT_CONST;
        this.sheetColor = sheetColor;
        this.price = PRICE_CONST;
    }

    public double getHeight(){
        return this.height;
    }
    public int getPillowAmount(){
        return this.pillowAmount;
    }
    public String getSheetColor(){
        return this.sheetColor;
    }
    public double getPrice(){
        return this.price;
    }
    public void setSheetColor(String Sheet_Color){
        this.sheetColor = sheetColor;
    }
}