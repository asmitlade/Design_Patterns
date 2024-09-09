public class AppDeveloperFactory extends AbstractEmployeeFactory {

    @Override
    Employee createEmployee() {
        return new AppDeveloper();
    }
    
}
