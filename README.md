
# Celebrity Challenge : Find a celebrity

Small algorithm that looks for a celebrity or the best known person in the team within a group N of people

## Getting Started

An algorithm is created that, based on a database of people (Work Team), searches for the most famous person within them. He uses it by asking each team member questions, after collecting all the information determines the most frequent person as the team's celebrity.


### Installing

It is required the creation of a new Maven project in eclipse or to fetch the changes of this repository as importation of a new protection.

git@github.com:davinsong621/celebrityChallenge_project.git

Open Eclipse, with E-Git installed (you will quickly find out if you have an older version without it).
In Eclipse, choose ‘File’ (top left), then ‘Import…’
In the dialog that opens, choose ‘Git > Projects from Git’ and click ‘Next’
Click on ‘Clone URI’, then click ‘Next’
Here’s where some magic happens: on this next screen the details should already be filled out for you, as shown below. Ensure that your GitHub username and password are entered under ‘Authentication’, and click Next.
Import Projects from Git
For the rr-eclipse-git repo, there should only be one branch showing on the next screen, click ‘Next’
Choose a directory where the local copy of the repo should live, and click ‘Next’.
Tip: On my Windows computer, I have a ‘git’ directory in my home directory, where any git projects go. So with the repo name ‘rr-eclipse-git’, the directory here would be C:\Users\davinsong\git\rr-eclipse-git
On the next screen choose ‘Import as general project’, click ‘Next’
On the final screen, keep the default Project name, which should match the repo name (this is really recommended!!), and click ‘Finish’!!
That’s it! The project should now be on your local machine, and visible in Eclipse in the ‘Project Explorer’. If you don’t see this window on the left side, make it visible by clicking on ‘Window > Show View > Project Explorer’.

User and password will be send to your email

The functionality is initialized from the Main method of the App class that consumes resources of its Member model for completeness of information, to test the functionality you must initialize the development console view in the Selected IDE and press run, the system will inform console the most celebrity person found according to the database loaded in the data.properties file

## Running the tests

Located in data.properties in folder resources

### And coding style tests

In the data.properties file there are 5 people who make up a development team where one person (Emma) is the celebrity among them. The functionality asks each member their name, surname, role and if they know a celebrity person in the team (In case of the answer being "yes" the system asks who, the person most often determines as the celebrity)

## Deployment

for the defined scope no graphic interface is made.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Versioning

Alfa Version

## Authors

* **Davinson Gomez** - *Java Developer* - 

