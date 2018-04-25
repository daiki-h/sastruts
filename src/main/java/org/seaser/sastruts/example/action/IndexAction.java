/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seaser.sastruts.example.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;
import org.seasar.struts.annotation.Execute;
import org.seaser.sastruts.example.dto.EmployeeDto;
import org.seaser.sastruts.example.entity.DspEmployeeEntity;
import org.seaser.sastruts.example.service.EmpListService;

public class IndexAction {
	
	//======
	// DI
	//=====	
	@Resource
	/** Service **/
	protected EmpListService empListService;
	
	/** 検索結果Dto */
	public List<EmployeeDto> empList;

	S2Container container;
	//===========
	//実行メソッド
	//=========
    @Execute(validator = false)
	public String index() {
    	    
    	    // インスタンスの初期化
    		SingletonS2ContainerFactory.init();
    		container = SingletonS2ContainerFactory.getContainer();
    	
    		// 社員情報の検索 
    		empList = empListService.searchEmpData();
    		
    		return "index.jsp";
	}
}
