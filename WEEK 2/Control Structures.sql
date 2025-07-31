DECLARE
    v_marks NUMBER := 78;
    v_grade CHAR(1);
BEGIN
    
    IF v_marks >= 90 THEN
        v_grade := 'A';
    ELSIF v_marks >= 75 THEN
        v_grade := 'B';
    ELSIF v_marks >= 60 THEN
        v_grade := 'C';
    ELSE
        v_grade := 'D';
    END IF;

    DBMS_OUTPUT.PUT_LINE('Marks: ' || v_marks);
    DBMS_OUTPUT.PUT_LINE('Grade: ' || v_grade);

    
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Count: ' || i);
    END LOOP;

    
    CASE v_grade
        WHEN 'A' THEN DBMS_OUTPUT.PUT_LINE('Excellent performance!');
        WHEN 'B' THEN DBMS_OUTPUT.PUT_LINE('Good job!');
        WHEN 'C' THEN DBMS_OUTPUT.PUT_LINE('Needs improvement.');
        ELSE DBMS_OUTPUT.PUT_LINE('Poor performance.');
    END CASE;
END;
/
