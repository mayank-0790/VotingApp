package com.voting.voting_app.controllers;

import com.voting.voting_app.model.poll;
import com.voting.voting_app.services.PollService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
