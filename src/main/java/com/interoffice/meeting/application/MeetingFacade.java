package com.interoffice.meeting.application;

import com.interoffice.account.domain.Account;
import com.interoffice.account.domain.AccountRepository;
import com.interoffice.common.ResponseDto;
import com.interoffice.meeting.domain.Meeting;
import com.interoffice.meeting.domain.MeetingRepository;
import com.interoffice.meeting.presentation.MeetingCommand;
import com.interoffice.room.domain.Room;
import com.interoffice.room.domain.RoomRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * temp.
 */
@Service
@RequiredArgsConstructor
public class MeetingFacade {

  private final AccountRepository accountRepository;
  private final RoomRepository roomRepository;
  private final MeetingRepository meetingRepository;

  public ResponseDto reserve(MeetingCommand meetingCommand) {
    // TODO: session 기반 로그인 기능 구현 완료 시 session 정보에서 조회해오는 로직으로 대체
    Account account = accountRepository.findById(meetingCommand.getAccountId())
        .orElseThrow(IllegalArgumentException::new);

    Room room = roomRepository.findById(meetingCommand.getRoomId())
        .orElseThrow(IllegalArgumentException::new);

    Optional<Meeting> meetingOptional = meetingRepository.findByRoomAndDateAndStartTime(
        room, meetingCommand.getDate(), meetingCommand.getStartTime());

    if (meetingOptional.isEmpty()) {
      meetingRepository.save(
          new Meeting(account, room,
              meetingCommand.getHour(), meetingCommand.getDate(), meetingCommand.getStartTime()));
      return new ResponseDto(200, "예약이 완료되었습니다.");
    } else {
      return new ResponseDto(200, "이미 예약된 일정 입니다.");
    }

  }

}
