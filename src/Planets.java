public enum Planets {

    MERCURY(0, 1, 300, null),
    VENUS(1000,2,400, MERCURY),
    EARTH(2000, 3, 500, VENUS),
    MARS(3000, 4, 600, EARTH),
    JUPITER(4000,5, 700, MARS),
    SATURN(5000,6, 800, JUPITER),
    URANUS(6000,7,900, SATURN),
    NEPTUNE(7000,8,950, URANUS);


    private final int distanseToPreviousPlanet;

    private final int planetOrderNumber;

    private final int distanseFromTheSun;

    private final int radius;

    private final Planets previousPlanet;


    Planets(int distanseToPreviousPlanet, int planetOrderNumber, int radius, Planets previousPlanet) {
        this.distanseToPreviousPlanet = distanseToPreviousPlanet;
        this.planetOrderNumber = planetOrderNumber;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanseFromTheSun = previousPlanet != null ? previousPlanet.distanseFromTheSun + distanseToPreviousPlanet : distanseToPreviousPlanet;

    }

    public int getDistanseToPreviousPlanet() {
        return distanseToPreviousPlanet;
    }

    public int getPlanetOrderNumber() {
        return planetOrderNumber;
    }

    public int getRadius() {
        return radius;
    }

    public Planets getPreviousPlanet() {
        return previousPlanet;
    }

    public int getDistanseFromTheSun() {
        return distanseFromTheSun;
    }



}






//
//        Написати enum для планети сонячної системи. Клас повинен містити такі дані:
//
//        порядковий номер від сонця (для супутників застосовується номер планети)
//
//        віддаленість від попередньої планети (для меркурія 0)
//
//        віддаленість від сонця
//
//        радіус
//
//        попередня планета
//
//
//        Відстань від попередньої планети вказується явно.
//
//        Відстань від сонця обчислюється в конструкторі.
//
//        Точність даних не є важливою, допускається застосування невеликих чисел.
//

