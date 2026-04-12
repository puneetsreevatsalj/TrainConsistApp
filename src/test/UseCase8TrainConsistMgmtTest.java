package test;

import main.*;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    private List<Bogie> getBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 80));
        list.add(new Bogie("Second Sitting", 70));
        return list;
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogies(getBogies(), 70);

        assertTrue(result.stream().allMatch(b -> b.capacity > 70));
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogies(getBogies(), 70);

        assertFalse(result.stream().anyMatch(b -> b.capacity == 70));
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogies(getBogies(), 100);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogies(getBogies(), 50);

        assertEquals(4, result.size());
    }

    @Test
    void testFilter_EmptyList() {
        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogies(new ArrayList<>(), 50);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> original = getBogies();
        List<Bogie> copy = new ArrayList<>(original);

        UseCase8TrainConsistMgmt.filterBogies(original, 60);

        assertEquals(copy.size(), original.size());
    }
}