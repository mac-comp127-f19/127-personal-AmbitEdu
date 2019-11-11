package activityStarterCode.sortingArrays;

import org.junit.Test;

import static activityStarterCode.sortingArrays.ArraySort.sort;
import static org.junit.Assert.assertArrayEquals;

public class ArraySortTest {

    @Test
    public void testSingleElement() {
        assertArrayEquals(
                new String[]{"7"},
                sort(new String[]{"7"})
        );
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(
                new String[]{},
                sort(new String[]{})
        );
    }

    @Test
    public void testNullArray() {
        assertArrayEquals(
                new String[]{null},
                sort(new String[]{null})
        );
    }

    @Test
    public void testAppend() {
        assertArrayEquals(
                new String[]{"1", "2", "3"},
                sort(ArraySort.append(new String[]{"1", "2"}, new String[]{"3"}))
        );
    }

    @Test
    public void testTwoElements() {
        assertArrayEquals(
                new String[]{"1", "7"},
                sort(new String[]{"7", "1"})
        );
    }

    @Test
    public void testThreeElements() {
        assertArrayEquals(
                new String[]{"1", "4", "7"},
                sort(new String[]{"4", "7", "1"})
        );
    }

    @Test
    public void testManyElements() {
        assertArrayEquals(
                new String[]{"1", "4", "7", "19", "25", "77", "108", "471"},
                sort(new String[]{"77", "4", "108", "471", "7", "19", "1", "25"})
        );
    }
}
