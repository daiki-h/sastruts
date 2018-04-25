package org.seaser.sastruts.example.dto;

import java.sql.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SQLファイルの検索結果を受け取るDTO
 */
public class EmployeeDto {
	
	/** 名前 */
	public String name;
	
	/** 入社日 */
    @Temporal(TemporalType.DATE)
    public Date hireDate;
    
    /** 役職 */
    public String position;
}
