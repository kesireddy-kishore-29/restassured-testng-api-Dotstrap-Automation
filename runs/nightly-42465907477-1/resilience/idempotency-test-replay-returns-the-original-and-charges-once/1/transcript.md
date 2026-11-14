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
| 1 | `POST /v1/accounts` | 201 | 415 | `qa-deee7402-0e3e-4ff0-9485-a8921ea3a7e5` |
| 2 | `POST /v1/auth/token` | 200 | 91 | `qa-dfcf329e-58e2-44a9-89e3-2b0747ba5585` |
| 3 | `POST /v1/credits/purchases` | 201 | 91 | `qa-79b7d21a-408c-4bdb-9c0e-e850122fe0db` |
| 4 | `POST /v1/credits/purchases` | 200 | 26 | `qa-1b79b610-b6ed-4630-adf0-44aadbeb9fa9` |
| 5 | `GET /v1/credits/balance` | 200 | 40 | `qa-61ec5a19-903b-4bf6-9abe-047e22357d28` |
| 6 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-286f5359-2cc6-41c5-8f5d-df5ab67480d2` |
| 7 | `POST /v1/auth/token` | 401 | 25 | `qa-3593b5f2-1ff9-4985-ba93-0b45a68608d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-deee7402-0e3e-4ff0-9485-a8921ea3a7e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-deee7402-0e3e-4ff0-9485-a8921ea3a7e5
Content-Type: application/json

--- request body ---
{"handle":"qa-692b0368f3a3","displayName":"QA 692b0368f3a3","password":"****","region":"eu"}

--- response: 201 in 415 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-deee7402-0e3e-4ff0-9485-a8921ea3a7e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-692b0368f3a3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0504df85-13a6-4e4d-b81d-b42080f05133","handle":"qa-692b0368f3a3","displayName":"QA 692b0368f3a3","region":"eu","role":"user","createdAt":"2026-11-08T09:09:11.506464744Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dfcf329e-58e2-44a9-89e3-2b0747ba5585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfcf329e-58e2-44a9-89e3-2b0747ba5585
Content-Type: application/json

--- request body ---
{"handle":"qa-692b0368f3a3","password":"****"}

--- response: 200 in 91 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfcf329e-58e2-44a9-89e3-2b0747ba5585
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0504df85-13a6-4e4d-b81d-b42080f05133"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-79b7d21a-408c-4bdb-9c0e-e850122fe0db

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e3e5798c1a3647d991d6cf175ea292fb
X-Correlation-Id: qa-79b7d21a-408c-4bdb-9c0e-e850122fe0db
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 91 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-79b7d21a-408c-4bdb-9c0e-e850122fe0db
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
Location: /v1/credits/purchases/pur_0ac0854c-82c5-46f2-a21d-b34976c4bcbb
Content-Length: 144

{"id":"pur_0ac0854c-82c5-46f2-a21d-b34976c4bcbb","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.161615371Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1b79b610-b6ed-4630-adf0-44aadbeb9fa9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e3e5798c1a3647d991d6cf175ea292fb
X-Correlation-Id: qa-1b79b610-b6ed-4630-adf0-44aadbeb9fa9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 26 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b79b610-b6ed-4630-adf0-44aadbeb9fa9
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
Location: /v1/credits/purchases/pur_0ac0854c-82c5-46f2-a21d-b34976c4bcbb
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_0ac0854c-82c5-46f2-a21d-b34976c4bcbb","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-08T09:09:12.161615371Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-61ec5a19-903b-4bf6-9abe-047e22357d28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61ec5a19-903b-4bf6-9abe-047e22357d28
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-61ec5a19-903b-4bf6-9abe-047e22357d28
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

{"balance":15,"currency":"credits","accountId":"acc_0504df85-13a6-4e4d-b81d-b42080f05133"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-286f5359-2cc6-41c5-8f5d-df5ab67480d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-286f5359-2cc6-41c5-8f5d-df5ab67480d2
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-286f5359-2cc6-41c5-8f5d-df5ab67480d2
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
correlation: qa-3593b5f2-1ff9-4985-ba93-0b45a68608d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3593b5f2-1ff9-4985-ba93-0b45a68608d8
Content-Type: application/json

--- request body ---
{"handle":"qa-692b0368f3a3","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3593b5f2-1ff9-4985-ba93-0b45a68608d8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3593b5f2-1ff9-4985-ba93-0b45a68608d8"}
```
