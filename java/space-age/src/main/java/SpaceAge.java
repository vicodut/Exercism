class SpaceAge {
    private double age;
    private double earth_orbital = 31557600;
    private double mercury_orbital = 0.2408467 * earth_orbital;
    private double venus_orbital = 0.61519726 * earth_orbital;
    private double mars_orbital = 1.8808158 * earth_orbital;
    private double jupiter_orbital = 11.862615 * earth_orbital;
    private double saturn_orbital = 29.447498 * earth_orbital;
    private double uranus_orbital = 84.016846 * earth_orbital;
    private double neptune_orbital = 164.79132 * earth_orbital;


    SpaceAge(double seconds) {
        this.age = seconds;
    }

    double getSeconds() {
        return age;
    }

    double onEarth() {
        return age / earth_orbital;
    }

    double onMercury() {
        return age / mercury_orbital;
    }

    double onVenus() {
        return age / venus_orbital;
    }

    double onMars() {
        return age / mars_orbital;
    }

    double onJupiter() {
        return age / jupiter_orbital;
    }

    double onSaturn() {
        return age / saturn_orbital;
    }

    double onUranus() {
        return age / uranus_orbital;
    }

    double onNeptune() {
        return age / neptune_orbital;
    }

}
