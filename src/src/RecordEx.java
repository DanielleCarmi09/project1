public class RecordEx {
    public record Student(String name, int grade, int classNum) {
        public String Information(){
            String info = "student " + this.name + " is in " + this.grade + "grade in class number " + this.classNum;
            return info;
        }

    }
}