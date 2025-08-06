public enum Month{
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private int daysInTheMonth;
    Month(int daysInTheMonth){
        this.daysInTheMonth = daysInTheMonth;
    }
    public int getDaysInTheMonth(){
        return this.daysInTheMonth;
    }
    public int getMonthNumber(){
        return this.ordinal()+1;
    }
    public static int getDaysBefore(Month month, int day){
        int days=0;
        for(int i=0;i<month.ordinal();i++){
            days+=
        }
    }
}