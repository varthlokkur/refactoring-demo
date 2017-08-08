package com.scrumtrek.simplestore;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class CustomerTest {
    @Test
    public void shouldContainsNameWhenCreated() {
        Customer sut = new Customer("Test");
        Assert.assertEquals("Test", sut.getName());
    }

    @Test
    public void shouldStatementContainNameWhenCreated() {
        Customer sut = new Customer("Test");
        Assert.assertTrue(sut.Statement().contains("Rental record for Test"));
    }

    @Test
    public void shouldContainRentalMovieNameWhenRentalAdded() {
        Customer sut = new Customer("Test");
        Movie dummyMovie = new Movie("TestMovie", PriceCodes.Childrens);
        Rental dummyRental = new Rental(dummyMovie, 1);
        sut.addRental(dummyRental);

        String testResult = "TestMovie";
        Assert.assertTrue(sut.Statement().contains(testResult));
    }

    @Test
    public void shouldTripleTotalAmountWhenRentalNewReleaseMovie() {
        Customer sut = new Customer("Test");
        Movie dummyMovie = new Movie("TestMovie", PriceCodes.NewRelease);
        Rental dummyRental = new Rental(dummyMovie, 1);
        sut.addRental(dummyRental);

        String testResult = "3";
        Assert.assertTrue(sut.Statement().contains(testResult));
    }

    @Test
    public void shouldTotalAmountIncreaseTwoWhenRentalRegularMovieLessTwoDays() {
        Customer sut = new Customer("Test");
        Movie dummyMovie = new Movie("TestMovie", PriceCodes.Regular);
        Rental dummyRental = new Rental(dummyMovie, 1);
        sut.addRental(dummyRental);

        String testResult = "2";
        Assert.assertTrue(sut.Statement().contains(testResult));
    }

    @Test
    public void shouldTotalAmountIncreaseWhenRentalRegularMovieMoreTwoDays() {
        Customer sut = new Customer("Test");
        Movie dummyMovie = new Movie("TestMovie", PriceCodes.Regular);
        Rental dummyRental = new Rental(dummyMovie, 3);
        sut.addRental(dummyRental);

        String testResult = "3.5";
        Assert.assertTrue(sut.Statement().contains(testResult));
    }

    @Test
    public void shouldTotalAmountIncreaseWhenRentalChildrenMovieLessThreeDays() {
        Customer sut = new Customer("Test");
        Movie dummyMovie = new Movie("TestMovie", PriceCodes.Childrens);
        Rental dummyRental = new Rental(dummyMovie, 2);
        sut.addRental(dummyRental);

        String testResult = "1.5";
        Assert.assertTrue(sut.Statement().contains(testResult));
    }

    @Test
    public void shouldTotalAmountIncreaseWhenRentalChildrenMovieMoreThreeDays() {
        Customer sut = new Customer("Test");
        Movie dummyMovie = new Movie("TestMovie", PriceCodes.Childrens);
        Rental dummyRental = new Rental(dummyMovie, 4);
        sut.addRental(dummyRental);

        String testResult = "1.5";
        Assert.assertTrue(sut.Statement().contains(testResult));
    }
}
