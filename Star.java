public class Star extends CelestialBody {
    public Star(String name, double mass, double[] position) {
        super(name, mass, position);
    }

    @Override
    public void updatePosition() {
        System.out.println(getName() + " is stationary.");
    }
}
