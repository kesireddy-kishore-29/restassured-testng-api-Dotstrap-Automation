# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-5ce4cdd7-4649-4cef-b837-7d1023065bf6` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-1cea2bd8-23ca-4d6a-8fc6-ff54deaca114` |
| 3 | `POST /v1/auth/token` | 200 | 63 | `qa-618c81e1-123f-4c62-8353-689d27448e8f` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-5da0bdb6-e96d-4770-9eaa-403768c0539f` |
| 5 | `POST /v1/conversations` | 503 | 13 | `qa-0a65de23-1be7-41e0-936f-6507f54dc6d2` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-25b2c250-2f7d-4672-b434-7881380898b2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-dfdf9f8a-f596-462f-9a4e-a791d515368c` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-1ccb04e9-22fa-4c73-abc6-b87f9a45a0ff` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-bb5286d8-62f6-442c-9bbb-a6b48f9deceb` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-39cd04ba-c6fb-401f-aee4-5201e25832af` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ce4cdd7-4649-4cef-b837-7d1023065bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ce4cdd7-4649-4cef-b837-7d1023065bf6
Content-Type: application/json

--- request body ---
{"handle":"qa-1c164e92a1d6","displayName":"QA 1c164e92a1d6","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ce4cdd7-4649-4cef-b837-7d1023065bf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-1c164e92a1d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90a12ec5-083e-43de-8eee-b164b52359cf","handle":"qa-1c164e92a1d6","displayName":"QA 1c164e92a1d6","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.409747248Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1cea2bd8-23ca-4d6a-8fc6-ff54deaca114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cea2bd8-23ca-4d6a-8fc6-ff54deaca114
Content-Type: application/json

--- request body ---
{"handle":"qa-832f267dbc44","displayName":"QA 832f267dbc44","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cea2bd8-23ca-4d6a-8fc6-ff54deaca114
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-832f267dbc44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8090d93-dbf7-4f9f-9988-cc3f26aa731d","handle":"qa-832f267dbc44","displayName":"QA 832f267dbc44","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.453067245Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-618c81e1-123f-4c62-8353-689d27448e8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-618c81e1-123f-4c62-8353-689d27448e8f
Content-Type: application/json

--- request body ---
{"handle":"qa-1c164e92a1d6","password":"****"}

--- response: 200 in 63 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-618c81e1-123f-4c62-8353-689d27448e8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90a12ec5-083e-43de-8eee-b164b52359cf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5da0bdb6-e96d-4770-9eaa-403768c0539f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da0bdb6-e96d-4770-9eaa-403768c0539f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-832f267dbc44","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-5da0bdb6-e96d-4770-9eaa-403768c0539f
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
Location: /v1/conversations/cnv_75921c44-028b-468e-a73b-2594472bbc3c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_75921c44-028b-468e-a73b-2594472bbc3c","subject":"Error contract","status":"open","region":"eu","participants":["qa-1c164e92a1d6","qa-832f267dbc44"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.550262082Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0a65de23-1be7-41e0-936f-6507f54dc6d2

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4a41cd0b-caf7-4b14-a077-89c6b83e8a7d
X-Correlation-Id: qa-0a65de23-1be7-41e0-936f-6507f54dc6d2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1c164e92a1d6","subject":"Probe","message":"Hi"}

--- response: 503 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a65de23-1be7-41e0-936f-6507f54dc6d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-0a65de23-1be7-41e0-936f-6507f54dc6d2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-25b2c250-2f7d-4672-b434-7881380898b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25b2c250-2f7d-4672-b434-7881380898b2
Content-Type: application/json

--- request body ---
{"handle":"qa-832f267dbc44","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-25b2c250-2f7d-4672-b434-7881380898b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a8090d93-dbf7-4f9f-9988-cc3f26aa731d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dfdf9f8a-f596-462f-9a4e-a791d515368c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfdf9f8a-f596-462f-9a4e-a791d515368c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dfdf9f8a-f596-462f-9a4e-a791d515368c
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-1ccb04e9-22fa-4c73-abc6-b87f9a45a0ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ccb04e9-22fa-4c73-abc6-b87f9a45a0ff
Content-Type: application/json

--- request body ---
{"handle":"qa-832f267dbc44","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ccb04e9-22fa-4c73-abc6-b87f9a45a0ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ccb04e9-22fa-4c73-abc6-b87f9a45a0ff"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb5286d8-62f6-442c-9bbb-a6b48f9deceb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb5286d8-62f6-442c-9bbb-a6b48f9deceb
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb5286d8-62f6-442c-9bbb-a6b48f9deceb
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-39cd04ba-c6fb-401f-aee4-5201e25832af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39cd04ba-c6fb-401f-aee4-5201e25832af
Content-Type: application/json

--- request body ---
{"handle":"qa-1c164e92a1d6","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39cd04ba-c6fb-401f-aee4-5201e25832af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39cd04ba-c6fb-401f-aee4-5201e25832af"}
```
