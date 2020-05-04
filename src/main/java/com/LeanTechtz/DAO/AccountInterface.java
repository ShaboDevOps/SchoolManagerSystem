package com.LeanTechtz.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountInterface extends JpaRepository<Account, String> {
     
	Account findByUsername(String username);
}
