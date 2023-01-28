import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import trafficLight.Car;
import trafficLight.Green;
import trafficLight.Red;
import trafficLight.TrafficLight;

import static org.assertj.core.api.Assertions.assertThat;

public class TrafficLightShould {

    private Car car;
    private TrafficLight trafficLight;

    @BeforeEach
    void setUp() {
        car = new Car();
        trafficLight = new TrafficLight(car);
    }

    @Test
    void stop_car_when_light_is_red() {
        trafficLight.updateCarForLight(new Red());

        assertThat(car.isDrive()).isFalse();
    }

    @Test
    void drive_car_when_light_is_not_red() {

        trafficLight.updateCarForLight(new Green());

        assertThat(car.isDrive()).isTrue();
    }
}
