package com.example.SenpiperAssignment.Controller;

import com.example.SenpiperAssignment.Address.Address;
import com.example.SenpiperAssignment.AssignService.AssignService;
import com.example.SenpiperAssignment.Model.Assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AssignController {

    @Autowired
    private AssignService assignService;

    @RequestMapping("/trainingcenters")
    public List<Assignment> getalltraining(){
        return assignService.getAllAssignments();

    }

    @RequestMapping(method = RequestMethod.POST, value = "/trainingcenters")
    public @Valid Assignment addAssignments(@Valid @RequestBody Assignment assignment) {
//        try {
       // assignment.setAddress(new Address(detailedAddress,"","",""));
            assignService.addAssignment(assignment);
            return assignment;
//        }catch (Exception e)
//        {
//            return "Exception Occured " +e;
//        }
    }
}
