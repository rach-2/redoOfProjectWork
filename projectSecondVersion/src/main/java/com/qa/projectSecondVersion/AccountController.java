package com.qa.projectSecondVersion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/account")
public class AccountController {

	@Autowired
	AccountRepsoity accountRepo;
	
	@GetMapping("/getAll")
	@ResponseStatus(HttpStatus.OK)
	public List<Account> getAllAccounts(){
		return accountRepo.findAll();
		
	}
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public void addAccount(@RequestBody Account accountToAdd){
		//Account accountToAdd = new Account(firstName,lastName,accountNumber);
		accountRepo.save(accountToAdd);
	}
	
	@DeleteMapping("/remove/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleateAccount(@PathVariable Long id){
		accountRepo.deleteById(id);
		
	}
	
	@PutMapping("edit/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void edit(@PathVariable Long id, @RequestBody Account accountToUpadte){
		Optional<Account> accoutOptional = accountRepo.findById(id);
		 if(accoutOptional.isPresent()){
			 accountToUpadte.setId(id);
		 }
		 
		 accountRepo.save(accountToUpadte);
		
	}
	

	

	
	
	

}
