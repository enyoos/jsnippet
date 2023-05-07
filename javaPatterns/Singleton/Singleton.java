public final class Student{
    private volatile static Student student;
    private Student(){}
    public static Student getStudendInstance(){
        Student st = student;
        if (st==null){
            synchronized(Student.class){
                st = student;
                if (st == null){
                    student = st = new Student();
                }
            }
        }
       return st;
    }
}