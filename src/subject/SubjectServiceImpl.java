package subject;

public class SubjectServiceImpl implements SubjectService {
	SubjectDAO dao = SubjectDAO.getInstance();
	private static SubjectServiceImpl instance = new SubjectServiceImpl();
	private SubjectServiceImpl() {
	
	// TODO Auto-generated constructor stub
}
	public static SubjectServiceImpl getInstance() {
		return instance;
	}
	
	@Override
	public void insert(SubjectBean s) {
		// TODO Auto-generated method stub
		dao.insert(s);
	}
	
}
