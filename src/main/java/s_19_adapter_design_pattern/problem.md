# Adapter Design Pattern: Voltage Adapter

## Problem Statement

### Context
You have a modern client that expects a `Volt` object with a specific voltage (e.g., 12V, 3V, etc.), but the `Socket` class only provides a fixed 120 volts of power. The challenge is to **convert** this power into different voltages (e.g., 12V, 3V) without modifying the existing `Socket` class.

### Objective
We need to create an **adapter** that will allow the client to get the required voltages (e.g., 12V, 3V) from the 120V socket.

---

## Design Pattern: Adapter Pattern

### **Purpose**
The **Adapter Pattern** is used to convert one interface into another so that two incompatible interfaces can work together. In this scenario:
- The **Socket** class provides a voltage of 120V.
- The **Adapter** will convert this 120V to other voltages (e.g., 12V, 3V) that the client requires.

### **Components**:
- **Client**: The modern client that needs a `Volt` object with a specific voltage (12V, 3V, etc.).
- **Socket (Adaptee)**: Provides 120V but needs to be adapted for the client.
- **Adapter**: A class that implements the `SocketAdapter` interface and adapts the `Socket` to return the required voltages (12V, 3V).

---

## Solution Design

### 1. **Volt Class**:
The `Volt` class represents a voltage level (e.g., 120V, 12V, 3V). It encapsulates the voltage value that will be used by the client.

### 2. **Socket Class (Adaptee)**:
The `Socket` class represents the existing class that provides 120 volts of power. It does not meet the client's requirement for other voltages, so it needs to be adapted.

### 3. **SocketAdapter Interface**:
This interface defines the methods that the adapter class will implement. It provides methods to get the 120V, 12V, and 3V power.

### 4. **SocketObjectAdapterImpl Class**:
This is the adapter class that implements the `SocketAdapter` interface. It takes the 120V from the `Socket` and converts it to 12V, 3V, or other voltages as needed.

### 5. **Client Class**:
The client class uses the adapter to get the appropriate voltages (12V, 3V, etc.) from the `Socket`.
