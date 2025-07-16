package com.bintics.solid.ocp.good.op0;

import jdk.jfr.DataAmount;

import java.util.List;

public class ReportesrService {

    public void createReport(List<Product> products, String type) {
        switch (type.toLowerCase()) {
            case "pdf":
                // TODO: lógica para generar PDF
                System.out.println("PDF Report");
                break;
            case "txt":
                // TODO: Lógica para generar txt
                System.out.println("txt report");
                break;
        }
    }

    public static class Product {
        private final String name;
        private final double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

}
