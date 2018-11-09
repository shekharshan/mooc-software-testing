package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy happy;

    @BeforeEach
    public void initialize() {
       happy = new GHappy();
    }
    @Test
    public void testEmptyString() {
        Assertions.assertFalse(happy.gHappy("g"));
    }
}
