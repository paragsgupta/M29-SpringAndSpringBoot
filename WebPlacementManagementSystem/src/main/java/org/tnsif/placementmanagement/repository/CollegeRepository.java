package org.tnsif.placementmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entities.College;

/*JpaRepository is an interface which contains all the 
 * JPA CRUD operations which is required for SpringBoot*/
public interface CollegeRepository extends JpaRepository<College,Integer>{
	
	

}
