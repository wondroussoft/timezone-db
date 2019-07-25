CREATE TABLE timezone
(
    id                  	BIGSERIAL,
    zone_name            	VARCHAR(256),
    abbreviation        	VARCHAR(12),
    gmt_offset			DOUBLE PRECISION,
    daylight_saving_time	BOOLEAN,
    current_time_now		VARCHAR(256),
    created_on          	TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by          	BIGINT,
    updated_on          	TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_by          	BIGINT,

    CONSTRAINT pk_timezone PRIMARY KEY (id)
);
