package com.josecarlos.conferencespringdemo.repositories;

import com.josecarlos.conferencespringdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
