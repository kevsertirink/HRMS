package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jobpositions")
public class JobPositions {

	@Id
	@GeneratedValue 
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	
}
