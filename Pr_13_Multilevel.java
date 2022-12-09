import java.util.Scanner;

class Student{
    int roll;
    public void getRoll(int x){
        roll = x;
    }
    public void putRoll(){
        System.out.println("Roll No. : "+roll);
    }
}
class Test extends Student{
    int m1 , m2;
    public void getMark(int x, int y){
        m1 = x;
        m2 = y;

    }
    public void putMark(){
        System.out.println("Mark one: "+m1);
        System.out.println("Mark Two: "+m2);
    }
}
class Result extends Test{
    public void display(){
        putRoll();
        putMark();
        int total = m1+m2;
        System.out.println("Total marks: = "+ total);
    }
}

public class Pr_13_Multilevel {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter student roll no.: ");
        int rn = obj.nextInt();
        System.out.print("Enter student First mark: ");
        int m1 = obj.nextInt();
        System.out.print("Student second mark: ");
        int m2 = obj.nextInt();
        obj.close();
        Result sc = new Result();
        sc.getRoll(rn);
        sc.getMark(m1,m2);
        sc.display();
    }
}
