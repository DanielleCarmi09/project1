import java.util.Scanner;

public enum Product {
    CHEESE("cheese" ,5),
    WATER_BOTTLE("waterBottle",3),
    OIL_BOTTLE("oilBottle",10),
    SUGAR("sugar",7),
    APPLES("apples",0);

    private String name;
    private int price;
    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public static int fullPrice(Product[]products, int[]amounts, Scanner reader){
        int price=0;
        for(int i=0; i<products.length;i++){
            if(products[i] == APPLES){
                System.out.println("What price are the apples by weight?");
                price+= reader.nextInt();
            }else {
                price += products[i].price * amounts[i];
            }
        }
        return price;
    }

}