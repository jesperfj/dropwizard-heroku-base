# Dropwizard Heroku Baseline

I've loved the approach of Coda Hale's [DropWizard](http://dropwizard.io) project since it was first launched and it's great to see its continued growth in the community. I haven't looked at the project in a long time and decided I wanted to create a new baseline app setup for DropWizard on Heroku. So here it is.

## Structure

* Resources are mounted on /api/* instead of root
* Static files are served out of the assets directory in the root (not from the resources directory in the jar). No rebuild/restart required when asset files are updated
* index.html is served as default on /
* A sample resource and representation, hello-world, is included
* Procfile takes care of configuring $PORT as port
* jar file is always named 'app.jar' (no project name or version name) so this project can be forked and renamed in pom.xml without having to update Procfile. 
* Similarly, the YAML configuration file is generically named 'app.yml'.
