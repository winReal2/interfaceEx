package sec01.exam06;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.selsct();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
}
}
