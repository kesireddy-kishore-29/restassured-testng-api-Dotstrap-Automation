# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 410 | `qa-bd43c9ff-b94a-4780-a1a6-70411c6baa98` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-4c41099e-e7ec-4c8d-b332-dbf2a47792f2` |
| 3 | `POST /v1/auth/token` | 200 | 69 | `qa-0fc6dacf-21d2-4bc5-93f2-5bfcdabf255b` |
| 4 | `POST /v1/conversations` | 201 | 65 | `qa-5c42216c-271b-47a0-b263-e4c4dc3708eb` |
| 5 | `GET /v1/accounts/me` | 503 | 29 | `qa-b8d2155d-fd92-4fd2-aed0-4b6b2c0535cb` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-b43c6c21-9859-4d34-8ba1-05ae9f1c7826` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-93e8ad5e-a317-4721-9f3f-93c0dde2e36d` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-3c0ff268-524d-4fe4-87da-3b939fbaff87` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-b1e867fc-afc8-4b89-8106-fdc5601620db` |
| 10 | `POST /v1/auth/token` | 401 | 43 | `qa-3788689d-718c-4adb-9a88-35dfaa626be4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd43c9ff-b94a-4780-a1a6-70411c6baa98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd43c9ff-b94a-4780-a1a6-70411c6baa98
Content-Type: application/json

--- request body ---
{"handle":"qa-01734a457546","displayName":"QA 01734a457546","password":"****","region":"eu"}

--- response: 201 in 410 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd43c9ff-b94a-4780-a1a6-70411c6baa98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-01734a457546
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9fc03f2-5588-4672-9dd0-6e0e5e342de7","handle":"qa-01734a457546","displayName":"QA 01734a457546","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.336189480Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4c41099e-e7ec-4c8d-b332-dbf2a47792f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c41099e-e7ec-4c8d-b332-dbf2a47792f2
Content-Type: application/json

--- request body ---
{"handle":"qa-3002afd5c942","displayName":"QA 3002afd5c942","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c41099e-e7ec-4c8d-b332-dbf2a47792f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-3002afd5c942
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4e1af1df-e015-498b-b5f6-9d6488fa26f0","handle":"qa-3002afd5c942","displayName":"QA 3002afd5c942","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.800525346Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0fc6dacf-21d2-4bc5-93f2-5bfcdabf255b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fc6dacf-21d2-4bc5-93f2-5bfcdabf255b
Content-Type: application/json

--- request body ---
{"handle":"qa-01734a457546","password":"****"}

--- response: 200 in 69 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fc6dacf-21d2-4bc5-93f2-5bfcdabf255b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9fc03f2-5588-4672-9dd0-6e0e5e342de7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5c42216c-271b-47a0-b263-e4c4dc3708eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c42216c-271b-47a0-b263-e4c4dc3708eb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3002afd5c942","subject":"Error contract","message":"Hi"}

--- response: 201 in 65 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c42216c-271b-47a0-b263-e4c4dc3708eb
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
Location: /v1/conversations/cnv_0146d54d-184a-4184-872b-98a86e74f75e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0146d54d-184a-4184-872b-98a86e74f75e","subject":"Error contract","status":"open","region":"eu","participants":["qa-01734a457546","qa-3002afd5c942"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:20.996876795Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8d2155d-fd92-4fd2-aed0-4b6b2c0535cb

--- request headers ---
Accept: application/json
X-Fault-Key: 5497e370-7394-40ab-af11-9520b2350fb0
X-Fault: unavailable-once
X-Correlation-Id: qa-b8d2155d-fd92-4fd2-aed0-4b6b2c0535cb
Content-Type: application/json

--- response: 503 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8d2155d-fd92-4fd2-aed0-4b6b2c0535cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b8d2155d-fd92-4fd2-aed0-4b6b2c0535cb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b43c6c21-9859-4d34-8ba1-05ae9f1c7826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b43c6c21-9859-4d34-8ba1-05ae9f1c7826
Content-Type: application/json

--- request body ---
{"handle":"qa-3002afd5c942","password":"****"}

--- response: 200 in 40 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-b43c6c21-9859-4d34-8ba1-05ae9f1c7826
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4e1af1df-e015-498b-b5f6-9d6488fa26f0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-93e8ad5e-a317-4721-9f3f-93c0dde2e36d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93e8ad5e-a317-4721-9f3f-93c0dde2e36d
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-93e8ad5e-a317-4721-9f3f-93c0dde2e36d
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
correlation: qa-3c0ff268-524d-4fe4-87da-3b939fbaff87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c0ff268-524d-4fe4-87da-3b939fbaff87
Content-Type: application/json

--- request body ---
{"handle":"qa-3002afd5c942","password":"****"}

--- response: 401 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c0ff268-524d-4fe4-87da-3b939fbaff87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c0ff268-524d-4fe4-87da-3b939fbaff87"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b1e867fc-afc8-4b89-8106-fdc5601620db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1e867fc-afc8-4b89-8106-fdc5601620db
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b1e867fc-afc8-4b89-8106-fdc5601620db
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
correlation: qa-3788689d-718c-4adb-9a88-35dfaa626be4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3788689d-718c-4adb-9a88-35dfaa626be4
Content-Type: application/json

--- request body ---
{"handle":"qa-01734a457546","password":"****"}

--- response: 401 in 43 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3788689d-718c-4adb-9a88-35dfaa626be4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3788689d-718c-4adb-9a88-35dfaa626be4"}
```
