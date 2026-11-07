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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-f982fa19-2589-4e61-8c88-6674082e232d` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-df9470ec-f90a-4cc9-ae41-aaafce023ac9` |
| 3 | `POST /v1/credits/purchases` | 201 | 11 | `qa-c699060e-2adb-4cba-b090-a39ad461c479` |
| 4 | `POST /v1/credits/purchases` | 200 | 6 | `qa-129cf3cd-b78e-4a99-bd6b-acd457b85e8d` |
| 5 | `GET /v1/credits/balance` | 200 | 8 | `qa-cf5df98b-833a-4fde-9fdc-e881104cc049` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0509fe49-e889-4613-b631-55d5b77f4bd5` |
| 7 | `POST /v1/auth/token` | 401 | 9 | `qa-9ea9a23f-4452-4a80-9aa8-96aecb5988a7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f982fa19-2589-4e61-8c88-6674082e232d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f982fa19-2589-4e61-8c88-6674082e232d
Content-Type: application/json

--- request body ---
{"handle":"qa-1edd3cfa8e98","displayName":"QA 1edd3cfa8e98","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f982fa19-2589-4e61-8c88-6674082e232d
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
Location: /v1/accounts/qa-1edd3cfa8e98
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92e02d3f-ddf2-4280-8e4e-f4455357f26b","handle":"qa-1edd3cfa8e98","displayName":"QA 1edd3cfa8e98","region":"eu","role":"user","createdAt":"2026-11-01T09:23:30.442492395Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-df9470ec-f90a-4cc9-ae41-aaafce023ac9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df9470ec-f90a-4cc9-ae41-aaafce023ac9
Content-Type: application/json

--- request body ---
{"handle":"qa-1edd3cfa8e98","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-df9470ec-f90a-4cc9-ae41-aaafce023ac9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92e02d3f-ddf2-4280-8e4e-f4455357f26b"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c699060e-2adb-4cba-b090-a39ad461c479

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3c66a6d3f05b4db795aeadb8aac35d46
X-Correlation-Id: qa-c699060e-2adb-4cba-b090-a39ad461c479
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c699060e-2adb-4cba-b090-a39ad461c479
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
Location: /v1/credits/purchases/pur_6eff11bb-991d-4106-8fd1-15a3785f08cb
Content-Length: 144

{"id":"pur_6eff11bb-991d-4106-8fd1-15a3785f08cb","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.500394756Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-129cf3cd-b78e-4a99-bd6b-acd457b85e8d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3c66a6d3f05b4db795aeadb8aac35d46
X-Correlation-Id: qa-129cf3cd-b78e-4a99-bd6b-acd457b85e8d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-129cf3cd-b78e-4a99-bd6b-acd457b85e8d
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
Location: /v1/credits/purchases/pur_6eff11bb-991d-4106-8fd1-15a3785f08cb
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_6eff11bb-991d-4106-8fd1-15a3785f08cb","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.500394756Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-cf5df98b-833a-4fde-9fdc-e881104cc049

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf5df98b-833a-4fde-9fdc-e881104cc049
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf5df98b-833a-4fde-9fdc-e881104cc049
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

{"balance":15,"currency":"credits","accountId":"acc_92e02d3f-ddf2-4280-8e4e-f4455357f26b"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0509fe49-e889-4613-b631-55d5b77f4bd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0509fe49-e889-4613-b631-55d5b77f4bd5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0509fe49-e889-4613-b631-55d5b77f4bd5
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
correlation: qa-9ea9a23f-4452-4a80-9aa8-96aecb5988a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ea9a23f-4452-4a80-9aa8-96aecb5988a7
Content-Type: application/json

--- request body ---
{"handle":"qa-1edd3cfa8e98","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ea9a23f-4452-4a80-9aa8-96aecb5988a7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9ea9a23f-4452-4a80-9aa8-96aecb5988a7"}
```
