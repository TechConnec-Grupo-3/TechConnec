INSERT INTO categories (
    name,
    description
) VALUES (
             'Conciertos',               -- name
             'Eventos musicales en vivo' -- description
         );

INSERT INTO users (            -- FK a la tabla de eventos (opcional)
    name,
    email,
    password,
    interests,
    skills,
    link,
    profile_picture,
    created_at,
    updated_at
) VALUES (                      -- event_id (ajusta según tu caso)
             'Juan Pérez',          -- name
             'juan.perez@example.com',  -- email
             'hashed_password',     -- password (asegúrate de que sea el hash real)
             'Tecnología, Música',  -- interests
             'Java, SQL',          -- skills
             'https://linkedin.com/in/juanperez',  -- link
             'profile_picture.jpg', -- profile_picture
             '2024-10-02 14:30:00',                 -- created_at (timestamp actual)
             '2024-10-02 14:30:00'                  -- updated_at (timestamp actual)
         );

INSERT INTO exponents (
    name,
    description
) VALUES (
             'Ana Torres',                        -- name
             'Conocida por su trabajo en tecnología' -- description
         );

INSERT INTO events (
    organizer_id,
    category_id,
    exponent_id,
    title,
    description,
    location,
    share,
    registration,
    type_event,
    event_date,
    event_time,
    created_at,
    updated_at
) VALUES (
             1,                                  -- organizer_id (ejemplo)
             1,                                  -- category_id (ejemplo)
             1,                                  -- exponent_id (ejemplo)
             'Título del Evento',                -- title
             'Descripción del evento.',          -- description
             'Ubicación del evento',             -- location
             'Compartir este evento',            -- share
             '1,2,3',                            -- registration (ejemplo de IDs de usuarios)
             'SEMINAR',                           -- type_event (ajusta según tu enumeración)
             '2024-10-15',                       -- event_date (YYYY-MM-DD)
             '15:00:00',                         -- event_time (HH:mm:ss)
             '2024-10-02 14:30:00',
             '2024-10-02 14:30:00'    -- created_at (timestamp actual)
             -- updated_at (timestamp actual)
         );