package com.scrumtrek.simplestore;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DemoTest {
    @Test
    public void movieShouldSaveTitleWhenNotEmpty() {
        Movie sut = new Movie("test title", PriceCodes.Regular);
        assertEquals("test title", sut.getTitle());
        assertEquals(PriceCodes.Regular, sut.getPriceCode());
    }

    @Test
    public void rentalShouldContainsMovieWhenCreated() {
        Movie testMovie = new Movie("test movie", PriceCodes.Regular);
        Rental sutRental = new Rental(testMovie, 5);

        assertEquals(testMovie, sutRental.getMovie());
    }
}
