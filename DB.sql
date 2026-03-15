select current_user;--query to see your logged-user

--query lo list all users(roles) in pgadmin4
select
rolname AS "User Name",
rolcanlogin AS "Can Login",
rolcreatedb As "Can Create Db?"
from pg_roles 
order by
rolname DESC;
--if you want more detail(like the databse name, original user and who started the seesion ), you can use this expanded query
--current user: the user identity currently being used for permission check 
--sessionn user: the user who originaly connected to the database
--current db: confirms which specific database your pgadmin tab is currently working in
select 
current_user AS "Current User",
session_user AS "Original User",
current_database() As "Active Database",
inet_client_addr() AS "My IP Address";


