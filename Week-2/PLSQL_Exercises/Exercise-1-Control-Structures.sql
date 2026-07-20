/*
==========================================================
Exercise 1: Control Structures
Week 2 - Cognizant Digital Nurture 5.0
==========================================================
Scenario 1:
Apply a 1% discount to loan interest rates for customers
whose age is above 60 years.
==========================================================
*/

DECLARE
    v_age NUMBER;
BEGIN
    FOR cust IN (SELECT CustomerID, DOB FROM Customers) LOOP

        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, cust.DOB) / 12);

        IF v_age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to Customer ID: ' || cust.CustomerID
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/



/*
==========================================================
Scenario 2
Promote customers to VIP if balance > 10000
==========================================================
*/

ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);

BEGIN
    FOR cust IN (
        SELECT CustomerID, Balance
        FROM Customers
    ) LOOP

        IF cust.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer '
                || cust.CustomerID
                || ' promoted to VIP.'
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/




/*
==========================================================
Scenario 3
Print reminder for loans due within the next 30 days
==========================================================
*/

BEGIN

    FOR loan_rec IN (
        SELECT LoanID,
               CustomerID,
               EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ID '
            || loan_rec.CustomerID
            || ' has Loan ID '
            || loan_rec.LoanID
            || ' due on '
            || TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY')
        );

    END LOOP;

END;
/
