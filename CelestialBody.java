public abstract class CelestialBody implements Movable, Renderable {
    private String name;
    private double mass;
    private double[] position;

    public CelestialBody(String name, double mass, double[] position) {
        this.name = name;
        this.mass = mass;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    @Override
    public void render() {
        System.out.println(name + " is at position: " + java.util.Arrays.toString(position));
    }
}
