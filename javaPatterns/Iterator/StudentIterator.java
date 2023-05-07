public class StudentIterator implements Iter{
    
    public ArrayList<Student> students; 

    int i = 0;

    public StudentIterator(ArrayList<Student> students){
        this.students=students;
    }

    @Overrride
    public T next(){
        Student student = students.get(i);
        return student;
    }

    @Override
    public boolean hasNext(){
        try{
            Student std = students.get(i);
            return true;
        }
        catch(ArrayIndexOutOfBoundsException e){
            return false;
        }
        finally{
            return false;
        }
    }
}