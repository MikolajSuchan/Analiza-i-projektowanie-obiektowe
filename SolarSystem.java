import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private List<CelestialBody> bodies;

    public SolarSystem() {
        bodies = new ArrayList<>();
    }

    public void addBody(CelestialBody body) {
        bodies.add(body);
    }

    public void simulate() {
        for (CelestialBody body : bodies) {
            body.updatePosition();
            body.render();
        }
    }
}
