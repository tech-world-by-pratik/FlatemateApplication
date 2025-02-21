

package com.flatmate.service;

import com.flatmate.repository.ComplaintRepository;
import com.flatmate.repository.ResolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LeaderboardService {
    @Autowired
    private ComplaintRepository complaintRepository;

    @Autowired
    private ResolutionRepository resolutionRepository;

    public Map<String, Long> getTopComplaintCategories(String flatCode) {
            // return M;
        // Logic to fetch top complaint categories
    }

    public Map<String, Long> getMostComplaintsAgainst(String flatCode) {
        // Logic to fetch users with most complaints against them
    }
}
