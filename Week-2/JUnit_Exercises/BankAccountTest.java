package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    void testDeposit() {

        // Arrange
        BankAccount account = new BankAccount(1000);

        // Act
        account.deposit(500);

        // Assert
        assertEquals(1500, account.getBalance());
    }
}