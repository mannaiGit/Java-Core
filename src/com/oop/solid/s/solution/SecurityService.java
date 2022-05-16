/**
 * 
 */
package com.oop.solid.s.solution;

/**
 * @author abdelkader
 *
 */
public class SecurityService {
	public boolean hasAccess(User user) {
		if (user.getRole() == Role.ADMIN) {
			return true;
		} else {
			return false;
		}
	}
}
