public record Student(String name, int grade, int classNum) {

        private static final int HIGHSCHOOL_GRADE = 9;
        public Student(String name, int classNum){
            this(name, HIGHSCHOOL_GRADE, classNum);
        }

        public int getGrade() {return this.grade;}
        public int getClassNum(){return this.classNum;}


        public String Information(){
            String info = "student " + this.name + " is in " + this.grade + "th grade in class number " + this.classNum;
            return info;
        }

        public boolean isInHighschool(){
            return this.grade > HIGHSCHOOL_GRADE;
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