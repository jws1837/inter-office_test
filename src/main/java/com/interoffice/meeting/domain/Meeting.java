package com.interoffice.meeting.domain;

import com.interoffice.account.domain.Account;
import com.interoffice.room.domain.Room;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * temp.
 */
@Getter
@NoArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Meeting {

  private Integer id;

  private Account account;

  private Room room;

  private Integer hour;

  private LocalDate date;

  private LocalTime startTime;

  private LocalTime endTime;

  private LocalDateTime createdAt;

  private LocalDateTime modifiedAt;

  // private Double credit;

  @Builder
  public Meeting(Account account, Room room, Integer hour, LocalDate date, LocalTime startTime) {
    this.id = UUID.randomUUID().hashCode();
    this.account = account;
    this.room = room;
    this.hour = hour;
    this.date = date;
    this.startTime = startTime;
    this.endTime = startTime.plusHours(hour);
    this.createdAt = LocalDateTime.now(ZoneId.ofOffset("UTC", ZoneOffset.UTC)).plusHours(9);
    this.modifiedAt = LocalDateTime.now(ZoneId.ofOffset("UTC", ZoneOffset.UTC)).plusHours(9);
  }

}
