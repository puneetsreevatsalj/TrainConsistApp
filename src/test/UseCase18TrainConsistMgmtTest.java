import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase18TrainConsistMgmtTest {

    @Test
    void testFound() {
        String[] arr = {"A","B","C"};
        assertTrue(UseCase18TrainConsistMgmt.linearSearch(arr,"B"));
    }

    @Test
    void testNotFound() {
        String[] arr = {"A","B","C"};
        assertFalse(UseCase18TrainConsistMgmt.linearSearch(arr,"Z"));
    }
}