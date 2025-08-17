public enum coin{
    DOLLAR(amount -> amount),
    SHEKEL(amount -> amount*0.3),
    EURO(amount -> amount*1.15),
    ST(amount -> amount + 1);
    private Convert convert;
    coin(Convert convert){ this.convert = convert;}

    public double toDollar(double amount){ return convert.convert(amount);}
}