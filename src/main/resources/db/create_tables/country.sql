CREATE TABLE country
(
    id                  BIGSERIAL,
    name_eng            VARCHAR(256),
    name_telugu         VARCHAR(256),
    name_kannnada	VARCHAR(256),
    name_hindi		VARCHAR(256),
    name_tamil		VARCHAR(256),
    president_name_eng	VARCHAR(256),
    area		SMALLINT,
    population		SMALLINT,
    capital		VARCHAR(256),
    time		VARCHAR(256),
    date		VARCHAR(256),
    created_on          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by          BIGINT,
    updated_on          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_by          BIGINT,

    CONSTRAINT pk_country PRIMARY KEY (id)
);
