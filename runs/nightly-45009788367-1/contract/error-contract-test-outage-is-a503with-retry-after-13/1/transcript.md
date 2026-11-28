# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-abe5cee2-3c4c-437c-b191-cf8a9c3fe65a` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-712a6236-cbe1-4fca-b7a6-8ec998ac3df8` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-d1ad87d9-635d-47ec-b08a-bf8a33dfd635` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-e82627fc-b820-4b54-a33f-7088ba43f380` |
| 5 | `GET /v1/credits/balance` | 503 | 9 | `qa-65cd2d76-31e2-470c-b1f4-0600a84d543d` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-0a27bfe2-90ad-4c50-b679-56e52b3b5f16` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3a781848-251c-4eda-a780-f00ed031816f` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-6af15037-9c79-4842-967e-855a85810e5a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e40ce6e6-f098-4a08-b3e0-c04d03032dd9` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-b5f73e41-fb63-4a2d-8f19-f4a0be9f222d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-abe5cee2-3c4c-437c-b191-cf8a9c3fe65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abe5cee2-3c4c-437c-b191-cf8a9c3fe65a
Content-Type: application/json

--- request body ---
{"handle":"qa-6a120ab56db3","displayName":"QA 6a120ab56db3","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-abe5cee2-3c4c-437c-b191-cf8a9c3fe65a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Location: /v1/accounts/qa-6a120ab56db3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_994c4376-640b-4025-9978-cb448936cac8","handle":"qa-6a120ab56db3","displayName":"QA 6a120ab56db3","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.011208387Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-712a6236-cbe1-4fca-b7a6-8ec998ac3df8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-712a6236-cbe1-4fca-b7a6-8ec998ac3df8
Content-Type: application/json

--- request body ---
{"handle":"qa-6b8f3c1c2f70","displayName":"QA 6b8f3c1c2f70","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-712a6236-cbe1-4fca-b7a6-8ec998ac3df8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Location: /v1/accounts/qa-6b8f3c1c2f70
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4fefe8b5-2571-478e-9b3a-c94ec5ed4664","handle":"qa-6b8f3c1c2f70","displayName":"QA 6b8f3c1c2f70","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.038762159Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d1ad87d9-635d-47ec-b08a-bf8a33dfd635

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1ad87d9-635d-47ec-b08a-bf8a33dfd635
Content-Type: application/json

--- request body ---
{"handle":"qa-6a120ab56db3","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1ad87d9-635d-47ec-b08a-bf8a33dfd635
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_994c4376-640b-4025-9978-cb448936cac8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e82627fc-b820-4b54-a33f-7088ba43f380

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e82627fc-b820-4b54-a33f-7088ba43f380
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6b8f3c1c2f70","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e82627fc-b820-4b54-a33f-7088ba43f380
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
Location: /v1/conversations/cnv_2810224f-f050-486f-a47f-ced89b5b71bc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2810224f-f050-486f-a47f-ced89b5b71bc","subject":"Error contract","status":"open","region":"eu","participants":["qa-6a120ab56db3","qa-6b8f3c1c2f70"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.117780892Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-65cd2d76-31e2-470c-b1f4-0600a84d543d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f0ed410f-cf36-448b-b16d-d9d655fb0a2e
X-Correlation-Id: qa-65cd2d76-31e2-470c-b1f4-0600a84d543d
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65cd2d76-31e2-470c-b1f4-0600a84d543d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-65cd2d76-31e2-470c-b1f4-0600a84d543d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0a27bfe2-90ad-4c50-b679-56e52b3b5f16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a27bfe2-90ad-4c50-b679-56e52b3b5f16
Content-Type: application/json

--- request body ---
{"handle":"qa-6b8f3c1c2f70","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a27bfe2-90ad-4c50-b679-56e52b3b5f16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4fefe8b5-2571-478e-9b3a-c94ec5ed4664"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a781848-251c-4eda-a780-f00ed031816f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a781848-251c-4eda-a780-f00ed031816f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a781848-251c-4eda-a780-f00ed031816f
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
correlation: qa-6af15037-9c79-4842-967e-855a85810e5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6af15037-9c79-4842-967e-855a85810e5a
Content-Type: application/json

--- request body ---
{"handle":"qa-6b8f3c1c2f70","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6af15037-9c79-4842-967e-855a85810e5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6af15037-9c79-4842-967e-855a85810e5a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e40ce6e6-f098-4a08-b3e0-c04d03032dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e40ce6e6-f098-4a08-b3e0-c04d03032dd9
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e40ce6e6-f098-4a08-b3e0-c04d03032dd9
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
correlation: qa-b5f73e41-fb63-4a2d-8f19-f4a0be9f222d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5f73e41-fb63-4a2d-8f19-f4a0be9f222d
Content-Type: application/json

--- request body ---
{"handle":"qa-6a120ab56db3","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5f73e41-fb63-4a2d-8f19-f4a0be9f222d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5f73e41-fb63-4a2d-8f19-f4a0be9f222d"}
```
