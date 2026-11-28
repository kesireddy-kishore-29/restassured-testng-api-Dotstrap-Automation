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
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-a3171168-1d92-4b90-b14f-355bd519709a` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-d8d4df52-4499-456e-b1d3-52a5ab7e375d` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-e8821424-3d74-4883-8ad6-fb420b2ca190` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-a7808a31-591f-4265-bf79-9074af043880` |
| 5 | `POST /v1/credits/purchases` | 422 | 9 | `qa-53e04283-73a1-491c-9fe8-59adbaaede72` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-a7b29d59-4c5b-49bf-9c84-0a23e92b7f9b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-8dcf2c15-f55d-4f09-b07b-1938b8485681` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-e4cad92e-5d22-4c9c-a0e1-98af70bfbfd4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d7094321-c582-4ead-8235-0f5aaa6ff6b8` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-650d3c15-d480-4323-a84d-c9e3fe2ddf58` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a3171168-1d92-4b90-b14f-355bd519709a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3171168-1d92-4b90-b14f-355bd519709a
Content-Type: application/json

--- request body ---
{"handle":"qa-40d63cae84de","displayName":"QA 40d63cae84de","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3171168-1d92-4b90-b14f-355bd519709a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Location: /v1/accounts/qa-40d63cae84de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_073f042c-9ee3-4fe9-b38d-7970af65ee63","handle":"qa-40d63cae84de","displayName":"QA 40d63cae84de","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.907819035Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d8d4df52-4499-456e-b1d3-52a5ab7e375d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8d4df52-4499-456e-b1d3-52a5ab7e375d
Content-Type: application/json

--- request body ---
{"handle":"qa-cce2ee82eade","displayName":"QA cce2ee82eade","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8d4df52-4499-456e-b1d3-52a5ab7e375d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Location: /v1/accounts/qa-cce2ee82eade
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d89a6472-1331-4769-9dbe-69fbb5ac88fe","handle":"qa-cce2ee82eade","displayName":"QA cce2ee82eade","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.943817269Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e8821424-3d74-4883-8ad6-fb420b2ca190

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8821424-3d74-4883-8ad6-fb420b2ca190
Content-Type: application/json

--- request body ---
{"handle":"qa-40d63cae84de","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8821424-3d74-4883-8ad6-fb420b2ca190
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_073f042c-9ee3-4fe9-b38d-7970af65ee63"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a7808a31-591f-4265-bf79-9074af043880

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7808a31-591f-4265-bf79-9074af043880
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cce2ee82eade","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7808a31-591f-4265-bf79-9074af043880
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
Location: /v1/conversations/cnv_37e08635-7fba-43a4-a644-8a48c944ae5f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_37e08635-7fba-43a4-a644-8a48c944ae5f","subject":"Error contract","status":"open","region":"eu","participants":["qa-40d63cae84de","qa-cce2ee82eade"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:04.007048320Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-53e04283-73a1-491c-9fe8-59adbaaede72

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c760298ecb1d498b903e4c3e2af4c532
X-Correlation-Id: qa-53e04283-73a1-491c-9fe8-59adbaaede72
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53e04283-73a1-491c-9fe8-59adbaaede72
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-53e04283-73a1-491c-9fe8-59adbaaede72","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a7b29d59-4c5b-49bf-9c84-0a23e92b7f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7b29d59-4c5b-49bf-9c84-0a23e92b7f9b
Content-Type: application/json

--- request body ---
{"handle":"qa-cce2ee82eade","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7b29d59-4c5b-49bf-9c84-0a23e92b7f9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d89a6472-1331-4769-9dbe-69fbb5ac88fe"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8dcf2c15-f55d-4f09-b07b-1938b8485681

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dcf2c15-f55d-4f09-b07b-1938b8485681
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8dcf2c15-f55d-4f09-b07b-1938b8485681
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
correlation: qa-e4cad92e-5d22-4c9c-a0e1-98af70bfbfd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4cad92e-5d22-4c9c-a0e1-98af70bfbfd4
Content-Type: application/json

--- request body ---
{"handle":"qa-cce2ee82eade","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4cad92e-5d22-4c9c-a0e1-98af70bfbfd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4cad92e-5d22-4c9c-a0e1-98af70bfbfd4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7094321-c582-4ead-8235-0f5aaa6ff6b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7094321-c582-4ead-8235-0f5aaa6ff6b8
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7094321-c582-4ead-8235-0f5aaa6ff6b8
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
correlation: qa-650d3c15-d480-4323-a84d-c9e3fe2ddf58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-650d3c15-d480-4323-a84d-c9e3fe2ddf58
Content-Type: application/json

--- request body ---
{"handle":"qa-40d63cae84de","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-650d3c15-d480-4323-a84d-c9e3fe2ddf58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-650d3c15-d480-4323-a84d-c9e3fe2ddf58"}
```
