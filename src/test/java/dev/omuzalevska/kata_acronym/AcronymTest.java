package dev.omuzalevska.kata_acronym;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
 import static org.hamcrest.Matchers.is;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AcronymTest {

    @Test
    public void basic() {
        assertThat(new Acronym("Portable Network Graphics").get(), is(equalTo("PNG")));
    }

    //@Disabled("Remove to run test")
    @Test
    public void lowercaseWords() {
        //assertThat(new Acronym("Ruby on Rails").get(), is(equals("ROR")));
        Acronym acronym = new Acronym("Ruby on Rails");
        assertThat(acronym.get(), equalTo("ROR"));
    }

    //@Disabled("Remove to run test")
    @Test
    public void punctuation() {
        //assertThat(new Acronym("First In, First Out").get(), is(equals("FIFO")));
        Acronym acronym = new Acronym("First In, First Out");
        assertThat(acronym.get(), equalTo("FIFO"));          
    }

    //@Disabled("Remove to run test")
    @Test
    public void nonAcronymAllCapsWord() {
        //assertThat(new Acronym("GNU Image Manipulation Program").get(), is(equals("GIMP")));
        Acronym acronym = new Acronym("GNU Image Manipulation Program");
        assertThat(acronym.get(), equalTo("GIMP"));
    }

    //@Disabled("Remove to run test")
    @Test
    public void punctuationWithoutWhitespace() {
        //assertThat(new Acronym("Complementary metal-oxide semiconductor").get(), is(equals("CMOS")));
        Acronym acronym = new Acronym("Complementary metal-oxide semiconductor");
        assertThat(acronym.get(), equalTo("CMOS"));
    }

    //@Disabled("Remove to run test")
    @Test
    public void veryLongAbbreviation() {
        //assertThat(new Acronym("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me").get(), is(equals("ROTFLSHTMDCOALM")));
        Acronym acronym = new Acronym("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me");
        assertThat(acronym.get(), equalTo("ROTFLSHTMDCOALM"));
    }

    //@Disabled("Remove to run test")
    @Test
    public void consecutiveDelimiters() {
        //assertThat(new Acronym("Something - I made up from thin air").get(), is(equals("SIMUFTA")));
        Acronym acronym = new Acronym("Something - I made up from thin air");
        assertThat(acronym.get(), equalTo("SIMUFTA"));
    }

    //@Disabled("Remove to run test")
    @Test
    public void apostrophes() {
        //assertThat(new Acronym("Halley's Comet").get(), is(equals("HC")));
        Acronym acronym = new Acronym("Halley's Comet");
        assertThat(acronym.get(), equalTo("HC"));
    }

    //@Disabled("Remove to run test")
    @Test
    public void underscoreEmphasis() {
        //assertThat(new Acronym("The Road _Not_ Taken").get(), is(equals("TRNT")));
        Acronym acronym = new Acronym("The Road _Not_ Taken");
        assertThat(acronym.get(), equalTo("TRNT"));
    }

}