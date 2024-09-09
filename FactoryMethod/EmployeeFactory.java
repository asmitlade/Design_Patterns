public class EmployeeFactory {

    public static Employee getInstance(String objType) {
        if(objType.trim().equals("App")){
            return new AppDeveloper();
        } else if(objType.trim().equals("Web")) {
            return new WebDeveloper();
        } else {
             return null;
        }

    }
}
