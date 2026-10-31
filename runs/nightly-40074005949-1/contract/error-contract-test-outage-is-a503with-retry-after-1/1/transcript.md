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
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-ff0cc19f-18fd-484b-9bd1-11d303bf1138` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-1d7a52f3-9304-463a-970f-7d2d3a2539aa` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-d427c57c-d936-4692-ba86-c0cd759026a8` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-cc4ea4e9-2bdb-4b68-8d63-8461fc5aada7` |
| 5 | `POST /v1/accounts` | 503 | 23 | `qa-fd14bf1a-6def-4244-b38a-56290a404893` |
| 6 | `POST /v1/auth/token` | 200 | 65 | `qa-3cfb6c7e-8164-4156-b3c9-49e13377b573` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-216d4611-01c8-4b9e-a960-e4da5dad9e13` |
| 8 | `POST /v1/auth/token` | 401 | 37 | `qa-abfccd74-55c9-4b19-8947-0ed808df4437` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-ff4abd5c-6198-48e4-93d0-db7f1298d1fb` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-41b7b62f-161b-49ec-b166-73b6160ff986` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ff0cc19f-18fd-484b-9bd1-11d303bf1138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff0cc19f-18fd-484b-9bd1-11d303bf1138
Content-Type: application/json

--- request body ---
{"handle":"qa-107cd8dffe6e","displayName":"QA 107cd8dffe6e","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff0cc19f-18fd-484b-9bd1-11d303bf1138
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-107cd8dffe6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9763d7f-ce62-401b-88e8-8af1cc3fb997","handle":"qa-107cd8dffe6e","displayName":"QA 107cd8dffe6e","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.807944198Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1d7a52f3-9304-463a-970f-7d2d3a2539aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d7a52f3-9304-463a-970f-7d2d3a2539aa
Content-Type: application/json

--- request body ---
{"handle":"qa-fceec79533fd","displayName":"QA fceec79533fd","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d7a52f3-9304-463a-970f-7d2d3a2539aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Location: /v1/accounts/qa-fceec79533fd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fe7ca5b5-ee62-4243-b0b3-773e003a6e47","handle":"qa-fceec79533fd","displayName":"QA fceec79533fd","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.872935246Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d427c57c-d936-4692-ba86-c0cd759026a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d427c57c-d936-4692-ba86-c0cd759026a8
Content-Type: application/json

--- request body ---
{"handle":"qa-107cd8dffe6e","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d427c57c-d936-4692-ba86-c0cd759026a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9763d7f-ce62-401b-88e8-8af1cc3fb997"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cc4ea4e9-2bdb-4b68-8d63-8461fc5aada7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc4ea4e9-2bdb-4b68-8d63-8461fc5aada7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fceec79533fd","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc4ea4e9-2bdb-4b68-8d63-8461fc5aada7
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
Location: /v1/conversations/cnv_9070231e-32ef-4901-94f0-bf6b43e7d9b5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9070231e-32ef-4901-94f0-bf6b43e7d9b5","subject":"Error contract","status":"open","region":"eu","participants":["qa-107cd8dffe6e","qa-fceec79533fd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.975440348Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-fd14bf1a-6def-4244-b38a-56290a404893

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ec822d45-ac0e-4519-896f-bbcff78b8832
X-Correlation-Id: qa-fd14bf1a-6def-4244-b38a-56290a404893
Content-Type: application/json

--- request body ---
{"handle":"qa-bf8a87e77b7a","displayName":"QA bf8a87e77b7a","password":"****","region":"eu"}

--- response: 503 in 23 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd14bf1a-6def-4244-b38a-56290a404893
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-fd14bf1a-6def-4244-b38a-56290a404893"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3cfb6c7e-8164-4156-b3c9-49e13377b573

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cfb6c7e-8164-4156-b3c9-49e13377b573
Content-Type: application/json

--- request body ---
{"handle":"qa-fceec79533fd","password":"****"}

--- response: 200 in 65 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cfb6c7e-8164-4156-b3c9-49e13377b573
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe7ca5b5-ee62-4243-b0b3-773e003a6e47"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-216d4611-01c8-4b9e-a960-e4da5dad9e13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-216d4611-01c8-4b9e-a960-e4da5dad9e13
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-216d4611-01c8-4b9e-a960-e4da5dad9e13
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
correlation: qa-abfccd74-55c9-4b19-8947-0ed808df4437

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abfccd74-55c9-4b19-8947-0ed808df4437
Content-Type: application/json

--- request body ---
{"handle":"qa-fceec79533fd","password":"****"}

--- response: 401 in 37 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-abfccd74-55c9-4b19-8947-0ed808df4437
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-abfccd74-55c9-4b19-8947-0ed808df4437"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff4abd5c-6198-48e4-93d0-db7f1298d1fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff4abd5c-6198-48e4-93d0-db7f1298d1fb
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff4abd5c-6198-48e4-93d0-db7f1298d1fb
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
correlation: qa-41b7b62f-161b-49ec-b166-73b6160ff986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41b7b62f-161b-49ec-b166-73b6160ff986
Content-Type: application/json

--- request body ---
{"handle":"qa-107cd8dffe6e","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41b7b62f-161b-49ec-b166-73b6160ff986
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-41b7b62f-161b-49ec-b166-73b6160ff986"}
```
