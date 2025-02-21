
package com.flatmate.service;

import com.flatmate.entity.Complaint;
import com.flatmate.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository complaintRepository;

    public Complaint createComplaint(Complaint complaint, String flatCode, String username) {
        complaint.setTimestamp(LocalDateTime.now());
        complaint.setFlatCode(flatCode);
        complaint.setCreatedBy(username);
        return complaintRepository.save(complaint);
    }

    public List<Complaint> getComplaintsByFlatCode(String flatCode) {
        return complaintRepository.findByFlatCode(flatCode);
    }
}