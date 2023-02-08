package arrayProcessor;

import arrayProccessor.ArrayMinimum;
import arrayProccessor.ArraySum;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayProcessorShould {

    @Test
    void accumulate_sum_arrays_element() {
        final ArraySum processor = new ArraySum(0);

        final int sum = processor.process(new int[]{1, 2, 3, 4, 5});

        assertThat(sum).isEqualTo(15);
    }

    @Test
    void accumulate_minimum_element_of_arrays() {
        final ArrayMinimum processor = new ArrayMinimum(1);

        final int min = processor.process(new int[]{1, 2, 3, 4, 5});

        assertThat(min).isEqualTo(1);
    }
}
