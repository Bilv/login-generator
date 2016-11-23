package geco;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Test de réponse à l'exigence 1
 * @return
 */

public class LoginServiceTest {

    @Test
    public void testLoginExists() throws Exception {
        String[] testALS = {};
        LoginService testLS = new LoginService(testALS);
        assertFalse(testLS.loginExists("Rafael"));
        String[] newTestALS = {"Rafael"};
        LoginService newTestLS = new LoginService(newTestALS);
        assertTrue(newTestLS.loginExists("Rafael"));
    }

    @Test
    public void testAddLogin() throws Exception {
        String[] testALS = {};
        LoginService testLS = new LoginService(testALS);
        assertFalse(testLS.loginExists("Rafael"));
        testLS.addLogin("Rafael");
        assertTrue(testLS.loginExists("Rafael"));
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {

        ArrayList<String> testLoginsPrefixes = new ArrayList<String>();
        String[] testALS = {};
        LoginService testLS = new LoginService(testALS);

        assertEquals(testLoginsPrefixes,testLS.findAllLoginsStartingWith(""));

        testLoginsPrefixes.add("Victor");
        testLoginsPrefixes.add("Valentin");
        testLoginsPrefixes.add("Victoria");


        testLS.addLogin("Victor");
        assertNotEquals(testLoginsPrefixes,testLS.findAllLoginsStartingWith("V"));

        testLS.addLogin("Valentin");
        testLS.addLogin("Victoria");
        assertEquals(testLoginsPrefixes,testLS.findAllLoginsStartingWith("V"));

        testLS.addLogin("Rafael");
        assertEquals(testLoginsPrefixes,testLS.findAllLoginsStartingWith("V"));

    }

    @Test
    public void testFindAllLogins() throws Exception {
        ArrayList<String> testLoginsPrefixes = new ArrayList<String>();
        String[] testALS = {};
        LoginService testLS = new LoginService(testALS);

        assertEquals(testLoginsPrefixes,testLS.findAllLogins());

        testLoginsPrefixes.add("Victor");
        testLoginsPrefixes.add("Valentin");
        testLoginsPrefixes.add("Victoria");
        testLoginsPrefixes.add("Rafael");

        testLS.addLogin("Victor");
        testLS.addLogin("Valentin");
        testLS.addLogin("Victoria");
        assertNotEquals(testLoginsPrefixes,testLS.findAllLogins());
        testLS.addLogin("Rafael");
        assertEquals(testLoginsPrefixes,testLS.findAllLogins());

    }
}

