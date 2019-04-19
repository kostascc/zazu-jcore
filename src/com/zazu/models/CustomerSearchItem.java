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

package com.zazu.models;

/**
 * Warning: This is a transitional object,
 * NOT an API model.
 */
public class CustomerSearchItem {

	public Customer customer;
		
	public CustomerSearchItem(Customer customer){ this.customer = customer; }
	
	@Override
	public String toString() {
		return ( customer.first_name + " " + customer.last_name + " (" + customer.card + ")" );
	}
	
}
