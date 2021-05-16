package kodlamaIO.hrmsMay.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIO.hrmsMay.business.concretes.JobPositionManager;
import kodlamaIO.hrmsMay.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	private JobPositionManager jobpositionmanager;
	
	@Autowired
	public JobPositionsController(JobPositionManager jobpositionmanager) {
		super();
		this.jobpositionmanager = jobpositionmanager;
	}
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobpositionmanager.getAll();		
	}

}

	
	
