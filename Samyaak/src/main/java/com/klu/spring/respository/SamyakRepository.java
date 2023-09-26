package com.klu.spring.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klu.spring.entity.Samyak;

@Repository
public interface SamyakRepository extends JpaRepository<Samyak, Long> {

	@Query("select count(S) from Samyak S")
	public Long countParticipants();
}
