package com.hillel.somov.lessons.lesson16;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class SquareArrayTest {

    @Test
    public void newSquareArray() {
        int[][] anArray = {{1,1},{2,2}};
        SquareArray squareArray1 = new SquareArray(anArray);
        long asserCountAllElements = (long) squareArray1.getRow() * squareArray1.getColumn();
        Assert.assertEquals(asserCountAllElements, squareArray1.getSumLengthAllRow());
    }

}