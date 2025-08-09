public enum Product {
    CHEESE(5),
    WATER_BOTTLE(3),
    OIL_BOTTLE(10),
    SUGAR(7),
    Apples(reader.nextlint);

    private int price;
    Product(int price){
        this.price = price;
    }

    public int fullPrice(Product[]products, int[]amounts){
        int price=0;
        for(int i=0; i<products.length;i++){
            price+=products[i].price*amounts[i];
        }
        return price;
    }

}