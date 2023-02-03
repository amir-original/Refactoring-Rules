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
        final TrafficColor nextColor = trafficLight.nextColor(new Red());

        assertTrue(nextColor instanceof Green);
    }

    @Test
    void return_yellow_as_next_color_if_current_color_is_green() {
        final TrafficColor nextColor = trafficLight.nextColor(new Green());

        assertTrue(nextColor instanceof Yellow);
    }

    @Test
    void return_red_as_next_color_if_current_color_is_yellow() {
        final TrafficColor nextColor = trafficLight.nextColor(new Yellow());

        assertTrue(nextColor instanceof Red);
    }

    private void assertTrue(boolean isTrue) {
        assertThat(isTrue).isTrue();
    }
}