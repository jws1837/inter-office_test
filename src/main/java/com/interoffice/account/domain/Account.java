package com.interoffice.account.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;

/** temp.
 *
 */
@Getter
@NoArgsConstructor
public class Account {

  private Long id;
  //  private Company company;
  private String username;
  private String email;
  private String password;
  private LocalDateTime createdAt;
  private LocalDateTime modifiedAt;


}
