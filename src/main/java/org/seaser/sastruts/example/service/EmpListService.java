package org.seaser.sastruts.example.service;

import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.framework.container.SingletonS2Container;
import org.seaser.sastruts.example.dto.EmployeeDto;

public class EmpListService extends S2AbstractService<EmployeeDto>{
	
	//=====
	// DI
	//====
	public List<EmployeeDto> results;
	
	public List<EmployeeDto> searchEmpData() {
		// S2ContainerからJdbcManagerを取得
		JdbcManager jdbcManager = SingletonS2Container.getComponent(JdbcManager.class);
			
		// JdbcManagerを使用して検索
		results = jdbcManager.selectBySqlFile(EmployeeDto.class,"data/searchEmployeeList.sql").getResultList();
		
		return results;
	}
}
