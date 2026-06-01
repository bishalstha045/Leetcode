# Write your MySQL query statement below
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
LEFT JOIN  Address a
on p.personId = a.personId;
-- using alias

-- Select 
-- Person.firstName , Person.lastName, Address.city , Address.state
-- from person
-- left join Address
-- on Person.personId = Address.personId ;