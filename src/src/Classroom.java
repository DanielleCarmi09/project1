public record Classroom(int classNum, int grade, Student[] students){
    public Classroom(int classNum, int grade, Student[]students){
        this.classNum=classNum;
        this.grade=grade;
        this.students=students;
    }
    public int getClassNum(){return this.classNum}
    public int getGrade(){return this.grade}

    public static Classroom[] sortStudentsByClassroom(Student[]students){
        Classroom[]temp = new Classroom[students.length];
        int empty = 0;
        for (int i=0;i< students.length;i++){
            if(isClassroomFound(temp, students[i].getGrade(), students[i].getClassNum())==-1){
                Student[]classStudents=new Student[students.length];
                temp[empty]=new Classroom(students[i].getClassNum(), students[i].getGrade(), classStudents);
            }
        }
    }

    public static int isClassroomFound(Classroom[]classrooms, int grade, int classNum){
        for(int i=0;i<classrooms.length;i++){
            if(classrooms[i].getClassNum()==classNum&&classrooms[i].getGrade()==grade) return i;
        }
        return -1;
    }
    public static int isEmpty(Student[]students){
        int count=0;
        while(students[count]!=null){
            count++;
        }
        return count;
    }
}