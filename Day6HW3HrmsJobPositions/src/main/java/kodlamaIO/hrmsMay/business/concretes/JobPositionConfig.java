package kodlamaIO.hrmsMay.business.concretes;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kodlamaIO.hrmsMay.dataAccess.abstracts.JobPositionRepository;
import kodlamaIO.hrmsMay.entities.concretes.JobPosition;

	@Configuration
	public class JobPositionConfig {
		@Bean
		CommandLineRunner commandLineRunner(JobPositionRepository repository) {
			return args -> {
				JobPosition softwareDeveloper = new JobPosition(
						1,
						1,
						"Developer",
						"Software",
						6000,
						3
				);
				
				JobPosition softwareArchitect = new JobPosition(
						2,
						1,
						"Architect",
						"Software",
						6500,
						2
				);
				
				JobPosition softwareTester = new JobPosition(
						3,
						1,
						"Tester",
						"Software",
						5500,
						1
				);
				
				JobPosition solutionsArchitect = new JobPosition(
						4,
						1,
						"Cloud Solutions Architect",
						"Software",
						7500,
						8
				);
				
				JobPosition solutionsDeveloper = new JobPosition(
						5,
						1,
						"Cloud Solution Developer",
						"Software",
						7000,
						9
				);
				
				JobPosition uIDesigner = new JobPosition(
						6,
						1,
						"UI Designer",
						"Software",
						5500,
						12
				);
				
				JobPosition devOpsEngineer = new JobPosition(
						7,
						1,
						"DevOps Engineer",
						"Software",
						6500,
						5
				);
				
				JobPosition projectManager = new JobPosition(
						8,
						2,
						"Project Manager",
						"Management",
						7500,
						7
				);
				
				repository.saveAll(
						List.of(softwareDeveloper, softwareArchitect,softwareTester,solutionsArchitect,solutionsDeveloper,uIDesigner,devOpsEngineer,projectManager)
				
				);
				
			};
		

	}
}
