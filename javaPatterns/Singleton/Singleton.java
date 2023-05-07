public final class Student{
    private volatile static Student student = new Student();
    private Student(){}
    public static Student getStudendInstance(){
        if (student == null){
           return new Student(); 
        }
        return null;
    }
}