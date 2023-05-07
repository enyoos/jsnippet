public final class Student{
    private volatile static Student student;
    private Student(){}
    public static Student getStudendInstance(){
        if (student==null){
            synchronized(Student.class){
                if (student == null){
                    return new Student(); 
                }
            }
        }
       return student;
    }
}