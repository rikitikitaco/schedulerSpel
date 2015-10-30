# schedulerSpel
Showing defect where spring expressions are not parsed correctly with fixedRateString on the @Scheduled annotation.

Error is:
java.lang.IllegalStateException: Encountered invalid @Scheduled method 'doSomething': Invalid fixedRateString value "#{myApplicationProperties.fixedScheduleRate}" - cannot parse into integer
