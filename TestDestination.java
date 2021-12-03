
import cpit251.Destination;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wed
 */
public class TestDestination {
    //Test resturants,amusement parks,music festivals & musuems information display
  @Test
  public void Testinfo(){
      Destination destination=new Destination();
      String Info="----------------------"
                + "\n          Destination      "
                + "   \n----------------------"
                + "\n- Name: " + destination.getName()
                + "\n- Section: " + destination.getSectionType()
                + "\n- Rating: " + destination.getRate()
                + "\n- Location: " + destination.getLocation()
                + "\n- Menu: " + destination.getMenu()
                + "\n- Phone Number: " + destination.getPhoneNum();
            String expResult=Info;
            String result=destination.Info();
            assertEquals(expResult,result);
  }
  //Test Land marks information display
@Test
         public void TestLandmarksInfo() {
       Destination destination=new Destination();
      String landMarks= "----------------------"
                + "\n          Destination      "
                + "\n----------------------"
                + "\n- Name: " + destination.getName()
                + "\n- Section: " + destination.getSectionType()
                + "\n- Location: " + destination.getLocation();
           String expResult=landMarks;
            String result=destination.LandmarksInfo();
            assertEquals(expResult,result);
  }
    
}
