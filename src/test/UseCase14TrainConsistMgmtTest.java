import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14TrainConsistMgmtTest {

    @Test
    void testExceptionThrown() {
        assertThrows(RuntimeException.class, () -> {
            new UseCase14TrainConsistMgmt.Bogie(0);
        });
    }
}