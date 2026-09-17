# Bank Management System

- Concepts

Encapsulation

Constructors

Methods

- Class

BankAccount

- Functions

Deposit

Withdraw

Transfer

Check Balance

# Timeline

start - 15/09/26
end 16/09/2026


# improvement
Operation Phase (Deposit / Withdraw / Transfer / Balance Check):

When a user wants to perform an action, ask for their accountNumber.

BankManager looks up the account.

If found: Perform the operation (deposit, withdraw, check balance).

If transfer: Ask for the destination accountNumber, look it up, and if both exist, move the money between them.

If not found: Display "Account number does not exist