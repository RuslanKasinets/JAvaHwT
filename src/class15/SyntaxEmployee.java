package class15;

public class SyntaxEmployee {
    String empID;
    int salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee e1=new SyntaxEmployee();
        SyntaxEmployee e2=new SyntaxEmployee();
        e1.salary=123123;
        e1.empID="1231";

        e2.empID="234";
        e2.salary=12432;
        System.out.println(CEO+" $"+e1.salary+" id"+e1.empID);
    }
}



