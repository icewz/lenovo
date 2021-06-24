package apiNeedToReadCareFully.IO;

public class EmployeeFactoryImpl implements EmployeeFactory{
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType{
        switch (r.type) {
//            case COMMISSIONED:
//                return new CommissionedEmployee(r);
            default:
                throw new InvalidEmployeeType(r.type);
        }
    }
}
