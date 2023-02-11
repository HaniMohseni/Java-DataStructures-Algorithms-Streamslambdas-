package com.sg.streams;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlanetUtilsTest {
    private List<Planet> planets = SolarSystem.getPlanets();
    private PlanetUtils planetUtils = new PlanetUtils();


    @Test
    void getPlanetStartWithM() {
        List<Planet> actual = planetUtils.getPlanetStartWithM(planets);
        assertEquals(2,actual.size());
        assertThat(actual).extracting(Planet::getName)
                .containsExactly("Mercury", "Mars");

    }

    @Test
    void getPlanetsWithRings() {
        List<Planet> actual = planetUtils.getPlanetsWithRings(planets);
        assertEquals(actual.size(),5);
        assertThat(actual).extracting(Planet::getName)
                .containsExactly("Mars","Jupiter","Saturn","Uranus","Neptune");
    }

    @Test
    void getPlanetsWithMoreThanThreeMoons() {
        List<Planet> actual = planetUtils.getPlanetsWithMoreThanThreeMoons(planets);
        //33 and 34 are equal
        assertEquals(actual.size(),4);
        assertThat(actual).hasSize(4);
        assertThat(actual).extracting(Planet ::getName)
                .containsExactly("Jupiter","Saturn","Uranus","Neptune");
    }

    @Test
    void getPlanetsWithDensityGreaterThanFive() {
        List<Planet> actual = planetUtils.getPlanetsWithDensityGreaterThanFive(planets);
        assertThat(actual).hasSize(3);
        assertThat(actual).extracting(Planet :: getName)
                .containsExactly("Mercury","Venus","Earth");
    }
}