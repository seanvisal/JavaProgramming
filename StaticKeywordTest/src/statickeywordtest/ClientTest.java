package statickeywordtest;


/**
 * Created by Visal Sean.
 */
public class ClientTest {

    public static void main(String[] args) {
        QuietStatic ex1 = new QuietStatic();
        //ex1.classMember++;
        QuietStatic.classMember++;
        ex1.instanceMember++;


        QuietStatic ex2 = new QuietStatic();
        ex2.classMember++;
        ex2.instanceMember++;


        System.out.println("ex1 class member: " + ex1.classMember);
        System.out.println("ex1 instance member: " + ex1.instanceMember);
        System.out.println("ex2 class member: " + ex2.classMember);
        System.out.println("ex2 instance member: " + ex2.instanceMember);
    }
}
