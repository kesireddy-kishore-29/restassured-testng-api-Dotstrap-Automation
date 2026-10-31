# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-ec5ed7a4-a72a-4731-944f-f07039d13f5f` |
| 2 | `POST /v1/accounts` | 201 | 67 | `qa-d07464d7-ff93-4f8d-b068-a3e60e84be64` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-b17817c6-f6e2-4a95-b6cc-960c52ffc627` |
| 4 | `POST /v1/conversations` | 201 | 42 | `qa-9d3249fc-6877-4ca9-8220-25ba598ce914` |
| 5 | `POST /v1/accounts` | 422 | 25 | `qa-ddce5098-27f0-4209-8437-d4b7bcd87b60` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-6bd12c6b-06d7-468d-9e9d-e08b14506d9f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-b2d23bf1-05a5-4b44-9b21-99df0f944983` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-972cd81e-a59c-48ba-961a-e550dc8f2532` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-4c22dd77-4187-4b51-95cb-8d5ab2296fe7` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-7d07ec5b-97f0-4212-9387-83a3a94f193e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ec5ed7a4-a72a-4731-944f-f07039d13f5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec5ed7a4-a72a-4731-944f-f07039d13f5f
Content-Type: application/json

--- request body ---
{"handle":"qa-939f7ac151ab","displayName":"QA 939f7ac151ab","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec5ed7a4-a72a-4731-944f-f07039d13f5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Location: /v1/accounts/qa-939f7ac151ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b19156f1-3c89-4bdd-ac76-a45a91156ad4","handle":"qa-939f7ac151ab","displayName":"QA 939f7ac151ab","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.959617804Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d07464d7-ff93-4f8d-b068-a3e60e84be64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d07464d7-ff93-4f8d-b068-a3e60e84be64
Content-Type: application/json

--- request body ---
{"handle":"qa-a8417dd8b949","displayName":"QA a8417dd8b949","password":"****","region":"eu"}

--- response: 201 in 67 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d07464d7-ff93-4f8d-b068-a3e60e84be64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Location: /v1/accounts/qa-a8417dd8b949
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f35f41f-2847-4a1d-85b6-a52cbe672d65","handle":"qa-a8417dd8b949","displayName":"QA a8417dd8b949","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.061495791Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b17817c6-f6e2-4a95-b6cc-960c52ffc627

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b17817c6-f6e2-4a95-b6cc-960c52ffc627
Content-Type: application/json

--- request body ---
{"handle":"qa-939f7ac151ab","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b17817c6-f6e2-4a95-b6cc-960c52ffc627
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b19156f1-3c89-4bdd-ac76-a45a91156ad4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9d3249fc-6877-4ca9-8220-25ba598ce914

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d3249fc-6877-4ca9-8220-25ba598ce914
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a8417dd8b949","subject":"Error contract","message":"Hi"}

--- response: 201 in 42 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d3249fc-6877-4ca9-8220-25ba598ce914
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
Location: /v1/conversations/cnv_962bb25e-1189-4b52-ae8b-85781531b783
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_962bb25e-1189-4b52-ae8b-85781531b783","subject":"Error contract","status":"open","region":"eu","participants":["qa-939f7ac151ab","qa-a8417dd8b949"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.257339291Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-ddce5098-27f0-4209-8437-d4b7bcd87b60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddce5098-27f0-4209-8437-d4b7bcd87b60
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddce5098-27f0-4209-8437-d4b7bcd87b60
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
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-ddce5098-27f0-4209-8437-d4b7bcd87b60","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6bd12c6b-06d7-468d-9e9d-e08b14506d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bd12c6b-06d7-468d-9e9d-e08b14506d9f
Content-Type: application/json

--- request body ---
{"handle":"qa-a8417dd8b949","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bd12c6b-06d7-468d-9e9d-e08b14506d9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f35f41f-2847-4a1d-85b6-a52cbe672d65"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2d23bf1-05a5-4b44-9b21-99df0f944983

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2d23bf1-05a5-4b44-9b21-99df0f944983
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b2d23bf1-05a5-4b44-9b21-99df0f944983
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
correlation: qa-972cd81e-a59c-48ba-961a-e550dc8f2532

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-972cd81e-a59c-48ba-961a-e550dc8f2532
Content-Type: application/json

--- request body ---
{"handle":"qa-a8417dd8b949","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-972cd81e-a59c-48ba-961a-e550dc8f2532
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-972cd81e-a59c-48ba-961a-e550dc8f2532"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c22dd77-4187-4b51-95cb-8d5ab2296fe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c22dd77-4187-4b51-95cb-8d5ab2296fe7
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c22dd77-4187-4b51-95cb-8d5ab2296fe7
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
correlation: qa-7d07ec5b-97f0-4212-9387-83a3a94f193e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d07ec5b-97f0-4212-9387-83a3a94f193e
Content-Type: application/json

--- request body ---
{"handle":"qa-939f7ac151ab","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d07ec5b-97f0-4212-9387-83a3a94f193e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7d07ec5b-97f0-4212-9387-83a3a94f193e"}
```
