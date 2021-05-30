package com.josecarlos.conferencespringdemo.repositories;

import com.josecarlos.conferencespringdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
