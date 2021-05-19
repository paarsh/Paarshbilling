package child;
import parent.perent;

/**
 *
 * @author Legend
 */
public class child extends perent {
    child(){
        super();
        System.out.println("Child Class invoked");
    }
    public static void main(String...Legend){
        child child_object = new child();
    }
}
