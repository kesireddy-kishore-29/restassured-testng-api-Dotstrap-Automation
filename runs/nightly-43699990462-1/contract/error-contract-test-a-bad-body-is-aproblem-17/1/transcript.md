# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-4300a4f9-6fa0-4e2e-a6c6-106a091bcb7e` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-b74655fd-0890-483f-b014-bc92ba9fb670` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-f38fe0f2-3b82-421a-ac2a-af3b7c028b3f` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-a517ccde-8a63-4740-9eb3-86f829deb6d6` |
| 5 | `POST /v1/credits/purchases` | 422 | 5 | `qa-10c35d88-52b4-48a8-a5f0-6054c68d21fe` |
| 6 | `POST /v1/auth/token` | 200 | 5 | `qa-3fe183ca-1c44-47c6-84af-8a9d682739c2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5a8ebd91-aff8-4908-9eb5-451ec9483960` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-7f7b8d50-4008-4bbd-875d-7c50c62664da` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-401b488d-6666-4d67-a910-119dec61d558` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-d9809b72-af11-4513-b055-a745b6d97b7b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4300a4f9-6fa0-4e2e-a6c6-106a091bcb7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4300a4f9-6fa0-4e2e-a6c6-106a091bcb7e
Content-Type: application/json

--- request body ---
{"handle":"qa-4172b75f7e83","displayName":"QA 4172b75f7e83","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4300a4f9-6fa0-4e2e-a6c6-106a091bcb7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Location: /v1/accounts/qa-4172b75f7e83
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7e5fd0b-85ea-4740-89ef-ae8360b82c4a","handle":"qa-4172b75f7e83","displayName":"QA 4172b75f7e83","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.654805216Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b74655fd-0890-483f-b014-bc92ba9fb670

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b74655fd-0890-483f-b014-bc92ba9fb670
Content-Type: application/json

--- request body ---
{"handle":"qa-922802d91888","displayName":"QA 922802d91888","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b74655fd-0890-483f-b014-bc92ba9fb670
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Location: /v1/accounts/qa-922802d91888
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf439480-f675-495f-b261-e9fe9593398e","handle":"qa-922802d91888","displayName":"QA 922802d91888","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.677964392Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f38fe0f2-3b82-421a-ac2a-af3b7c028b3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f38fe0f2-3b82-421a-ac2a-af3b7c028b3f
Content-Type: application/json

--- request body ---
{"handle":"qa-4172b75f7e83","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f38fe0f2-3b82-421a-ac2a-af3b7c028b3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7e5fd0b-85ea-4740-89ef-ae8360b82c4a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a517ccde-8a63-4740-9eb3-86f829deb6d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a517ccde-8a63-4740-9eb3-86f829deb6d6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-922802d91888","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a517ccde-8a63-4740-9eb3-86f829deb6d6
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
Location: /v1/conversations/cnv_0f988e8b-4cf6-4eae-9e38-c340455e81c0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0f988e8b-4cf6-4eae-9e38-c340455e81c0","subject":"Error contract","status":"open","region":"eu","participants":["qa-4172b75f7e83","qa-922802d91888"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.715478247Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-10c35d88-52b4-48a8-a5f0-6054c68d21fe

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3390626833594a34b02bfce4a8e76f87
X-Correlation-Id: qa-10c35d88-52b4-48a8-a5f0-6054c68d21fe
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10c35d88-52b4-48a8-a5f0-6054c68d21fe
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-10c35d88-52b4-48a8-a5f0-6054c68d21fe","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3fe183ca-1c44-47c6-84af-8a9d682739c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fe183ca-1c44-47c6-84af-8a9d682739c2
Content-Type: application/json

--- request body ---
{"handle":"qa-922802d91888","password":"****"}

--- response: 200 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fe183ca-1c44-47c6-84af-8a9d682739c2
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf439480-f675-495f-b261-e9fe9593398e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5a8ebd91-aff8-4908-9eb5-451ec9483960

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a8ebd91-aff8-4908-9eb5-451ec9483960
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5a8ebd91-aff8-4908-9eb5-451ec9483960
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
correlation: qa-7f7b8d50-4008-4bbd-875d-7c50c62664da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f7b8d50-4008-4bbd-875d-7c50c62664da
Content-Type: application/json

--- request body ---
{"handle":"qa-922802d91888","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f7b8d50-4008-4bbd-875d-7c50c62664da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f7b8d50-4008-4bbd-875d-7c50c62664da"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-401b488d-6666-4d67-a910-119dec61d558

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-401b488d-6666-4d67-a910-119dec61d558
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-401b488d-6666-4d67-a910-119dec61d558
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
correlation: qa-d9809b72-af11-4513-b055-a745b6d97b7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9809b72-af11-4513-b055-a745b6d97b7b
Content-Type: application/json

--- request body ---
{"handle":"qa-4172b75f7e83","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9809b72-af11-4513-b055-a745b6d97b7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9809b72-af11-4513-b055-a745b6d97b7b"}
```
