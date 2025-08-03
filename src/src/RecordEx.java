public class RecordEx {
    public record Student(String name, int grade, int classNum) {
        public Student(String name, int classNum){
            this(name, 9, classNum);
        }
        public String Information(){
            String info = "student " + this.name + " is in " + this.grade + "grade in class number " + this.classNum;
            return info;
        }
        public boolean isInHighschool(){
            if(this.grade>9) return true;
            else return false;
        }

    }
}