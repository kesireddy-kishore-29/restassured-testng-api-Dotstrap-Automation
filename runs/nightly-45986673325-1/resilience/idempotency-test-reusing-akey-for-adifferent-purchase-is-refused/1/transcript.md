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
| 1 | `POST /v1/accounts` | 201 | 322 | `qa-28c07210-8aba-4c3e-b53f-7459814becaf` |
| 2 | `POST /v1/auth/token` | 200 | 45 | `qa-2e19b86d-1b15-4f03-9a9d-1c7462c51a13` |
| 3 | `POST /v1/credits/purchases` | 201 | 51 | `qa-8d59d102-f660-47a4-8a38-3d08a5b3bfbf` |
| 4 | `POST /v1/credits/purchases` | 409 | 30 | `qa-777134bc-9ce8-47a1-8e74-f15d326b1c21` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-533211f2-67a9-4d80-8ceb-c67c39f99e08` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-bb5df2b4-b7b4-40cf-9431-1c1cb34258f0` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-b37c154d-9a96-499f-b9b2-171223e98457` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-28c07210-8aba-4c3e-b53f-7459814becaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28c07210-8aba-4c3e-b53f-7459814becaf
Content-Type: application/json

--- request body ---
{"handle":"qa-8f959de28409","displayName":"QA 8f959de28409","password":"****","region":"eu"}

--- response: 201 in 322 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-28c07210-8aba-4c3e-b53f-7459814becaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-8f959de28409
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a19cb0dc-12b0-4a86-889f-438845b57c29","handle":"qa-8f959de28409","displayName":"QA 8f959de28409","region":"eu","role":"user","createdAt":"2026-11-27T10:59:48.120282776Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2e19b86d-1b15-4f03-9a9d-1c7462c51a13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e19b86d-1b15-4f03-9a9d-1c7462c51a13
Content-Type: application/json

--- request body ---
{"handle":"qa-8f959de28409","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e19b86d-1b15-4f03-9a9d-1c7462c51a13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a19cb0dc-12b0-4a86-889f-438845b57c29"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8d59d102-f660-47a4-8a38-3d08a5b3bfbf

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cd0edd0e118f4ee1b396bce23993b0ea
X-Correlation-Id: qa-8d59d102-f660-47a4-8a38-3d08a5b3bfbf
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 51 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d59d102-f660-47a4-8a38-3d08a5b3bfbf
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
Location: /v1/credits/purchases/pur_26602e42-56b2-42ef-b426-89fb4e1f8682
Content-Length: 144

{"id":"pur_26602e42-56b2-42ef-b426-89fb4e1f8682","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.581876191Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-777134bc-9ce8-47a1-8e74-f15d326b1c21

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cd0edd0e118f4ee1b396bce23993b0ea
X-Correlation-Id: qa-777134bc-9ce8-47a1-8e74-f15d326b1c21
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-777134bc-9ce8-47a1-8e74-f15d326b1c21
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-777134bc-9ce8-47a1-8e74-f15d326b1c21"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-533211f2-67a9-4d80-8ceb-c67c39f99e08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-533211f2-67a9-4d80-8ceb-c67c39f99e08
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-533211f2-67a9-4d80-8ceb-c67c39f99e08
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

{"balance":15,"currency":"credits","accountId":"acc_a19cb0dc-12b0-4a86-889f-438845b57c29"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb5df2b4-b7b4-40cf-9431-1c1cb34258f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb5df2b4-b7b4-40cf-9431-1c1cb34258f0
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb5df2b4-b7b4-40cf-9431-1c1cb34258f0
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
correlation: qa-b37c154d-9a96-499f-b9b2-171223e98457

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b37c154d-9a96-499f-b9b2-171223e98457
Content-Type: application/json

--- request body ---
{"handle":"qa-8f959de28409","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b37c154d-9a96-499f-b9b2-171223e98457
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b37c154d-9a96-499f-b9b2-171223e98457"}
```
