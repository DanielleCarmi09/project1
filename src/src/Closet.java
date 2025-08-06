public class Closet {
    private Shirt[] shirtsArr;

    public Closet(Shirt[] shirtsArr) {
        this.shirtsArr = shirtsArr;
    }

    public Shirt[] getShirtsArr() {
        return this.shirtsArr;
    }

    public Shirt[] getShirtsBySize(int size) {
        int length = 0;
        for (int i = 0; i < this.shirtsArr.length; i++) {
            if (this.shirtsArr[i].getSize() == size) length++;
        }
        Shirt[] shirtsBySizeArr = new Shirt[length];
        int place = 0;
        for (int i = 0; i < shirtsArr.length; i++) {
            if (this.shirtsArr[i].getSize() == size) {
                shirtsBySizeArr[place] = this.shirtsArr[i];
                place++;
            }
        }
        return shirtsBySizeArr;

    }

    public void addShirt(Shirt s) {
        Util u = new Util();
        this.shirtsArr = u.addShirt(this.shirtsArr, s);
    }

    public static void main(String[] args) {
        Shirt[] shirts = {new Shirt(1, "red"), new Shirt(2, "blue")};
        Util u = new Util();
        Shirt[] newShirts = u.addShirt(shirts, new Shirt(3, "green"));
        for (int i = 0; i < newShirts.length; i++) {
            System.out.println(newShirts[i].getSize()+ " " + newShirts[i].getColor());
        }
    }
}



