package com.zebrunner.carina.demo;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.crypto.Algorithm;
import com.zebrunner.carina.crypto.CryptoTool;
import com.zebrunner.carina.crypto.CryptoToolBuilder;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.utils.config.EncryptorConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EncryptionFeatureTest implements IAbstractTest {

    @Test
    public void TestEncrypt(){
        CryptoTool cryptoTool = CryptoToolBuilder.builder()
                .chooseAlgorithm(Algorithm.AES_ECB_PKCS5_PADDING)
                .setKey("OIujpEmIVZ0C9kOkXniFRw==")
                .build();

        String password= "HelloWorld";
        String encryptedPassword= cryptoTool.encrypt(password);
        String decryptedPassword= cryptoTool.decrypt(encryptedPassword);
        Assert.assertEquals(password,decryptedPassword);
    }

}
