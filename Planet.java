public class Planet extends CelestialBody {
    private double orbitalSpeed;

    public Planet(String name, double mass, double[] position, double orbitalSpeed) {
        super(name, mass, position);
        this.orbitalSpeed = orbitalSpeed;
    }

    public double getOrbitalSpeed() {
        return orbitalSpeed;
    }

    @Override
    public void updatePosition() {
        double[] position = getPosition();
        position[0] += orbitalSpeed;
        setPosition(position);
    }
}
