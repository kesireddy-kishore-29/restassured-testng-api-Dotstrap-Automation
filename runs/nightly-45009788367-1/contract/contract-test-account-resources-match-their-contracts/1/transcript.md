# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-b2b9cad4-3949-44a0-8d5a-e5beeff14a75` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-05d9772a-20e4-4c86-ab72-c224a3c63ce1` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-9d7c4f4c-d396-48e9-8db3-bfc3c2a3d05e` |
| 4 | `POST /v1/auth/token` | 200 | 13 | `qa-22f16a48-4cbe-4d7a-a0f9-c6bc4a2fb77f` |
| 5 | `GET /v1/accounts/me` | 200 | 6 | `qa-caf1d122-ff88-4249-9c57-72e9546486f8` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 14 | `qa-fc5b7eb1-fc87-41df-bb72-8eb94a0e42f3` |
| 7 | `POST /v1/auth/token` | 200 | 9 | `qa-92ae45c8-f4be-4f1f-bf0c-510553618c1f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-71279c2f-c2b6-4b7a-be91-f35993f1c31f` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-62ab12d0-6730-4a0d-ae10-bcc2f3e00108` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-ec83e401-ad41-4667-9afa-3a3c58ddddb7` |
| 11 | `POST /v1/auth/token` | 401 | 3 | `qa-b1fc33a3-523f-4383-afff-eb2aa01892b6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b2b9cad4-3949-44a0-8d5a-e5beeff14a75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2b9cad4-3949-44a0-8d5a-e5beeff14a75
Content-Type: application/json

--- request body ---
{"handle":"qa-3df629d72f79","displayName":"QA 3df629d72f79","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2b9cad4-3949-44a0-8d5a-e5beeff14a75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-3df629d72f79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_baed7d46-956e-4676-b597-3edbb116448a","handle":"qa-3df629d72f79","displayName":"QA 3df629d72f79","region":"eu","role":"user","createdAt":"2026-11-22T09:54:46.532654848Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-05d9772a-20e4-4c86-ab72-c224a3c63ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05d9772a-20e4-4c86-ab72-c224a3c63ce1
Content-Type: application/json

--- request body ---
{"handle":"qa-64815563a3dc","displayName":"QA 64815563a3dc","password":"****","region":"us"}

--- response: 201 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-05d9772a-20e4-4c86-ab72-c224a3c63ce1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-64815563a3dc
X-Served-Region: us
Content-Length: 181

{"id":"acc_5fc6ebbb-bac7-43f3-adb6-fa1b6cc0deb0","handle":"qa-64815563a3dc","displayName":"QA 64815563a3dc","region":"us","role":"user","createdAt":"2026-11-22T09:54:46.547485047Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9d7c4f4c-d396-48e9-8db3-bfc3c2a3d05e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d7c4f4c-d396-48e9-8db3-bfc3c2a3d05e
Content-Type: application/json

--- request body ---
{"handle":"qa-3df629d72f79","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d7c4f4c-d396-48e9-8db3-bfc3c2a3d05e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_baed7d46-956e-4676-b597-3edbb116448a"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-22f16a48-4cbe-4d7a-a0f9-c6bc4a2fb77f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22f16a48-4cbe-4d7a-a0f9-c6bc4a2fb77f
Content-Type: application/json

--- request body ---
{"handle":"qa-3df629d72f79","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-22f16a48-4cbe-4d7a-a0f9-c6bc4a2fb77f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_baed7d46-956e-4676-b597-3edbb116448a"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-caf1d122-ff88-4249-9c57-72e9546486f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caf1d122-ff88-4249-9c57-72e9546486f8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-caf1d122-ff88-4249-9c57-72e9546486f8
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
Content-Length: 181

{"id":"acc_baed7d46-956e-4676-b597-3edbb116448a","handle":"qa-3df629d72f79","displayName":"QA 3df629d72f79","region":"eu","role":"user","createdAt":"2026-11-22T09:54:46.532654848Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-64815563a3dc
correlation: qa-fc5b7eb1-fc87-41df-bb72-8eb94a0e42f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc5b7eb1-fc87-41df-bb72-8eb94a0e42f3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc5b7eb1-fc87-41df-bb72-8eb94a0e42f3
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

{"handle":"qa-64815563a3dc","displayName":"QA 64815563a3dc","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-92ae45c8-f4be-4f1f-bf0c-510553618c1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92ae45c8-f4be-4f1f-bf0c-510553618c1f
Content-Type: application/json

--- request body ---
{"handle":"qa-64815563a3dc","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-92ae45c8-f4be-4f1f-bf0c-510553618c1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5fc6ebbb-bac7-43f3-adb6-fa1b6cc0deb0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71279c2f-c2b6-4b7a-be91-f35993f1c31f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71279c2f-c2b6-4b7a-be91-f35993f1c31f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71279c2f-c2b6-4b7a-be91-f35993f1c31f
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
correlation: qa-62ab12d0-6730-4a0d-ae10-bcc2f3e00108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62ab12d0-6730-4a0d-ae10-bcc2f3e00108
Content-Type: application/json

--- request body ---
{"handle":"qa-64815563a3dc","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62ab12d0-6730-4a0d-ae10-bcc2f3e00108
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62ab12d0-6730-4a0d-ae10-bcc2f3e00108"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec83e401-ad41-4667-9afa-3a3c58ddddb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec83e401-ad41-4667-9afa-3a3c58ddddb7
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec83e401-ad41-4667-9afa-3a3c58ddddb7
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-b1fc33a3-523f-4383-afff-eb2aa01892b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1fc33a3-523f-4383-afff-eb2aa01892b6
Content-Type: application/json

--- request body ---
{"handle":"qa-3df629d72f79","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1fc33a3-523f-4383-afff-eb2aa01892b6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1fc33a3-523f-4383-afff-eb2aa01892b6"}
```
