# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-43a33115-8a12-4231-bc16-2325a96a9be2` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-dfc89a1f-6977-40da-ae06-144f059f2dc6` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-63181187-3dd2-4c71-84bd-0d86fcfe0d3b` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-844f5e0c-2323-4903-a337-22c06a7a6385` |
| 5 | `PATCH /v1/accounts/me` | 400 | 52 | `qa-f887ddaa-14ea-43b2-b829-e4a58279426c` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-3f9ea92b-0516-4f1a-b41c-f0258412d697` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-997fdadb-24f3-4503-8563-e993c0a5b81e` |
| 8 | `POST /v1/auth/token` | 401 | 54 | `qa-ec860ceb-6589-4baa-a689-043282445c5d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-3bf7687f-82b2-4d68-b9e8-255efcdb3a79` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-4215f4df-e440-4b0e-b5ca-c6bf8bd4209c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43a33115-8a12-4231-bc16-2325a96a9be2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43a33115-8a12-4231-bc16-2325a96a9be2
Content-Type: application/json

--- request body ---
{"handle":"qa-0c97db363be9","displayName":"QA 0c97db363be9","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-43a33115-8a12-4231-bc16-2325a96a9be2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Location: /v1/accounts/qa-0c97db363be9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_920ac890-4c1a-4253-b48e-d0de121c53d8","handle":"qa-0c97db363be9","displayName":"QA 0c97db363be9","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.266397541Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dfc89a1f-6977-40da-ae06-144f059f2dc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfc89a1f-6977-40da-ae06-144f059f2dc6
Content-Type: application/json

--- request body ---
{"handle":"qa-100010f724af","displayName":"QA 100010f724af","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfc89a1f-6977-40da-ae06-144f059f2dc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Location: /v1/accounts/qa-100010f724af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a977bc5-b165-4136-9a0f-1fea0077ede6","handle":"qa-100010f724af","displayName":"QA 100010f724af","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.355101902Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-63181187-3dd2-4c71-84bd-0d86fcfe0d3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63181187-3dd2-4c71-84bd-0d86fcfe0d3b
Content-Type: application/json

--- request body ---
{"handle":"qa-0c97db363be9","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-63181187-3dd2-4c71-84bd-0d86fcfe0d3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_920ac890-4c1a-4253-b48e-d0de121c53d8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-844f5e0c-2323-4903-a337-22c06a7a6385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-844f5e0c-2323-4903-a337-22c06a7a6385
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-100010f724af","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-844f5e0c-2323-4903-a337-22c06a7a6385
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
Location: /v1/conversations/cnv_4645ad25-2239-48d6-90e8-46bf1c61b030
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4645ad25-2239-48d6-90e8-46bf1c61b030","subject":"Error contract","status":"open","region":"eu","participants":["qa-0c97db363be9","qa-100010f724af"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.486955003Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-f887ddaa-14ea-43b2-b829-e4a58279426c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f887ddaa-14ea-43b2-b829-e4a58279426c
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 52 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f887ddaa-14ea-43b2-b829-e4a58279426c
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-f887ddaa-14ea-43b2-b829-e4a58279426c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3f9ea92b-0516-4f1a-b41c-f0258412d697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f9ea92b-0516-4f1a-b41c-f0258412d697
Content-Type: application/json

--- request body ---
{"handle":"qa-100010f724af","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f9ea92b-0516-4f1a-b41c-f0258412d697
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a977bc5-b165-4136-9a0f-1fea0077ede6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-997fdadb-24f3-4503-8563-e993c0a5b81e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-997fdadb-24f3-4503-8563-e993c0a5b81e
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-997fdadb-24f3-4503-8563-e993c0a5b81e
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
correlation: qa-ec860ceb-6589-4baa-a689-043282445c5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec860ceb-6589-4baa-a689-043282445c5d
Content-Type: application/json

--- request body ---
{"handle":"qa-100010f724af","password":"****"}

--- response: 401 in 54 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec860ceb-6589-4baa-a689-043282445c5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec860ceb-6589-4baa-a689-043282445c5d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3bf7687f-82b2-4d68-b9e8-255efcdb3a79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bf7687f-82b2-4d68-b9e8-255efcdb3a79
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3bf7687f-82b2-4d68-b9e8-255efcdb3a79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4215f4df-e440-4b0e-b5ca-c6bf8bd4209c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4215f4df-e440-4b0e-b5ca-c6bf8bd4209c
Content-Type: application/json

--- request body ---
{"handle":"qa-0c97db363be9","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4215f4df-e440-4b0e-b5ca-c6bf8bd4209c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4215f4df-e440-4b0e-b5ca-c6bf8bd4209c"}
```
