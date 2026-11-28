# Transcript: A purchase without an Idempotency-Key is refused with 400

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#purchaseWithoutIdempotencyKeyIsA400` |
| Features | FEAT-IDEMP-03, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-ad52d4d1-3c70-47f1-99ed-41e6be5c001a` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-1c3d5445-e736-4730-9f71-72361223ea71` |
| 3 | `POST /v1/credits/purchases` | 400 | 16 | `qa-72276429-dc8c-47c3-b81f-e1494ea388ad` |
| 4 | `GET /v1/credits/balance` | 200 | 7 | `qa-6bf58d5e-9234-493e-b8bf-ed16963d3ebb` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-910eab91-2df5-4b8f-b864-a572f3a685f6` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-e332279b-3df7-4179-92ca-5253677d3230` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ad52d4d1-3c70-47f1-99ed-41e6be5c001a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad52d4d1-3c70-47f1-99ed-41e6be5c001a
Content-Type: application/json

--- request body ---
{"handle":"qa-841c4646f157","displayName":"QA 841c4646f157","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad52d4d1-3c70-47f1-99ed-41e6be5c001a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-841c4646f157
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6072d401-cc59-4375-b296-9c5f6789de59","handle":"qa-841c4646f157","displayName":"QA 841c4646f157","region":"eu","role":"user","createdAt":"2026-11-23T10:54:53.642748756Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1c3d5445-e736-4730-9f71-72361223ea71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c3d5445-e736-4730-9f71-72361223ea71
Content-Type: application/json

--- request body ---
{"handle":"qa-841c4646f157","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c3d5445-e736-4730-9f71-72361223ea71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6072d401-cc59-4375-b296-9c5f6789de59"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-72276429-dc8c-47c3-b81f-e1494ea388ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72276429-dc8c-47c3-b81f-e1494ea388ad
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72276429-dc8c-47c3-b81f-e1494ea388ad
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
Content-Length: 319

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-72276429-dc8c-47c3-b81f-e1494ea388ad"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-6bf58d5e-9234-493e-b8bf-ed16963d3ebb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bf58d5e-9234-493e-b8bf-ed16963d3ebb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bf58d5e-9234-493e-b8bf-ed16963d3ebb
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
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_6072d401-cc59-4375-b296-9c5f6789de59"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-910eab91-2df5-4b8f-b864-a572f3a685f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-910eab91-2df5-4b8f-b864-a572f3a685f6
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-910eab91-2df5-4b8f-b864-a572f3a685f6
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e332279b-3df7-4179-92ca-5253677d3230

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e332279b-3df7-4179-92ca-5253677d3230
Content-Type: application/json

--- request body ---
{"handle":"qa-841c4646f157","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e332279b-3df7-4179-92ca-5253677d3230
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e332279b-3df7-4179-92ca-5253677d3230"}
```
