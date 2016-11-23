package geco;

import org.junit.Before;
import org.junit.Test;
import geco.LoginGenerator;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService loginService;
    private LoginGenerator loginGenerator;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);

    }

    @Test
    public void testPaulDurand() throws Exception {
        String test = loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals(test, "PDUR");
    }

    @Test
    public void testJohnRalling() throws Exception {
        String test = loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertEquals(test, "JRAL2");
    }

    @Test
    public void testJeanRolling() throws Exception {
        String test = loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertEquals(test, "JROL1");
    }

    @Test
    public void testPaulDurandAvecAccent() throws Exception {
        String test = loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertEquals(test, "PDUR");
    }
}