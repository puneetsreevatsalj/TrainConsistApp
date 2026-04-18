import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15TrainConsistMgmtTest {

    @Test
    void testTryCatchFinally() {

        try {
            int x = 10 / 0;
        } catch (Exception e) {
            assertTrue(true);
        } finally {
            assertTrue(true);
        }
    }
}