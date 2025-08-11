public class Main {
    public static void main(String[]args){
        Bed bed = new Bed(1.2,2, "white", 200);
        Shirt[]shirts ={new Shirt(39, "red"), new Shirt(2, "blue")};
        Room room = new Room(shirts, bed);
        room.getBed().setSheetColor(DanielleConstants.FAVORITE_COLOR);
        Shirt[] shirtsBySize = room.getCloset().getShirtsBySize(DanielleConstants.SIZE);
        for (int i = 0; i<shirtsBySize.length;i++) System.out.println(shirtsBySize[i].getColor());
        System.out.println(Util.isTolerant(room.getBed().getPrice(),DanielleConstants.HEIGHEST_PRICE,DanielleConstants.TOLERANCE));

    }
}