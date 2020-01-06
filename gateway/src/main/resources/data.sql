DROP TABLE IF EXISTS gateways;
DROP TABLE IF EXISTS peripherals;

CREATE TABLE gateways (
  serial_number VARCHAR(250)  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  ipv4 VARCHAR(250) NOT NULL
);
 
INSERT INTO gateways (serial_number, name, ipv4) VALUES
  ('1111111111', 'gateway1', '0000.0000.00.1'),
  ('2222222222', 'gateway2', '0000.0000.00.2');
  
CREATE TABLE peripherals (
  uid VARCHAR(250)  PRIMARY KEY,
  vendor VARCHAR(250) NOT NULL,
  create_date VARCHAR(250) NOT NULL,
  status VARCHAR(250) NOT NULL,
  serial_number VARCHAR(250) NOT NULL,

);
 
INSERT INTO peripherals (uid, vendor, create_date, status, serial_number) VALUES
  ('uid1', 'peripheral1', '20200101', 'success', '1111111111'),
  ('uid2', 'peripheral2', '20200101', 'success', '1111111111'),
  ('uid3', 'peripheral3', '20200101', 'success', '2222222222');

