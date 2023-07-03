//CRUD operation keliye

package org.tnsif.placementmanagement.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.College;
import org.tnsif.placementmanagement.repository.CollegeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService{
	
	/*To inject the dependency automatically*/
	@Autowired
	private CollegeRepository repo;
	
	//create
	public void create(College college)
	{
		repo.save(college);
	}
	
	//retrieve with specific ID
	public College retrieve(Integer id)
	{
		return repo.findById(id).get();
		
	}
	
	//To retrieve all records
	public List<College> retrieveAll()
	{
		return repo.findAll();
	}
	
	//delete with specific record
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
