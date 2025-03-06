package org.varrnit.StructuralPatterns.FacadePattern.Solution;

// Microservice for Payment Processing
class PaymentService {
    public String processPayment(String paymentId) {
        // Simulate payment processing
        return "Processing payment with paymentId: " + paymentId;
    }
}