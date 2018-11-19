# Thoth Boot Properties

Research on how Spring Boot handles properties files.

## thoth-boot-properties-01-it_works

This uses an `application.properties` and `application-mike.properties` file to
research overriding properties with profiles. This seems to work OK with 
Spring Boot out of the box, however, I couldn't get this to work successfully
with a non-boot app.

In NetBeans, right click the `thoth-boot-properties-01-it_works` project and
select "Run Maven" > "Spring boot run". This will run with the `default` profile.
Then try "Run Maven" > "Spring boot run (mike)". This will run with the 
`mike` profile.  In the output of the two runs, the `Application name (common)`
value will remain the same, but the `Personal name (profile)` value will
be different.