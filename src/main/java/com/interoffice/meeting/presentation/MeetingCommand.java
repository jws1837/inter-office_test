package com.interoffice.meeting.presentation;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;

/**
 * temp.
 */
@Getter
public class MeetingCommand {

  private Long accountId;
  private Long roomId;
  private Integer hour;
  private LocalDate date;
  private LocalTime startTime;

}
