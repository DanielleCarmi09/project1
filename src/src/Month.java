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
        Month[]months=Month.values();
        for(int i=0;i<month.ordinal();i++){
            days+=months[i].getDaysInTheMonth();
        }
        days+=day-1;
        return days;
    }

    public static Month whichMonth(int day){
        Month[]months = Month.values();
        int month=0;
        while(day-months[month].getDaysInTheMonth()>0){
            day-=months[month].getDaysInTheMonth();
            month++;
        }
        return months[month];
    }
}