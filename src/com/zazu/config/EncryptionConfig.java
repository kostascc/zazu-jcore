/*******************************************************************************
 * Copyright (C) 2018 Konstantinos Chatzis - All Rights Reserved
 * 
 * Licensed Under:
 * Creative Commons Attribution-NoDerivatives 4.0 International Public License
 *  
 * You must give appropriate credit, provide a link to the license, and indicate 
 * if changes were made. You may do so in any reasonable manner, but not in 
 * any way that suggests the licensor endorses you or your use. If you remix, 
 * transform, or build upon the material, you may not distribute the modified material. 
 * 
 * Konstantinos Chatzis <kachatzis@ece.auth.gr>
 ******************************************************************************/

package com.zazu.config;

public class EncryptionConfig {
	
	public static String PASSWORD_INNER_SALT = "#";
	
	public static String PASSWORD_OUTTER_SALT = "#";
	
	public static int ROUNDS = 1;	
	
	public static String INNER_ALGORITHM = ""; // SHA-512/SHA-256
	
	public static String OUTTER_ALGORITHM = ""; // SHA-512/SHA-256
	
}
