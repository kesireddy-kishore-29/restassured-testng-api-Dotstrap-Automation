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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-34213d6f-cb6c-4ecc-b60b-8aa4fc629d98` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-59833a05-4d26-49b5-bc3d-c81a3e82636d` |
| 3 | `POST /v1/credits/purchases` | 201 | 6 | `qa-c50f8351-623f-413b-8570-fabf7b36b8f7` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-297de26f-e967-477c-b7fb-c78efcd47868` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-f5f6e6b6-7159-4059-8d57-051ee64ee33d` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-fa12e6ec-f0c6-46d7-81f8-4b172b35ceaa` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-53cbbc4e-2b05-4a79-b340-a1d422f95581` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34213d6f-cb6c-4ecc-b60b-8aa4fc629d98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34213d6f-cb6c-4ecc-b60b-8aa4fc629d98
Content-Type: application/json

--- request body ---
{"handle":"qa-4889fcb2ca6c","displayName":"QA 4889fcb2ca6c","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-34213d6f-cb6c-4ecc-b60b-8aa4fc629d98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Location: /v1/accounts/qa-4889fcb2ca6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c69c36be-16e5-4e03-8c5c-a2849c61b78c","handle":"qa-4889fcb2ca6c","displayName":"QA 4889fcb2ca6c","region":"eu","role":"user","createdAt":"2026-10-26T07:54:43.563744344Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-59833a05-4d26-49b5-bc3d-c81a3e82636d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59833a05-4d26-49b5-bc3d-c81a3e82636d
Content-Type: application/json

--- request body ---
{"handle":"qa-4889fcb2ca6c","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-59833a05-4d26-49b5-bc3d-c81a3e82636d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c69c36be-16e5-4e03-8c5c-a2849c61b78c"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c50f8351-623f-413b-8570-fabf7b36b8f7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9e2eda29bbd4480595fc57f1a0375d96
X-Correlation-Id: qa-c50f8351-623f-413b-8570-fabf7b36b8f7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c50f8351-623f-413b-8570-fabf7b36b8f7
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
Location: /v1/credits/purchases/pur_03ab051a-dc3b-4f94-a093-cbd3e77a27a0
Content-Length: 144

{"id":"pur_03ab051a-dc3b-4f94-a093-cbd3e77a27a0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.600184808Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-297de26f-e967-477c-b7fb-c78efcd47868

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9e2eda29bbd4480595fc57f1a0375d96
X-Correlation-Id: qa-297de26f-e967-477c-b7fb-c78efcd47868
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-297de26f-e967-477c-b7fb-c78efcd47868
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
Location: /v1/credits/purchases/pur_03ab051a-dc3b-4f94-a093-cbd3e77a27a0
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_03ab051a-dc3b-4f94-a093-cbd3e77a27a0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:43.600184808Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-f5f6e6b6-7159-4059-8d57-051ee64ee33d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5f6e6b6-7159-4059-8d57-051ee64ee33d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5f6e6b6-7159-4059-8d57-051ee64ee33d
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

{"balance":15,"currency":"credits","accountId":"acc_c69c36be-16e5-4e03-8c5c-a2849c61b78c"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa12e6ec-f0c6-46d7-81f8-4b172b35ceaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa12e6ec-f0c6-46d7-81f8-4b172b35ceaa
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa12e6ec-f0c6-46d7-81f8-4b172b35ceaa
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
correlation: qa-53cbbc4e-2b05-4a79-b340-a1d422f95581

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53cbbc4e-2b05-4a79-b340-a1d422f95581
Content-Type: application/json

--- request body ---
{"handle":"qa-4889fcb2ca6c","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53cbbc4e-2b05-4a79-b340-a1d422f95581
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-53cbbc4e-2b05-4a79-b340-a1d422f95581"}
```
