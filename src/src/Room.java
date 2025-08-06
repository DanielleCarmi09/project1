public class Room {
    private Closet closet;
    private Bed bed;

    public Room(Closet closet, Bed bed) {
        this.closet = closet;
        this.bed = bed;
    }

    public Room(Shirt[] shirts, Bed bed) {
        this.closet = new Closet(shirts);
        this.bed = bed;
    }

    public Closet getCloset() {
        return this.closet;
    }

    public Bed getBed() {
        return this.bed;
    }
}