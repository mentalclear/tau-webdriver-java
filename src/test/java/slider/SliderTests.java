package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider() {
        // Dmitrii's solution, again - too much of hardcoded stuff.
//        var sliderPage = homePage.clickHorizontalSlider();
//        sliderPage.setSliderToValue("4");
//        assertEquals(sliderPage.getResultValue(), "4", "Expected value wasn't 4!");

        // Angie's solution
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderToValue(value);
        assertEquals(sliderPage.getResultValue(), value, "Expected value wasn't 4!");
    }
}
