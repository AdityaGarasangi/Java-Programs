// Represent employess as objects
class emp {
    // Attributes
    int Empid;
    String Name;
    int age;
    String phnNum;
    double Salary;
    String Dept;

    void updateAge(int arg) {
        System.out.println("Updating " + Name + "'s age: ");
        age = arg;
    }

    void updatePhnNum(String arg) {
        System.out.println("Updating " + Name + "'s Phone Number: ");
        phnNum = arg;
    }

    void updateSalary(double arg) {
        System.out.println("Updating " + Name + "'s Salary: ");
        Salary = arg;
    }

    void details() {
        System.out.println("Name: " + Name + "\nEmployee ID: " + Empid + "\nAge: " + age + "\nPhone Number: " + phnNum
                + "\nSalary: " + Salary + "\nDepartment: " + Dept);
    }
}

public class program7 {
    public static void main(String[] args) {
        emp e1 = new emp();
        e1.Name = "John Doe";
        e1.Empid = 69;
        e1.age = 22;
        e1.phnNum = "+91 5236987415";
        e1.Salary = 45000;
        e1.Dept = "Sales";

        e1.details();

        System.out.println("\nAfter Updating........\n");

        e1.updateAge(23);
        e1.updatePhnNum("+91 8541256354");
        e1.updateSalary(55000);

        e1.details();
    }
}