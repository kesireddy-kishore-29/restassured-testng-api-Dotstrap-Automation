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
| 1 | `POST /v1/accounts` | 201 | 454 | `qa-882923a7-0d38-4e48-a835-28058bbe0661` |
| 2 | `POST /v1/auth/token` | 200 | 74 | `qa-0badaa23-1340-4199-94dc-ba027e4b777a` |
| 3 | `POST /v1/credits/purchases` | 201 | 69 | `qa-fe4f4023-b275-4600-beed-7d9c0392298a` |
| 4 | `POST /v1/credits/purchases` | 409 | 53 | `qa-172e3b04-9e2d-4c3e-bc92-1ad55c217b91` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-4334f1bd-2f52-48ed-b906-bc0efb98b49c` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-4401452e-1cb1-4a2f-b41a-ceee339e1982` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-ce2b6181-8039-4cbb-bcfc-82e5d96533d3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-882923a7-0d38-4e48-a835-28058bbe0661

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-882923a7-0d38-4e48-a835-28058bbe0661
Content-Type: application/json

--- request body ---
{"handle":"qa-d00a16f3e55c","displayName":"QA d00a16f3e55c","password":"****","region":"eu"}

--- response: 201 in 454 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-882923a7-0d38-4e48-a835-28058bbe0661
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
Location: /v1/accounts/qa-d00a16f3e55c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0bf70318-7dff-4383-929c-877826f1b407","handle":"qa-d00a16f3e55c","displayName":"QA d00a16f3e55c","region":"eu","role":"user","createdAt":"2026-11-14T09:05:14.126722313Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0badaa23-1340-4199-94dc-ba027e4b777a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0badaa23-1340-4199-94dc-ba027e4b777a
Content-Type: application/json

--- request body ---
{"handle":"qa-d00a16f3e55c","password":"****"}

--- response: 200 in 74 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0badaa23-1340-4199-94dc-ba027e4b777a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bf70318-7dff-4383-929c-877826f1b407"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fe4f4023-b275-4600-beed-7d9c0392298a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d0a1701d303d43e8b6d1efe9d3276a8d
X-Correlation-Id: qa-fe4f4023-b275-4600-beed-7d9c0392298a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 69 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe4f4023-b275-4600-beed-7d9c0392298a
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
Location: /v1/credits/purchases/pur_83add9f0-b1fc-4844-a68d-6048d63641e3
Content-Length: 144

{"id":"pur_83add9f0-b1fc-4844-a68d-6048d63641e3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:14.821984215Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-172e3b04-9e2d-4c3e-bc92-1ad55c217b91

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d0a1701d303d43e8b6d1efe9d3276a8d
X-Correlation-Id: qa-172e3b04-9e2d-4c3e-bc92-1ad55c217b91
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 53 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-172e3b04-9e2d-4c3e-bc92-1ad55c217b91
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-172e3b04-9e2d-4c3e-bc92-1ad55c217b91"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-4334f1bd-2f52-48ed-b906-bc0efb98b49c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4334f1bd-2f52-48ed-b906-bc0efb98b49c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4334f1bd-2f52-48ed-b906-bc0efb98b49c
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

{"balance":15,"currency":"credits","accountId":"acc_0bf70318-7dff-4383-929c-877826f1b407"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4401452e-1cb1-4a2f-b41a-ceee339e1982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4401452e-1cb1-4a2f-b41a-ceee339e1982
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4401452e-1cb1-4a2f-b41a-ceee339e1982
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
correlation: qa-ce2b6181-8039-4cbb-bcfc-82e5d96533d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce2b6181-8039-4cbb-bcfc-82e5d96533d3
Content-Type: application/json

--- request body ---
{"handle":"qa-d00a16f3e55c","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce2b6181-8039-4cbb-bcfc-82e5d96533d3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce2b6181-8039-4cbb-bcfc-82e5d96533d3"}
```
