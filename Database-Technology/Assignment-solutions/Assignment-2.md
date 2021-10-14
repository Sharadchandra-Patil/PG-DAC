Database Technologies – Assignment 2

NOTE – 
    Database Creation and user Creation, assigning privileges is responsibility of Database Administrator (root)

Q1. Create 'classwork' database. Import classwork-db.sql.
   SOLUTION:   
            
                1. CREATE DATABASE classwork;
                2. GRANT ALL PRIVILEGES ON classwork.* TO d3_56456@localhost;
            
                1. USE classwork;
                2. SOURCE D:/classwork-db.sql


Q2. Create 'hr' database. Import hr-db.sql.
    SOLUTION:   root>create database hr;
                Query OK, 1 row affected (0.22 sec)


                root>grant all privileges on hr.* to d3_56456@localhost;
                Query OK, 0 rows affected (0.09 sec)

                root>use hr;
                Database changed

                root>source D:/db/hr-db.sql


Q3. Create 'sales' database. Import sales-db.sql.
        Solution :   root>create database sales;
                     Query OK, 1 row affected (0.28 sec)

                     root>grant all privileges on sales.* to d3_56456@localhost;
                     Query OK, 0 rows affected (0.09 sec)

                     root>use sales;
                     Database changed

                     root>source D:/db/sales-db.sql



Q4. Create 'northwind' database. Import northwind-db.sql.
    solution :  root>create database northwind;
                Query OK, 1 row affected (0.25 sec)

                root>grant all privileges on northwind.* to d3_56456@localhost;
                Query OK, 0 rows affected (0.12 sec)

                root>use northwind;
                Database changed

                root>source D:/db/northwind-db.sql




Q5. List all tables in classwork database. Display contents of all tables (one by one).
    solution:   root>use classwork;
                Database changed

                root>show tables;
                +---------------------+
                | Tables_in_classwork |
                +---------------------+
                | bonus               |
                | books               |
                | dept                |
                | dummy               |
                | emp                 |
                | salgrade            |
                +---------------------+
                7 rows in set (0.07 sec)

                root>select * from bonus;
                Empty set (0.08 sec)

                root>select * from books;
                +------+---------------------------------+-------------------+-------------------+---------+
                | id   | name                            | author            | subject           | price   |
                +------+---------------------------------+-------------------+-------------------+---------+
                | 1001 | Exploring C                     | Yashwant Kanetkar | C Programming     | 123.456 |
                | 1002 | Pointers in C                   | Yashwant Kanetkar | C Programming     | 371.019 |
                | 1003 | ANSI C Programming              | E Balaguruswami   | C Programming     | 334.215 |
                | 1004 | ANSI C Programming              | Dennis Ritchie    | C Programming     | 140.121 |
                | 2001 | C++ Complete Reference          | Herbert Schildt   | C++ Programming   | 417.764 |
                | 2002 | C++ Primer                      | Stanley Lippman   | C++ Programming   | 620.665 |
                | 2003 | C++ Programming Language        | Bjarne Stroustrup | C++ Programming   | 987.213 |
                | 3001 | Java Complete Reference         | Herbert Schildt   | Java Programming  | 525.121 |
                | 3002 | Core Java Volume I              | Cay Horstmann     | Java Programming  | 575.651 |
                | 3003 | Java Programming Language       | James Gosling     | Java Programming  | 458.238 |
                | 4001 | Operating System Concepts       | Peter Galvin      | Operating Systems | 567.391 |
                | 4002 | Design of UNIX Operating System | Mauris J Bach     | Operating Systems | 421.938 |
                | 4003 | UNIX Internals                  | Uresh Vahalia     | Operating Systems | 352.822 |
                +------+---------------------------------+-------------------+-------------------+---------+
                13 rows in set (0.04 sec)

                root>select * from dept;
                +--------+------------+----------+
                | deptno | dname      | loc      |
                +--------+------------+----------+
                |     10 | ACCOUNTING | NEW YORK |
                |     20 | RESEARCH   | DALLAS   |
                |     30 | SALES      | CHICAGO  |
                |     40 | OPERATIONS | BOSTON   |
                +--------+------------+----------+
                4 rows in set (0.03 sec)

                root>select * from dummy;
                +-------+
                | dummy |
                +-------+
                |     0 |
                +-------+
                1 row in set (0.03 sec)

                root>select * from emp;
                +-------+--------+-----------+------+------------+---------+---------+--------+
                | empno | ename  | job       | mgr  | hire       | sal     | comm    | deptno |
                +-------+--------+-----------+------+------------+---------+---------+--------+
                |  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
                |  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
                |  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
                |  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
                |  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
                |  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
                |  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
                |  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
                |  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
                |  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
                |  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
                |  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
                |  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
                |  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
                +-------+--------+-----------+------+------------+---------+---------+--------+
                14 rows in set (0.01 sec)

                root>select * from salgrade;
                +-------+-------+-------+
                | grade | losal | hisal |
                +-------+-------+-------+
                |     1 |   700 |  1200 |
                |     2 |  1201 |  1400 |
                |     3 |  1401 |  2000 |
                |     4 |  2001 |  3000 |
                |     5 |  3001 |  9999 |
                +-------+-------+-------+
                5 rows in set (0.02 sec)




