package org.varrnit.StructuralPatterns.AdapterPattern;

interface NotificationService {
    void send(String to,String subject,String body);
}
