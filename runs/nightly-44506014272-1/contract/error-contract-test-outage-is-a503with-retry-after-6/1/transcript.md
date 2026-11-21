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
| 1 | `POST /v1/accounts` | 201 | 78 | `qa-f36bdada-91c5-47aa-9cc3-16db55ea10e4` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-cb1558da-9907-4588-bb2e-4eff01aabc36` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-f9379866-6f07-432d-ba43-8759afc4969b` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-100aca5f-dc9b-46af-ae7a-a0a3de808446` |
| 5 | `POST /v1/conversations` | 503 | 14 | `qa-766d5a41-258e-438c-8398-91d8f41037b9` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-f89b4084-a037-4172-9049-e4a4279d9707` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d42f176d-3554-4ee0-9962-e3ca9689b502` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-fb910319-e77b-4d6a-a2d2-fd05e493a8db` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-dce3076d-4bc0-4024-90a4-140ef21273ab` |
| 10 | `POST /v1/auth/token` | 401 | 31 | `qa-8ba0b683-9667-4b22-8c87-f1dea32bb989` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f36bdada-91c5-47aa-9cc3-16db55ea10e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f36bdada-91c5-47aa-9cc3-16db55ea10e4
Content-Type: application/json

--- request body ---
{"handle":"qa-8c79b172ef50","displayName":"QA 8c79b172ef50","password":"****","region":"eu"}

--- response: 201 in 78 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f36bdada-91c5-47aa-9cc3-16db55ea10e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 7
Location: /v1/accounts/qa-8c79b172ef50
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43a196fa-1667-44ba-a9c2-ca7e14ad4e19","handle":"qa-8c79b172ef50","displayName":"QA 8c79b172ef50","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.339324480Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cb1558da-9907-4588-bb2e-4eff01aabc36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb1558da-9907-4588-bb2e-4eff01aabc36
Content-Type: application/json

--- request body ---
{"handle":"qa-32b74df27814","displayName":"QA 32b74df27814","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb1558da-9907-4588-bb2e-4eff01aabc36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 7
Location: /v1/accounts/qa-32b74df27814
X-Served-Region: eu
Content-Length: 181

{"id":"acc_832f4ff9-c6e5-4e2e-ba68-d0a311d7c007","handle":"qa-32b74df27814","displayName":"QA 32b74df27814","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.464236693Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f9379866-6f07-432d-ba43-8759afc4969b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9379866-6f07-432d-ba43-8759afc4969b
Content-Type: application/json

--- request body ---
{"handle":"qa-8c79b172ef50","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9379866-6f07-432d-ba43-8759afc4969b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43a196fa-1667-44ba-a9c2-ca7e14ad4e19"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-100aca5f-dc9b-46af-ae7a-a0a3de808446

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-100aca5f-dc9b-46af-ae7a-a0a3de808446
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-32b74df27814","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-100aca5f-dc9b-46af-ae7a-a0a3de808446
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
Location: /v1/conversations/cnv_80313555-3fa7-4fd2-958f-804431dc602c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_80313555-3fa7-4fd2-958f-804431dc602c","subject":"Error contract","status":"open","region":"eu","participants":["qa-8c79b172ef50","qa-32b74df27814"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.546636362Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-766d5a41-258e-438c-8398-91d8f41037b9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0ea5a43e-3759-4e07-bab5-170b1c8a20fa
X-Correlation-Id: qa-766d5a41-258e-438c-8398-91d8f41037b9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8c79b172ef50","subject":"Probe","message":"Hi"}

--- response: 503 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-766d5a41-258e-438c-8398-91d8f41037b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-766d5a41-258e-438c-8398-91d8f41037b9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f89b4084-a037-4172-9049-e4a4279d9707

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f89b4084-a037-4172-9049-e4a4279d9707
Content-Type: application/json

--- request body ---
{"handle":"qa-32b74df27814","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f89b4084-a037-4172-9049-e4a4279d9707
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_832f4ff9-c6e5-4e2e-ba68-d0a311d7c007"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d42f176d-3554-4ee0-9962-e3ca9689b502

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d42f176d-3554-4ee0-9962-e3ca9689b502
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d42f176d-3554-4ee0-9962-e3ca9689b502
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
correlation: qa-fb910319-e77b-4d6a-a2d2-fd05e493a8db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb910319-e77b-4d6a-a2d2-fd05e493a8db
Content-Type: application/json

--- request body ---
{"handle":"qa-32b74df27814","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb910319-e77b-4d6a-a2d2-fd05e493a8db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb910319-e77b-4d6a-a2d2-fd05e493a8db"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dce3076d-4bc0-4024-90a4-140ef21273ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dce3076d-4bc0-4024-90a4-140ef21273ab
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dce3076d-4bc0-4024-90a4-140ef21273ab
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
correlation: qa-8ba0b683-9667-4b22-8c87-f1dea32bb989

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ba0b683-9667-4b22-8c87-f1dea32bb989
Content-Type: application/json

--- request body ---
{"handle":"qa-8c79b172ef50","password":"****"}

--- response: 401 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ba0b683-9667-4b22-8c87-f1dea32bb989
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ba0b683-9667-4b22-8c87-f1dea32bb989"}
```
