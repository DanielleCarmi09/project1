public class Room {
    private Closet c;
    private Bed b;

    public Room(Closet c, Bed b) {
        this.c = c;
        this.b = b;
    }

    public Room(Shirt[] shirts, Bed b) {
        this.c = new Closet(shirts);
        this.b = b;
    }

    public Closet getCloset() {
        return this.c;
    }

    public Bed getBed() {
        return this.b;
    }
}