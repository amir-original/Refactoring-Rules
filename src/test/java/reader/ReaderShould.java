package reader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReaderShould {

    private String[] data;

    @BeforeEach
    void setUp() {
        data = new String[]{"Hello","Hi","Salam"};
    }

    @Test
    void read_data_line_by_line() {

        final Reader br = new Reader(data);
        String line;
        StringBuilder result = new StringBuilder();
        while ((line=br.readLine())!=null){
           result.append(line).append(" ");
        }

        assertResult(result);
    }

    @Test
    void separate_side_effect_from_condition_by_catcher() {
        final Reader tmpBr = new Reader(data);
        final Cacher<String> br = new Cacher<>(tmpBr::readLine);

        StringBuilder result = new StringBuilder();
        for (;br.get()!=null;br.next())
            result.append(br.get()).append(" ");


        assertResult(result);
    }

    private void assertResult(StringBuilder result) {
        final String finalRes = result.toString().trim();
        assertThat(finalRes).isEqualTo("Hello Hi Salam");
    }
}
