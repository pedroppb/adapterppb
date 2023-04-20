package adapterppb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class dataTest {
    @Test
    void deveRetornarDataBR() {
        Evento data = new Evento();
        data.setdataBR("25/12/2023");

        assertEquals("25/12/2023", data.getDatabr());
    }

    @Test
    void deveRetornarDataUS(){
        Evento data = new Evento();
        data.setdataBR("25/12/2023");

        assertEquals("12/25/2023", data.getDataUS());
    }
}
