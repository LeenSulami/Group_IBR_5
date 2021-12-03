


import cpit251.City;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wed
 */
public class TestCity {
    @Test
         public void TestCity() {
        City city=new City();
      String cityInfo= "----------------------"
                + "\n          City      "
                + "\n----------------------"
                + "\n- City Name: " + city.getCityname()
                + "\n- Section: " + city.getSection()
                + "\n- Weather: " + city.getWeather();
           String expResult=cityInfo;
            String result=city.City();
            assertEquals(expResult,result);
  }
    
}
