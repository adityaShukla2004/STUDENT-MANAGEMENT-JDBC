public class Student{
    private String sName ;
    private int sAge;
    private String sCourse;
    private String sAdd;


    // constructor

    public Student(String sName,int sAge,String sCourse,String sAdd){
           this.sName =sName;
           this.sAge=sAge;
           this.sCourse=sCourse;
           this.sAdd=sAdd;
    }


    // setter
    public void setName( String sName){
        this.sName = sName;
    }
    public void setAge(int sAge){
        this.sAge = sAge;
    }
    public void setCourse(String sCourse){
        this.sCourse = sCourse;
    }
    public void setAdd(String sAdd){
        this.sAdd = sAdd;
    }

    // getter

    public String getName(){
        return this.sName;
    }

    public int getAge(){
        return this.sAge;
    }

    public String getCourse(){
        return this.sCourse;
    }

    public String getAdd(){
        return this.sAdd;
    }


}