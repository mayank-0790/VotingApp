package com.voting.voting_app.repositories;

import com.voting.voting_app.model.poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends JpaRepository<poll, Long> {
}
