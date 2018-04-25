package org.seaser.sastruts.example.entity;

import java.sql.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class DspEmployeeEntity {
		
		/** 名前 */
		public String name;
		
		/** 入社日 */
	    @Temporal(TemporalType.DATE)
	    public Date hireDate;
	    
	    /** 役職 */
	    public String potision;

}
