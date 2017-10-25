package AppiumMavenK;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class AppTest {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        Result result  = junit.run(Test_ContactSearch.class); // Replace "SampleTest" with the name of your class
        if (result.getFailureCount() > 0) {
          System.out.println("Test failed.");
          System.exit(1);
        } else {
          System.out.println("Test finished successfully.");
          System.exit(0);
        }
    }
}
