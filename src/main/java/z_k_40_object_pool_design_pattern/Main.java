package z_k_40_object_pool_design_pattern;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            ConnectionPool pool = ConnectionPool.getInstance();

            System.out.println("Available connections: " + pool.getAvailableConnectionsCount()); // 3 initially

            Connection conn1 = pool.acquireConnection();
            Connection conn2 = pool.acquireConnection();

            System.out.println("Available after acquiring 2: " + pool.getAvailableConnectionsCount()); // 1
            System.out.println("Used connections: " + pool.getUsedConnectionsCount()); // 2

            pool.releaseConnection(conn1);

            System.out.println("Available after releasing 1: " + pool.getAvailableConnectionsCount()); // 2
            System.out.println("Used connections: " + pool.getUsedConnectionsCount()); // 1

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
