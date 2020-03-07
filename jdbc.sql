use hr;
select * from books;
CREATE TABLE stu(
	sid CHAR(6) PRIMARY KEY,
	sname VARCHAR(20) NOT NULL,
	fee DECIMAL(7,2) NOT NULL,
	joindate date NOT NULL
);
UPDATE `hr`.`stu`
SET
`sid` = <{sid: 6 }>,
`sname` = <{sname: }>,
`fee` = <{fee: }>,
`joindate` = <{joindate: }>
WHERE `sid` = <{expr}>;
