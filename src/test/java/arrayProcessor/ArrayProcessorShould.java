package arrayProcessor;

import arrayProccessor.BatchProcessor;
import arrayProccessor.MinimumProcessor;
import arrayProccessor.SumProcessor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayProcessorShould {

    @Test
    void accumulate_sum_arrays_element() {
        final BatchProcessor processor = new BatchProcessor(new SumProcessor(0));

        final int sum = processor.process(new int[]{1, 2, 3, 4, 5});

        assertThat(sum).isEqualTo(15);
    }

    @Test
    void accumulate_minimum_element_of_arrays() {
        final BatchProcessor processor = new BatchProcessor(new MinimumProcessor(1));

        final int min = processor.process(new int[]{1, 2, 3, 4, 5});

        assertThat(min).isEqualTo(1);
    }
}
