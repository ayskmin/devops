import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int result = a + b;
        Assertions.assertEquals(5, result, "La somme de a et b doit être égale à 5");
    }
}
