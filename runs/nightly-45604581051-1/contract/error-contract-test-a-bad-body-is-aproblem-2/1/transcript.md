# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-b9881b2d-34b1-4e4d-8049-32f6a142efd6` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-93d2fb07-9825-4f74-86a3-0dd7e7295907` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-3d76d331-b181-4a92-931c-3566a7a08d48` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-a745abed-6b7f-4bfc-b125-a207a2dde2b5` |
| 5 | `POST /v1/auth/token` | 422 | 47 | `qa-8284f88a-bf15-4281-8a3c-f5c25400bd3a` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-017ef4bf-5b6d-4e23-93e8-95ee16585056` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-df758956-7584-489e-8699-68244f6498bb` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-bafe3d71-2105-411a-b185-2aa590c36225` |
| 9 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-a529889b-825a-4113-b1a8-aed1b73ae6ab` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-b1c61165-88ef-4a1d-8c90-2f3a3ef42363` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9881b2d-34b1-4e4d-8049-32f6a142efd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9881b2d-34b1-4e4d-8049-32f6a142efd6
Content-Type: application/json

--- request body ---
{"handle":"qa-4e63cfd0b717","displayName":"QA 4e63cfd0b717","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9881b2d-34b1-4e4d-8049-32f6a142efd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-4e63cfd0b717
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ec2e8d3-aefd-43c2-a7c3-e85214afc578","handle":"qa-4e63cfd0b717","displayName":"QA 4e63cfd0b717","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.210799167Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-93d2fb07-9825-4f74-86a3-0dd7e7295907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93d2fb07-9825-4f74-86a3-0dd7e7295907
Content-Type: application/json

--- request body ---
{"handle":"qa-1023af6dca2d","displayName":"QA 1023af6dca2d","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-93d2fb07-9825-4f74-86a3-0dd7e7295907
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Location: /v1/accounts/qa-1023af6dca2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ff29421-79be-4e01-b8a0-828b397fde0c","handle":"qa-1023af6dca2d","displayName":"QA 1023af6dca2d","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.260143994Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3d76d331-b181-4a92-931c-3566a7a08d48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d76d331-b181-4a92-931c-3566a7a08d48
Content-Type: application/json

--- request body ---
{"handle":"qa-4e63cfd0b717","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d76d331-b181-4a92-931c-3566a7a08d48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ec2e8d3-aefd-43c2-a7c3-e85214afc578"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a745abed-6b7f-4bfc-b125-a207a2dde2b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a745abed-6b7f-4bfc-b125-a207a2dde2b5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1023af6dca2d","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a745abed-6b7f-4bfc-b125-a207a2dde2b5
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
Location: /v1/conversations/cnv_9325e9b3-ef63-409d-8d3f-0b8473840827
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9325e9b3-ef63-409d-8d3f-0b8473840827","subject":"Error contract","status":"open","region":"eu","participants":["qa-4e63cfd0b717","qa-1023af6dca2d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.325613073Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8284f88a-bf15-4281-8a3c-f5c25400bd3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8284f88a-bf15-4281-8a3c-f5c25400bd3a
Content-Type: application/json

--- request body ---
{"handle":"qa-4e63cfd0b717","password":"****","ttlSeconds":0}

--- response: 422 in 47 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8284f88a-bf15-4281-8a3c-f5c25400bd3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-8284f88a-bf15-4281-8a3c-f5c25400bd3a","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-017ef4bf-5b6d-4e23-93e8-95ee16585056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-017ef4bf-5b6d-4e23-93e8-95ee16585056
Content-Type: application/json

--- request body ---
{"handle":"qa-1023af6dca2d","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-017ef4bf-5b6d-4e23-93e8-95ee16585056
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ff29421-79be-4e01-b8a0-828b397fde0c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-df758956-7584-489e-8699-68244f6498bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df758956-7584-489e-8699-68244f6498bb
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-df758956-7584-489e-8699-68244f6498bb
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
correlation: qa-bafe3d71-2105-411a-b185-2aa590c36225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bafe3d71-2105-411a-b185-2aa590c36225
Content-Type: application/json

--- request body ---
{"handle":"qa-1023af6dca2d","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bafe3d71-2105-411a-b185-2aa590c36225
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bafe3d71-2105-411a-b185-2aa590c36225"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a529889b-825a-4113-b1a8-aed1b73ae6ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a529889b-825a-4113-b1a8-aed1b73ae6ab
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a529889b-825a-4113-b1a8-aed1b73ae6ab
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
correlation: qa-b1c61165-88ef-4a1d-8c90-2f3a3ef42363

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1c61165-88ef-4a1d-8c90-2f3a3ef42363
Content-Type: application/json

--- request body ---
{"handle":"qa-4e63cfd0b717","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1c61165-88ef-4a1d-8c90-2f3a3ef42363
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1c61165-88ef-4a1d-8c90-2f3a3ef42363"}
```
