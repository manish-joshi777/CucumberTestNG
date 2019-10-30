$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/media/manish/data2/IJ/IJ_Projects/CucumberTestNG/src/main/java/feature/freeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 763648,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate free CRM HomePage",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user login in app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate homepage title",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDefinition.user_open_browser()"
});
formatter.result({
  "duration": 4897813875,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 48213417,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDefinition.user_login_in_app()"
});
formatter.result({
  "duration": 570282123,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDefinition.validate_homepage_title()"
});
formatter.result({
  "duration": 11461630,
  "status": "passed"
});
formatter.after({
  "duration": 75069622,
  "status": "passed"
});
});