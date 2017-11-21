/**
 * 
 */
package com.dineshonjava.sbsecurity.model;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Alok.Pandey
 *
 */
public interface UserRepository extends CrudRepository<User, Long>{
	
	User findOneByEmail(String email);
}
