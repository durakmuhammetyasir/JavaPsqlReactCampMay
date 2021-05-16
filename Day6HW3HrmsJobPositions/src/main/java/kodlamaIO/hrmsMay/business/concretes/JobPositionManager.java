package kodlamaIO.hrmsMay.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaIO.hrmsMay.business.abstracts.JobPositionService;
import kodlamaIO.hrmsMay.dataAccess.abstracts.JobPositionRepository;
import kodlamaIO.hrmsMay.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	private final JobPositionRepository jobpositionrepository;
	
	public JobPositionManager(JobPositionRepository jobpositionrepository) {
		this.jobpositionrepository = jobpositionrepository;
	}

	public List<JobPosition> getAll() {
		return jobpositionrepository.findAll();
	}
}
