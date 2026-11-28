# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-232358a3-8b46-4e2a-b90b-bea1ab7649a8` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-11c355f1-d6b8-40d3-a224-69424b15326a` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-9ec18341-d26d-45ac-9137-8a723eb79e05` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-0c222685-1d0d-4bf2-a591-149a83468101` |
| 5 | `GET /v1/credits/ledger` | 503 | 19 | `qa-51860da8-1ca9-4ecc-86a5-d4e2346f593f` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-3dfcda51-0637-4fb0-9763-e834031fd1ca` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-b015a403-c9c8-4c35-82f3-a6a2ea332a15` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-85756615-6943-4e03-a953-f7734f946efd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-aabde26b-7341-4ac1-9ba2-12b4cf0b05e1` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-48a6e565-85d4-4175-bbcb-b95c9a67ad0d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-232358a3-8b46-4e2a-b90b-bea1ab7649a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-232358a3-8b46-4e2a-b90b-bea1ab7649a8
Content-Type: application/json

--- request body ---
{"handle":"qa-82f37df76258","displayName":"QA 82f37df76258","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-232358a3-8b46-4e2a-b90b-bea1ab7649a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Location: /v1/accounts/qa-82f37df76258
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c5a62da5-0480-461d-b94c-b332c652d21e","handle":"qa-82f37df76258","displayName":"QA 82f37df76258","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.797187858Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-11c355f1-d6b8-40d3-a224-69424b15326a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11c355f1-d6b8-40d3-a224-69424b15326a
Content-Type: application/json

--- request body ---
{"handle":"qa-05d4fb4dde7d","displayName":"QA 05d4fb4dde7d","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-11c355f1-d6b8-40d3-a224-69424b15326a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Location: /v1/accounts/qa-05d4fb4dde7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99e0a033-22d2-4fe2-b185-adc7744d0d29","handle":"qa-05d4fb4dde7d","displayName":"QA 05d4fb4dde7d","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.834899936Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9ec18341-d26d-45ac-9137-8a723eb79e05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ec18341-d26d-45ac-9137-8a723eb79e05
Content-Type: application/json

--- request body ---
{"handle":"qa-82f37df76258","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ec18341-d26d-45ac-9137-8a723eb79e05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c5a62da5-0480-461d-b94c-b332c652d21e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0c222685-1d0d-4bf2-a591-149a83468101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c222685-1d0d-4bf2-a591-149a83468101
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-05d4fb4dde7d","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c222685-1d0d-4bf2-a591-149a83468101
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
Location: /v1/conversations/cnv_a2f2de8a-0d2c-4774-b76d-8653aeaeeb0a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a2f2de8a-0d2c-4774-b76d-8653aeaeeb0a","subject":"Error contract","status":"open","region":"eu","participants":["qa-82f37df76258","qa-05d4fb4dde7d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.890463514Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-51860da8-1ca9-4ecc-86a5-d4e2346f593f

--- request headers ---
Accept: application/json
X-Fault-Key: 33311f45-bede-40a2-8ff2-aa983f1f8662
X-Fault: unavailable-once
X-Correlation-Id: qa-51860da8-1ca9-4ecc-86a5-d4e2346f593f
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51860da8-1ca9-4ecc-86a5-d4e2346f593f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-51860da8-1ca9-4ecc-86a5-d4e2346f593f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3dfcda51-0637-4fb0-9763-e834031fd1ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dfcda51-0637-4fb0-9763-e834031fd1ca
Content-Type: application/json

--- request body ---
{"handle":"qa-05d4fb4dde7d","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dfcda51-0637-4fb0-9763-e834031fd1ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99e0a033-22d2-4fe2-b185-adc7744d0d29"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b015a403-c9c8-4c35-82f3-a6a2ea332a15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b015a403-c9c8-4c35-82f3-a6a2ea332a15
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b015a403-c9c8-4c35-82f3-a6a2ea332a15
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
correlation: qa-85756615-6943-4e03-a953-f7734f946efd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85756615-6943-4e03-a953-f7734f946efd
Content-Type: application/json

--- request body ---
{"handle":"qa-05d4fb4dde7d","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85756615-6943-4e03-a953-f7734f946efd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-85756615-6943-4e03-a953-f7734f946efd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aabde26b-7341-4ac1-9ba2-12b4cf0b05e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aabde26b-7341-4ac1-9ba2-12b4cf0b05e1
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aabde26b-7341-4ac1-9ba2-12b4cf0b05e1
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
correlation: qa-48a6e565-85d4-4175-bbcb-b95c9a67ad0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a6e565-85d4-4175-bbcb-b95c9a67ad0d
Content-Type: application/json

--- request body ---
{"handle":"qa-82f37df76258","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48a6e565-85d4-4175-bbcb-b95c9a67ad0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48a6e565-85d4-4175-bbcb-b95c9a67ad0d"}
```
