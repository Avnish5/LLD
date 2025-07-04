package z_k_40_object_pool_design_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ConnectionPool {

    private static volatile ConnectionPool instance;

    private static final int INITIAL_POOL_SIZE = 3;
    private static final int MAX_POOL_SIZE = 5;

    private final Set<Connection> availableConnections = new HashSet<>();
    private final Set<Connection> usedConnections = new HashSet<>();

    private final String url = "jdbc:mysql://localhost:3306/mydb";
    private final String user = "root";
    private final String password = "password";

    // Private constructor initializes the pool with default initial size
    private ConnectionPool() throws SQLException{
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            availableConnections.add(createConnection());
        }
    }

    // Singleton accessor without parameters
    public static ConnectionPool getInstance() throws SQLException{
        if (instance == null) {
            synchronized (ConnectionPool.class) {
               if (instance == null) {
                   instance = new ConnectionPool();
               }
            }
        }
        return instance;
    }

    private Connection createConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public synchronized Connection acquireConnection() throws SQLException {
        if (!availableConnections.isEmpty()) {
            Connection conn = availableConnections.iterator().next();
            availableConnections.remove(conn);
            usedConnections.add(conn);
            return conn;
        } else if (usedConnections.size() < MAX_POOL_SIZE) {
            Connection conn = createConnection();
            availableConnections.add(conn);
            return conn;
        } else {
            throw new SQLException("Maximum pool size reached, no available connections!");
        }
    }

    public synchronized void releaseConnection(Connection conn) {
        if (conn != null) {
            usedConnections.remove(conn);
            availableConnections.add(conn);
        }
    }

    public synchronized int getAvailableConnectionsCount() {
        return availableConnections.size();
    }

    public synchronized int getUsedConnectionsCount() {
        return usedConnections.size();
    }



}
