package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModelsTest {
    @Test
    public void testPersonAge() {
        Person person = new Person();
        person.setAge(14);
        assertEquals(person.getAge(), 14);
    }

    @Test
    void testPedestrianCrossing() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setCrossedTheCrosswalk(true);

        boolean result = footpassenger.crossedTheCrosswalk();

        assertTrue(result, "Footpassenger should have crossed the crosswalk.");
    }

    @Test
    public void testStreetFlowDirection() {
        Traffic traffic = new Traffic();
        StreetDirectionFlow expected = StreetDirectionFlow.ONE_WAY;
        traffic.setStreetDirectionFlow(expected);
        assertEquals(expected, traffic.getStreetDirectionFlow());
        traffic.setStreetDirectionFlow(StreetDirectionFlow.TWO_WAY);
        assertEquals(StreetDirectionFlow.TWO_WAY, traffic.getStreetDirectionFlow());
    }

    @Test
    public void testHeavyCarTraffic() {
        Traffic traffic = new Traffic();
        traffic.setIntenseCarTraffic(true);
        assertTrue(traffic.intenseCarTraffic());
    }


    @Test
    public void testTrafficLightState() {
        Traffic traffic = new Traffic();
        TrafficLigth expected = TrafficLigth.YELLOW;
        traffic.setCurrentTrafficLight(expected);
        assertEquals(expected, traffic.getCurrentTrafficLight());
        expected = TrafficLigth.GREEN;
        traffic.setCurrentTrafficLight(expected);
        assertEquals(expected, traffic.getCurrentTrafficLight());
        expected = TrafficLigth.RED;
        traffic.setCurrentTrafficLight(expected);
        assertEquals(expected, traffic.getCurrentTrafficLight());
    }


    @Test
    public void testMinimumSpeedLimit() {
        Traffic traffic = new Traffic();
        short expected = 60;
        traffic.setMinSpeedAllowed(expected);
        assertEquals(expected, traffic.getMinSpeedAllowed());
    }


    @Test
    public void testMaximumSpeedLimit() {
        Traffic traffic = new Traffic();
        short expected = 120;
        traffic.setMaxSpeedAllowed(expected);
        assertEquals(expected, traffic.getMaxSpeedAllowed());
    }


    @Test
    public void testStreetDirection() {
        Traffic traffic = new Traffic();

        StreetDirectionFlow expected = StreetDirectionFlow.ONE_WAY;
        traffic.setStreetDirectionFlow(expected);
        assertEquals(expected, traffic.getStreetDirectionFlow());
        traffic.setStreetDirectionFlow(StreetDirectionFlow.TWO_WAY);
        assertEquals(StreetDirectionFlow.TWO_WAY, traffic.getStreetDirectionFlow());
    }

}