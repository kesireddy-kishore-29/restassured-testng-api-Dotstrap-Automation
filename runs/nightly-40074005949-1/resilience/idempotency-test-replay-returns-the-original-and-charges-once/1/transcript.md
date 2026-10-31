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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-5ce29ce0-2e1d-4ec8-8037-02798a4a885f` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-9ce5e96a-0838-4a0d-8744-0ac15d8d2bb9` |
| 3 | `POST /v1/credits/purchases` | 201 | 8 | `qa-047e4dc9-461a-495f-ace1-72c73f41091c` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-9736eb23-bf96-4beb-9b4b-77ebf79445d6` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-217b2fde-29ae-4d4a-8c8f-b1c4cb30911f` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-90f715ee-c772-404d-a27f-018d6b2779ce` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-8f0f2ec6-68f4-43ee-9076-af7baef1cf4f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ce29ce0-2e1d-4ec8-8037-02798a4a885f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ce29ce0-2e1d-4ec8-8037-02798a4a885f
Content-Type: application/json

--- request body ---
{"handle":"qa-1832066bcac0","displayName":"QA 1832066bcac0","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ce29ce0-2e1d-4ec8-8037-02798a4a885f
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
Location: /v1/accounts/qa-1832066bcac0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e53c857c-dbab-4a28-b719-a86926b1dbb5","handle":"qa-1832066bcac0","displayName":"QA 1832066bcac0","region":"eu","role":"user","createdAt":"2026-10-24T07:25:06.496279089Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9ce5e96a-0838-4a0d-8744-0ac15d8d2bb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ce5e96a-0838-4a0d-8744-0ac15d8d2bb9
Content-Type: application/json

--- request body ---
{"handle":"qa-1832066bcac0","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ce5e96a-0838-4a0d-8744-0ac15d8d2bb9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e53c857c-dbab-4a28-b719-a86926b1dbb5"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-047e4dc9-461a-495f-ace1-72c73f41091c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-05bc02504d0f4e7b9a4a7cdc4444883f
X-Correlation-Id: qa-047e4dc9-461a-495f-ace1-72c73f41091c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-047e4dc9-461a-495f-ace1-72c73f41091c
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
Location: /v1/credits/purchases/pur_a0205e84-daa0-47ee-ac45-1d1e84e9998a
Content-Length: 144

{"id":"pur_a0205e84-daa0-47ee-ac45-1d1e84e9998a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:06.531813008Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9736eb23-bf96-4beb-9b4b-77ebf79445d6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-05bc02504d0f4e7b9a4a7cdc4444883f
X-Correlation-Id: qa-9736eb23-bf96-4beb-9b4b-77ebf79445d6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-9736eb23-bf96-4beb-9b4b-77ebf79445d6
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
Location: /v1/credits/purchases/pur_a0205e84-daa0-47ee-ac45-1d1e84e9998a
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_a0205e84-daa0-47ee-ac45-1d1e84e9998a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:06.531813008Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-217b2fde-29ae-4d4a-8c8f-b1c4cb30911f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-217b2fde-29ae-4d4a-8c8f-b1c4cb30911f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-217b2fde-29ae-4d4a-8c8f-b1c4cb30911f
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

{"balance":15,"currency":"credits","accountId":"acc_e53c857c-dbab-4a28-b719-a86926b1dbb5"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-90f715ee-c772-404d-a27f-018d6b2779ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90f715ee-c772-404d-a27f-018d6b2779ce
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-90f715ee-c772-404d-a27f-018d6b2779ce
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
correlation: qa-8f0f2ec6-68f4-43ee-9076-af7baef1cf4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f0f2ec6-68f4-43ee-9076-af7baef1cf4f
Content-Type: application/json

--- request body ---
{"handle":"qa-1832066bcac0","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f0f2ec6-68f4-43ee-9076-af7baef1cf4f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f0f2ec6-68f4-43ee-9076-af7baef1cf4f"}
```
