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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-4e09119e-2f30-467f-af02-fae046e60b3e` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-8ffebe87-c8ed-4140-8d7c-979625c85b4b` |
| 3 | `POST /v1/credits/purchases` | 201 | 6 | `qa-9491829c-4101-4385-8a08-b45edf65f1f8` |
| 4 | `POST /v1/credits/purchases` | 409 | 10 | `qa-792bb957-e0a1-4d75-9665-dec3dc5c5c2e` |
| 5 | `GET /v1/credits/balance` | 200 | 5 | `qa-3d5550b8-a4c9-4d50-9e57-2798f8210bcf` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c9efab11-710a-4c61-86bb-1375b45ed2cb` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-c1906506-7f07-41ec-90c5-bcf3e3999546` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4e09119e-2f30-467f-af02-fae046e60b3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e09119e-2f30-467f-af02-fae046e60b3e
Content-Type: application/json

--- request body ---
{"handle":"qa-7897ba45af96","displayName":"QA 7897ba45af96","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e09119e-2f30-467f-af02-fae046e60b3e
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
Location: /v1/accounts/qa-7897ba45af96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f6a8e50-a8fe-4c66-855c-8e8ba985b2fb","handle":"qa-7897ba45af96","displayName":"QA 7897ba45af96","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.190153929Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8ffebe87-c8ed-4140-8d7c-979625c85b4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ffebe87-c8ed-4140-8d7c-979625c85b4b
Content-Type: application/json

--- request body ---
{"handle":"qa-7897ba45af96","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ffebe87-c8ed-4140-8d7c-979625c85b4b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f6a8e50-a8fe-4c66-855c-8e8ba985b2fb"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9491829c-4101-4385-8a08-b45edf65f1f8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c172641eeb5c4bc295c61aa61f6a7149
X-Correlation-Id: qa-9491829c-4101-4385-8a08-b45edf65f1f8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-9491829c-4101-4385-8a08-b45edf65f1f8
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
Location: /v1/credits/purchases/pur_c01fe5c3-7bc2-4129-8715-4db2a321b3b3
Content-Length: 144

{"id":"pur_c01fe5c3-7bc2-4129-8715-4db2a321b3b3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:44.223778162Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-792bb957-e0a1-4d75-9665-dec3dc5c5c2e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c172641eeb5c4bc295c61aa61f6a7149
X-Correlation-Id: qa-792bb957-e0a1-4d75-9665-dec3dc5c5c2e
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-792bb957-e0a1-4d75-9665-dec3dc5c5c2e
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-792bb957-e0a1-4d75-9665-dec3dc5c5c2e"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-3d5550b8-a4c9-4d50-9e57-2798f8210bcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d5550b8-a4c9-4d50-9e57-2798f8210bcf
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d5550b8-a4c9-4d50-9e57-2798f8210bcf
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

{"balance":15,"currency":"credits","accountId":"acc_7f6a8e50-a8fe-4c66-855c-8e8ba985b2fb"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c9efab11-710a-4c61-86bb-1375b45ed2cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9efab11-710a-4c61-86bb-1375b45ed2cb
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c9efab11-710a-4c61-86bb-1375b45ed2cb
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
correlation: qa-c1906506-7f07-41ec-90c5-bcf3e3999546

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1906506-7f07-41ec-90c5-bcf3e3999546
Content-Type: application/json

--- request body ---
{"handle":"qa-7897ba45af96","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1906506-7f07-41ec-90c5-bcf3e3999546
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1906506-7f07-41ec-90c5-bcf3e3999546"}
```
