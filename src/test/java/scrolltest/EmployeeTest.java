package scrolltest;

import com.intuit.karate.junit5.Karate;

public class EmployeeTest {

    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
}
