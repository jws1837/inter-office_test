package com.interoffice.account.infrastructure.encoder;

import com.interoffice.account.domain.PasswordEncoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class bCryptPasswordEncoder implements PasswordEncoder {

  @Override
  public String encode(String plainText) {
  return "";
  }


}
