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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-4d70bb51-0826-4bee-87e2-15abbb2cb57e` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-5d31f929-445d-4c5c-bcc4-b60e711c4dd5` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-323c7ed8-2d21-4e2a-8c83-74aca1352013` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-dccb9ee2-73fd-421b-aae6-58b9891f12cc` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-4e94a0bc-8455-448d-96c5-81046144553e` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-8ac687d7-4894-4427-b5c7-e9d248254ed0` |
| 7 | `POST /v1/auth/token` | 200 | 14 | `qa-7f481215-fc82-4aeb-9102-0ff8161f4885` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-0b89831d-2661-4db5-bd6a-dc423261360f` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-bf2dd8d5-fe2d-4cf4-b092-1c998b3a4b86` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-05e9fce9-44f0-4558-b070-f011f99586df` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-ab240441-1289-45e7-a4b6-61ea6998414f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4d70bb51-0826-4bee-87e2-15abbb2cb57e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d70bb51-0826-4bee-87e2-15abbb2cb57e
Content-Type: application/json

--- request body ---
{"handle":"qa-a60a9271f294","displayName":"QA a60a9271f294","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d70bb51-0826-4bee-87e2-15abbb2cb57e
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
Location: /v1/accounts/qa-a60a9271f294
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ef637a41-da9c-42ea-84a1-ecd864a97b70","handle":"qa-a60a9271f294","displayName":"QA a60a9271f294","region":"eu","role":"user","createdAt":"2026-11-08T09:09:15.509180005Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5d31f929-445d-4c5c-bcc4-b60e711c4dd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d31f929-445d-4c5c-bcc4-b60e711c4dd5
Content-Type: application/json

--- request body ---
{"handle":"qa-117c9f527fcc","displayName":"QA 117c9f527fcc","password":"****","region":"us"}

--- response: 201 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d31f929-445d-4c5c-bcc4-b60e711c4dd5
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
Location: /v1/accounts/qa-117c9f527fcc
X-Served-Region: us
Content-Length: 181

{"id":"acc_51efa839-d348-4bd7-ad3d-3f7b803212fb","handle":"qa-117c9f527fcc","displayName":"QA 117c9f527fcc","region":"us","role":"user","createdAt":"2026-11-08T09:09:15.528195546Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-323c7ed8-2d21-4e2a-8c83-74aca1352013

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-323c7ed8-2d21-4e2a-8c83-74aca1352013
Content-Type: application/json

--- request body ---
{"handle":"qa-a60a9271f294","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-323c7ed8-2d21-4e2a-8c83-74aca1352013
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ef637a41-da9c-42ea-84a1-ecd864a97b70"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-117c9f527fcc
correlation: qa-dccb9ee2-73fd-421b-aae6-58b9891f12cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dccb9ee2-73fd-421b-aae6-58b9891f12cc
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-dccb9ee2-73fd-421b-aae6-58b9891f12cc
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

{"handle":"qa-117c9f527fcc","displayName":"QA 117c9f527fcc","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-117c9f527fcc
correlation: qa-4e94a0bc-8455-448d-96c5-81046144553e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e94a0bc-8455-448d-96c5-81046144553e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e94a0bc-8455-448d-96c5-81046144553e
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

{"handle":"qa-117c9f527fcc","displayName":"QA 117c9f527fcc","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-117c9f527fcc
correlation: qa-8ac687d7-4894-4427-b5c7-e9d248254ed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ac687d7-4894-4427-b5c7-e9d248254ed0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ac687d7-4894-4427-b5c7-e9d248254ed0
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

{"handle":"qa-117c9f527fcc","displayName":"QA 117c9f527fcc","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-7f481215-fc82-4aeb-9102-0ff8161f4885

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f481215-fc82-4aeb-9102-0ff8161f4885
Content-Type: application/json

--- request body ---
{"handle":"qa-117c9f527fcc","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f481215-fc82-4aeb-9102-0ff8161f4885
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51efa839-d348-4bd7-ad3d-3f7b803212fb"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b89831d-2661-4db5-bd6a-dc423261360f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b89831d-2661-4db5-bd6a-dc423261360f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b89831d-2661-4db5-bd6a-dc423261360f
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
correlation: qa-bf2dd8d5-fe2d-4cf4-b092-1c998b3a4b86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf2dd8d5-fe2d-4cf4-b092-1c998b3a4b86
Content-Type: application/json

--- request body ---
{"handle":"qa-117c9f527fcc","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf2dd8d5-fe2d-4cf4-b092-1c998b3a4b86
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf2dd8d5-fe2d-4cf4-b092-1c998b3a4b86"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05e9fce9-44f0-4558-b070-f011f99586df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05e9fce9-44f0-4558-b070-f011f99586df
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05e9fce9-44f0-4558-b070-f011f99586df
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
correlation: qa-ab240441-1289-45e7-a4b6-61ea6998414f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab240441-1289-45e7-a4b6-61ea6998414f
Content-Type: application/json

--- request body ---
{"handle":"qa-a60a9271f294","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab240441-1289-45e7-a4b6-61ea6998414f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ab240441-1289-45e7-a4b6-61ea6998414f"}
```
