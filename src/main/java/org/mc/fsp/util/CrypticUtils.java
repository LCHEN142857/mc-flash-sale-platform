/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-05-08
 */
package org.mc.fsp.util;


import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-05-08
 */
public final class CrypticUtils {
    private CrypticUtils() {
    }

    public static final String RSA_ALGORITHM = "RSA";

    /**
     * 解密数据源用户名和密码
     *
     * @param encryptedData 数据源的用户名或密码
     * @param privateKeyFile 私钥文件
     * @return 解密数据
     * @throws IOException IOException
     * @throws NoSuchAlgorithmException NoSuchAlgorithmException
     * @throws InvalidKeySpecException InvalidKeySpecException
     * @throws NoSuchPaddingException NoSuchPaddingException
     * @throws InvalidKeyException InvalidKeyException
     * @throws IllegalBlockSizeException IllegalBlockSizeException
     * @throws BadPaddingException BadPaddingException
     */
    public static String decryptDatasourceSensitiveInfo(String encryptedData, String privateKeyFile) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        FileInputStream privateFis = new FileInputStream(privateKeyFile);
        byte[] privateKeyBytes = new byte[privateFis.available()];
        privateFis.read(privateKeyBytes);
        privateFis.close();
        PrivateKey privateKey = KeyFactory.getInstance(RSA_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(privateKeyBytes));

        // 使用私钥进行解密
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedData = cipher.doFinal(Base64.getDecoder().decode(encryptedData.getBytes()));
        return new String(decryptedData);
    }

}
