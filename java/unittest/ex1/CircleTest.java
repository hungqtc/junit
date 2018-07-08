package unittest.ex1;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class CircleTest {

   Circle c1 = new Circle(5,"red");
   double delta = 0.0000000000001;
  @Test

   public void testArea() { 
        
     assertEquals(5*5*Math.PI, c1.getArea(), delta) ;     
   } 

   
  @Test

  public void testgetColor() {
   		assertEquals("red", c1.getColor());
   } 

   @Test
   public  void testgetRadius() {
   		c1.setRadius(7);
   		assertEquals(5, c1.getRadius(), delta);
   }

}
