public class Main {
    public static void main(String[] args) {

        Star sun = new Star("Sun", 1.989E30, new double[] { 0, 0 });
        Planet earth = new Planet("Earth", 5.972E24, new double[] { 1.496E11, 0 }, 29.78E3);
        Planet mars = new Planet("Mars", 6.417E23, new double[] { 2.279E11, 0 }, 24.077E3);

        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addBody(sun);
        solarSystem.addBody(earth);
        solarSystem.addBody(mars);

        for (int i = 0; i < 5; i++) {
            System.out.println("Step: " + (i + 1));
            solarSystem.simulate();
            System.out.println();

            if (i == 2) {
                earth.setPosition(new double[] { earth.getPosition()[0], earth.getPosition()[1] + 1000000 });
                System.out.println("Increased Earth's velocity.");
            }

            if (i == 3) {
                Planet jupiter = new Planet("Jupiter", 1.898E27, new double[] { 7.785E11, 0 }, 13.07E3);
                solarSystem.addBody(jupiter);
                System.out.println("Added Jupiter to the solar system.");
            }
        }
    }
}
