public class Student implements Clone<Student>{
    private String name;
    private byte age;
    private long id;
    public Student(Student student){
        this.name=student.name;
        this.age=student.age;
        this.id=student.id;
    }
    
    @Override
    public Student clone(){
        return new Student(this);
    }
}