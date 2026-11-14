# Transcript: Same key + same body replays the original purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 444 | `qa-850e84a0-1824-4756-81ae-7c3e34c80f4b` |
| 2 | `POST /v1/auth/token` | 200 | 69 | `qa-479ea23f-69f7-479b-9e62-241694e43910` |
| 3 | `POST /v1/credits/purchases` | 201 | 58 | `qa-ecb1694c-93a8-4959-94fb-4d5492dc4783` |
| 4 | `POST /v1/credits/purchases` | 200 | 19 | `qa-7b3d44f9-085b-41ae-ae2b-7a5df5f33c26` |
| 5 | `GET /v1/credits/balance` | 200 | 53 | `qa-3deac19f-1602-4f6e-b549-4a4cebc5232d` |
| 6 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ed97baf4-9db6-4bb8-a89c-ad23cb39cd89` |
| 7 | `POST /v1/auth/token` | 401 | 17 | `qa-34c7d00e-cc6d-46ab-b2a0-54ab9a2e0090` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-850e84a0-1824-4756-81ae-7c3e34c80f4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-850e84a0-1824-4756-81ae-7c3e34c80f4b
Content-Type: application/json

--- request body ---
{"handle":"qa-e38d10ef4fd0","displayName":"QA e38d10ef4fd0","password":"****","region":"eu"}

--- response: 201 in 444 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-850e84a0-1824-4756-81ae-7c3e34c80f4b
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
Location: /v1/accounts/qa-e38d10ef4fd0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7180cb92-176c-4eca-a627-d65011adcac8","handle":"qa-e38d10ef4fd0","displayName":"QA e38d10ef4fd0","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.011947703Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-479ea23f-69f7-479b-9e62-241694e43910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-479ea23f-69f7-479b-9e62-241694e43910
Content-Type: application/json

--- request body ---
{"handle":"qa-e38d10ef4fd0","password":"****"}

--- response: 200 in 69 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-479ea23f-69f7-479b-9e62-241694e43910
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7180cb92-176c-4eca-a627-d65011adcac8"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ecb1694c-93a8-4959-94fb-4d5492dc4783

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a9469633016642d4a1ef7394fd241c49
X-Correlation-Id: qa-ecb1694c-93a8-4959-94fb-4d5492dc4783
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecb1694c-93a8-4959-94fb-4d5492dc4783
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
Location: /v1/credits/purchases/pur_6b1915c1-ce6c-45d2-b1b2-170634e70f28
Content-Length: 144

{"id":"pur_6b1915c1-ce6c-45d2-b1b2-170634e70f28","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.654620258Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7b3d44f9-085b-41ae-ae2b-7a5df5f33c26

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a9469633016642d4a1ef7394fd241c49
X-Correlation-Id: qa-7b3d44f9-085b-41ae-ae2b-7a5df5f33c26
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b3d44f9-085b-41ae-ae2b-7a5df5f33c26
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
Location: /v1/credits/purchases/pur_6b1915c1-ce6c-45d2-b1b2-170634e70f28
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_6b1915c1-ce6c-45d2-b1b2-170634e70f28","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-06T09:30:31.654620258Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-3deac19f-1602-4f6e-b549-4a4cebc5232d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3deac19f-1602-4f6e-b549-4a4cebc5232d
Content-Type: application/json

--- response: 200 in 53 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3deac19f-1602-4f6e-b549-4a4cebc5232d
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

{"balance":15,"currency":"credits","accountId":"acc_7180cb92-176c-4eca-a627-d65011adcac8"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed97baf4-9db6-4bb8-a89c-ad23cb39cd89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed97baf4-9db6-4bb8-a89c-ad23cb39cd89
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed97baf4-9db6-4bb8-a89c-ad23cb39cd89
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
correlation: qa-34c7d00e-cc6d-46ab-b2a0-54ab9a2e0090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34c7d00e-cc6d-46ab-b2a0-54ab9a2e0090
Content-Type: application/json

--- request body ---
{"handle":"qa-e38d10ef4fd0","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34c7d00e-cc6d-46ab-b2a0-54ab9a2e0090
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-34c7d00e-cc6d-46ab-b2a0-54ab9a2e0090"}
```
