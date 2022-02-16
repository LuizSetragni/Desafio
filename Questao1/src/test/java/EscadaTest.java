import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EscadaTest {
    @Test
    public void escadaComTamanho6() {
        var esperado =  "     *\n" +
                        "    **\n" +
                        "   ***\n" +
                        "  ****\n" +
                        " *****\n" +
                        "******";
        var resultado = Main.escada(6);
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void escadaTamanho0() {
        var esperado =  "";
        var resultado = Main.escada(0);
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void escadaTamanhoNegativo() {
        var esperado =  "";
        var resultado = Main.escada(-2);
        Assert.assertEquals(esperado, resultado);
    }
}
