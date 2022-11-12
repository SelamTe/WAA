# Lab 6

- Summary

Spring Security and JWT were used to offer token-based authentication and authorisation in this spring-boot-built application.

-For optimal security, we added several items and gave the Refresh Token a different value and expiration time than the Access Token:

-To the application's settings, add secret keys.
-To prevent utilizing an access token as a refresh token, use separate secret keys for refresh and access tokens.
-We can revoke all active refresh tokens for specific users if someone gains access to the refresh token or force all users to log out if necessary by storing refresh tokens in the database. The app will remove the expired refresh token from the database and prompt the user to re-login if the user attempts to refresh his access token.
-The app will remove the expired refresh token from the database and prompt the user to re-login if the user attempts to refresh his access token using it.
-The previous access token need not be sent in order to refresh the access token.The token for the refresh will suffice.

- Group Members:

- Selam Tesfaalem
- Sirak  Abai
- Yemane  Berhane

