package bogus.karameikos.motherjava;

import org.junit.Assert;
import org.junit.Test;

public class MotherJavaTest {
    private MotherJava cut = new MotherJava();

    @Test
    public void testCodeIst9ZifferLangMitNull() {
        // given
        String eingabe = null;
        // when
        boolean result = cut.checkFormat(eingabe);
        // then
        Assert.assertFalse("Eingabe ist kein Code.", result);
    }

    @Test
    public void testCodeIst9ZifferLangMit9Ziffern() {
        // given
        String eingabe = "123456789";
        // when
        boolean result = cut.checkFormat(eingabe);
        // then
        Assert.assertTrue("Eingabe muss gut sein.", result);
    }

    @Test
    public void testCodeIst9ZifferLangUndWiederholung() {
        // given
        String eingabe = "123455789";
        // when
        boolean result = cut.checkFormat(eingabe);
        // then
        Assert.assertFalse("Eingabe hat wiederhoung.", result);
    }

    @Test
    public void testCodeIst9ZifferLangTooShort() {
        // given
        String eingabe = "123459";
        // when
        boolean result = cut.checkFormat(eingabe);
        // then
        Assert.assertFalse("Eingabe ist zu kurz.", result);
    }

    @Test
    public void testCodeIst9ZifferKleinsteMoeglicheZahl() {
        // given
        String eingabe = "012345678";
        // when
        boolean result = cut.checkFormat(eingabe);
        // then
        Assert.assertTrue("012345678 muss passen.", result);
    }

    @Test
    public void testReverseIsSquare() {
        // given
        long eingabe = 4;

        boolean result = cut.isSquare(eingabe);

        Assert.assertTrue("4 ist Quadrat", result);
    }

    @Test
    public void testReverseIsAlsoSquare() {
        // given
        long eingabe = 9;

        boolean result = cut.isSquare(eingabe);

        Assert.assertTrue("9 ist Quadrat", result);
    }

    @Test
    public void testReverseIsNotSquare() {
        // given
        long eingabe = 5;

        boolean result = cut.isSquare(eingabe);

        Assert.assertFalse("5 ist kein Quadrat", result);
    }

    @Test
    public void testReverseIsSquare0() {
        // given
        long eingabe = 0;

        boolean result = cut.isSquare(eingabe);

        Assert.assertTrue("0 ist kein Quadrat", result);
    }

    @Test
    public void testCodeIst9ZifferLangMitNichtZiffern() {
        // given
        String eingabe = "12b456f89";
        // when
        boolean result = cut.checkFormat(eingabe);
        // then
        Assert.assertFalse("Eingabe hat Buchstaben.", result);
    }


    @Test
    public void testReserver() {
        String eingabe = "abcde";

        String result = cut.reverse(eingabe);

        Assert.assertEquals("Passt nicht.", "edcba", result);
    }



}
