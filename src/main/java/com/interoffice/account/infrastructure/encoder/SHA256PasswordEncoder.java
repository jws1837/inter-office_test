package com.interoffice.account.infrastructure.encoder;

import com.interoffice.account.domain.PasswordEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class SHA256PasswordEncoder implements PasswordEncoder {

  @Override
  public String encode(String plainText) {
    MessageDigest md = null;
    try {
      md = MessageDigest.getInstance("SHA-256");
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    md.update(plainText.getBytes());

    byte[] bytes = md.digest();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < bytes.length; i++) {
      sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
    }

    return sb.toString();
  }


}
