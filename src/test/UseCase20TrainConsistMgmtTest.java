import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase20TrainConsistMgmtTest {

    @Test
    void testValidSearch() {
        String[] arr = {"A","B"};
        assertTrue(UseCase20TrainConsistMgmt.search(arr,"A"));
    }

    @Test
    void testException() {
        assertThrows(IllegalStateException.class, () -> {
            UseCase20TrainConsistMgmt.search(new String[]{}, "A");
        });
    }
}