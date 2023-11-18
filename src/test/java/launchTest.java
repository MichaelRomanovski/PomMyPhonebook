import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SplashScreen;

public class launchTest extends AppiumConfiguration {
    @Test

    public void testlaunch() {


String version=new SplashScreen(mobileDriver).currentVersion();
        Assert.assertTrue(version.contains("1.0.0"));



    }


}
