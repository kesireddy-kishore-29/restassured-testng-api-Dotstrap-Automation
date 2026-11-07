# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-689eddef-18f7-4f59-97ae-78e37f740343` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-3a9496e8-e9be-4621-ab2e-02bb85be227e` |
| 3 | `POST /v1/auth/token` | 200 | 58 | `qa-56aa90f3-c659-4c15-920e-23bd271a0841` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-d966ae29-6b19-4254-9803-c3c8815760d6` |
| 5 | `POST /v1/credits/purchases` | 400 | 25 | `qa-90ba1737-c8f3-42a8-9260-29ae3461c196` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-30518473-cf5b-4d66-ad1e-2cc056960b58` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-b3ae03cb-af41-453a-ac52-8c72439a2e52` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-1d8d64d2-79c7-476f-abbc-80671c3ece9d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-96c33070-1998-4634-bceb-8e3995940dde` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-2ba27c9c-efc9-4665-8ace-b95a606d4821` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-689eddef-18f7-4f59-97ae-78e37f740343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-689eddef-18f7-4f59-97ae-78e37f740343
Content-Type: application/json

--- request body ---
{"handle":"qa-695f18972148","displayName":"QA 695f18972148","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-689eddef-18f7-4f59-97ae-78e37f740343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Location: /v1/accounts/qa-695f18972148
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c81ce56-8d12-444f-bca6-c6cf9a9e08f6","handle":"qa-695f18972148","displayName":"QA 695f18972148","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.287324298Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a9496e8-e9be-4621-ab2e-02bb85be227e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a9496e8-e9be-4621-ab2e-02bb85be227e
Content-Type: application/json

--- request body ---
{"handle":"qa-bad5532ea9fd","displayName":"QA bad5532ea9fd","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a9496e8-e9be-4621-ab2e-02bb85be227e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Location: /v1/accounts/qa-bad5532ea9fd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7e87176-a15d-4f81-a595-38cdb95028d3","handle":"qa-bad5532ea9fd","displayName":"QA bad5532ea9fd","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.334232825Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-56aa90f3-c659-4c15-920e-23bd271a0841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56aa90f3-c659-4c15-920e-23bd271a0841
Content-Type: application/json

--- request body ---
{"handle":"qa-695f18972148","password":"****"}

--- response: 200 in 58 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-56aa90f3-c659-4c15-920e-23bd271a0841
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c81ce56-8d12-444f-bca6-c6cf9a9e08f6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d966ae29-6b19-4254-9803-c3c8815760d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d966ae29-6b19-4254-9803-c3c8815760d6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bad5532ea9fd","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d966ae29-6b19-4254-9803-c3c8815760d6
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
Location: /v1/conversations/cnv_44571cbb-bd64-4fac-b0fb-7ec770b761d0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_44571cbb-bd64-4fac-b0fb-7ec770b761d0","subject":"Error contract","status":"open","region":"eu","participants":["qa-695f18972148","qa-bad5532ea9fd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.448729925Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-90ba1737-c8f3-42a8-9260-29ae3461c196

--- request headers ---
Accept: application/json
Idempotency-Key: qa-374cedb8e06f492c9ffc6b602c30b7f7
X-Correlation-Id: qa-90ba1737-c8f3-42a8-9260-29ae3461c196
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90ba1737-c8f3-42a8-9260-29ae3461c196
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-90ba1737-c8f3-42a8-9260-29ae3461c196"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-30518473-cf5b-4d66-ad1e-2cc056960b58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30518473-cf5b-4d66-ad1e-2cc056960b58
Content-Type: application/json

--- request body ---
{"handle":"qa-bad5532ea9fd","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-30518473-cf5b-4d66-ad1e-2cc056960b58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7e87176-a15d-4f81-a595-38cdb95028d3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3ae03cb-af41-453a-ac52-8c72439a2e52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3ae03cb-af41-453a-ac52-8c72439a2e52
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3ae03cb-af41-453a-ac52-8c72439a2e52
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
correlation: qa-1d8d64d2-79c7-476f-abbc-80671c3ece9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d8d64d2-79c7-476f-abbc-80671c3ece9d
Content-Type: application/json

--- request body ---
{"handle":"qa-bad5532ea9fd","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d8d64d2-79c7-476f-abbc-80671c3ece9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d8d64d2-79c7-476f-abbc-80671c3ece9d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96c33070-1998-4634-bceb-8e3995940dde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96c33070-1998-4634-bceb-8e3995940dde
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96c33070-1998-4634-bceb-8e3995940dde
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
correlation: qa-2ba27c9c-efc9-4665-8ace-b95a606d4821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ba27c9c-efc9-4665-8ace-b95a606d4821
Content-Type: application/json

--- request body ---
{"handle":"qa-695f18972148","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ba27c9c-efc9-4665-8ace-b95a606d4821
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ba27c9c-efc9-4665-8ace-b95a606d4821"}
```
