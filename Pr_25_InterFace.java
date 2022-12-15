public interface Pr_25_InterFace {
    void display(); }
class R implements Pr_25_InterFace {
    public void display(){
        System.out.println("JAVA PROGRAMING"); } }
class C implements Pr_25_InterFace {
    public void display(){
        System.out.println("JAVA PRACTICE FILE");} }
class D {
    public static void main(String args[]) {
        Pr_25_InterFace a = new C();
        a.display();
        Pr_25_InterFace b = new R();
        b.display();
    }
}