Q6. List all tables in sales database. Display contents of all tables (one by one).
    solution:   root>use sales;
                Database changed

                root>show tables;
                +-----------------+
                | Tables_in_sales |
                +-----------------+
                | customers       |
                | orders          |
                | salespeople     |
                +-----------------+
                3 rows in set (0.00 sec)

                root>select * from customers;
                +------+----------+----------+--------+------+
                | cnum | cname    | city     | rating | snum |
                +------+----------+----------+--------+------+
                | 2001 | Hoffman  | London   |    100 | 1001 |
                | 2002 | Giovanni | Rome     |    200 | 1003 |
                | 2003 | Liu      | San Jose |    200 | 1002 |
                | 2004 | Grass    | Berlin   |    300 | 1002 |
                | 2006 | Clemens  | London   |    100 | 1001 |
                | 2008 | Cisneros | San Jose |    300 | 1007 |
                | 2007 | Pereira  | Rome     |    100 | 1004 |
                +------+----------+----------+--------+------+
                7 rows in set (0.04 sec)

                root>select * from orders;
                +------+---------+------------+------+------+
                | onum | amt     | odate      | cnum | snum |
                +------+---------+------------+------+------+
                | 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
                | 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
                | 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
                | 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
                | 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
                | 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
                | 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
                | 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
                | 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
                | 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
                +------+---------+------------+------+------+
                10 rows in set (0.01 sec)

                root>select * from salespeople;
                +------+---------+-----------+------+
                | snum | sname   | city      | comm |
                +------+---------+-----------+------+
                | 1001 | Peel    | London    | 0.12 |
                | 1002 | Serres  | San Jose  | 0.13 |
                | 1004 | Motika  | London    | 0.11 |
                | 1007 | Rifkin  | Barcelona | 0.15 |
                | 1003 | Axelrod | New York  | 0.10 |
                +------+---------+-----------+------+
                5 rows in set (0.02 sec)

  


Q7. 
    Login with your user name (d1_12345). List all tables in sales database. Display contents of  all tables (one by one). Answer the following questions (by observations only – not queries).
           
            a. How many orders data is present in the database?  
                Ans: 10
            
            b. How many customers are present in the database?
                Ans: 7
           
            c. How many salespeople are present in the database?
                Ans: 5
           
            d. On which date order with highest amount is placed?
                Ans: 1990-10-04 (04-10-1990)
            
            e. For which order salesman got maximum commission?
                Hint: you need to refer data of two tables.
                    Ans: Order number(onum) = 3011  commission = 9891.88 * 0.12
            
            f. Which salesman are handling more than two customers? Hint: you need to refer data of two tables.
                    Ans: Peel(1001) and Serres(1002)
            
            g. Which city have single customer?
                    Ans: Berlin
            
            h. Which city have multiple salespeople?
                    Ans: Rome and San Jose
            
            i. What is name of customer and salesman of the maximum amount order?
                    Ans: Customer name - Clemens   and     Salesman name - Peel



Q8. Study relationship between the tables in sales database.
    solution : observed sales database table successfully.

    Note : To solve below queries use “sales” database

