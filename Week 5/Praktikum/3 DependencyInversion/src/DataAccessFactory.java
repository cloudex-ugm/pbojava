public class DataAccessFactory {
    public static IEmployeeDataAccess GetEmployeeDataAccessObj(){
        return new EmployeeDataAccessLogic();
    }
}
