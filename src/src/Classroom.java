public record Classroom(int classNum, int grade, Student[] students){
    public Classroom(int classNum, int grade, Student[]students){
        this.classNum=classNum;
        this.grade=grade;
        this.students=students;
    }

    public static Classroom[] sortStudentsByClassroom(Student[]students){
        Classroom[]temp = sortIntoClassrooms(students);
        Classroom[]classrooms = cmpressArr(temp);
        classrooms = sortByGradeAndClassNum(classrooms);


        return classrooms;
    }

    public static int isClassroomFound(Classroom[]classrooms, int grade, int classNum){
        for(int i=0;i<classrooms.length;i++){
            if(classrooms[i].classNum()==classNum&&classrooms[i].grade()==grade) return i;
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
    public static Classroom[] sortIntoClassrooms(Student[]students){
        Classroom[]temp = new Classroom[students.length];
        int empty = 0;
        for (int i=0;i< students.length;i++){
            if(isClassroomFound(temp, students[i].grade(), students[i].classNum())==-1){
                Student[]classStudents=new Student[students.length];
                classStudents[0]=students[i];
                temp[empty]=new Classroom(students[i].classNum(), students[i].grade(), classStudents);
                empty++;
            }else{
                boolean isFound=false;
                int placeInArr=0;
                while(!isFound){
                    if(temp[placeInArr].grade()==students[i].grade()&&temp[placeInArr].classNum()==students[i].classNum()){
                        isFound=true;
                    }else placeInArr++;
                }
                temp[placeInArr].students()[isEmpty(temp[placeInArr].students())]=students[i];
            }
        }
        return temp;
    }

    public static Classroom[] sortByGradeAndClassNum(Classroom[]classrooms){
        for(int i=0;i<classrooms.length;i++){
            for(int j=0;j<classrooms.length-1;j++){
                if(classrooms[j].grade()>classrooms[j+1].grade()||(classrooms[j].grade()==classrooms[j+1].grade()&&classrooms[j].classNum()>classrooms[j+1].classNum())){
                    Classroom tempClassroom = classrooms[j+1];
                    classrooms[j+1]=classrooms[j];
                    classrooms[j]=tempClassroom;
                }
            }
        }
        return classrooms;
    }
    public static Classroom[] cmpressArr(Classroom[]temp){
        int count=0;
        while(temp[count]!=null){
            count++;
        }
        Classroom[]classrooms=new Classroom[count+1];
        for(int i=0;i<classrooms.length;i++){
            classrooms[i]=temp[i];
            int countStudents=0;
            while(classrooms[i].students()[countStudents]!=null){
                countStudents++;
            }
            Student[]newStudents = new Student[countStudents+1];
            for(int j=0;j<newStudents.length;j++){
                newStudents[j]=classrooms[i].students()[j];
            }
            classrooms[i] = new Classroom(newStudents[0].classNum(), newStudents[0].grade(), newStudents);
        }
        return classrooms;
    }
}