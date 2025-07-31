CREATE TABLE employees (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50),
    salary NUMBER
);


INSERT INTO employees VALUES (1, 'John', 50000);
INSERT INTO employees VALUES (2, 'Alice', 60000);
COMMIT;

CREATE OR REPLACE PROCEDURE calculate_bonus(p_emp_id IN NUMBER) AS
    v_name employees.emp_name%TYPE;
    v_salary employees.salary%TYPE;
    v_bonus NUMBER;
BEGIN
    SELECT emp_name, salary
    INTO v_name, v_salary
    FROM employees
    WHERE emp_id = p_emp_id;

    v_bonus := v_salary * 0.10;

    DBMS_OUTPUT.PUT_LINE('Employee: ' || v_name);
    DBMS_OUTPUT.PUT_LINE('Salary: ₹' || v_salary);
    DBMS_OUTPUT.PUT_LINE('Bonus (10%): ₹' || v_bonus);
    DBMS_OUTPUT.PUT_LINE('Total (Salary + Bonus): ₹' || (v_salary + v_bonus));
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee not found for ID: ' || p_emp_id);
END;
/


SET SERVEROUTPUT ON;
EXEC calculate_bonus(1);
