Database Technologies – Assignment 6


Note: To solve below queries use “sales” database *Use appropriate joins to solve following queries.


1. Write a query that lists each order number followed by the name of the customer who made the order.
        
        d3_56456> select o.onum, c.cname from orders o 
        inner join customers c on o.cnum = c.cnum order by o.onum;

                +------+----------+
                | onum | cname    |
                +------+----------+
                | 3001 | Cisneros |
                | 3002 | Pereira  |
                | 3003 | Hoffman  |
                | 3005 | Liu      |
                | 3006 | Cisneros |
                | 3007 | Grass    |
                | 3008 | Clemens  |
                | 3009 | Giovanni |
                | 3010 | Grass    |
                | 3011 | Clemens  |
                +------+----------+
                10 rows in set (0.00 sec)       


2. Write a query that gives the names of both the salesperson and the customer for each order along with the order number.
        
        d3_56456> select o.onum, c.cname, s.sname from orders o 
                 inner join customers c on o.cnum = c.cnum  
                 inner join salespeople s on o.snum=s.snum 
                 order by o.onum ;
                
                +------+----------+---------+
                | onum | cname    | sname   |
                +------+----------+---------+
                | 3001 | Cisneros | Rifkin  |
                | 3002 | Pereira  | Motika  |
                | 3003 | Hoffman  | Peel    |
                | 3005 | Liu      | Serres  |
                | 3006 | Cisneros | Rifkin  |
                | 3007 | Grass    | Serres  |
                | 3008 | Clemens  | Peel    |
                | 3009 | Giovanni | Axelrod |
                | 3010 | Grass    | Serres  |
                | 3011 | Clemens  | Peel    |
                +------+----------+---------+
                10 rows in set (0.00 sec


3. Write a query that produces all customers serviced by salespeople with a commission above 12%. Output the customer’s name, the salesperson’s name, and the salesperson’s rate of commission.

        d3_56456>select c.cname, s.sname, s.comm from customers c
             -> inner join salespeople s on c.snum = s.snum
             -> where s.comm > 0.12;
             
               +----------+--------+------+
               | cname    | sname  | comm |
               +----------+--------+------+
               | Liu      | Serres | 0.13 |
               | Grass    | Serres | 0.13 |
               | Cisneros | Rifkin | 0.15 |
               +----------+--------+------+
               3 rows in set (0.03 sec)



4. Write a query that calculates the amount of the salesperson’s commission on each order by a customer with a rating above 100.
       
        d3_56456>select o.onum, c.cname, c.rating, s.sname,  o.amt, s.comm as 's_comm %', o.amt * s.comm as 's_comm Rs'
             -> from orders o
             -> inner join salespeople s on o.snum = s.snum
             -> inner join customers c on o.cnum = c.cnum
             -> where c.rating > 100
             -> order by c.rating;
                 
                  +------+----------+--------+---------+---------+----------+-----------+
                  | onum | cname    | rating | sname   | amt     | s_comm % | s_comm Rs |
                  +------+----------+--------+---------+---------+----------+-----------+
                  | 3005 | Liu      |    200 | Serres  | 5160.45 |     0.13 |  670.8585 |
                  | 3009 | Giovanni |    200 | Axelrod | 1713.23 |     0.10 |  171.3230 |
                  | 3010 | Grass    |    300 | Serres  |  309.95 |     0.13 |   40.2935 |
                  | 3007 | Grass    |    300 | Serres  |   75.75 |     0.13 |    9.8475 |
                  | 3006 | Cisneros |    300 | Rifkin  | 1098.16 |     0.15 |  164.7240 |
                  | 3001 | Cisneros |    300 | Rifkin  |   18.69 |     0.15 |    2.8035 |
                  +------+----------+--------+---------+---------+----------+-----------+
                  6 rows in set (0.00 sec)  




5. Write a query that produces all pairs of salespeople who are living in the same city. Exclude combinations of salespeople with themselves as well as duplicate rows with the order reversed.

        d3_56456>select s.sname, sm.sname, s.city from salespeople s 
        join salespeople sm on s.city = sm.city where s.snum < sm.snum;
           
            +--------+-------+--------+
            | sname  | sname | city   |
            +--------+-------+--------+
            | Motika | Peel  | London |
            +--------+-------+--------+
            1 row in set (0.00 sec)



Database Technologies – Assignment 6


Note: To solve below queries use “hr” database *Use appropriate joins to solve following queries.


6. Display department name and manager first name.

        d3_56456>select d.department_name, e.first_name from
            -> employees e right join departments d
            ->  on d.manager_id = e.employee_id;

                +----------------------+------------+
                | department_name      | first_name |
                +----------------------+------------+
                | Administration       | Jennifer   |
                | Marketing            | Michael    |
                | Purchasing           | Den        |
                | Human Resources      | Susan      |
                | Shipping             | Adam       |
                | IT                   | Alexander  |
                | Public Relations     | Hermann    |
                | Sales                | John       |
                | Executive            | Steven     |
                | Finance              | Nancy      |
                | Accounting           | Shelley    |
                | Treasury             | NULL       |
                | Corporate Tax        | NULL       |
                | Control And Credit   | NULL       |
                | Shareholder Services | NULL       |
                | Benefits             | NULL       |
                | Manufacturing        | NULL       |
                | Construction         | NULL       |
                | Contracting          | NULL       |
                | Operations           | NULL       |
                | IT Support           | NULL       |
                | NOC                  | NULL       |
                | IT Helpdesk          | NULL       |
                | Government Sales     | NULL       |
                | Retail Sales         | NULL       |
                | Recruiting           | NULL       |
                | Payroll              | NULL       |
                +----------------------+------------+
                27 rows in set (0.00 sec)


7. Display department name, manager name, and city.

        d3_56456>select d.department_name, e.first_name, l.city  from departments d 
        left join employees e on d.manager_id = e.employee_id  
        inner join  locations l on  l.location_id = d.location_id;

            +----------------------+------------+---------------------+
            | department_name      | first_name | city                |
            +----------------------+------------+---------------------+
            | Administration       | Jennifer   | Seattle             |
            | Marketing            | Michael    | Toronto             |
            | Purchasing           | Den        | Seattle             |
            | Human Resources      | Susan      | London              |
            | Shipping             | Adam       | South San Francisco |
            | IT                   | Alexander  | Southlake           |
            | Public Relations     | Hermann    | Munich              |
            | Sales                | John       | OX9 9ZB             |
            | Executive            | Steven     | Seattle             |
            | Finance              | Nancy      | Seattle             |
            | Accounting           | Shelley    | Seattle             |
            | Treasury             | NULL       | Seattle             |
            | Corporate Tax        | NULL       | Seattle             |
            | Control And Credit   | NULL       | Seattle             |
            | Shareholder Services | NULL       | Seattle             |
            | Benefits             | NULL       | Seattle             |
            | Manufacturing        | NULL       | Seattle             |
            | Construction         | NULL       | Seattle             |
            | Contracting          | NULL       | Seattle             |
            | Operations           | NULL       | Seattle             |
            | IT Support           | NULL       | Seattle             |
            | NOC                  | NULL       | Seattle             |
            | IT Helpdesk          | NULL       | Seattle             |
            | Government Sales     | NULL       | Seattle             |
            | Retail Sales         | NULL       | Seattle             |
            | Recruiting           | NULL       | Seattle             |
            | Payroll              | NULL       | Seattle             |
            +----------------------+------------+---------------------+
            27 rows in set (0.00 sec)


8. Display country name, city, and department name.

        d3_56456>select d.department_name,  l.city ,c.country_name from locations l 
                right join departments d on d.location_id = l.location_id  
                inner join  countries c on  l.country_id = c.country_id;

                +----------------------+---------------------+--------------------------+
                | department_name      | city                | country_name             |
                +----------------------+---------------------+--------------------------+
                | Administration       | Seattle             | United States of America |
                | Marketing            | Toronto             | Canada                   |
                | Purchasing           | Seattle             | United States of America |
                | Human Resources      | London              | United Kingdom           |
                | Shipping             | South San Francisco | United States of America |
                | IT                   | Southlake           | United States of America |
                | Public Relations     | Munich              | Germany                  |
                | Executive            | Seattle             | United States of America |
                | Finance              | Seattle             | United States of America |
                | Accounting           | Seattle             | United States of America |
                | Treasury             | Seattle             | United States of America |
                | Corporate Tax        | Seattle             | United States of America |
                | Control And Credit   | Seattle             | United States of America |
                | Shareholder Services | Seattle             | United States of America |
                | Benefits             | Seattle             | United States of America |
                | Manufacturing        | Seattle             | United States of America |
                | Construction         | Seattle             | United States of America |
                | Contracting          | Seattle             | United States of America |
                | Operations           | Seattle             | United States of America |
                | IT Support           | Seattle             | United States of America |
                | NOC                  | Seattle             | United States of America |
                | IT Helpdesk          | Seattle             | United States of America |
                | Government Sales     | Seattle             | United States of America |
                | Retail Sales         | Seattle             | United States of America |
                | Recruiting           | Seattle             | United States of America |
                | Payroll              | Seattle             | United States of America |
                +----------------------+---------------------+--------------------------+
                26 rows in set (0.00 sec)


9. Display job title, department name, employee last name, starting date for all jobs from 1993 to 1998.

        d3_56456> select j.job_title, d.department_name, e.last_name, jh.start_date
            -> from job_history jh
            -> right join jobs j on j.job_id = jh.job_id
            -> inner join employees e on jh.employee_id = e.employee_id
            -> inner join departments d on jh.department_id = d.department_id
            -> where jh.start_date > '1993-01-01' and jh.start_date < '1998-12-31';

                +--------------------------+-----------------+-----------+------------+
                | job_title                | department_name | last_name | start_date |
                +--------------------------+-----------------+-----------+------------+
                | Programmer               | IT              | De Haan   | 1993-01-13 |
                | Accounting Manager       | Accounting      | Kochhar   | 1993-10-28 |
                | Marketing Representative | Marketing       | Hartstein | 1996-02-17 |
                | Stock Clerk              | Shipping        | Raphaely  | 1998-03-24 |
                | Sales Representative     | Sales           | Taylor    | 1998-03-24 |
                | Public Accountant        | Executive       | Whalen    | 1994-07-01 |
                +--------------------------+-----------------+-----------+------------+
                6 rows in set (0.02 sec)




10. Display job title and average salary of employees. 

        d3_56456>SELECT job_title, AVG(salary)  FROM employees  
        right JOIN  jobs using(job_id) GROUP BY job_title;

            +---------------------------------+--------------+
            | job_title                       | AVG(salary)  |
            +---------------------------------+--------------+
            | President                       | 24000.000000 |
            | Administration Vice President   | 17000.000000 |
            | Administration Assistant        |  4400.000000 |
            | Finance Manager                 | 12000.000000 |
            | Accountant                      |  7920.000000 |
            | Accounting Manager              | 12000.000000 |
            | Public Accountant               |  8300.000000 |
            | Sales Manager                   | 12200.000000 |
            | Sales Representative            |  8350.000000 |
            | Purchasing Manager              | 11000.000000 |
            | Purchasing Clerk                |  2780.000000 |
            | Stock Manager                   |  7280.000000 |
            | Stock Clerk                     |  2785.000000 |
            | Shipping Clerk                  |  3215.000000 |
            | Programmer                      |  5760.000000 |
            | Marketing Manager               | 13000.000000 |
            | Marketing Representative        |  6000.000000 |
            | Human Resources Representative  |  6500.000000 |
            | Public Relations Representative | 10000.000000 |
            +---------------------------------+--------------+
            19 rows in set (0.00 sec)




11. Display job title, employee name, and the difference between maximum salary for the job and salary of the employee. 

        d3_56456>SELECT J.JOB_TITLE,CONCAT(E.FIRST_NAME,E.LAST_NAME),(J.MAX_SALARY-e.SALARY) AS DIFFERENCE FROM employees E 
        INNER JOIN jobs J ON J.JOB_ID=E.JOB_ID;

                +---------------------------------+----------------------------------+------------+
                | JOB_TITLE                       | CONCAT(E.FIRST_NAME,E.LAST_NAME) | DIFFERENCE |
                +---------------------------------+----------------------------------+------------+
                | President                       | Steven King                       |   16000.00 |
                | Administration Vice President   | Neena Kochhar                     |   13000.00 |
                | Administration Vice President   | LexDe Haan                       |   13000.00 |
                | Administration Assistant        | Jennifer Whalen                   |    1600.00 |
                | Finance Manager                 | Nancy Greenberg                   |    4000.00 |
                | Accountant                      | Danie lFaviet                     |       0.00 |
                | Accountant                      | John Chen                         |     800.00 |
                | Accountant                      | Ismael Sciarra                    |    1300.00 |
                | Accountant                      | Jose ManuelUrman                 |    1200.00 |
                | Accountant                      | Luis Popp                         |    2100.00 |
                | Accounting Manager              | Shelley Higgins                   |    4000.00 |
                | Public Accountant               | William Gietz                     |     700.00 |
                | Sales Manager                   | John Russell                      |    6000.00 |
                | Sales Manager                   | Karen Partners                    |    6500.00 |
                | Sales Manager                   | AlbertoErrazuriz                 |    8000.00 |
                | Sales Manager                   | GeraldCambrault                  |    9000.00 |
                | Sales Manager                   | EleniZlotkey                     |    9500.00 |
                | Sales Representative            | PeterTucker                      |    2000.00 |
                | Sales Representative            | DavidBernstein                   |    2500.00 |
                | Sales Representative            | PeterHall                        |    3000.00 |
                | Sales Representative            | ChristopherOlsen                 |    4000.00 |
                | Sales Representative            | NanetteCambrault                 |    4500.00 |
                | Sales Representative            | OliverTuvault                    |    5000.00 |
                | Sales Representative            | JanetteKing                      |    2000.00 |
                | Sales Representative            | PatrickSully                     |    2500.00 |
                | Sales Representative            | AllanMcEwen                      |    3000.00 |
                | Sales Representative            | LindseySmith                     |    4000.00 |
                | Sales Representative            | LouiseDoran                      |    4500.00 |
                | Sales Representative            | SarathSewall                     |    5000.00 |
                | Sales Representative            | ClaraVishney                     |    1500.00 |
                | Sales Representative            | DanielleGreene                   |    2500.00 |
                | Sales Representative            | MatteaMarvins                    |    4800.00 |
                | Sales Representative            | DavidLee                         |    5200.00 |
                | Sales Representative            | SundarAnde                       |    5600.00 |
                | Sales Representative            | AmitBanda                        |    5800.00 |
                | Sales Representative            | LisaOzer                         |     500.00 |
                | Sales Representative            | HarrisonBloom                    |    2000.00 |
                | Sales Representative            | TaylerFox                        |    2400.00 |
                | Sales Representative            | WilliamSmith                     |    4600.00 |
                | Sales Representative            | ElizabethBates                   |    4700.00 |
                | Sales Representative            | SunditaKumar                     |    5900.00 |
                | Sales Representative            | EllenAbel                        |    1000.00 |
                | Sales Representative            | AlyssaHutton                     |    3200.00 |
                | Sales Representative            | JonathonTaylor                   |    3400.00 |
                | Sales Representative            | JackLivingston                   |    3600.00 |
                | Sales Representative            | KimberelyGrant                   |    5000.00 |
                | Sales Representative            | CharlesJohnson                   |    5800.00 |
                | Purchasing Manager              | DenRaphaely                      |    4000.00 |
                | Purchasing Clerk                | AlexanderKhoo                    |    2400.00 |
                | Purchasing Clerk                | ShelliBaida                      |    2600.00 |
                | Purchasing Clerk                | SigalTobias                      |    2700.00 |
                | Purchasing Clerk                | GuyHimuro                        |    2900.00 |
                | Purchasing Clerk                | KarenColmenares                  |    3000.00 |
                | Stock Manager                   | MatthewWeiss                     |     500.00 |
                | Stock Manager                   | AdamFripp                        |     300.00 |
                | Stock Manager                   | PayamKaufling                    |     600.00 |
                | Stock Manager                   | ShantaVollman                    |    2000.00 |
                | Stock Manager                   | KevinMourgos                     |    2700.00 |
                | Stock Clerk                     | JuliaNayer                       |    1800.00 |
                | Stock Clerk                     | IreneMikkilineni                 |    2300.00 |
                | Stock Clerk                     | JamesLandry                      |    2600.00 |
                | Stock Clerk                     | StevenMarkle                     |    2800.00 |
                | Stock Clerk                     | LauraBissot                      |    1700.00 |
                | Stock Clerk                     | MozheAtkinson                    |    2200.00 |
                | Stock Clerk                     | JamesMarlow                      |    2500.00 |
                | Stock Clerk                     | TJOlson                          |    2900.00 |
                | Stock Clerk                     | JasonMallin                      |    1700.00 |
                | Stock Clerk                     | MichaelRogers                    |    2100.00 |
                | Stock Clerk                     | KiGee                            |    2600.00 |
                | Stock Clerk                     | HazelPhiltanker                  |    2800.00 |
                | Stock Clerk                     | RenskeLadwig                     |    1400.00 |
                | Stock Clerk                     | StephenStiles                    |    1800.00 |
                | Stock Clerk                     | JohnSeo                          |    2300.00 |
                | Stock Clerk                     | JoshuaPatel                      |    2500.00 |
                | Stock Clerk                     | TrennaRajs                       |    1500.00 |
                | Stock Clerk                     | CurtisDavies                     |    1900.00 |
                | Stock Clerk                     | RandallMatos                     |    2400.00 |
                | Stock Clerk                     | PeterVargas                      |    2500.00 |
                | Shipping Clerk                  | WinstonTaylor                    |    2300.00 |
                | Shipping Clerk                  | JeanFleaur                       |    2400.00 |
                | Shipping Clerk                  | MarthaSullivan                   |    3000.00 |
                | Shipping Clerk                  | GirardGeoni                      |    2700.00 |
                | Shipping Clerk                  | NanditaSarchand                  |    1300.00 |
                | Shipping Clerk                  | AlexisBull                       |    1400.00 |
                | Shipping Clerk                  | JuliaDellinger                   |    2100.00 |
                | Shipping Clerk                  | AnthonyCabrio                    |    2500.00 |
                | Shipping Clerk                  | KellyChung                       |    1700.00 |
                | Shipping Clerk                  | JenniferDilly                    |    1900.00 |
                | Shipping Clerk                  | TimothyGates                     |    2600.00 |
                | Shipping Clerk                  | RandallPerkins                   |    3000.00 |
                | Shipping Clerk                  | SarahBell                        |    1500.00 |
                | Shipping Clerk                  | BritneyEverett                   |    1600.00 |
                | Shipping Clerk                  | SamuelMcCain                     |    2300.00 |
                | Shipping Clerk                  | VanceJones                       |    2700.00 |
                | Shipping Clerk                  | AlanaWalsh                       |    2400.00 |
                | Shipping Clerk                  | KevinFeeney                      |    2500.00 |
                | Shipping Clerk                  | DonaldOConnell                   |    2900.00 |
                | Shipping Clerk                  | DouglasGrant                     |    2900.00 |
                | Programmer                      | AlexanderHunold                  |    1000.00 |
                | Programmer                      | BruceErnst                       |    4000.00 |
                | Programmer                      | DavidAustin                      |    5200.00 |
                | Programmer                      | ValliPataballa                   |    5200.00 |
                | Programmer                      | DianaLorentz                     |    5800.00 |
                | Marketing Manager               | MichaelHartstein                 |    2000.00 |
                | Marketing Representative        | PatFay                           |    3000.00 |
                | Human Resources Representative  | SusanMavris                      |    2500.00 |
                | Public Relations Representative | HermannBaer                      |     500.00 |
                +---------------------------------+----------------------------------+------------+
                107 rows in set (0.00 sec)




12. Display last name, job title of employees who have commission percentage and belongs to department 30. 

        d3_56456>select e.last_name, j.job_title, e.commission_pct from employees e 
        inner join jobs j using(job_id) 
        where e.  commission_pct != 0.0 and e.department_id = 30;

                Empty set (0.08 sec)


13. Display details of jobs that were done by any employee who is currently drawing more than 15000 of salary. 

        d3_56456>select j.job_title ,e.first_name, e.salary from employees e 
        right join jobs j using(job_id) where e.salary > 15000;

            +-------------------------------+------------+----------+
            | job_title                     | first_name | salary   |
            +-------------------------------+------------+----------+
            | President                     | Steven     | 24000.00 |
            | Administration Vice President | Neena      | 17000.00 |
            | Administration Vice President | Lex        | 17000.00 |
            +-------------------------------+------------+----------+
            3 rows in set (0.03 sec)


14. Display department name, manager name, and salary of the manager for all managers whose experience is more than 5 years. 

        d3_56456>select d.department_id, d.department_name, e.first_name as man_name, e.salary as man_salary from employees e 
        right join departments d on e.employee_id = d.manager_id 
        where (datediff(now(),e.hire_date)/365)>5;

                +---------------+------------------+-----------+------------+
                | department_id | department_name  | man_name  | man_salary |
                +---------------+------------------+-----------+------------+
                |            10 | Administration   | Jennifer  |    4400.00 |
                |            20 | Marketing        | Michael   |   13000.00 |
                |            30 | Purchasing       | Den       |   11000.00 |
                |            40 | Human Resources  | Susan     |    6500.00 |
                |            50 | Shipping         | Adam      |    8200.00 |
                |            60 | IT               | Alexander |    9000.00 |
                |            70 | Public Relations | Hermann   |   10000.00 |
                |            80 | Sales            | John      |   14000.00 |
                |            90 | Executive        | Steven    |   24000.00 |
                |           100 | Finance          | Nancy     |   12000.00 |
                |           110 | Accounting       | Shelley   |   12000.00 |
                +---------------+------------------+-----------+------------+
                11 rows in set (0.04 sec)


15. Display employee name if the employee joined before his manager. 

        d3_56456>SELECT e.*
            -> FROM Employees e
            -> INNER JOIN Employees m ON e.Manager_Id = m.Employee_id AND e.hire_date < m.Hire_Date;
        
                Empty set (0.00 sec)

16. Display employee name, job title for the jobs employee did in the past where the job was done less than six months. 

        d3_56456>select jh.employee_id, e.first_name, jh.job_id, j.job_title from job_history jh inner join jobs j on jh.job_id = j.job_id 
        inner join employees e on jh.employee_id = e.employee_id 
        where (datediff(jh.end_date, jh.start_date) / 30) < 6;

            Empty set (0.00 sec)



17. Display employee name and country in which he is working. 

        d3_56456>select e.First_name , d.department_id , l.location_id, c.country_name from departments d 
        right join employees e on d.department_id = e.department_id  
        left join locations l on l.location_id = d.location_id 
        left join countries c on l.country_id = c.country_id;

            +-------------+---------------+-------------+--------------------------+
            | First_name  | department_id | location_id | country_name             |
            +-------------+---------------+-------------+--------------------------+
            | Steven      |            90 |        1700 | United States of America |
            | Neena       |            90 |        1700 | United States of America |
            | Lex         |            90 |        1700 | United States of America |
            | Alexander   |            60 |        1400 | United States of America |
            | Bruce       |            60 |        1400 | United States of America |
            | David       |            60 |        1400 | United States of America |
            | Valli       |            60 |        1400 | United States of America |
            | Diana       |            60 |        1400 | United States of America |
            | Nancy       |           100 |        1700 | United States of America |
            | Daniel      |           100 |        1700 | United States of America |
            | John        |           100 |        1700 | United States of America |
            | Ismael      |           100 |        1700 | United States of America |
            | Jose Manuel |           100 |        1700 | United States of America |
            | Luis        |           100 |        1700 | United States of America |
            | Den         |            30 |        1700 | United States of America |
            | Alexander   |            30 |        1700 | United States of America |
            | Shelli      |            30 |        1700 | United States of America |
            | Sigal       |            30 |        1700 | United States of America |
            | Guy         |            30 |        1700 | United States of America |
            | Karen       |            30 |        1700 | United States of America |
            | Matthew     |            50 |        1500 | United States of America |
            | Adam        |            50 |        1500 | United States of America |
            | Payam       |            50 |        1500 | United States of America |
            | Shanta      |            50 |        1500 | United States of America |
            | Kevin       |            50 |        1500 | United States of America |
            | Julia       |            50 |        1500 | United States of America |
            | Irene       |            50 |        1500 | United States of America |
            | James       |            50 |        1500 | United States of America |
            | Steven      |            50 |        1500 | United States of America |
            | Laura       |            50 |        1500 | United States of America |
            | Mozhe       |            50 |        1500 | United States of America |
            | James       |            50 |        1500 | United States of America |
            | TJ          |            50 |        1500 | United States of America |
            | Jason       |            50 |        1500 | United States of America |
            | Michael     |            50 |        1500 | United States of America |
            | Ki          |            50 |        1500 | United States of America |
            | Hazel       |            50 |        1500 | United States of America |
            | Renske      |            50 |        1500 | United States of America |
            | Stephen     |            50 |        1500 | United States of America |
            | John        |            50 |        1500 | United States of America |
            | Joshua      |            50 |        1500 | United States of America |
            | Trenna      |            50 |        1500 | United States of America |
            | Curtis      |            50 |        1500 | United States of America |
            | Randall     |            50 |        1500 | United States of America |
            | Peter       |            50 |        1500 | United States of America |
            | John        |            80 |        2500 | NULL                     |
            | Karen       |            80 |        2500 | NULL                     |
            | Alberto     |            80 |        2500 | NULL                     |
            | Gerald      |            80 |        2500 | NULL                     |
            | Eleni       |            80 |        2500 | NULL                     |
            | Peter       |            80 |        2500 | NULL                     |
            | David       |            80 |        2500 | NULL                     |
            | Peter       |            80 |        2500 | NULL                     |
            | Christopher |            80 |        2500 | NULL                     |
            | Nanette     |            80 |        2500 | NULL                     |
            | Oliver      |            80 |        2500 | NULL                     |
            | Janette     |            80 |        2500 | NULL                     |
            | Patrick     |            80 |        2500 | NULL                     |
            | Allan       |            80 |        2500 | NULL                     |
            | Lindsey     |            80 |        2500 | NULL                     |
            | Louise      |            80 |        2500 | NULL                     |
            | Sarath      |            80 |        2500 | NULL                     |
            | Clara       |            80 |        2500 | NULL                     |
            | Danielle    |            80 |        2500 | NULL                     |
            | Mattea      |            80 |        2500 | NULL                     |
            | David       |            80 |        2500 | NULL                     |
            | Sundar      |            80 |        2500 | NULL                     |
            | Amit        |            80 |        2500 | NULL                     |
            | Lisa        |            80 |        2500 | NULL                     |
            | Harrison    |            80 |        2500 | NULL                     |
            | Tayler      |            80 |        2500 | NULL                     |
            | William     |            80 |        2500 | NULL                     |
            | Elizabeth   |            80 |        2500 | NULL                     |
            | Sundita     |            80 |        2500 | NULL                     |
            | Ellen       |            80 |        2500 | NULL                     |
            | Alyssa      |            80 |        2500 | NULL                     |
            | Jonathon    |            80 |        2500 | NULL                     |
            | Jack        |            80 |        2500 | NULL                     |
            | Kimberely   |          NULL |        NULL | NULL                     |
            | Charles     |            80 |        2500 | NULL                     |
            | Winston     |            50 |        1500 | United States of America |
            | Jean        |            50 |        1500 | United States of America |
            | Martha      |            50 |        1500 | United States of America |
            | Girard      |            50 |        1500 | United States of America |
            | Nandita     |            50 |        1500 | United States of America |
            | Alexis      |            50 |        1500 | United States of America |
            | Julia       |            50 |        1500 | United States of America |
            | Anthony     |            50 |        1500 | United States of America |
            | Kelly       |            50 |        1500 | United States of America |
            | Jennifer    |            50 |        1500 | United States of America |
            | Timothy     |            50 |        1500 | United States of America |
            | Randall     |            50 |        1500 | United States of America |
            | Sarah       |            50 |        1500 | United States of America |
            | Britney     |            50 |        1500 | United States of America |
            | Samuel      |            50 |        1500 | United States of America |
            | Vance       |            50 |        1500 | United States of America |
            | Alana       |            50 |        1500 | United States of America |
            | Kevin       |            50 |        1500 | United States of America |
            | Donald      |            50 |        1500 | United States of America |
            | Douglas     |            50 |        1500 | United States of America |
            | Jennifer    |            10 |        1700 | United States of America |
            | Michael     |            20 |        1800 | Canada                   |
            | Pat         |            20 |        1800 | Canada                   |
            | Susan       |            40 |        2400 | United Kingdom           |
            | Hermann     |            70 |        2700 | Germany                  |
            | Shelley     |           110 |        1700 | United States of America |
            | William     |           110 |        1700 | United States of America |
            +-------------+---------------+-------------+--------------------------+
            107 rows in set (0.00 sec)



18. Display department name, average salary and number of employees with commission within the department. 

        d3_56456>select d.department_name, avg(e.salary) ,count(e.employee_id) from departments d left join employees e on d.department_id = e.department_id 
        where e.commission_pct != 0.0 group by d.department_name ;

            +-----------------+---------------+----------------------+
            | department_name | avg(e.salary) | count(e.employee_id) |
            +-----------------+---------------+----------------------+
            | Sales           |   8955.882353 |                   34 |
            +-----------------+---------------+----------------------+
            1 row in set (0.00 sec)


19. Display the month in which more than 5 employees joined in any department located in Sydney. 

        d3_56456>select d.department_id, l.city, month(e.hire_date) as month , count(e.employee_id) from employees e  
        left join departments d on d.department_id = e.department_id  
        left join locations l on d.location_id = l.location_id 
        where l.city= 'sydney' group by  d.department_id  , month(e.hire_date), l.city;

            Empty set (0.03 sec)

20. Display employee name, job title, start date, and end date of past jobs of all employees with commission percentage null.
        
        d3_56456>select e.First_name, j.job_title, jh.start_date, jh.end_date from job_history jh left join jobs j on jh.job_id = j.job_id 
        inner join employees e on jh.employee_id = e.employee_id 
        where e.commission_pct is NULL;

            Empty set (0.00 sec)