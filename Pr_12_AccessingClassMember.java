public class Pr_12_AccessingClassMember {
        String name;
        int age;
        float bsal, gsal;

        public void acceptDetails(String n, int a, int s)
        {
            name = n;
            age = a;
            bsal = s;
        }
        public void showData()
        {
            System.out.println("Employee Name = " + name);
            System.out.println("Employee Age = " + age);
            System.out.println("Employee Basic Salary = " + bsal);
            System.out.println("Employee Gross Salary = " + gsal);
        }
        void cal()            // public by default
        {
            gsal = bsal - (bsal*5/100);
        }

        public static void main(String args [])
        {
            Pr_12_AccessingClassMember e1 = new Pr_12_AccessingClassMember();      // object e1 created
            e1.acceptDetails("Nancy", 28, 12000);
            e1.cal();
            e1.showData();
        }
}
