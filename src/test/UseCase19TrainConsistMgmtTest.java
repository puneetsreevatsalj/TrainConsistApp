import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase19TrainConsistMgmtTest {

    @Test
    void testBinarySearchFound() {
        String[] arr = {"A","B","C"};
        assertTrue(UseCase19TrainConsistMgmt.binarySearch(arr,"B"));
    }

    @Test
    void testBinarySearchNotFound() {
        String[] arr = {"A","B","C"};
        assertFalse(UseCase19TrainConsistMgmt.binarySearch(arr,"Z"));
    }
}