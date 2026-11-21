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
| 1 | `POST /v1/accounts` | 201 | 453 | `qa-5b9cdd85-8321-4b54-9ea4-3bd297ecb411` |
| 2 | `POST /v1/auth/token` | 200 | 93 | `qa-29c5c216-4fa1-4d3c-9fb4-a04f7c356dcf` |
| 3 | `POST /v1/credits/purchases` | 201 | 69 | `qa-85d51afe-b93b-40e6-ad33-330cc54d10d4` |
| 4 | `POST /v1/credits/purchases` | 409 | 38 | `qa-4fa0882d-13a3-4fef-b526-4cd375bd92a2` |
| 5 | `GET /v1/credits/balance` | 200 | 9 | `qa-f468a7d6-1870-49d9-a609-9a72459b9d11` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-7a95bab3-90d2-4b6b-89c4-98a01f8eaec4` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-35d83905-46b4-4b97-aad2-5a22498258f9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b9cdd85-8321-4b54-9ea4-3bd297ecb411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b9cdd85-8321-4b54-9ea4-3bd297ecb411
Content-Type: application/json

--- request body ---
{"handle":"qa-b7463ba95959","displayName":"QA b7463ba95959","password":"****","region":"eu"}

--- response: 201 in 453 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b9cdd85-8321-4b54-9ea4-3bd297ecb411
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-b7463ba95959
X-Served-Region: eu
Content-Length: 181

{"id":"acc_638a0423-d436-401d-afad-0d3675726b70","handle":"qa-b7463ba95959","displayName":"QA b7463ba95959","region":"eu","role":"user","createdAt":"2026-11-20T10:10:01.404923093Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-29c5c216-4fa1-4d3c-9fb4-a04f7c356dcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29c5c216-4fa1-4d3c-9fb4-a04f7c356dcf
Content-Type: application/json

--- request body ---
{"handle":"qa-b7463ba95959","password":"****"}

--- response: 200 in 93 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-29c5c216-4fa1-4d3c-9fb4-a04f7c356dcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_638a0423-d436-401d-afad-0d3675726b70"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-85d51afe-b93b-40e6-ad33-330cc54d10d4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a4e25c5ee47e4fbf8eeb4b17460ca3d3
X-Correlation-Id: qa-85d51afe-b93b-40e6-ad33-330cc54d10d4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 69 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-85d51afe-b93b-40e6-ad33-330cc54d10d4
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
Location: /v1/credits/purchases/pur_439001fd-73cd-437e-9596-6b2db2e15f85
Content-Length: 144

{"id":"pur_439001fd-73cd-437e-9596-6b2db2e15f85","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.027206129Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4fa0882d-13a3-4fef-b526-4cd375bd92a2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a4e25c5ee47e4fbf8eeb4b17460ca3d3
X-Correlation-Id: qa-4fa0882d-13a3-4fef-b526-4cd375bd92a2
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 38 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fa0882d-13a3-4fef-b526-4cd375bd92a2
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-4fa0882d-13a3-4fef-b526-4cd375bd92a2"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-f468a7d6-1870-49d9-a609-9a72459b9d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f468a7d6-1870-49d9-a609-9a72459b9d11
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f468a7d6-1870-49d9-a609-9a72459b9d11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_638a0423-d436-401d-afad-0d3675726b70"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a95bab3-90d2-4b6b-89c4-98a01f8eaec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a95bab3-90d2-4b6b-89c4-98a01f8eaec4
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a95bab3-90d2-4b6b-89c4-98a01f8eaec4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 9
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-35d83905-46b4-4b97-aad2-5a22498258f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35d83905-46b4-4b97-aad2-5a22498258f9
Content-Type: application/json

--- request body ---
{"handle":"qa-b7463ba95959","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35d83905-46b4-4b97-aad2-5a22498258f9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35d83905-46b4-4b97-aad2-5a22498258f9"}
```
