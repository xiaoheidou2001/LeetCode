create table Person (Personid int primary key, FirstName varchar(30), LastName varchar(30));
create table Address (AddressId int primary key, Personid int, City varchar(30), State varchar(30));

insert into Person values (1, 'Alan', 'Wang');
insert into Person values (2, 'Bob', 'Alice');

insert into Address values (1, 2, 'New York City', 'New York');
insert into Address values (2, 3, 'Los Angeles', 'California');

select FirstName, LastName, City, State from (Person left join Address on Person.Personid = Address.Personid);

create table Employee (id int primary key, salary int);
insert into Employee values (1, 100);
insert into Employee values (2, 200);
insert into Employee values (3, 300);
select (select distinct salary from Employee order by salary desc limit 1 offset 1) as SecondHighestSalary;

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      select distinct salary from Employee order by salary desc limit N,1
    );
END
