# Travel Policy UI Tests

UI end-to-end test for an insurer's online travel-insurance purchase wizard.

**What it checks:** opens the travel-policy page, starts a first-time purchase, picks a destination, selects departure/return dates in the date picker, verifies the trip-length summary is shown, and confirms the wizard moves on to the travellers step.

**Tools:** Java, Selenium WebDriver 4, TestNG, Maven, Chrome

## Run it

Needs JDK 11+, Maven and Chrome (Selenium Manager fetches the driver).

```bash
cd travel-policy-tests
mvn test -Dtest=TravelPolicyTest
```
