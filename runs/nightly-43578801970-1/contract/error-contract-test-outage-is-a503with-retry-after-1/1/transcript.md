# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-1f9a5e49-2138-4190-8dc7-e5aa6b9dd53b` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-2393d0c0-1522-4dbd-91ab-b168e72548f2` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-bfabace1-673a-4507-af3a-a6a91a7cd90f` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-8e5eb106-d980-400f-bc49-38442d60cf75` |
| 5 | `POST /v1/accounts` | 503 | 27 | `qa-b7294cfa-2c28-4c9f-bad1-0cf6438ac413` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-47911e4b-87f5-4eea-bad0-4bd6b3768972` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-3083e1a3-40e6-4182-9465-58e0d27a8909` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-e476c87c-4e7e-4800-808d-3ae2f9f72a7e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-cfbfdc72-e831-490e-8512-a5844ab88d0f` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-5120cfe4-0068-4bb2-92b3-4134a94e1503` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1f9a5e49-2138-4190-8dc7-e5aa6b9dd53b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f9a5e49-2138-4190-8dc7-e5aa6b9dd53b
Content-Type: application/json

--- request body ---
{"handle":"qa-77c3176b335c","displayName":"QA 77c3176b335c","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f9a5e49-2138-4190-8dc7-e5aa6b9dd53b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-77c3176b335c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a459f3b-83d6-4727-925b-6615a58d0fbc","handle":"qa-77c3176b335c","displayName":"QA 77c3176b335c","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.965734229Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2393d0c0-1522-4dbd-91ab-b168e72548f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2393d0c0-1522-4dbd-91ab-b168e72548f2
Content-Type: application/json

--- request body ---
{"handle":"qa-ff8418f974bd","displayName":"QA ff8418f974bd","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2393d0c0-1522-4dbd-91ab-b168e72548f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-ff8418f974bd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a388d5c0-6d05-4b3e-8d09-369a39bafa1d","handle":"qa-ff8418f974bd","displayName":"QA ff8418f974bd","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.026682456Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bfabace1-673a-4507-af3a-a6a91a7cd90f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfabace1-673a-4507-af3a-a6a91a7cd90f
Content-Type: application/json

--- request body ---
{"handle":"qa-77c3176b335c","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfabace1-673a-4507-af3a-a6a91a7cd90f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a459f3b-83d6-4727-925b-6615a58d0fbc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8e5eb106-d980-400f-bc49-38442d60cf75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e5eb106-d980-400f-bc49-38442d60cf75
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ff8418f974bd","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e5eb106-d980-400f-bc49-38442d60cf75
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
Location: /v1/conversations/cnv_bc257e90-302d-4f32-b82d-388bd1c1e616
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bc257e90-302d-4f32-b82d-388bd1c1e616","subject":"Error contract","status":"open","region":"eu","participants":["qa-77c3176b335c","qa-ff8418f974bd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.121358682Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-b7294cfa-2c28-4c9f-bad1-0cf6438ac413

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 81826bc5-b931-4298-a46a-2c9c79ea9526
X-Correlation-Id: qa-b7294cfa-2c28-4c9f-bad1-0cf6438ac413
Content-Type: application/json

--- request body ---
{"handle":"qa-9f969c350747","displayName":"QA 9f969c350747","password":"****","region":"eu"}

--- response: 503 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7294cfa-2c28-4c9f-bad1-0cf6438ac413
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-b7294cfa-2c28-4c9f-bad1-0cf6438ac413"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-47911e4b-87f5-4eea-bad0-4bd6b3768972

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47911e4b-87f5-4eea-bad0-4bd6b3768972
Content-Type: application/json

--- request body ---
{"handle":"qa-ff8418f974bd","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-47911e4b-87f5-4eea-bad0-4bd6b3768972
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a388d5c0-6d05-4b3e-8d09-369a39bafa1d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3083e1a3-40e6-4182-9465-58e0d27a8909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3083e1a3-40e6-4182-9465-58e0d27a8909
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3083e1a3-40e6-4182-9465-58e0d27a8909
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
correlation: qa-e476c87c-4e7e-4800-808d-3ae2f9f72a7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e476c87c-4e7e-4800-808d-3ae2f9f72a7e
Content-Type: application/json

--- request body ---
{"handle":"qa-ff8418f974bd","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e476c87c-4e7e-4800-808d-3ae2f9f72a7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e476c87c-4e7e-4800-808d-3ae2f9f72a7e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cfbfdc72-e831-490e-8512-a5844ab88d0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfbfdc72-e831-490e-8512-a5844ab88d0f
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cfbfdc72-e831-490e-8512-a5844ab88d0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5120cfe4-0068-4bb2-92b3-4134a94e1503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5120cfe4-0068-4bb2-92b3-4134a94e1503
Content-Type: application/json

--- request body ---
{"handle":"qa-77c3176b335c","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5120cfe4-0068-4bb2-92b3-4134a94e1503
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5120cfe4-0068-4bb2-92b3-4134a94e1503"}
```
