import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import terraficLight.Car;
import terraficLight.TerrificLight;
import terraficLight.TerrificLightState;

import static org.assertj.core.api.Assertions.assertThat;

public class TerrificLightShould {

    private Car car;
    private TerrificLight terrificLight;

    @BeforeEach
    void setUp() {
        car = new Car();
        terrificLight = new TerrificLight(car);
    }

    @Test
    void stop_car_when_light_is_red() {
        terrificLight.updateCareForLight(TerrificLightState.RED);

        assertThat(car.isDrive()).isFalse();
    }

    @Test
    void drive_car_when_light_is_not_red() {

        terrificLight.updateCareForLight(TerrificLightState.GREEN);

        assertThat(car.isDrive()).isTrue();
    }
}
