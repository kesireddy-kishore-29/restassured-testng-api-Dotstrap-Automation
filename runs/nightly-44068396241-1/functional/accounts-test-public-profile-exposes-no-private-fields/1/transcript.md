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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-924f0679-d18d-4a53-98e0-6a22a3c87bf0` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-ae2dbe1d-52e3-4a89-8d1a-5174d8a3ad72` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-2463010d-e280-41b3-986e-1fa5ce0f5157` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-ba3c4417-0142-4070-8486-7df51bd6c663` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-0aad8835-28db-4312-bb42-5b7701d5e2a4` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-da102453-a6a3-4147-96ca-28347a0e57be` |
| 7 | `POST /v1/auth/token` | 200 | 19 | `qa-741a363a-bd79-44f0-9cb1-ea166128e890` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-0b17f20a-4cdc-4f44-a2be-59f7401ffcdf` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-e97eebb9-ba78-4189-882a-940c35bca178` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-25841646-54c8-4028-abc3-e1eb66e486b1` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-1a69e330-9d61-4b15-ae7a-48c087d52be4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-924f0679-d18d-4a53-98e0-6a22a3c87bf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-924f0679-d18d-4a53-98e0-6a22a3c87bf0
Content-Type: application/json

--- request body ---
{"handle":"qa-2d8f4c84d28f","displayName":"QA 2d8f4c84d28f","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-924f0679-d18d-4a53-98e0-6a22a3c87bf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-2d8f4c84d28f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c5957cd-7285-47c2-88a9-59907cb11215","handle":"qa-2d8f4c84d28f","displayName":"QA 2d8f4c84d28f","region":"eu","role":"user","createdAt":"2026-11-17T10:50:11.104366045Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ae2dbe1d-52e3-4a89-8d1a-5174d8a3ad72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae2dbe1d-52e3-4a89-8d1a-5174d8a3ad72
Content-Type: application/json

--- request body ---
{"handle":"qa-11b77aab8eb0","displayName":"QA 11b77aab8eb0","password":"****","region":"us"}

--- response: 201 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae2dbe1d-52e3-4a89-8d1a-5174d8a3ad72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-11b77aab8eb0
X-Served-Region: us
Content-Length: 181

{"id":"acc_2b8747f7-cb25-40ac-844d-84a463cbe77d","handle":"qa-11b77aab8eb0","displayName":"QA 11b77aab8eb0","region":"us","role":"user","createdAt":"2026-11-17T10:50:11.130713086Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2463010d-e280-41b3-986e-1fa5ce0f5157

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2463010d-e280-41b3-986e-1fa5ce0f5157
Content-Type: application/json

--- request body ---
{"handle":"qa-2d8f4c84d28f","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2463010d-e280-41b3-986e-1fa5ce0f5157
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c5957cd-7285-47c2-88a9-59907cb11215"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-11b77aab8eb0
correlation: qa-ba3c4417-0142-4070-8486-7df51bd6c663

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba3c4417-0142-4070-8486-7df51bd6c663
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba3c4417-0142-4070-8486-7df51bd6c663
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

{"handle":"qa-11b77aab8eb0","displayName":"QA 11b77aab8eb0","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-11b77aab8eb0
correlation: qa-0aad8835-28db-4312-bb42-5b7701d5e2a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aad8835-28db-4312-bb42-5b7701d5e2a4
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0aad8835-28db-4312-bb42-5b7701d5e2a4
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

{"handle":"qa-11b77aab8eb0","displayName":"QA 11b77aab8eb0","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-11b77aab8eb0
correlation: qa-da102453-a6a3-4147-96ca-28347a0e57be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da102453-a6a3-4147-96ca-28347a0e57be
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-da102453-a6a3-4147-96ca-28347a0e57be
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

{"handle":"qa-11b77aab8eb0","displayName":"QA 11b77aab8eb0","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-741a363a-bd79-44f0-9cb1-ea166128e890

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-741a363a-bd79-44f0-9cb1-ea166128e890
Content-Type: application/json

--- request body ---
{"handle":"qa-11b77aab8eb0","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-741a363a-bd79-44f0-9cb1-ea166128e890
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2b8747f7-cb25-40ac-844d-84a463cbe77d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b17f20a-4cdc-4f44-a2be-59f7401ffcdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b17f20a-4cdc-4f44-a2be-59f7401ffcdf
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b17f20a-4cdc-4f44-a2be-59f7401ffcdf
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
correlation: qa-e97eebb9-ba78-4189-882a-940c35bca178

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e97eebb9-ba78-4189-882a-940c35bca178
Content-Type: application/json

--- request body ---
{"handle":"qa-11b77aab8eb0","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e97eebb9-ba78-4189-882a-940c35bca178
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e97eebb9-ba78-4189-882a-940c35bca178"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25841646-54c8-4028-abc3-e1eb66e486b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25841646-54c8-4028-abc3-e1eb66e486b1
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25841646-54c8-4028-abc3-e1eb66e486b1
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
correlation: qa-1a69e330-9d61-4b15-ae7a-48c087d52be4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a69e330-9d61-4b15-ae7a-48c087d52be4
Content-Type: application/json

--- request body ---
{"handle":"qa-2d8f4c84d28f","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a69e330-9d61-4b15-ae7a-48c087d52be4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a69e330-9d61-4b15-ae7a-48c087d52be4"}
```
