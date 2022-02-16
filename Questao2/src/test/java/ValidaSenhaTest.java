import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidaSenhaTest {
    @Test
    public void stringYa3DeveSer3(){
         Assertions.assertEquals(Main.validaSenha("Ya3"), 3);
    }

    @Test
    public void stringVaziaDeveSer6() {
        Assertions.assertEquals(Main.validaSenha(""), 6);
    }

    @Test
    public void stringYa3eddDeveSer1() {
        Assertions.assertEquals(Main.validaSenha("Ya3edd"), 1);
    }

    @Test
    public void stringYa3edEDeveSer0() {
        Assertions.assertEquals(Main.validaSenha("Ya3ed&"), 0);
    }

}
