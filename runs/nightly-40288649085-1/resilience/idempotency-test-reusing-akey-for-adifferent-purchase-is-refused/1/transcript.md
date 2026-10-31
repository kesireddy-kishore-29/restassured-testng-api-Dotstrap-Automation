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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-a9ec8950-8ac4-43be-8269-7e81fcc27576` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-1f91d313-5117-4af3-ad1b-8e988dd2faf5` |
| 3 | `POST /v1/credits/purchases` | 201 | 5 | `qa-e569f28f-02ad-402a-81a4-976d42fb6ae4` |
| 4 | `POST /v1/credits/purchases` | 409 | 7 | `qa-15f230cc-c866-4d4b-9f8a-d5cb8038013b` |
| 5 | `GET /v1/credits/balance` | 200 | 8 | `qa-bee2cd42-6a93-453e-953c-9834457be0fa` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-f256774c-f45a-49d1-8032-b9ca09c53c9c` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-2311fc54-2b0a-481c-bb43-1d744cda632a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9ec8950-8ac4-43be-8269-7e81fcc27576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9ec8950-8ac4-43be-8269-7e81fcc27576
Content-Type: application/json

--- request body ---
{"handle":"qa-90dc462d3d25","displayName":"QA 90dc462d3d25","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9ec8950-8ac4-43be-8269-7e81fcc27576
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
Location: /v1/accounts/qa-90dc462d3d25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1d456294-fef9-4ec9-a06a-0da73d1d699e","handle":"qa-90dc462d3d25","displayName":"QA 90dc462d3d25","region":"eu","role":"user","createdAt":"2026-10-26T07:54:43.687131428Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1f91d313-5117-4af3-ad1b-8e988dd2faf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f91d313-5117-4af3-ad1b-8e988dd2faf5
Content-Type: application/json

--- request body ---
{"handle":"qa-90dc462d3d25","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f91d313-5117-4af3-ad1b-8e988dd2faf5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d456294-fef9-4ec9-a06a-0da73d1d699e"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e569f28f-02ad-402a-81a4-976d42fb6ae4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3e808da8217c4870a19bbb2c0f2af68c
X-Correlation-Id: qa-e569f28f-02ad-402a-81a4-976d42fb6ae4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-e569f28f-02ad-402a-81a4-976d42fb6ae4
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
Location: /v1/credits/purchases/pur_fbd00a62-f8ad-40c3-9850-a025f9992646
Content-Length: 144

{"id":"pur_fbd00a62-f8ad-40c3-9850-a025f9992646","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.713313951Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-15f230cc-c866-4d4b-9f8a-d5cb8038013b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3e808da8217c4870a19bbb2c0f2af68c
X-Correlation-Id: qa-15f230cc-c866-4d4b-9f8a-d5cb8038013b
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15f230cc-c866-4d4b-9f8a-d5cb8038013b
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-15f230cc-c866-4d4b-9f8a-d5cb8038013b"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-bee2cd42-6a93-453e-953c-9834457be0fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bee2cd42-6a93-453e-953c-9834457be0fa
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-bee2cd42-6a93-453e-953c-9834457be0fa
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

{"balance":15,"currency":"credits","accountId":"acc_1d456294-fef9-4ec9-a06a-0da73d1d699e"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f256774c-f45a-49d1-8032-b9ca09c53c9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f256774c-f45a-49d1-8032-b9ca09c53c9c
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f256774c-f45a-49d1-8032-b9ca09c53c9c
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
correlation: qa-2311fc54-2b0a-481c-bb43-1d744cda632a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2311fc54-2b0a-481c-bb43-1d744cda632a
Content-Type: application/json

--- request body ---
{"handle":"qa-90dc462d3d25","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2311fc54-2b0a-481c-bb43-1d744cda632a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2311fc54-2b0a-481c-bb43-1d744cda632a"}
```
