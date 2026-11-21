# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-77606995-3ad5-44b2-a6d8-5b2caa652623` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-f7b21bec-3a9c-49cb-b1ef-d0cea77dd4c8` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-019f309b-936e-4eac-bcd2-ff68157d11f6` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-c2854124-d501-4985-b469-46f2bfcd4e1e` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 19 | `qa-d2dcc159-d8b4-4e8d-8360-778d31dba2c2` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-98bd1e11-fb1f-470e-8e48-3fd8da378bf6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3b1f03eb-bc10-4bec-badc-acf6018a4244` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-3ea58288-115c-41b0-b125-ac1fb7cf1d76` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a6ad223a-867f-4c0e-86d7-0a1eeb95e0fa` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-ba3991d4-4be2-483e-98bc-d0abd368bea6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-77606995-3ad5-44b2-a6d8-5b2caa652623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77606995-3ad5-44b2-a6d8-5b2caa652623
Content-Type: application/json

--- request body ---
{"handle":"qa-b1a4fd17042d","displayName":"QA b1a4fd17042d","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-77606995-3ad5-44b2-a6d8-5b2caa652623
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Location: /v1/accounts/qa-b1a4fd17042d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_58d0e801-cd1f-428e-89b1-c530f8eae4dc","handle":"qa-b1a4fd17042d","displayName":"QA b1a4fd17042d","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.145185824Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f7b21bec-3a9c-49cb-b1ef-d0cea77dd4c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7b21bec-3a9c-49cb-b1ef-d0cea77dd4c8
Content-Type: application/json

--- request body ---
{"handle":"qa-4e47190c9ee2","displayName":"QA 4e47190c9ee2","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7b21bec-3a9c-49cb-b1ef-d0cea77dd4c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-4e47190c9ee2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_42f563f6-5b8d-422f-be8c-2dc153e57998","handle":"qa-4e47190c9ee2","displayName":"QA 4e47190c9ee2","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.204212903Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-019f309b-936e-4eac-bcd2-ff68157d11f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-019f309b-936e-4eac-bcd2-ff68157d11f6
Content-Type: application/json

--- request body ---
{"handle":"qa-b1a4fd17042d","password":"****"}

--- response: 200 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-019f309b-936e-4eac-bcd2-ff68157d11f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_58d0e801-cd1f-428e-89b1-c530f8eae4dc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c2854124-d501-4985-b469-46f2bfcd4e1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2854124-d501-4985-b469-46f2bfcd4e1e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4e47190c9ee2","subject":"Error contract","message":"Hi"}

--- response: 201 in 38 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2854124-d501-4985-b469-46f2bfcd4e1e
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
Location: /v1/conversations/cnv_28eeb8c9-75b9-487f-b2fd-48dff6bc7244
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_28eeb8c9-75b9-487f-b2fd-48dff6bc7244","subject":"Error contract","status":"open","region":"eu","participants":["qa-b1a4fd17042d","qa-4e47190c9ee2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.312848256Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-b1a4fd17042d
correlation: qa-d2dcc159-d8b4-4e8d-8360-778d31dba2c2

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 825eb1a8-d77e-4a12-bd13-bc7b7c5a1680
X-Correlation-Id: qa-d2dcc159-d8b4-4e8d-8360-778d31dba2c2
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2dcc159-d8b4-4e8d-8360-778d31dba2c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-b1a4fd17042d","correlationId":"qa-d2dcc159-d8b4-4e8d-8360-778d31dba2c2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-98bd1e11-fb1f-470e-8e48-3fd8da378bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98bd1e11-fb1f-470e-8e48-3fd8da378bf6
Content-Type: application/json

--- request body ---
{"handle":"qa-4e47190c9ee2","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-98bd1e11-fb1f-470e-8e48-3fd8da378bf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_42f563f6-5b8d-422f-be8c-2dc153e57998"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b1f03eb-bc10-4bec-badc-acf6018a4244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b1f03eb-bc10-4bec-badc-acf6018a4244
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b1f03eb-bc10-4bec-badc-acf6018a4244
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
correlation: qa-3ea58288-115c-41b0-b125-ac1fb7cf1d76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ea58288-115c-41b0-b125-ac1fb7cf1d76
Content-Type: application/json

--- request body ---
{"handle":"qa-4e47190c9ee2","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ea58288-115c-41b0-b125-ac1fb7cf1d76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ea58288-115c-41b0-b125-ac1fb7cf1d76"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a6ad223a-867f-4c0e-86d7-0a1eeb95e0fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6ad223a-867f-4c0e-86d7-0a1eeb95e0fa
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a6ad223a-867f-4c0e-86d7-0a1eeb95e0fa
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
correlation: qa-ba3991d4-4be2-483e-98bc-d0abd368bea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba3991d4-4be2-483e-98bc-d0abd368bea6
Content-Type: application/json

--- request body ---
{"handle":"qa-b1a4fd17042d","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba3991d4-4be2-483e-98bc-d0abd368bea6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba3991d4-4be2-483e-98bc-d0abd368bea6"}
```
