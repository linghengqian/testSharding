CREATE TABLE IF NOT EXISTS equipment_oee
(
    serial_no                BIGINT NOT NULL PRIMARY KEY,
    equipment_id             VARCHAR(255) DEFAULT NULL,
    statistics_cycle         VARCHAR(255) DEFAULT NULL,
    statistics_time          VARCHAR(255) DEFAULT NULL,
    lastest_status_serial_no BIGINT       DEFAULT NULL
);