package com.bintics.solid.srp;

import java.util.List;

public class OrderService {

    private OrderRepository orderRepository = new OrderRepository();
    private EmailService emailService = new EmailService();
    private TaxCalculator taxCalculator = new TaxCalculator();
    private InventoryManager inventoryManager = new InventoryManager();
    private Logger logger = new Logger();

    public void processOrder(Order order) {

        if (order.getItems() == null || order.getItems().isEmpty()) { // 1. Validar pedido
            throw new IllegalArgumentException("El pedido no contiene productos");
        }

        double tax = taxCalculator.calculate(order); // 2. Calcular impuestos
        order.setTax(tax);

        orderRepository.save(order); // 3. Guardar pedido
        inventoryManager.reserveStock(order); // 4. Actualizar inventario
        emailService.sendOrderConfirmation(order); // 5. Enviar notificación
        logger.log("Orden procesada: " + order.getId()); // 6. Registrar en logs
    }
}

// Clases simuladas para el ejercicio
class OrderRepository {
    public void save(Order order) { /* ... */ }
}

class EmailService {
    public void sendOrderConfirmation(Order order) { /* ... */ }
}

class TaxCalculator {
    public double calculate(Order order) { return 10.0; }
}

class InventoryManager {
    public void reserveStock(Order order) { /* ... */ }
}

class Logger {
    public void log(String msg) { System.out.println(msg); }
}

class Order {
    private List<String> items;
    private double tax;
    private String id;

    public List<String> getItems() { return items; }
    public void setItems(List<String> items) { this.items = items; }
    public void setTax(double tax) { this.tax = tax; }
    public String getId() { return id; }
}
