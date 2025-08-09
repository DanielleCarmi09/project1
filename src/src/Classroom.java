public record Classroom(int classNum, int grade, Student[] students){
    public Classroom(int classNum, int grade, Student[]students){
        this.classNum=classNum;
        this.grade=grade;
        this.students=students;
    }
    public int getClassNum(){return this.classNum;}
    public int getGrade(){return this.grade;}
    public Student[] getStudents(){return this.students;}

    public static Classroom[] sortStudentsByClassroom(Student[]students){
        Classroom[]temp = new Classroom[students.length];
        int empty = 0;
        for (int i=0;i< students.length;i++){
            if(isClassroomFound(temp, students[i].getGrade(), students[i].getClassNum())==-1){
                Student[]classStudents=new Student[students.length];
                classStudents[0]=students[i];
                temp[empty]=new Classroom(students[i].getClassNum(), students[i].getGrade(), classStudents);
                empty++;
            }else{
                boolean isFound=false;
                int placeInArr=0;
                while(!isFound){
                    if(temp[placeInArr].getGrade()==students[i].getGrade()&&temp[placeInArr].getClassNum()==students[i].getClassNum()){
                        isFound=true;
                    }else placeInArr++;
                }
                temp[placeInArr].getStudents()[isEmpty(temp[placeInArr].getStudents())]=students[i];
            }
        }
        int count=0;
        while(temp[count]!=null){
            count++;
        }
        Classroom[]classrooms=new Classroom[count+1];
        for(int i=0;i<classrooms.length;i++){
            classrooms[i]=temp[i];
            int countStudents=0;
            while(classrooms[i].getStudents()[countStudents]!=null){
                countStudents++;
            }
            Student[]newStudents = new Student[countStudents+1];
            for(int j=0;j<newStudents.length;j++){
                newStudents[j]=classrooms[i].getStudents()[j];
            }
            classrooms[i] = new Classroom(newStudents[0].getClassNum(), newStudents[0].getGrade(), newStudents);
        }

        for(int i=0;i<classrooms.length;i++){
            for(int j=0;j<classrooms.length-1;j++){
                if(classrooms[j].getGrade()>classrooms[j+1].getGrade()||(classrooms[j].getGrade()==classrooms[j+1].getGrade()&&classrooms[j].getClassNum()>classrooms[j+1].getClassNum())){
                    Classroom tempClassroom = classrooms[j+1];
                    classrooms[j+1]=classrooms[j];
                    classrooms[j]=tempClassroom;
                }
            }
        }
        return classrooms;
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