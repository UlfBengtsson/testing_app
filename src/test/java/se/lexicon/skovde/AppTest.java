package se.lexicon.skovde;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void additionSimplePlus()
    {
        //Arrange
        double number1 = 1;
        double number2 = 1;
        double expected = 2;

        //Act
        double result = App.addition(number1, number2);

        //Assert
        assertEquals( expected ,result  , 0 );
    }

    @Test
    public void additionSimplePlusDecimal()
    {
        //Arrange
        double number1 = 1.6;
        double number2 = 3.7;
        double expected = 5.3;

        //Act
        double result = App.addition(number1, number2);

        //Assert
        assertEquals( expected , result , 0.01 );
    }

    @Test
    public void additionPlusDecimalFourInputs()
    {
        //Arrange
        double number1 = 1.6;
        double number2 = 3.7;
        double number3 = 1.6;
        double number4 = 3.7;
        double expected = 10.6;

        //Act
        double result = App.addition(number1, number2, number3, number4);

        //Assert
        assertEquals( expected , result , 0.01 );
    }

    @Test
    public void additionPlusDecimalArrayInput()
    {
        //Arrange
        double[] numbers = {12.1 , 1.12, 3.3};
        double expected = 16.52;

        //Act
        double result = App.addition(numbers);

        //Assert
        assertEquals( expected , result , 0.001 );
    }

    @Test
    public void additionPlusDecimalZeroArrayInput()
    {
        //Arrange
        double[] numbers = {};
        double expected = 0;

        //Act
        double result = App.addition(numbers);

        //Assert
        assertEquals( expected , result , 0 );
    }

    @Test
    public void additionPlusDecimalNullArrayInput()
    {
        //Arrange
        double[] numbers = null;
        double expected = 0;

        //Act
        double result = App.addition(numbers);

        //Assert
        assertEquals( expected , result , 0 );
    }

    //------------------------------------------- String ---------------------------------------------

    @Test
    public void createFullNameOk()
    {
        //Arrange
        String firstName = "Ulf";
        String lastName = "Bengtsson";

        //Act
        String result = App.createFullName(firstName , lastName);

        //Assert
        assertTrue(result.contains(firstName));
        assertTrue(result.contains(lastName));
    }

    @Test
    public void welcomeUser()
    {
        //Arrange
        String firstName = "Ulf";
        String lastName = "Bengtsson";

        //Act
        String result = App.welcomeUser(firstName , lastName);

        //Assert
        assertTrue(result.contains(firstName));
        assertTrue(result.contains(lastName));
    }
}
