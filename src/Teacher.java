public class Teacher extends Person{
    private String subject;
    private String school;
    private boolean busDuty;
    private int numClasses;

    public Teacher(String name, String subject, String school) {
        super(name);
        this.subject = subject;
        this.school = school;
    }

    public void getNumClasses() {
        System.out.println(getName()+" has "+ numClasses+" classes this week");
    }

    public void setNumClasses(int numClasses) {
        this.numClasses = numClasses;
    }

    public void describeRole(){
        System.out.println("Name: "+getName()+ " teaches: "+ subject);
    }
    public void assignBusDuty(String onBusDuty){
        if (onBusDuty.toLowerCase()=="yes") {
            busDuty = true;
        }
        else if (onBusDuty.toLowerCase()=="no"){
            busDuty = false;
        }
        else {
            System.out.println("enter yes or no please");
        }
    }
    public void onBusDuty(){
        if (busDuty==true){
            System.out.println("Teacher " + getName()+ " is on bus duty");
        }
        else {
            System.out.println("Teacher " + getName()+ " is not on bus duty");
        }
    }

}
