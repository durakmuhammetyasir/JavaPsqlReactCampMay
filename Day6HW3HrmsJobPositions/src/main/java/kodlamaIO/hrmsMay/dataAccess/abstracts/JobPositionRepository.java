package kodlamaIO.hrmsMay.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaIO.hrmsMay.entities.concretes.JobPosition;

public interface JobPositionRepository extends JpaRepository<JobPosition, Integer>{

}
