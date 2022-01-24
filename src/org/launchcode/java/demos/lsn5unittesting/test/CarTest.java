package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
//    @Test
//    public void emptyTest(){
//        assertEquals(10,10,.001);
//    }
    //TODO: constructor sets gasTankLevel properly
    // the before annotation creates the test car so we dont have to do it over and over again.
    Car test_car;
    @Before
    public void createCarObject(){
        test_car = new Car("Toyota","Prius",10,50);
    }

    @Test
    public void testInitialGasTank(){

        assertEquals(10,test_car.getGasTankLevel(),.001);
    }

    @Test
    public void testGasFalse(){
        assertFalse("does the car has a gas level of 0",test_car.getGasTankLevel()==0);
    }

    @Test
    public void testGasTrue(){
        assertTrue("does the car has a gasl level of 10", test_car.getGasTankLevel()==10);
    }

    @Test
    public void testWrongLevel(){
        Car wrong_level = new Car("Toyota","Prius", 40,50);
        assertNotEquals(10,wrong_level.getGasTankLevel(),.001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range

    @Test
    public void  testGasTankAfterDriving(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void testGasTankAfterExceedingTankRange(){
        test_car.drive(500);
        assertEquals(0,test_car.getGasTankLevel(), .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
   public void testGasOverfillException(){

        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

}
