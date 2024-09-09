public class WebDeveloperFactory extends AbstractEmployeeFactory {

    @Override
    Employee createEmployee() {
        return new WebDeveloper();
    }
    
}
