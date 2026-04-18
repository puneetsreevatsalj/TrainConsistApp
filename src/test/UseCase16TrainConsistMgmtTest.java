import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase16TrainConsistMgmtTest {

    @Test
    void testBubbleSort() {
        int[] arr = {5, 2, 9};

        UseCase16TrainConsistMgmt.bubbleSort(arr);

        assertArrayEquals(new int[]{2,5,9}, arr);
    }
}