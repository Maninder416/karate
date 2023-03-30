package scrolltest;

import com.intuit.karate.junit5.Karate;

public class PersonTest {

    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
}
