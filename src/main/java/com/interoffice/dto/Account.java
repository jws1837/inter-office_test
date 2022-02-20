package com.interoffice.dto;

/**
 * 계정정보 담겨있는 클래스.
 *
 */
public class Account {
  private String id;
  private int password;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getPassword() {
    return password;
  }

  public void setPassword(int password) {
    this.password = password;
  }


}
