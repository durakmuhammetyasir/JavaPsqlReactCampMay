package kodlamaIO.hrmsMay.business.abstracts;

import java.util.List;

import kodlamaIO.hrmsMay.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
