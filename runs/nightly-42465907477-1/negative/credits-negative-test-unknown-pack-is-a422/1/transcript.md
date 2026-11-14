# Transcript: An unknown credit pack is a 422 on packId

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#unknownPackIsA422` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-4cfcadb5-a567-4c61-9527-e1c63d77417a` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-1ba74b40-d358-4ae6-95e6-5bdb03cb4075` |
| 3 | `POST /v1/credits/purchases` | 422 | 14 | `qa-13293062-ee83-4a64-b7e5-25760a39751f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-83014db4-e530-4c89-9b86-d6e33667a0ba` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-997801b5-90c4-481b-809a-7aba5fd58395` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4cfcadb5-a567-4c61-9527-e1c63d77417a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cfcadb5-a567-4c61-9527-e1c63d77417a
Content-Type: application/json

--- request body ---
{"handle":"qa-10c0d688862d","displayName":"QA 10c0d688862d","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cfcadb5-a567-4c61-9527-e1c63d77417a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-10c0d688862d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f26e5cc3-e982-4e37-b757-1c33738e3f88","handle":"qa-10c0d688862d","displayName":"QA 10c0d688862d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:06.906930981Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1ba74b40-d358-4ae6-95e6-5bdb03cb4075

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ba74b40-d358-4ae6-95e6-5bdb03cb4075
Content-Type: application/json

--- request body ---
{"handle":"qa-10c0d688862d","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ba74b40-d358-4ae6-95e6-5bdb03cb4075
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f26e5cc3-e982-4e37-b757-1c33738e3f88"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-13293062-ee83-4a64-b7e5-25760a39751f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f61f6de1c3dc418fa6d7bb63c1b89154
X-Correlation-Id: qa-13293062-ee83-4a64-b7e5-25760a39751f
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13293062-ee83-4a64-b7e5-25760a39751f
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-13293062-ee83-4a64-b7e5-25760a39751f","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83014db4-e530-4c89-9b86-d6e33667a0ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83014db4-e530-4c89-9b86-d6e33667a0ba
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83014db4-e530-4c89-9b86-d6e33667a0ba
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-997801b5-90c4-481b-809a-7aba5fd58395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-997801b5-90c4-481b-809a-7aba5fd58395
Content-Type: application/json

--- request body ---
{"handle":"qa-10c0d688862d","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-997801b5-90c4-481b-809a-7aba5fd58395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-997801b5-90c4-481b-809a-7aba5fd58395"}
```
