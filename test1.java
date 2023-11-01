public class test1 {
    public getpassedstudents getpassedrollno(getpassedstudents x){
        if(x.getrollno()<8) {

            return null;
        }
        else {
            return null;
        }
    }
    public static void main (String arg[]){
        getpassedstudents s1=new getpassedstudents("bindu",69,07);
        getpassedstudents s2=new getpassedstudents("spandana", 49, 9);
        test1 a=new test1();
        getpassedstudents s3=a.getpassedrollno(s1);
        if(s3!=null){
            System.out.println(s3.getrollno());
        }
        getpassedstudents s4=a.getpassedrollno(s2);
        if(s4!=null) {
            System.out.println(s4.getrollno());
        }

    }
}
