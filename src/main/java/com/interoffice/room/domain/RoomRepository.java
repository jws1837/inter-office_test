package com.interoffice.room.domain;

import java.util.Optional;

public interface RoomRepository {

  Optional<Room> findById(Long id);

}
