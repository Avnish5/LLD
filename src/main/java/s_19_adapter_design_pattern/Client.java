package s_19_adapter_design_pattern;

public class Client {
    public static void main(String[] args) {
        SocketAdapter adapter = new SocketObjectAdapterImpl();

        Volt v120 = adapter.get120Volt();
        Volt v12 = adapter.get12Volt();
        Volt v3 = adapter.get3Volt();

        System.out.println("v120 volts: " + v120.getVolts());
        System.out.println("v12 volts: " + v12.getVolts());
        System.out.println("v3 volts: " + v3.getVolts());
    }
}
