package com.interoffice.meeting.domain;

import com.interoffice.room.domain.Room;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

/**
 * temp.
 */
public interface MeetingRepository {

  void save(Meeting meeting);

  Optional<Meeting> findByRoomAndDate(Room room, LocalDate date);

}
