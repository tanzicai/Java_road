import javax.xml.crypto.Data;
import java.util.*;
import javafx.geometry.Point2D;

public class test {
public static void main(String args[]){
    java.util.Date data = new java.util.Date();
    System.out.println("the elapsed time since 1970 is"+data.getTime());
    System.out.println("the time is" + data.toString());
    Point2D p2 = new Point2D(12,12);
    Point2D p1 = new Point2D(1,1);
    System.out.println("the distance is "+p1.distance(p2));

}
}
