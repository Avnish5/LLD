package m_13_proxy_design_pattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try {
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("ADMIN", new EmployeeDo());
            System.out.println("Operation is successfull");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
