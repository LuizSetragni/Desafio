import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramaTest {
    @Test
    public void deveTer2ParesSubstringsComParAnagrama() {
        int result = Main.subString("ovo");
        Assertions.assertEquals(result, 2);
    }

    @Test
    public void deveTer3ParesSubstringsComParAnagrama() {
        int result = Main.subString("ifailuhkqq");
        Assertions.assertEquals(result, 3);
    }
}
