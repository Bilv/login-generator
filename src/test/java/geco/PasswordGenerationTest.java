package geco;

import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void testGenerateRandomPassword() throws Exception {
        PasswordGeneration PGtest = new PasswordGeneration();
        String test = PGtest.generateRandomPassword();
        for(int i =0; i<test.length();i++)
            assertTrue( test.charAt(i)=='a'
                    || test.charAt(i)=='b'
                    || test.charAt(i)=='c'
                    || test.charAt(i)=='d'
                    || test.charAt(i)=='e'
                    || test.charAt(i)=='f'
                    || test.charAt(i)=='g'
                    || test.charAt(i)=='h'
                    || test.charAt(i)=='i'
                    || test.charAt(i)=='j'
                    || test.charAt(i)=='k'
                    || test.charAt(i)=='l'
                    || test.charAt(i)=='m'
                    || test.charAt(i)=='n'
                    || test.charAt(i)=='o'
                    || test.charAt(i)=='p'
                    || test.charAt(i)=='q'
                    || test.charAt(i)=='r'
                    || test.charAt(i)=='s'
                    || test.charAt(i)=='t'
                    || test.charAt(i)=='u'
                    || test.charAt(i)=='v'
                    || test.charAt(i)=='w'
                    || test.charAt(i)=='x'
                    || test.charAt(i)=='y'
                    || test.charAt(i)=='z'
                    || test.charAt(i)=='0'
                    || test.charAt(i)=='1'
                    || test.charAt(i)=='2'
                    || test.charAt(i)=='3'
                    || test.charAt(i)=='4'
                    || test.charAt(i)=='5'
                    || test.charAt(i)=='6'
                    || test.charAt(i)=='7'
                    || test.charAt(i)=='8'
                    || test.charAt(i)=='9');
    }
}