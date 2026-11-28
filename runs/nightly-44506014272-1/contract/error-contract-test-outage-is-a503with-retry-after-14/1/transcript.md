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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-85c10959-c473-421c-8784-ef4d1224eabd` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-c22fe169-3126-43c8-826b-060485385fb6` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-4e2a93d9-52de-4c1d-b540-52656e33f7fc` |
| 4 | `POST /v1/conversations` | 201 | 68 | `qa-f9b9e67b-d30e-495d-8327-856a298bccef` |
| 5 | `GET /v1/credits/ledger` | 503 | 65 | `qa-509e3712-534b-49b8-828e-ab486125ded5` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-9b971f1e-f91c-4616-b36a-6a752a5eb91b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-b29dc938-707c-426c-b555-0cc3f4cea846` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-f33620ba-5904-4cf8-9fa4-dbbb32ab8ac5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-2338a791-d2d9-43f6-a8ca-06238960724b` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-5b1f7bc8-34b5-4a49-9eae-d91d549986cc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-85c10959-c473-421c-8784-ef4d1224eabd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85c10959-c473-421c-8784-ef4d1224eabd
Content-Type: application/json

--- request body ---
{"handle":"qa-27eaf03c0b6b","displayName":"QA 27eaf03c0b6b","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-85c10959-c473-421c-8784-ef4d1224eabd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Location: /v1/accounts/qa-27eaf03c0b6b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ba90145-348c-4b4b-afa6-cdca9bf7c89d","handle":"qa-27eaf03c0b6b","displayName":"QA 27eaf03c0b6b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.832260729Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c22fe169-3126-43c8-826b-060485385fb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c22fe169-3126-43c8-826b-060485385fb6
Content-Type: application/json

--- request body ---
{"handle":"qa-abaf5abb0800","displayName":"QA abaf5abb0800","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c22fe169-3126-43c8-826b-060485385fb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 6
Location: /v1/accounts/qa-abaf5abb0800
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e1a6f61-6efa-4c92-95ad-04bb36146be2","handle":"qa-abaf5abb0800","displayName":"QA abaf5abb0800","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.893458901Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4e2a93d9-52de-4c1d-b540-52656e33f7fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e2a93d9-52de-4c1d-b540-52656e33f7fc
Content-Type: application/json

--- request body ---
{"handle":"qa-27eaf03c0b6b","password":"****"}

--- response: 200 in 51 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e2a93d9-52de-4c1d-b540-52656e33f7fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ba90145-348c-4b4b-afa6-cdca9bf7c89d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f9b9e67b-d30e-495d-8327-856a298bccef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9b9e67b-d30e-495d-8327-856a298bccef
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-abaf5abb0800","subject":"Error contract","message":"Hi"}

--- response: 201 in 68 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9b9e67b-d30e-495d-8327-856a298bccef
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
Location: /v1/conversations/cnv_c5a384a6-ee01-42a3-b168-866b3e10d5f7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c5a384a6-ee01-42a3-b168-866b3e10d5f7","subject":"Error contract","status":"open","region":"eu","participants":["qa-27eaf03c0b6b","qa-abaf5abb0800"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:27.028666180Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-509e3712-534b-49b8-828e-ab486125ded5

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e081da0e-0526-4d69-848e-10d0c1adee8d
X-Correlation-Id: qa-509e3712-534b-49b8-828e-ab486125ded5
Content-Type: application/json

--- response: 503 in 65 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-509e3712-534b-49b8-828e-ab486125ded5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-509e3712-534b-49b8-828e-ab486125ded5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9b971f1e-f91c-4616-b36a-6a752a5eb91b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b971f1e-f91c-4616-b36a-6a752a5eb91b
Content-Type: application/json

--- request body ---
{"handle":"qa-abaf5abb0800","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b971f1e-f91c-4616-b36a-6a752a5eb91b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e1a6f61-6efa-4c92-95ad-04bb36146be2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b29dc938-707c-426c-b555-0cc3f4cea846

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b29dc938-707c-426c-b555-0cc3f4cea846
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b29dc938-707c-426c-b555-0cc3f4cea846
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
correlation: qa-f33620ba-5904-4cf8-9fa4-dbbb32ab8ac5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f33620ba-5904-4cf8-9fa4-dbbb32ab8ac5
Content-Type: application/json

--- request body ---
{"handle":"qa-abaf5abb0800","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f33620ba-5904-4cf8-9fa4-dbbb32ab8ac5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f33620ba-5904-4cf8-9fa4-dbbb32ab8ac5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2338a791-d2d9-43f6-a8ca-06238960724b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2338a791-d2d9-43f6-a8ca-06238960724b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2338a791-d2d9-43f6-a8ca-06238960724b
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
correlation: qa-5b1f7bc8-34b5-4a49-9eae-d91d549986cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b1f7bc8-34b5-4a49-9eae-d91d549986cc
Content-Type: application/json

--- request body ---
{"handle":"qa-27eaf03c0b6b","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b1f7bc8-34b5-4a49-9eae-d91d549986cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b1f7bc8-34b5-4a49-9eae-d91d549986cc"}
```
