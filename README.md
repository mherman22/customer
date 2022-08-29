# customer FeedBack App

This documentation has been hosted at <https://mherman22.github.io/customer/>

This webapp has been created with the sole aim of collecting the `Name` `Email address,Customer feedback and the GPS location of the respondent`.

To achieve the above, i have used Reactjs for the frontEnd and Java's Spring framework to comeup with the restful backend of the webapp.

To interract with the webapp, visit <https://mherman22.github.io/feedback/#/landingpage> to have a view of the frontend which i deployed using github pages.

However, to carryout CRUD operations on the web app, please clone the backend service using `git clone https://github.com/mherman22/customer` and setup `mysql` and then cd into the project folder by doing `cd customer` and then trigger `mvn spring-boot:run` which will run the server onto which the restful service can be accessed.

With the above step done, you can now go back to the web app and interract with it by;

- Adding customer details
- Then viewing the data in the datatable

## some screenshots

| CustomerPage Screenshot  | LandingPage Screenshot |
| ------------- | ------------- |
| ![CustomerPage](/Screenshot%20from%202022-08-29%2016-06-08.png "frontpage")  | ![LandingPage](/Screenshot%20from%202022-08-29%2016-21-04.png) |

# Read More to acquint yourself with the various tools used

## Tools used in development in the backend

- Java 8
- Spring Boot
- Mysql
- Lombok
- Hibernate JPA
- maven.

## Getting Started

### Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#using.devtools)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web)
- [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.jpa-and-spring-data)
- [Validation](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#io.validation)

### Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
- [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Validation](https://spring.io/guides/gs/validating-form-input/)

### How to Open the repo in an IDE?

Make sure you have java installed on your machine.

### For Windows

For Windows platform/machine, do the following;-
Download and install java 8.
Set environment variable path (JAVA_HOME).
Test to see if java has been installed. java -version.

### For Linux Platform

- Follow the steps at <https://mherman22.hashnode.dev/have-java-installed-on-ubuntu-easy-steps-i-followed> to achieve that.

### For Mac

- Follow the steps at <https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-macos.htm>

### How to Install Lombok in your IDE

Make sure your IDE has Lombok configured in it, if not do the following;-

- For Eclipse, follow the steps at <https://projectlombok.org/setup/eclipse>.
- For Intellijea, follow the steps at <https://projectlombok.org/setup/intellij>.
- For Netbeans, follow the steps at <https://projectlombok.org/setup/netbeans>.
- For Spring Tool Suite, follow the steps at <https://projectlombok.org/setup/eclipse>.
- For Visual Studio Code, follow the steps at <https://projectlombok.org/setup/vscode>.
- For JBoss Developer Studio, follow the steps at <https://projectlombok.org/setup/eclipse>

## Pull Requests? Wanna implement or make an addition or correct something?

- fork this repository.
- clone it onto your machine.
- make your changes and test them to ensure everything perfect.
- create a branch `git checkout -b branch-name`.
commit your changes to your branch using `git add .` and `git commit -m "commit message"`.
- pull from origin to ensure your local repo is in sync with upstream. use `git pull origin branch-name`
- push your changes using `git push origin branch-name`.
- create a pull request and give it a proper description stating clearly the changes you have added.

# CustomerFeedback Frontend

This is the frontend (ui) for the [Customer Feedback App](https://github.com/mherman22/customer) \
It was bootstrapped with [Create React App](https://github.com/facebook/create-react-app). I have not used any library in this project (yet).

Find the deployment at <https://mherman22.github.io/feedback/#/landingpage>

### Technologies used?

- axios
- sass
- Reactjs with jsx
- React-router-dom.
- [React Carbon Design System](https://react.carbondesignsystem.com)

### How to run this application?

- clone it onto your machine by running `git clone https://github.com/mherman22/feedback`.
- cd into `feedback`
- Open the command prompt or terminal.
- Run `npm install` to install the dependencies.
- Then run `npm start`.
- Open [http://localhost:3000](http://localhost:3000) to view it in your browser.\
The page will reload when you make changes. You may also see any lint errors in the console.

### To change the default port?

- For windows users, go to package.json file and replace [react-scripts start](https://github.com/mherman22/KTMInv-frontend/blob/05b97e64abc5bd904a4451d79e369c16affc5722/package.json#L15) with `"start": "set PORT=portNumberOfYourChoice && react-scripts start"`.
- For Linux users, do the above and replace with `"start": "PORT=portNumberOfYourChoice react-scripts start"` or `"start": "export PORT=portNumberOfYourChoice react-scripts start"`

### How to contribute to this project?

- fork this repository.
- clone it onto your machine by running `git clone https://github.com/mherman22/feedback`.
- make your changes and test them to ensure everything perfect.
- create a branch `git checkout -b branch-name`.
- commit your changes to your branch using `git add .` and  `git commit -m "commit message"`.
- pull from origin to ensure your local repo is in sync with upstream. use `git pull origin branch-name`
- push your changes using `git push origin branch-name`.
- create a pull request and give it a proper description stating clearly the changes you have added.

### In the project directory, you can run

- `npm start`: It runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.\
The page will reload when you make changes.\
You may also see any lint errors in the console.

- `npm test`: It launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

- `npm run build`: It builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.\
The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!\
See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### Learn More

To learn more about React, explore the following links;-

- You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started) and also check out the [React documentation](https://reactjs.org/).
- Code Splitting: This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting).
- Analyzing the Bundle Size: This section has moved here: [https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size](https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size).
- Making a Progressive Web App: This section has moved here: [https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app](https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app).
- Advanced Configuration: This section has moved here: [https://facebook.github.io/create-react-app/docs/advanced-configuration](https://facebook.github.io/create-react-app/docs/advanced-configuration).
- Deployment: This section has moved here: [https://facebook.github.io/create-react-app/docs/deployment](https://facebook.github.io/create-react-app/docs/deployment).
- `npm run build` fails to minify: This section has moved here: [https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify](https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify).

### Contributor(s)

- [mherman22](https://github.com/mherman22)
