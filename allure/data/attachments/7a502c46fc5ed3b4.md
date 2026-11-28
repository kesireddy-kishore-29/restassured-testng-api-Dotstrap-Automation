# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-2abee4e1-d469-443b-8675-805b89af5a03` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-827d4205-f376-4dc9-977b-88106e9dba3c` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-080a1ae6-56ec-42ac-b8b5-777815d2556d` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-e22722f4-349a-44e8-b52d-6569216ce909` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 26 | `qa-264d2fa6-5ef0-4a27-aea7-9abcf30dd11a` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-dce1fa6b-cd1f-4ca7-a09a-fb93e9fb583a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-fd74c90a-b346-4b6c-b684-48d44f2c4db3` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-05437c52-06d6-47e2-93af-6d78ac0c88f4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-20ccdb3a-5d7d-4f5f-b285-8aba539cb0b5` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-7dfb3d02-3583-4c9b-bf80-feb6f13c6d4f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2abee4e1-d469-443b-8675-805b89af5a03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2abee4e1-d469-443b-8675-805b89af5a03
Content-Type: application/json

--- request body ---
{"handle":"qa-e3a53763e5d6","displayName":"QA e3a53763e5d6","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2abee4e1-d469-443b-8675-805b89af5a03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Location: /v1/accounts/qa-e3a53763e5d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ec5bf67-3c89-40a3-8b03-e7f24ebee931","handle":"qa-e3a53763e5d6","displayName":"QA e3a53763e5d6","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.180918986Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-827d4205-f376-4dc9-977b-88106e9dba3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-827d4205-f376-4dc9-977b-88106e9dba3c
Content-Type: application/json

--- request body ---
{"handle":"qa-2bbd97f8b1af","displayName":"QA 2bbd97f8b1af","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-827d4205-f376-4dc9-977b-88106e9dba3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-2bbd97f8b1af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_707e70a1-a703-4cc7-99c0-e17782441541","handle":"qa-2bbd97f8b1af","displayName":"QA 2bbd97f8b1af","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.251490643Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-080a1ae6-56ec-42ac-b8b5-777815d2556d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-080a1ae6-56ec-42ac-b8b5-777815d2556d
Content-Type: application/json

--- request body ---
{"handle":"qa-e3a53763e5d6","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-080a1ae6-56ec-42ac-b8b5-777815d2556d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ec5bf67-3c89-40a3-8b03-e7f24ebee931"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e22722f4-349a-44e8-b52d-6569216ce909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e22722f4-349a-44e8-b52d-6569216ce909
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2bbd97f8b1af","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e22722f4-349a-44e8-b52d-6569216ce909
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
Location: /v1/conversations/cnv_a8d50255-06b2-4c8e-b920-9c37596e0bf1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a8d50255-06b2-4c8e-b920-9c37596e0bf1","subject":"Error contract","status":"open","region":"eu","participants":["qa-e3a53763e5d6","qa-2bbd97f8b1af"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.359861768Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-e3a53763e5d6
correlation: qa-264d2fa6-5ef0-4a27-aea7-9abcf30dd11a

--- request headers ---
Accept: application/json
X-Fault-Key: 13cb7791-66a4-431b-ba03-06e0b09ee8a5
X-Fault: unavailable-once
X-Correlation-Id: qa-264d2fa6-5ef0-4a27-aea7-9abcf30dd11a
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-264d2fa6-5ef0-4a27-aea7-9abcf30dd11a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-e3a53763e5d6","correlationId":"qa-264d2fa6-5ef0-4a27-aea7-9abcf30dd11a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dce1fa6b-cd1f-4ca7-a09a-fb93e9fb583a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dce1fa6b-cd1f-4ca7-a09a-fb93e9fb583a
Content-Type: application/json

--- request body ---
{"handle":"qa-2bbd97f8b1af","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-dce1fa6b-cd1f-4ca7-a09a-fb93e9fb583a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_707e70a1-a703-4cc7-99c0-e17782441541"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd74c90a-b346-4b6c-b684-48d44f2c4db3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd74c90a-b346-4b6c-b684-48d44f2c4db3
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd74c90a-b346-4b6c-b684-48d44f2c4db3
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
correlation: qa-05437c52-06d6-47e2-93af-6d78ac0c88f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05437c52-06d6-47e2-93af-6d78ac0c88f4
Content-Type: application/json

--- request body ---
{"handle":"qa-2bbd97f8b1af","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05437c52-06d6-47e2-93af-6d78ac0c88f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05437c52-06d6-47e2-93af-6d78ac0c88f4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20ccdb3a-5d7d-4f5f-b285-8aba539cb0b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20ccdb3a-5d7d-4f5f-b285-8aba539cb0b5
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20ccdb3a-5d7d-4f5f-b285-8aba539cb0b5
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
correlation: qa-7dfb3d02-3583-4c9b-bf80-feb6f13c6d4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dfb3d02-3583-4c9b-bf80-feb6f13c6d4f
Content-Type: application/json

--- request body ---
{"handle":"qa-e3a53763e5d6","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7dfb3d02-3583-4c9b-bf80-feb6f13c6d4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7dfb3d02-3583-4c9b-bf80-feb6f13c6d4f"}
```
