package com.example.SenpiperAssignment.AssignService;

import com.example.SenpiperAssignment.Model.Assignment;
import com.example.SenpiperAssignment.Repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignService {

    @Autowired
    private AssignmentRepository assignmentRepository;


    public List<Assignment> getAllAssignments() {
        List<Assignment> assignments = new ArrayList<>();
        assignmentRepository.findAll().forEach(assignments::add);
        return assignments;
    }
    public void addAssignment(Assignment assignment){

        assignmentRepository.save(assignment);
        //throw new Exception("Sample Exception");

    }
}
