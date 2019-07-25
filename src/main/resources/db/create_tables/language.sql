CREATE TABLE language
(
    id                  BIGSERIAL,
    language             VARCHAR(256),
    created_on          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by          BIGINT,
    updated_on          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_by          BIGINT,

    CONSTRAINT pk_language PRIMARY KEY (id)
);
