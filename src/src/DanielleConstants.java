public class DanielleConstants{
    private static final int SIZE = 39;
    private static final String FAVORITE_COLOR = "pink";
    private static final double HIEGHEST_PRICE = 300;
    private static final double TOLERANCE = 50;

    public static void main(String[]args){
        Bed bed = new Bed(1.2,2, "white", 200);
        Shirt[]shirts ={new Shirt(39, "red"), new Shirt(2, "blue")};
        Room room = new Room(shirts, bed);
        room.getBed().setSheetColor(FAVORITE_COLOR);
        Shirt[] shirtsBySize = room.getCloset().getShirtsBySize(SIZE);
        for (int i = 0; i<shirtsBySize.length;i++) System.out.println(shirtsBySize[i].getColor());

    }
}