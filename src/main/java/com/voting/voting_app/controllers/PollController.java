package com.voting.voting_app.controllers;

import com.voting.voting_app.model.poll;
import com.voting.voting_app.services.PollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/polls")
public class PollController {
    private PollService pollService;

    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @PostMapping
    public poll createPoll(@RequestBody poll poll){
        return pollService.createPoll(poll);
    }

    @GetMapping
    public List<poll> getAllPolls(){
        return pollService.getALLPolls();
    }

    @GetMapping("/{id}")
    public ResponseEntity<poll> getPoll(@PathVariable Long id){
        return pollService.getPollById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
