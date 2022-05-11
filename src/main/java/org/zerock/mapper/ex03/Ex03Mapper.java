package org.zerock.mapper.ex03;

import org.apache.ibatis.annotations.Select;

public interface Ex03Mapper {
	
	@Select("SELECT FirstName FROM Employees WHERE EmployeeId = #{id}")
	String selectEmployeeFirstNameById(int id);
}
