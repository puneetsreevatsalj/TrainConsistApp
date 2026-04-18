import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase17TrainConsistMgmtTest {

    @Test
    void testSorting() {
        String[] arr = {"B","A","C"};

        Arrays.sort(arr);

        assertArrayEquals(new String[]{"A","B","C"}, arr);
    }
}