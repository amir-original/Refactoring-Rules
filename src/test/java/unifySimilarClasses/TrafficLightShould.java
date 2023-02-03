package unifySimilarClasses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrafficLightShould {

    private TrafficLight trafficLight;

    @BeforeEach
    void setUp() {
        trafficLight = new TrafficLight();
    }

    @Test
    void return_green_as_next_color_if_current_color_is_red() {
        final TrafficColor nextColor = trafficLight.nextColor(new Color(ColorState.RED));

        assertThat(nextColor.color()).isEqualTo(ColorState.GREEN);
    }

    @Test
    void return_yellow_as_next_color_if_current_color_is_green() {
        final TrafficColor nextColor = trafficLight.nextColor(new Color(ColorState.GREEN));

        assertThat(nextColor.color()).isEqualTo(ColorState.YELLOW);
    }

    @Test
    void return_red_as_next_color_if_current_color_is_yellow() {
        final TrafficColor nextColor = trafficLight.nextColor(new Color(ColorState.YELLOW));

        assertThat(nextColor.color()).isEqualTo(ColorState.RED);
    }

}
