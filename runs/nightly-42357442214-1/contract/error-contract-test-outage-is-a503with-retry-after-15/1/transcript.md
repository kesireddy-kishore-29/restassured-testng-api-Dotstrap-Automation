# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-5dfcb208-5536-4f63-bdee-9cc211de6c9f` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-809da0b0-63f3-422a-86c7-7af20bd18b9a` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-9324f57a-ed32-4f8d-a700-43f74acaaf72` |
| 4 | `POST /v1/conversations` | 201 | 34 | `qa-bf36299a-656f-49a7-bf07-654aedd4a3d9` |
| 5 | `POST /v1/credits/purchases` | 503 | 10 | `qa-e92b83d4-a458-4621-98d7-8b601a018fb9` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-97f7499a-3bdf-41de-aed7-4198b0ca176c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-9a109b06-f5cf-43e0-98c7-4fcf63615dfc` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-d95308e5-2ad2-4fab-9a28-db8f34a9b2b9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-fd20763e-d519-44f5-8f01-9679c76e2c8e` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-6f10cdfe-c30c-458d-b297-6d551d59d368` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5dfcb208-5536-4f63-bdee-9cc211de6c9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dfcb208-5536-4f63-bdee-9cc211de6c9f
Content-Type: application/json

--- request body ---
{"handle":"qa-1ef4de5b19b1","displayName":"QA 1ef4de5b19b1","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dfcb208-5536-4f63-bdee-9cc211de6c9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Location: /v1/accounts/qa-1ef4de5b19b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14cc53b0-376f-4bf6-9736-81fcdb6ad845","handle":"qa-1ef4de5b19b1","displayName":"QA 1ef4de5b19b1","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.384790719Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-809da0b0-63f3-422a-86c7-7af20bd18b9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-809da0b0-63f3-422a-86c7-7af20bd18b9a
Content-Type: application/json

--- request body ---
{"handle":"qa-cead954f2b0f","displayName":"QA cead954f2b0f","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-809da0b0-63f3-422a-86c7-7af20bd18b9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Location: /v1/accounts/qa-cead954f2b0f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3794c0c7-b225-489c-af3a-617a140b2357","handle":"qa-cead954f2b0f","displayName":"QA cead954f2b0f","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.411256151Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9324f57a-ed32-4f8d-a700-43f74acaaf72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9324f57a-ed32-4f8d-a700-43f74acaaf72
Content-Type: application/json

--- request body ---
{"handle":"qa-1ef4de5b19b1","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9324f57a-ed32-4f8d-a700-43f74acaaf72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14cc53b0-376f-4bf6-9736-81fcdb6ad845"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bf36299a-656f-49a7-bf07-654aedd4a3d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf36299a-656f-49a7-bf07-654aedd4a3d9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cead954f2b0f","subject":"Error contract","message":"Hi"}

--- response: 201 in 34 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf36299a-656f-49a7-bf07-654aedd4a3d9
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
Location: /v1/conversations/cnv_c5d51718-2aa4-4fec-9170-532c29fd66ef
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c5d51718-2aa4-4fec-9170-532c29fd66ef","subject":"Error contract","status":"open","region":"eu","participants":["qa-1ef4de5b19b1","qa-cead954f2b0f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.481560355Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e92b83d4-a458-4621-98d7-8b601a018fb9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: deb1160c-f166-40cf-9001-ff8a15831433
Idempotency-Key: qa-737a9eb4bf19477d84afa0808ccbf3d8
X-Correlation-Id: qa-e92b83d4-a458-4621-98d7-8b601a018fb9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e92b83d4-a458-4621-98d7-8b601a018fb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-e92b83d4-a458-4621-98d7-8b601a018fb9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-97f7499a-3bdf-41de-aed7-4198b0ca176c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97f7499a-3bdf-41de-aed7-4198b0ca176c
Content-Type: application/json

--- request body ---
{"handle":"qa-cead954f2b0f","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-97f7499a-3bdf-41de-aed7-4198b0ca176c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3794c0c7-b225-489c-af3a-617a140b2357"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a109b06-f5cf-43e0-98c7-4fcf63615dfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a109b06-f5cf-43e0-98c7-4fcf63615dfc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a109b06-f5cf-43e0-98c7-4fcf63615dfc
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
correlation: qa-d95308e5-2ad2-4fab-9a28-db8f34a9b2b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d95308e5-2ad2-4fab-9a28-db8f34a9b2b9
Content-Type: application/json

--- request body ---
{"handle":"qa-cead954f2b0f","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d95308e5-2ad2-4fab-9a28-db8f34a9b2b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d95308e5-2ad2-4fab-9a28-db8f34a9b2b9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd20763e-d519-44f5-8f01-9679c76e2c8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd20763e-d519-44f5-8f01-9679c76e2c8e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd20763e-d519-44f5-8f01-9679c76e2c8e
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
correlation: qa-6f10cdfe-c30c-458d-b297-6d551d59d368

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f10cdfe-c30c-458d-b297-6d551d59d368
Content-Type: application/json

--- request body ---
{"handle":"qa-1ef4de5b19b1","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f10cdfe-c30c-458d-b297-6d551d59d368
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f10cdfe-c30c-458d-b297-6d551d59d368"}
```
