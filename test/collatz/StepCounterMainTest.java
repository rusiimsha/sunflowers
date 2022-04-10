package collatz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepCounterMainTest {

    @Test
    void run() {
        assertEquals(3, new StepCounter_Main()
                .getNumberWithMostSteps(Arrays.asList(1, 2, 3)));

        assertEquals(910107, new StepCounter_Main()
                .getNumberWithMostSteps(allNumbersUpToAMillion()));

        //assertEquals(837799, new StepCounter_Main(allNumbersUpToAMillion()).assess());
        //https://www.google.com/search?q=910107+collatz
    }

    private List<Integer> allNumbersUpToAMillion() {
        return Arrays.stream(IntStream.range(1, 1000000).toArray()).boxed().collect(Collectors.toList());
    }


}
