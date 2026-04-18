import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmtTest {

    @Test
    void testFilterLogic() {

        List<UseCase13TrainConsistMgmt.Bogie> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new UseCase13TrainConsistMgmt.Bogie(i));
        }

        long count = list.stream().filter(b -> b.capacity > 50).count();

        assertEquals(49, count);
    }
}