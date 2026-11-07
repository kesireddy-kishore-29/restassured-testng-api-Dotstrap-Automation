# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 334 | `qa-992597d2-dec9-482c-88e3-b1307abfb155` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-6ef29460-c554-492f-a5c1-73cfe45a2ca7` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-2f5920cc-6d9d-4d28-82ae-55a28ed41423` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 45 | `qa-40ed20b2-aa2c-415d-9f98-35f0dffa2813` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-e1569bda-8a9e-4c13-9a1c-d8897aa9b4a1` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-b2a46cad-d21b-4de8-bf57-45eda76a2b0d` |
| 7 | `POST /v1/auth/token` | 200 | 17 | `qa-2d3066d9-95b3-4c02-8793-12c57be7b810` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-68319d27-87e0-41f1-b447-468cd5c230e8` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-2913fc77-d8cb-4968-9c2c-668dfebfd69a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-12134cc6-3a08-4329-b808-778e320ffd52` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-359fed02-48fc-45d7-bb18-bb87b2cb7de2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-992597d2-dec9-482c-88e3-b1307abfb155

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-992597d2-dec9-482c-88e3-b1307abfb155
Content-Type: application/json

--- request body ---
{"handle":"qa-81054af62cbb","displayName":"QA 81054af62cbb","password":"****","region":"eu"}

--- response: 201 in 334 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-992597d2-dec9-482c-88e3-b1307abfb155
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-81054af62cbb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb527ca9-83b4-46d9-9a91-dec4cd97f5cd","handle":"qa-81054af62cbb","displayName":"QA 81054af62cbb","region":"eu","role":"user","createdAt":"2026-11-02T09:39:10.481557752Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6ef29460-c554-492f-a5c1-73cfe45a2ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ef29460-c554-492f-a5c1-73cfe45a2ca7
Content-Type: application/json

--- request body ---
{"handle":"qa-a3ed2e11b702","displayName":"QA a3ed2e11b702","password":"****","region":"us"}

--- response: 201 in 36 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ef29460-c554-492f-a5c1-73cfe45a2ca7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-a3ed2e11b702
X-Served-Region: us
Content-Length: 181

{"id":"acc_879ee80f-b9d6-4700-8045-01ef158f84cf","handle":"qa-a3ed2e11b702","displayName":"QA a3ed2e11b702","region":"us","role":"user","createdAt":"2026-11-02T09:39:10.862830073Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2f5920cc-6d9d-4d28-82ae-55a28ed41423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f5920cc-6d9d-4d28-82ae-55a28ed41423
Content-Type: application/json

--- request body ---
{"handle":"qa-81054af62cbb","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f5920cc-6d9d-4d28-82ae-55a28ed41423
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb527ca9-83b4-46d9-9a91-dec4cd97f5cd"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-a3ed2e11b702
correlation: qa-40ed20b2-aa2c-415d-9f98-35f0dffa2813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40ed20b2-aa2c-415d-9f98-35f0dffa2813
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-40ed20b2-aa2c-415d-9f98-35f0dffa2813
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-a3ed2e11b702","displayName":"QA a3ed2e11b702","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-a3ed2e11b702
correlation: qa-e1569bda-8a9e-4c13-9a1c-d8897aa9b4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1569bda-8a9e-4c13-9a1c-d8897aa9b4a1
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1569bda-8a9e-4c13-9a1c-d8897aa9b4a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-a3ed2e11b702","displayName":"QA a3ed2e11b702","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-a3ed2e11b702
correlation: qa-b2a46cad-d21b-4de8-bf57-45eda76a2b0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2a46cad-d21b-4de8-bf57-45eda76a2b0d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2a46cad-d21b-4de8-bf57-45eda76a2b0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-a3ed2e11b702","displayName":"QA a3ed2e11b702","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-2d3066d9-95b3-4c02-8793-12c57be7b810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d3066d9-95b3-4c02-8793-12c57be7b810
Content-Type: application/json

--- request body ---
{"handle":"qa-a3ed2e11b702","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d3066d9-95b3-4c02-8793-12c57be7b810
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_879ee80f-b9d6-4700-8045-01ef158f84cf"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68319d27-87e0-41f1-b447-468cd5c230e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68319d27-87e0-41f1-b447-468cd5c230e8
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68319d27-87e0-41f1-b447-468cd5c230e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-2913fc77-d8cb-4968-9c2c-668dfebfd69a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2913fc77-d8cb-4968-9c2c-668dfebfd69a
Content-Type: application/json

--- request body ---
{"handle":"qa-a3ed2e11b702","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2913fc77-d8cb-4968-9c2c-668dfebfd69a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2913fc77-d8cb-4968-9c2c-668dfebfd69a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-12134cc6-3a08-4329-b808-778e320ffd52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12134cc6-3a08-4329-b808-778e320ffd52
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-12134cc6-3a08-4329-b808-778e320ffd52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-359fed02-48fc-45d7-bb18-bb87b2cb7de2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-359fed02-48fc-45d7-bb18-bb87b2cb7de2
Content-Type: application/json

--- request body ---
{"handle":"qa-81054af62cbb","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-359fed02-48fc-45d7-bb18-bb87b2cb7de2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-359fed02-48fc-45d7-bb18-bb87b2cb7de2"}
```
