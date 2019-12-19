package always.datastructure.rsa;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: Anograss
 * @description:
 * @author: Ano
 * @create: 2019-10-30 10:48
 **/
public class RSAEncrypt {
    private final static Map<Integer, String> keyMap = new HashMap<Integer, String>();

    public static void main(String[] args) throws Exception {
        String message = "18505601540";
        genKeyPair();
        System.out.println("随机生成的公钥为：" + keyMap.get(0));
        System.out.println("随机生成的私钥为："+keyMap.get(1));
        String messageEn=encrypt(message,keyMap.get(0));
        System.out.println(message+"\t加密后的字符创为："+messageEn);
        String messageDe=decrypt(messageEn,keyMap.get(1));
        System.out.println("还原后的字符串为："+messageDe);
    }

    public static void genKeyPair() throws NoSuchAlgorithmException {
        //用于生成公钥和私钥对，基于RSA算法生成对象
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        //初始化密钥对生成器，秘钥大小为96-1024位
        keyPairGenerator.initialize(2048, new SecureRandom());
        //生成一个密钥对，保存在keyPair中
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        //得到私钥
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        //得到公钥
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        //将公钥与私钥转为公钥字符串与私钥字符串
        String privateKeyString = new String(Base64.encodeBase64(privateKey.getEncoded()));
        String publiczkeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
        keyMap.put(0, publiczkeyString);
        keyMap.put(1, privateKeyString);
    }

    /*公钥加密
     * str           加密字符串
     * publicKey     公钥
     * */
    public static String encrypt(String str, String publicKey) throws Exception {
        //base64编码的公钥
        byte[] decoded = Base64.decodeBase64(publicKey);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
        //RSA加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
        return outStr;
    }
    //When I wrote this,only God and I understood what I was doing
    //Now,God only knows
    public static String decrypt(String str, String privateKey) throws Exception {
        byte[] inputByte = Base64.decodeBase64(str.getBytes("UTF-8"));
        byte[] decoded = Base64.decodeBase64(privateKey);
        RSAPrivateKey privateKey1 = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey1);
        String outStr = new String(cipher.doFinal(inputByte));
        return outStr;
    }

}
