
//Deal with REST

//program to demonstrate on RESTful API and it contains
//business logic of an application
package org.tnsif.placementmanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entities.College;
import org.tnsif.placementmanagement.services.CollegeService;

/*used to create controllers for REST API's which can return JSON*/


@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService service;
	
	//RESTful API's method
	
	/*REST API used when there is any third party involvement in 
	 * our application process*/
	
	/*@RequestBody for when we requesting any insertion*/
	@PostMapping("/college")
	public void insert(@RequestBody College college)
	{
		service.create(college);
	}
	
	@DeleteMapping("/college/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//for all the records
	@GetMapping("/college")
	public List<College>retrieveA()
	{
		return service.retrieveAll();
	}
	
	//for the specific
	@GetMapping("/college/{id}")
	public ResponseEntity<College> retrieve(@PathVariable Integer id)
	{
		try {
			
			College college=service.retrieve(id);
			return new ResponseEntity<College>(college,HttpStatus.OK);

		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	public ResponseEntity<College>update (@RequestBody College college,@PathVariable Integer id)
	{
		try {
		College c=service.retrieve(id);
		service.create(college);
		return new ResponseEntity<College>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) 
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
			
		}
	}


}
