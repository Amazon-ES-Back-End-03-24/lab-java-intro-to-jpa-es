ALTER TABLE flight_bookings -- seleccionas la tabla en la que quieres crear la relacion
    ADD CONSTRAINT fk_customers -- le añàdes la relación y defines un nombre a esa relación
        FOREIGN KEY (customer_id) -- le dices que la relación es de clave foránea
            -- y es una relación desde la columna customer_id de la tabla flight_bookings
            REFERENCES customers (customer_id); -- le defines que esta columna hace referencia a la primary
-- key (customer_id) de la tabla customers

ALTER TABLE  flight_bookings -- seleccionas tabla
    ADD CONSTRAINT fk_flight -- nombras la constraint
        FOREIGN KEY (flight_id) -- eliges la columna de tu tabla (flight_bookins) sobre la que haces la relación
            REFERENCES flights(flight_id) -- eliges la tabla y su primary key a la que te relacionas