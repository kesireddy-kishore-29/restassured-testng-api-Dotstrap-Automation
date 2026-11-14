# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-da78b89c-b398-4b83-80b2-9d85816187ec` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-281038a0-0d83-41e6-91d7-4ed512fe4caa` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-389e22b5-8457-4413-b20c-eb9d17aecfae` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-dfb14258-7544-4dd8-9910-14af9ba80ed2` |
| 5 | `GET /v1/admin/stats` | 503 | 14 | `qa-85fe276e-6885-4cd8-83b1-469c95c0e5ec` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-07d2e1dc-d33c-490d-b90d-db4bb2dc968b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3218135e-f99b-4925-9814-7e712722188e` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-889a199b-90e6-4d9a-a320-46d7336329db` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e1571d99-f6ed-4f88-a327-068203caf584` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-0c68b9d1-400c-41e2-8871-4d48bc35d97b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-da78b89c-b398-4b83-80b2-9d85816187ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da78b89c-b398-4b83-80b2-9d85816187ec
Content-Type: application/json

--- request body ---
{"handle":"qa-13939e1a1e39","displayName":"QA 13939e1a1e39","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-da78b89c-b398-4b83-80b2-9d85816187ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 8
Location: /v1/accounts/qa-13939e1a1e39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2fe15066-48a7-4a30-aa74-f17385e4b517","handle":"qa-13939e1a1e39","displayName":"QA 13939e1a1e39","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.533864774Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-281038a0-0d83-41e6-91d7-4ed512fe4caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-281038a0-0d83-41e6-91d7-4ed512fe4caa
Content-Type: application/json

--- request body ---
{"handle":"qa-1b08354f923a","displayName":"QA 1b08354f923a","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-281038a0-0d83-41e6-91d7-4ed512fe4caa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 8
Location: /v1/accounts/qa-1b08354f923a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25d4bf34-0442-49b7-a161-ae128c93d68a","handle":"qa-1b08354f923a","displayName":"QA 1b08354f923a","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.551093194Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-389e22b5-8457-4413-b20c-eb9d17aecfae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-389e22b5-8457-4413-b20c-eb9d17aecfae
Content-Type: application/json

--- request body ---
{"handle":"qa-13939e1a1e39","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-389e22b5-8457-4413-b20c-eb9d17aecfae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fe15066-48a7-4a30-aa74-f17385e4b517"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dfb14258-7544-4dd8-9910-14af9ba80ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfb14258-7544-4dd8-9910-14af9ba80ed2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1b08354f923a","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfb14258-7544-4dd8-9910-14af9ba80ed2
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
Location: /v1/conversations/cnv_93d71a59-1d46-40b5-886e-0218b95760b8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_93d71a59-1d46-40b5-886e-0218b95760b8","subject":"Error contract","status":"open","region":"eu","participants":["qa-13939e1a1e39","qa-1b08354f923a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.587990739Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-85fe276e-6885-4cd8-83b1-469c95c0e5ec

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 29e6565f-9f87-4cc2-8b32-d8d5493c11f7
X-Correlation-Id: qa-85fe276e-6885-4cd8-83b1-469c95c0e5ec
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85fe276e-6885-4cd8-83b1-469c95c0e5ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-85fe276e-6885-4cd8-83b1-469c95c0e5ec"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-07d2e1dc-d33c-490d-b90d-db4bb2dc968b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07d2e1dc-d33c-490d-b90d-db4bb2dc968b
Content-Type: application/json

--- request body ---
{"handle":"qa-1b08354f923a","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-07d2e1dc-d33c-490d-b90d-db4bb2dc968b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25d4bf34-0442-49b7-a161-ae128c93d68a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3218135e-f99b-4925-9814-7e712722188e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3218135e-f99b-4925-9814-7e712722188e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3218135e-f99b-4925-9814-7e712722188e
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
correlation: qa-889a199b-90e6-4d9a-a320-46d7336329db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-889a199b-90e6-4d9a-a320-46d7336329db
Content-Type: application/json

--- request body ---
{"handle":"qa-1b08354f923a","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-889a199b-90e6-4d9a-a320-46d7336329db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-889a199b-90e6-4d9a-a320-46d7336329db"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1571d99-f6ed-4f88-a327-068203caf584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1571d99-f6ed-4f88-a327-068203caf584
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1571d99-f6ed-4f88-a327-068203caf584
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
correlation: qa-0c68b9d1-400c-41e2-8871-4d48bc35d97b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c68b9d1-400c-41e2-8871-4d48bc35d97b
Content-Type: application/json

--- request body ---
{"handle":"qa-13939e1a1e39","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c68b9d1-400c-41e2-8871-4d48bc35d97b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c68b9d1-400c-41e2-8871-4d48bc35d97b"}
```
