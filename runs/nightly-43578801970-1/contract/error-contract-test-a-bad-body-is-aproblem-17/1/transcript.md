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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-a85ac6d0-3072-4f9a-b2bf-3c9bdf201132` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-e2c13b8c-6d5a-4c21-95f9-bd76946032d7` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-94ecf2b5-c9ad-44b4-b372-659ac310def6` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-5c6fc8d4-a9f8-48b3-a3f9-d152625c3442` |
| 5 | `POST /v1/credits/purchases` | 422 | 6 | `qa-ca253995-1cb9-439d-8eff-6b48a59dd935` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-cb3f4c32-4f24-4c46-a007-e309f2b8322a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3797fea6-45ae-4e6b-8be5-40f8a56969b5` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-018a3b50-e537-4fcb-8704-84075cd8612e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-f4a22961-43de-4044-b5ad-2b7553c0ac6a` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-fb9d2139-9d40-4421-9738-ba3107484a09` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a85ac6d0-3072-4f9a-b2bf-3c9bdf201132

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a85ac6d0-3072-4f9a-b2bf-3c9bdf201132
Content-Type: application/json

--- request body ---
{"handle":"qa-ff7d5edd4a2c","displayName":"QA ff7d5edd4a2c","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a85ac6d0-3072-4f9a-b2bf-3c9bdf201132
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Location: /v1/accounts/qa-ff7d5edd4a2c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_691122ba-ff67-448a-b18c-e446c2eea255","handle":"qa-ff7d5edd4a2c","displayName":"QA ff7d5edd4a2c","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.736460390Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e2c13b8c-6d5a-4c21-95f9-bd76946032d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2c13b8c-6d5a-4c21-95f9-bd76946032d7
Content-Type: application/json

--- request body ---
{"handle":"qa-fdc126bccd62","displayName":"QA fdc126bccd62","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2c13b8c-6d5a-4c21-95f9-bd76946032d7
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
Location: /v1/accounts/qa-fdc126bccd62
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74df664e-de86-4387-bf15-166e1df44062","handle":"qa-fdc126bccd62","displayName":"QA fdc126bccd62","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.768348569Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-94ecf2b5-c9ad-44b4-b372-659ac310def6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94ecf2b5-c9ad-44b4-b372-659ac310def6
Content-Type: application/json

--- request body ---
{"handle":"qa-ff7d5edd4a2c","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-94ecf2b5-c9ad-44b4-b372-659ac310def6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_691122ba-ff67-448a-b18c-e446c2eea255"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5c6fc8d4-a9f8-48b3-a3f9-d152625c3442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c6fc8d4-a9f8-48b3-a3f9-d152625c3442
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fdc126bccd62","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c6fc8d4-a9f8-48b3-a3f9-d152625c3442
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
Location: /v1/conversations/cnv_698cbb30-759c-43ed-bf1b-06126e502d38
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_698cbb30-759c-43ed-bf1b-06126e502d38","subject":"Error contract","status":"open","region":"eu","participants":["qa-ff7d5edd4a2c","qa-fdc126bccd62"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.821150220Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ca253995-1cb9-439d-8eff-6b48a59dd935

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c34b230f3f1b4c0e9232ea646e7b97a9
X-Correlation-Id: qa-ca253995-1cb9-439d-8eff-6b48a59dd935
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca253995-1cb9-439d-8eff-6b48a59dd935
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-ca253995-1cb9-439d-8eff-6b48a59dd935","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cb3f4c32-4f24-4c46-a007-e309f2b8322a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb3f4c32-4f24-4c46-a007-e309f2b8322a
Content-Type: application/json

--- request body ---
{"handle":"qa-fdc126bccd62","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb3f4c32-4f24-4c46-a007-e309f2b8322a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74df664e-de86-4387-bf15-166e1df44062"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3797fea6-45ae-4e6b-8be5-40f8a56969b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3797fea6-45ae-4e6b-8be5-40f8a56969b5
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3797fea6-45ae-4e6b-8be5-40f8a56969b5
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
correlation: qa-018a3b50-e537-4fcb-8704-84075cd8612e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-018a3b50-e537-4fcb-8704-84075cd8612e
Content-Type: application/json

--- request body ---
{"handle":"qa-fdc126bccd62","password":"****"}

--- response: 401 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-018a3b50-e537-4fcb-8704-84075cd8612e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-018a3b50-e537-4fcb-8704-84075cd8612e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f4a22961-43de-4044-b5ad-2b7553c0ac6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4a22961-43de-4044-b5ad-2b7553c0ac6a
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f4a22961-43de-4044-b5ad-2b7553c0ac6a
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
correlation: qa-fb9d2139-9d40-4421-9738-ba3107484a09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb9d2139-9d40-4421-9738-ba3107484a09
Content-Type: application/json

--- request body ---
{"handle":"qa-ff7d5edd4a2c","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb9d2139-9d40-4421-9738-ba3107484a09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb9d2139-9d40-4421-9738-ba3107484a09"}
```
