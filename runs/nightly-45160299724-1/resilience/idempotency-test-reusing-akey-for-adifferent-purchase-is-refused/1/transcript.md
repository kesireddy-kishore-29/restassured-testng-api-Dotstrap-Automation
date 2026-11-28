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
| 1 | `POST /v1/accounts` | 201 | 477 | `qa-2ac88261-6990-4e42-baab-7af365689c3c` |
| 2 | `POST /v1/auth/token` | 200 | 64 | `qa-d9107aac-07f9-4e4c-82fc-a60bf5da26ee` |
| 3 | `POST /v1/credits/purchases` | 201 | 55 | `qa-e8acc2fb-ed2d-4fe7-b3bb-f526c56b5e3d` |
| 4 | `POST /v1/credits/purchases` | 409 | 23 | `qa-747beaa9-c094-4a64-86e0-045644f5abc9` |
| 5 | `GET /v1/credits/balance` | 200 | 9 | `qa-97b2c2b2-c011-48da-996a-a6c427611637` |
| 6 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-77558f3f-bf64-466b-be70-46c388efce82` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-c82e165f-295c-491a-bb65-22b016cc67a2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2ac88261-6990-4e42-baab-7af365689c3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ac88261-6990-4e42-baab-7af365689c3c
Content-Type: application/json

--- request body ---
{"handle":"qa-5e72131b7ccd","displayName":"QA 5e72131b7ccd","password":"****","region":"eu"}

--- response: 201 in 477 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ac88261-6990-4e42-baab-7af365689c3c
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
Location: /v1/accounts/qa-5e72131b7ccd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0af8f13-88be-4c51-8f2a-a6b6db9139e0","handle":"qa-5e72131b7ccd","displayName":"QA 5e72131b7ccd","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.674225213Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d9107aac-07f9-4e4c-82fc-a60bf5da26ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9107aac-07f9-4e4c-82fc-a60bf5da26ee
Content-Type: application/json

--- request body ---
{"handle":"qa-5e72131b7ccd","password":"****"}

--- response: 200 in 64 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9107aac-07f9-4e4c-82fc-a60bf5da26ee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0af8f13-88be-4c51-8f2a-a6b6db9139e0"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e8acc2fb-ed2d-4fe7-b3bb-f526c56b5e3d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e1ff823ed71444f8933da9a9bc961520
X-Correlation-Id: qa-e8acc2fb-ed2d-4fe7-b3bb-f526c56b5e3d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 55 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8acc2fb-ed2d-4fe7-b3bb-f526c56b5e3d
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
Location: /v1/credits/purchases/pur_0526ab88-0437-4d21-9b3c-82f4e7b52df4
Content-Length: 144

{"id":"pur_0526ab88-0437-4d21-9b3c-82f4e7b52df4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.271473811Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-747beaa9-c094-4a64-86e0-045644f5abc9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e1ff823ed71444f8933da9a9bc961520
X-Correlation-Id: qa-747beaa9-c094-4a64-86e0-045644f5abc9
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-747beaa9-c094-4a64-86e0-045644f5abc9
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-747beaa9-c094-4a64-86e0-045644f5abc9"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-97b2c2b2-c011-48da-996a-a6c427611637

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97b2c2b2-c011-48da-996a-a6c427611637
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-97b2c2b2-c011-48da-996a-a6c427611637
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

{"balance":15,"currency":"credits","accountId":"acc_e0af8f13-88be-4c51-8f2a-a6b6db9139e0"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77558f3f-bf64-466b-be70-46c388efce82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77558f3f-bf64-466b-be70-46c388efce82
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77558f3f-bf64-466b-be70-46c388efce82
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
correlation: qa-c82e165f-295c-491a-bb65-22b016cc67a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c82e165f-295c-491a-bb65-22b016cc67a2
Content-Type: application/json

--- request body ---
{"handle":"qa-5e72131b7ccd","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c82e165f-295c-491a-bb65-22b016cc67a2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c82e165f-295c-491a-bb65-22b016cc67a2"}
```
