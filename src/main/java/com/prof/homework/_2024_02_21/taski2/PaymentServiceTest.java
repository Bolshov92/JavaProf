package com.prof.homework._2024_02_21.taski2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class PaymentServiceTest {
    SimpleNotificationService notificationService = mock(SimpleNotificationService.class);
    SimpleTransactionRepository transactionRepository = mock(SimpleTransactionRepository.class);

    PaymentService paymentService = new PaymentService(notificationService, transactionRepository);


    @Test
    void makePaymentPositiveTest() {
        Mockito.when(transactionRepository.processTransaction(Mockito.anyDouble())).thenReturn(true);
        Assertions.assertTrue(paymentService.makePayment(Mockito.anyDouble()));
        Mockito.verify(notificationService).sendPaymentNotification(Mockito.anyString());
    }

    @Test
    void makePaymentNegativeTest() {
        Mockito.when(transactionRepository.processTransaction(Mockito.anyDouble())).thenReturn(false);
        Assertions.assertFalse(paymentService.makePayment(Mockito.anyDouble()));
        Mockito.verify(notificationService).sendPaymentNotification(Mockito.anyString());
    }

    @Test
    void refundPaymentPositiveTest() {
        Mockito.when(transactionRepository.processTransaction(-Mockito.anyDouble())).thenReturn(true);
        Assertions.assertTrue(paymentService.refundPayment(Mockito.anyDouble()));
        Mockito.verify(notificationService).sendPaymentNotification(Mockito.anyString());
    }

    @Test
    void refundPaymentNegativeTest() {
        Mockito.when(transactionRepository.processTransaction(-Mockito.anyDouble())).thenReturn(false);
        Assertions.assertFalse(paymentService.refundPayment(Mockito.anyDouble()));
        Mockito.verify(notificationService).sendPaymentNotification(Mockito.anyString());
    }
}