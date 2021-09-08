package com.example.salareunioes.repository;

import com.example.salareunioes.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {

}
