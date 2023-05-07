public class StudentCollection{
    public ArrayList<Student> students;
    public StudentCollection(){
        this.students=new ArrayList<>();
    }
    public void addStudent(Student s){this.students.add(s);}
    //just for the example
    public void removeStudent(Student s){
        for (Student student : this.students){
            if (student.name.equals(s.name)){
                this.student.remove(student);
            }
        }
    }
    public StudentIterator getStudentIterator(){
        return new StudentIterator(this.students);
    }
}