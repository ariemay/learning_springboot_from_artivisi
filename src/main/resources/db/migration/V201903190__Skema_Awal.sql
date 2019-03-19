create table article (
    id VARCHAR(36),
    code VARCHAR(100) NOT NULL,
    title VARCHAR(255) NOT NULL,
    content VARCHAR(900),
    PRIMARY KEY (id),
    UNIQUE (code)
);