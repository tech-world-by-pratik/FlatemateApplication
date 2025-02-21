

package com.flatmate.service;

import com.flatmate.entity.Vote;
import com.flatmate.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public Vote voteComplaint(Vote vote) {
        return voteRepository.save(vote);
    }
}