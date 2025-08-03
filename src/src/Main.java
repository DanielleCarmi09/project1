public class Main {

    public static void main(String[] args) {

    }

    public class Bed {
        private double height;
        private int Pillow_Amount;
        private String Sheet_Color;
        private double price;

        public Bed(double height, int Pillow_Amount, String Sheet_Color, double price) {
            this.height = height;
            this.Pillow_Amount = Pillow_Amount;
            this.Sheet_Color = Sheet_Color;
            this.price = price;
        }

        public Bed(double height, String Sheet_Color) {
            this.height = height;
            this.Pillow_Amount = 1;
            this.Sheet_Color = Sheet_Color;
            this.price = 100;
        }

        public double getHeight() {
            return this.height;
        }

        public int getPillow_Amount() {
            return this.Pillow_Amount;
        }

        public String getSheet_Color() {
            return this.Sheet_Color;
        }

        public double getPrice() {
            return this.price;
        }

        public void setSheet_Color(String Sheet_Color) {
            this.Sheet_Color = Sheet_Color;
        }
    }
}