import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import terraficLight.Car;
import terraficLight.Green;
import terraficLight.Red;
import terraficLight.TrafficLight;

import static org.assertj.core.api.Assertions.assertThat;

public class TerrificLightShould {

    private Car car;
    private TrafficLight terrificLight;

    @BeforeEach
    void setUp() {
        car = new Car();
        terrificLight = new TrafficLight(car);
    }

    @Test
    void stop_car_when_light_is_red() {
        terrificLight.updateCareForLight(new Red());

        assertThat(car.isDrive()).isFalse();
    }

    @Test
    void drive_car_when_light_is_not_red() {

        terrificLight.updateCareForLight(new Green());

        assertThat(car.isDrive()).isTrue();
    }
}
