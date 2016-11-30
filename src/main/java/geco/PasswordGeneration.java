package geco;

import java.util.UUID;

/**
 * Created by 21305878 on 30/11/2016.
 */
public class PasswordGeneration {

    public String generateRandomPassword(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
