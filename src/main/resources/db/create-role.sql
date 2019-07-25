DO
$body$
BEGIN
    IF NOT EXISTS(
            SELECT *
            FROM pg_catalog.pg_user
            WHERE usename = 'joseph')
    THEN
        CREATE ROLE joseph WITH PASSWORD 'josh@123';
    END IF;
END
$body$;

ALTER ROLE joseph NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION LOGIN;
