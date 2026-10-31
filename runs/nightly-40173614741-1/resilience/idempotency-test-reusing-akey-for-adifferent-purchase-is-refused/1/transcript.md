# Transcript: Same key + different body is a 409 and charges nothing

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#reusingAKeyForADifferentPurchaseIsRefused` |
| Features | FEAT-IDEMP-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-4c53dfee-2849-4e45-a278-8e3c153bdb4d` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-dae15bfc-f375-484c-9271-726d78355585` |
| 3 | `POST /v1/credits/purchases` | 201 | 7 | `qa-2069c764-b195-4ff1-963d-d87599519e42` |
| 4 | `POST /v1/credits/purchases` | 409 | 7 | `qa-b36a9017-56c1-4db5-a43a-c0ab80da2c81` |
| 5 | `GET /v1/credits/balance` | 200 | 14 | `qa-b3c6cb14-c700-4020-bdee-2ac7ffaaf84e` |
| 6 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-0fefa175-3bbb-4f39-b291-ca10869fc02e` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-910ea3af-4b95-4cc2-85bd-5bcb8e7181c3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4c53dfee-2849-4e45-a278-8e3c153bdb4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c53dfee-2849-4e45-a278-8e3c153bdb4d
Content-Type: application/json

--- request body ---
{"handle":"qa-fbe805774d39","displayName":"QA fbe805774d39","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c53dfee-2849-4e45-a278-8e3c153bdb4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-fbe805774d39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b6f271c-cfcd-4bcd-ac6d-816dee85a58c","handle":"qa-fbe805774d39","displayName":"QA fbe805774d39","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.343409829Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dae15bfc-f375-484c-9271-726d78355585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dae15bfc-f375-484c-9271-726d78355585
Content-Type: application/json

--- request body ---
{"handle":"qa-fbe805774d39","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-dae15bfc-f375-484c-9271-726d78355585
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b6f271c-cfcd-4bcd-ac6d-816dee85a58c"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2069c764-b195-4ff1-963d-d87599519e42

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1c13d34b07694ec294d77c18f3e4ebda
X-Correlation-Id: qa-2069c764-b195-4ff1-963d-d87599519e42
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-2069c764-b195-4ff1-963d-d87599519e42
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
Location: /v1/credits/purchases/pur_f443af50-320a-4f23-99ce-51c858be5f24
Content-Length: 144

{"id":"pur_f443af50-320a-4f23-99ce-51c858be5f24","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:28.372144531Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b36a9017-56c1-4db5-a43a-c0ab80da2c81

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1c13d34b07694ec294d77c18f3e4ebda
X-Correlation-Id: qa-b36a9017-56c1-4db5-a43a-c0ab80da2c81
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b36a9017-56c1-4db5-a43a-c0ab80da2c81
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
Content-Length: 334

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-b36a9017-56c1-4db5-a43a-c0ab80da2c81"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-b3c6cb14-c700-4020-bdee-2ac7ffaaf84e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3c6cb14-c700-4020-bdee-2ac7ffaaf84e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3c6cb14-c700-4020-bdee-2ac7ffaaf84e
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
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_1b6f271c-cfcd-4bcd-ac6d-816dee85a58c"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0fefa175-3bbb-4f39-b291-ca10869fc02e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fefa175-3bbb-4f39-b291-ca10869fc02e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0fefa175-3bbb-4f39-b291-ca10869fc02e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-910ea3af-4b95-4cc2-85bd-5bcb8e7181c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-910ea3af-4b95-4cc2-85bd-5bcb8e7181c3
Content-Type: application/json

--- request body ---
{"handle":"qa-fbe805774d39","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-910ea3af-4b95-4cc2-85bd-5bcb8e7181c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-910ea3af-4b95-4cc2-85bd-5bcb8e7181c3"}
```
