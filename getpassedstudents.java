public class getpassedstudents {
    private String name;
    private int marks;
    private int rollno;
    public getpassedstudents(String name,int marks,int rollno){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public int getrollno(){
        return this.rollno;
    }

}
