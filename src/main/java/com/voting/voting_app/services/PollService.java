package com.voting.voting_app.services;

import com.voting.voting_app.model.poll;
import com.voting.voting_app.repositories.PollRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public poll createPoll(poll poll) {
        return pollRepository.save(poll);
    }

    public List<poll> getALLPolls() {
        return pollRepository.findAll();
    }

    public Optional<poll> getPollById(Long id) {
        return pollRepository.findById(id);
    }
}
