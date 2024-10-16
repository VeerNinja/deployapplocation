SHOW TABLES;
DESCRIBE aws_user_details;


INSERT INTO aws_user_details (username, email, password, dob, status) VALUES
('john_doe', 'john@example.com', 'password123', '1990-01-01', 'active'),
('jane_doe', 'jane@example.com', 'password123', '1992-02-02', 'inactive');
