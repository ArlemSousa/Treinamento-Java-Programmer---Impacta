pg_hba.conf:

host    all             all             0.0.0.0/0               md5
host    all             all             ::0/0                   md5

============================================================================

psql -d impacta -h localhost -p 5432 -U postgres
psql -h 192.168.0.54 -U postgres
psql -h cpaest158 -U postgres
psql -h localhost -U postgres

\q            # Desconecta e sai
\l            # Mostra databases
\c database   # Muda o database atual
\i script.sql # Executa o script
