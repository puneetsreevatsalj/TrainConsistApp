import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase12TrainConsistMgmtTest {

    @Test
    void testValidBogie() {
        UseCase12TrainConsistMgmt.Bogie b =
                new UseCase12TrainConsistMgmt.Bogie("Sleeper", 72);

        assertEquals(72, b.capacity);
    }

    @Test
    void testInvalidCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            new UseCase12TrainConsistMgmt.Bogie("AC", 0);
        });
    }
}