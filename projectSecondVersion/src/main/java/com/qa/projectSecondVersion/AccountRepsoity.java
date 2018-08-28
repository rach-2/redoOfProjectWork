package com.qa.projectSecondVersion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.projectSecondVersion.Account;
@Repository
public interface AccountRepsoity extends JpaRepository<Account, Long> {
	

}
