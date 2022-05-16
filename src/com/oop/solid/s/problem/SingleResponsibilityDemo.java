/**
 * 
 */
package com.oop.solid.s.problem;

/**
 * @author abdelkader
 *
 */
public class SingleResponsibilityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MailboxSettingsService settingsService = new MailboxSettingsService();
		User user = new User();
		
		// responsibility #1 of the MilboxSettingsService - change settings in mailbox
		settingsService.changeSecondaryEmail(user, "newemail@email.com");
		
		// responsibility #2 of the MilboxSettingsService - verify access
		if (settingsService.hasAccess(user)) {
			user.sendMoney(new User(), 1000);
		}

	}

}
