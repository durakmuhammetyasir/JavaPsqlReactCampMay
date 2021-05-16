package kodlamaIO.hrmsMay.entities.concretes;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

	import lombok.Data;


	@Entity
	@Table
	@Data
	public class JobPosition {
		
		@Id	
		@SequenceGenerator(
				name = "Hrms_job_positions_sequence",
				sequenceName =  "Hrms_job_positions_sequence",
				allocationSize = 1
		)
		@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "Hrms_job_positions_sequence"
		)
		@Column(name="job_position_id")
		private int id;
		
		@Column(name="category_id")
		private int categoryId;
		
		@Column(name="job_position_name")
		private String jobPositionName;
		
		@Column(name="category_name")
		private String categoryName;
		
		@Column(name="job_position_salary")
		private double salary;
		
		@Column(name="number_of_people_in_job_position")
		private int peopleInJobPosition;

		public JobPosition() {
			super();
		}

		public JobPosition(int id, int categoryId, String jobPositionName, String categoryName, double salary,
				int peopleInJobPosition) {
			super();
			this.id = id;
			this.categoryId = categoryId;
			this.jobPositionName = jobPositionName;
			this.categoryName = categoryName;
			this.salary = salary;
			this.peopleInJobPosition = peopleInJobPosition;
		}

		
		
		
}
