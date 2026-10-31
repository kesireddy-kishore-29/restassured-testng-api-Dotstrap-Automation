# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-a8058898-1cee-45e2-9706-67172b03e451` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-124dab30-d5e3-41d5-bcdc-d76741b6a4ff` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-4540b880-5fdd-412d-b438-aaee817730a4` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-f8d74fca-5ada-4a66-aa93-76d0c9208f98` |
| 5 | `POST /v1/auth/token` | 503 | 15 | `qa-e5c0588c-ab5e-4ca5-97fb-02e84677cba4` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-97e4fb45-4242-4c5c-a27d-5cea79833b10` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-484a187a-d9d8-414a-a5a5-be1fead0e004` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-78ac5e5c-0818-4dc2-89c1-ee9bb65fd5a5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-11252034-d0e4-4ead-bd60-ac8fe298f7cf` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-f42c2c0e-06ca-482e-9a67-a205fccc623a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a8058898-1cee-45e2-9706-67172b03e451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8058898-1cee-45e2-9706-67172b03e451
Content-Type: application/json

--- request body ---
{"handle":"qa-310342e811d6","displayName":"QA 310342e811d6","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8058898-1cee-45e2-9706-67172b03e451
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
Location: /v1/accounts/qa-310342e811d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_566e472f-c19c-42d0-86ee-4f465575f1bc","handle":"qa-310342e811d6","displayName":"QA 310342e811d6","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.791144427Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-124dab30-d5e3-41d5-bcdc-d76741b6a4ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-124dab30-d5e3-41d5-bcdc-d76741b6a4ff
Content-Type: application/json

--- request body ---
{"handle":"qa-7c805b13e714","displayName":"QA 7c805b13e714","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-124dab30-d5e3-41d5-bcdc-d76741b6a4ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-7c805b13e714
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14e073e9-271b-4971-a818-5eb15587fc67","handle":"qa-7c805b13e714","displayName":"QA 7c805b13e714","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.827269315Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4540b880-5fdd-412d-b438-aaee817730a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4540b880-5fdd-412d-b438-aaee817730a4
Content-Type: application/json

--- request body ---
{"handle":"qa-310342e811d6","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4540b880-5fdd-412d-b438-aaee817730a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_566e472f-c19c-42d0-86ee-4f465575f1bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f8d74fca-5ada-4a66-aa93-76d0c9208f98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8d74fca-5ada-4a66-aa93-76d0c9208f98
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7c805b13e714","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8d74fca-5ada-4a66-aa93-76d0c9208f98
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
Location: /v1/conversations/cnv_aed52d1b-881d-4048-8275-530f2ffa164e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_aed52d1b-881d-4048-8275-530f2ffa164e","subject":"Error contract","status":"open","region":"eu","participants":["qa-310342e811d6","qa-7c805b13e714"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.936481303Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e5c0588c-ab5e-4ca5-97fb-02e84677cba4

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 56fd4e13-c75f-48f9-b335-5db446acfda3
X-Correlation-Id: qa-e5c0588c-ab5e-4ca5-97fb-02e84677cba4
Content-Type: application/json

--- request body ---
{"handle":"qa-310342e811d6","password":"****"}

--- response: 503 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5c0588c-ab5e-4ca5-97fb-02e84677cba4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-e5c0588c-ab5e-4ca5-97fb-02e84677cba4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-97e4fb45-4242-4c5c-a27d-5cea79833b10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97e4fb45-4242-4c5c-a27d-5cea79833b10
Content-Type: application/json

--- request body ---
{"handle":"qa-7c805b13e714","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-97e4fb45-4242-4c5c-a27d-5cea79833b10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14e073e9-271b-4971-a818-5eb15587fc67"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-484a187a-d9d8-414a-a5a5-be1fead0e004

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-484a187a-d9d8-414a-a5a5-be1fead0e004
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-484a187a-d9d8-414a-a5a5-be1fead0e004
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
correlation: qa-78ac5e5c-0818-4dc2-89c1-ee9bb65fd5a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78ac5e5c-0818-4dc2-89c1-ee9bb65fd5a5
Content-Type: application/json

--- request body ---
{"handle":"qa-7c805b13e714","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78ac5e5c-0818-4dc2-89c1-ee9bb65fd5a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78ac5e5c-0818-4dc2-89c1-ee9bb65fd5a5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11252034-d0e4-4ead-bd60-ac8fe298f7cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11252034-d0e4-4ead-bd60-ac8fe298f7cf
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11252034-d0e4-4ead-bd60-ac8fe298f7cf
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
correlation: qa-f42c2c0e-06ca-482e-9a67-a205fccc623a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f42c2c0e-06ca-482e-9a67-a205fccc623a
Content-Type: application/json

--- request body ---
{"handle":"qa-310342e811d6","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f42c2c0e-06ca-482e-9a67-a205fccc623a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f42c2c0e-06ca-482e-9a67-a205fccc623a"}
```
