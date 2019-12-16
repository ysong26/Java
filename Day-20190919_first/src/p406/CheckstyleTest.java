package p406;

import java.sql.SQLException;

public class CheckstyleTest {

	private Employee employeeDao;
	
	public int updateEmployee(int emploteeId, String emploteeName) throws SQLException{
		Employee emp=new Employee();
		return this.employeeDao.update(emp);
	}
}
