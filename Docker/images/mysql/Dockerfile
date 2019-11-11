FROM mysql:5.7.15
MAINTAINER Maximilian Vogel <maximilian.vogel@heig-vd.ch>

COPY data/a_people-schema.sql /docker-entrypoint-initdb.d
COPY data/b_people-data.sql /docker-entrypoint-initdb.d
