package Assignment8;

public class Student_Studing extends Student {
    private int units ;

    @Override
    public void set(int units) {
        this.units = units;
    }

    @Override
    public boolean check(int unit) {

        if (units <= 250)
            return true;
        else
            return false;
    }

    @Override
    public void enterData() {
        System.out.println("Enter a name for Student:");
        this.setName(sc.next());
        System.out.println("Enter a lastname for Student:");
        this.setFname(sc.next());
        System.out.println("Enter a studentid for Student:");
        this.setStudentid(sc.nextLong());
        System.out.println("Enter the student's entering year :");
        this.setEntering_year(sc.nextInt());
        System.out.println("Enter units passed:");
        this.units = sc.nextInt();
        if(check(units)){
            System.out.println("Student's Informations saved to file...!");
            setIstrue(true);
        }
        else{
            System.out.println("Error\n units must be less than 250!!!!!!");
            setIstrue(false);
        }
    }

    @Override
    public String sendToFile() {
        String s ="1_" + getName() + "_" +getFname() + "_" + getStudentid() + "_" + getEntering_year()+ "_" + units;
        return s ;
    }

    @Override
    public String toString() {
        return "name :"+getName()+"\nFamili name :"+getFname()+"\nStudentID :"+getStudentid()+"\nEntering year :"+getEntering_year()+"\nUnit passed :"+units+"\n\n";
    }
}