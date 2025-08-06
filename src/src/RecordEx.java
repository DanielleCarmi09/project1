public class RecordEx {

    public record Student(String name, int grade, int classNum) {
        public Student(String name, int classNum){
            this(name, 9, classNum);
        }
        public String Information(){
            String info = "student " + this.name + " is in " + this.grade + "th grade in class number " + this.classNum;
            return info;
        }
        public boolean isInHighschool(){
            if(this.grade>9) return true;
            else return false;
        }
    }
    public record Classroom(int classNum, int grade, Student[] students){

    }
    public static void ThisStudent(String name, int grade, int classNum){
        Student s = new Student(name, grade, classNum);
        System.out.println(s.Information());
        System.out.println(s.isInHighschool());
    }

    public static void main(String[] args){
        ThisStudent("Danielle", 11, 11);
    }
}