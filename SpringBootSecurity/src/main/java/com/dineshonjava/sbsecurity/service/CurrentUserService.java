/**
 * 
 */
package com.dineshonjava.sbsecurity.service;

import com.dineshonjava.sbsecurity.bean.CurrentUser;

/**
 * @author Alok.Pandey
 *
 */
public interface CurrentUserService {
	
	 boolean canAccessUser(CurrentUser currentUser, Long userId);
}
