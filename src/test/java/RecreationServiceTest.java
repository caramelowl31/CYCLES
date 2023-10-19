import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.java.CYCLES.services.RecreationService;

public class RecreationServiceTest {

    @Test
    public void FirstEarnings() {
        RecreationService service = new RecreationService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SecondEarnings() {
        RecreationService service = new RecreationService();

        int expected = 2;
        int actual = service.calculate(100_000,60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

}