Q9.  Write a select command that produces the order number, amount, and date for all rows in the    Orders table.
       
        Query: d3_56456> select onum 'order number', amt 'amount', odate 'date' from orders;
                           +--------------+---------+------------+
                           | order number | amount  | date       |
                           +--------------+---------+------------+
                           |         3001 |   18.69 | 1990-10-03 |
                           |         3003 |  767.19 | 1990-10-03 |
                           |         3002 | 1900.10 | 1990-10-03 |
                           |         3005 | 5160.45 | 1990-10-03 |
                           |         3006 | 1098.16 | 1990-10-03 |
                           |         3009 | 1713.23 | 1990-10-04 |
                           |         3007 |   75.75 | 1990-10-04 |
                           |         3008 | 4723.00 | 1990-10-04 |
                           |         3010 |  309.95 | 1990-10-04 |
                           |         3011 | 9891.88 | 1990-10-04 |
                           +--------------+---------+------------+
                           10 rows in set (0.00 sec




Q10. Write a query that displays the Salespeople table with the columns in the following order: city, sname, snum, comm.
    
    Query: d3_56456> select city, sname, snum, comm from salespeople;
                    +-----------+---------+------+------+
                    | city      | sname   | snum | comm |
                    +-----------+---------+------+------+
                    | London    | Peel    | 1001 | 0.12 |
                    | San Jose  | Serres  | 1002 | 0.13 |
                    | London    | Motika  | 1004 | 0.11 |
                    | Barcelona | Rifkin  | 1007 | 0.15 |
                    | New York  | Axelrod | 1003 | 0.10 |
                    +-----------+---------+------+------+
                    5 rows in set (0.00 sec)



Q11. Write a query that produces all rows from the Customers table for which the salesperson’s number is 1001.
      
        Query: d3_56456> select * from customers where snum = 1001;
                         +------+---------+--------+--------+------+
                         | cnum | cname   | city   | rating | snum |
                         +------+---------+--------+--------+------+
                         | 2001 | Hoffman | London |    100 | 1001 |
                         | 2006 | Clemens | London |    100 | 1001 |
                         +------+---------+--------+--------+------+
                         2 rows in set (0.00 sec)


Q12. Write a select command that produces the rating followed by the name of each customer in San Jose.
    
    Query : d3_56456> select rating 'Ratings', cname 'Customer name' from customers where city = 'San Jose';
                   +---------+---------------+
                   | Ratings | Customer name |
                   +---------+---------------+
                   |     200 | Liu           |
                   |     300 | Cisneros      |
                   +---------+---------------+
                   2 rows in set (0.00 sec)



Q13. Write a query that will produce the snum values of all salespeople from the Orders table (with the duplicate values suppressed).
 
        Query:  d3_56456> select distinct snum from orders ;
                         +------+
                         | snum |
                         +------+
                         | 1007 |
                         | 1001 |
                         | 1004 |
                         | 1002 |
                         | 1003 |
                         +------+
                         5 rows in set (0.03 sec)



Q14. Write a query that will give you all orders for more than Rs. 1,000.
       
        Query: d3_56456> select * from orders where amt > 1000;
                        +------+---------+------------+------+------+
                        | onum | amt     | odate      | cnum | snum |
                        +------+---------+------------+------+------+
                        | 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
                        | 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
                        | 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
                        | 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
                        | 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
                        | 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
                        +------+---------+------------+------+------+
                        6 rows in set (0.00 sec)



Q15. Write a query that will give you the names and cities of all salespeople in London with a commission above 0.10.
      
        Query : d3_56456> select sname 'Salesman Name', city from salespeople where city = 'London' and comm > 0.10;
                        +---------------+--------+
                        | Salesman Name | city   |
                        +---------------+--------+
                        | Peel          | London |
                        | Motika        | London |
                        +---------------+--------+
                        2 rows in set (0.00 sec)



Q16. Write a query on the Customers table whose output will exclude all customers with a rating <= 100, unless they are located in Rome.
 
        Query : d3_56456> select * from customers where rating > 100 or city like 'Rome';
                         +------+----------+----------+--------+------+
                         | cnum | cname    | city     | rating | snum |
                         +------+----------+----------+--------+------+
                         | 2002 | Giovanni | Rome     |    200 | 1003 |
                         | 2003 | Liu      | San Jose |    200 | 1002 |
                         | 2004 | Grass    | Berlin   |    300 | 1002 |
                         | 2008 | Cisneros | San Jose |    300 | 1007 |
                         | 2007 | Pereira  | Rome     |    100 | 1004 |
                         +------+----------+----------+--------+------+3
                         5 rows in set (0.04 sec)


Q17. Write a query that selects all orders except those with zeroes or NULLs in the amt field.
 
    Query: d3_56456> select * from orders where amt is not NULL or amt <> 0;
                         +------+---------+------------+------+------+
                         | onum | amt     | odate      | cnum | snum |
                         +------+---------+------------+------+------+
                         | 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
                         | 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
                         | 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
                         | 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
                         | 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
                         | 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
                         | 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
                         | 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
                         | 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
                         | 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
                         +------+---------+------------+------+------+
                         10 rows in set (0.00 sec)






Note: To solve below queries use “spj” database
Q18. Display all the data from the S table.
       
        Query : select * from S;
                 +------+--------+--------+--------+
                 | S#   | Sname  | Status | City   |
                 +------+--------+--------+--------+
                 | S1   | Smith  |     20 | London |
                 | S2   | Jones  |     10 | Paris  |
                 | S3   | Blake  |     30 | Paris  |
                 | S4   | Clarke |     20 | London |
                 | S5   | Adams  |     30 | Athens |
                 +------+--------+--------+--------+
                 5 rows in set (0.02 sec)



Q19. Display only the S# and SNAME fields from the S table.
        
        Ans:  d3_56456>select `S#`, `Sname` from s;
                               +------+--------+
                               | S#   | Sname  |
                               +------+--------+
                               | S1   | Smith  |
                               | S2   | Jones  |
                               | S3   | Blake  |
                               | S4   | Clarke |
                               | S5   | Adams  |
                               +------+--------+
                               5 rows in set (0.00 sec)

20. Assuming that the Part Weight is in GRAMS, display the same in MILLIGRAMS and KILOGRAMS.
   
         Ans: 
            d3_56456> select Weight,  Weight*1000 as Miligram, Weight * 0.001 as Kilogram  from p;
                        +--------+----------+----------+
                        | Weight | Miligram | Kilogram |
                        +--------+----------+----------+
                        |     12 |    12000 |    0.012 |
                        |     17 |    17000 |    0.017 |
                        |     17 |    17000 |    0.017 |
                        |     14 |    14000 |    0.014 |
                        |     12 |    12000 |    0.012 |
                        |     19 |    19000 |    0.019 |
                        +--------+----------+----------+
                        6 rows in set (0.03 sec)

21. Display the PNAME and COLOR from the P table for the CITY=”London”
    
        Ans: d3_56456>SELECT Pname,Color FROM P WHERE CITY = 'London';
                        +-------+-------+
                        | Pname | Color |
                        +-------+-------+
                        | Nut   | Red   |
                        | Screw | Red   |
                        | Cog   | Red   |
                        +-------+-------+
                        3 rows in set (0.00 sec)

22. Display all the Suppliers from London.
   
        Ans:  d3_56456> select Sname 'Suppliers' from s where city = 'London';
                            +-----------+
                            | Suppliers |
                            +-----------+
                            | Smith     |
                            | Clarke    |
                            +-----------+
                            2 rows in set (0.00 sec)

23. Display all the Suppliers from Paris or Athens.
    
        Ans:  d3_56456> select Sname 'Suppliers' from s where city = 'Paris' or city = 'Athens';
                            +-----------+
                            | Suppliers |
                            +-----------+
                            | Jones     |
                            | Blake     |
                            | Adams     |
                            +-----------+

24. Display all the Projects in Athens.
   
        Ans: d3_56456 >SELECT * FROM J WHERE City = 'Athens';
                            +------+---------+--------+
                            | J#   | Jname   | City   |
                            +------+---------+--------+
                            | J3   | Reader  | Athens |
                            | J4   | Console | Athens |
                            +------+---------+--------+
                            2 rows in set (0.00 sec)

25. Display all the Part names with the weight between 12 and 14 (inclusive of both).
    
        Ans: d3_56456>SELECT * FROM P WHERE Weight>=12 AND Weight<=14;
                            +------+-------+-------+--------+--------+
                            | P#   | Pname | Color | Weight | CITY   |
                            +------+-------+-------+--------+--------+
                            | P1   | Nut   | Red   |     12 | London |
                            | P4   | Screw | Red   |     14 | London |
                            | P5   | Cam   | Blue  |     12 | Paris  |
                            +------+-------+-------+--------+--------+
                            3 rows in set (0.00 sec)

26. Display all the Suppliers with a Status greater than or equal to 20.
    
        Ans: d3_56456> SELECT * FROM S WHERE Status>=20;
                            +------+--------+--------+--------+
                            | S#   | Sname  | Status | City   |
                            +------+--------+--------+--------+
                            | S1   | Smith  |     20 | London |
                            | S3   | Blake  |     30 | Paris  |
                            | S4   | Clarke |     20 | London |
                            | S5   | Adams  |     30 | Athens |
                            +------+--------+--------+--------+
                            4 rows in set (0.00 sec)

27. Display all the Suppliers except the Suppliers from London
    
        Ans:  d3_56456> SELECT * FROM S WHERE City != 'London';
                            +------+-------+--------+--------+
                            | S#   | Sname | Status | City   |
                            +------+-------+--------+--------+
                            | S2   | Jones |     10 | Paris  |
                            | S3   | Blake |     30 | Paris  |
                            | S5   | Adams |     30 | Athens |
                            +------+-------+--------+--------+
                            3 rows in set (0.00 sec)

28. Display only the Cities from where the Suppliers come from.
    
        Ans: d3_56456> SELECT DISTINCT City FROM S;
                            +--------+
                            | City   |
                            +--------+
                            | London |
                            | Paris  |
                            | Athens |
                            +--------+
                            3 rows in set (0.00 sec)

29. Display the Supplier table in the descending order of CITY.
    
         Ans: d3_56456> SELECT * FROM S ORDER BY City DESC;
                            +------+--------+--------+--------+
                            | S#   | Sname  | Status | City   |
                            +------+--------+--------+--------+
                            | S2   | Jones  |     10 | Paris  |
                            | S3   | Blake  |     30 | Paris  |
                            | S1   | Smith  |     20 | London |
                            | S4   | Clarke |     20 | London |
                            | S5   | Adams  |     30 | Athens |
                            +------+--------+--------+--------+
                            5 rows in set (0.01 sec)

30. Display the Part Table in the ascending order of CITY and within the city in the ascending order of Part names.
    
         Ans : d3_56456> SELECT * FROM P ORDER BY CITY ASC, Pname ASC;
                            +------+-------+-------+--------+--------+
                            | P#   | Pname | Color | Weight | CITY   |
                            +------+-------+-------+--------+--------+
                            | P6   | Cog   | Red   |     19 | London |
                            | P1   | Nut   | Red   |     12 | London |
                            | P4   | Screw | Red   |     14 | London |
                            | P2   | Bolt  | Green |     17 | Paris  |
                            | P5   | Cam   | Blue  |     12 | Paris  |
                            | P3   | Screw | Blue  |     17 | Rome   |
                            +------+-------+-------+--------+--------+
                            6 rows in set (0.00 sec)

31. Display all the Suppliers with a status between 10 and 20.
   
         Ans :  d3_56456>SELECT * FROM S WHERE Status>=10 AND Status<=20;
                            +------+--------+--------+--------+
                            | S#   | Sname  | Status | City   |
                            +------+--------+--------+--------+
                            | S1   | Smith  |     20 | London |
                            | S2   | Jones  |     10 | Paris  |
                            | S4   | Clarke |     20 | London |
                            +------+--------+--------+--------+
                            3 rows in set (0.00 sec) 

32. Display all the Parts and their Weight, which are not in the range of 10 and 15.
   
         Ans: d3_56456> SELECT Pname,Weight FROM P WHERE Weight<=10 OR Weight>=15;
                            +-------+--------+
                            | Pname | Weight |
                            +-------+--------+
                            | Bolt  |     17 |
                            | Screw |     17 |
                            | Cog   |     19 |
                            +-------+--------+
                            3 rows in set (0.00 sec)