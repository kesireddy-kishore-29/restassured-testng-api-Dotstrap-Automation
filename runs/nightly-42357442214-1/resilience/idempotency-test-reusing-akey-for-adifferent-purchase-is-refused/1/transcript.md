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
| 1 | `POST /v1/accounts` | 201 | 440 | `qa-f07f11ec-5d33-4838-be28-2e73c475b366` |
| 2 | `POST /v1/auth/token` | 200 | 117 | `qa-5077e2a1-75a8-4f26-86d1-3838391e9376` |
| 3 | `POST /v1/credits/purchases` | 201 | 64 | `qa-e6141f31-45da-41e6-9959-a013d0ac50ed` |
| 4 | `POST /v1/credits/purchases` | 409 | 49 | `qa-e772f96c-307f-4537-9fb4-323f48c936e9` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-30effd21-87b3-4747-916a-425753252636` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-8c49e16e-5a0c-4968-8e09-13e212c1e12a` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-049e6368-e414-4369-a462-a37f3aa7693f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f07f11ec-5d33-4838-be28-2e73c475b366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f07f11ec-5d33-4838-be28-2e73c475b366
Content-Type: application/json

--- request body ---
{"handle":"qa-90ca3846c1ef","displayName":"QA 90ca3846c1ef","password":"****","region":"eu"}

--- response: 201 in 440 ms ---
Date: Sat, 07 Nov 2026 08:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f07f11ec-5d33-4838-be28-2e73c475b366
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-90ca3846c1ef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4a484b4-5e09-4a56-af0d-ddcc224d7397","handle":"qa-90ca3846c1ef","displayName":"QA 90ca3846c1ef","region":"eu","role":"user","createdAt":"2026-11-07T08:55:02.770609388Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5077e2a1-75a8-4f26-86d1-3838391e9376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5077e2a1-75a8-4f26-86d1-3838391e9376
Content-Type: application/json

--- request body ---
{"handle":"qa-90ca3846c1ef","password":"****"}

--- response: 200 in 117 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5077e2a1-75a8-4f26-86d1-3838391e9376
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4a484b4-5e09-4a56-af0d-ddcc224d7397"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e6141f31-45da-41e6-9959-a013d0ac50ed

--- request headers ---
Accept: application/json
Idempotency-Key: qa-505f4da7129447a39be10c0439af97b6
X-Correlation-Id: qa-e6141f31-45da-41e6-9959-a013d0ac50ed
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 64 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6141f31-45da-41e6-9959-a013d0ac50ed
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
Location: /v1/credits/purchases/pur_0c6bfecb-d8b6-4e04-bdf6-4e958de5210a
Content-Length: 144

{"id":"pur_0c6bfecb-d8b6-4e04-bdf6-4e958de5210a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.399850326Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e772f96c-307f-4537-9fb4-323f48c936e9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-505f4da7129447a39be10c0439af97b6
X-Correlation-Id: qa-e772f96c-307f-4537-9fb4-323f48c936e9
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 49 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e772f96c-307f-4537-9fb4-323f48c936e9
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-e772f96c-307f-4537-9fb4-323f48c936e9"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-30effd21-87b3-4747-916a-425753252636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30effd21-87b3-4747-916a-425753252636
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-30effd21-87b3-4747-916a-425753252636
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

{"balance":15,"currency":"credits","accountId":"acc_a4a484b4-5e09-4a56-af0d-ddcc224d7397"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c49e16e-5a0c-4968-8e09-13e212c1e12a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c49e16e-5a0c-4968-8e09-13e212c1e12a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c49e16e-5a0c-4968-8e09-13e212c1e12a
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
correlation: qa-049e6368-e414-4369-a462-a37f3aa7693f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-049e6368-e414-4369-a462-a37f3aa7693f
Content-Type: application/json

--- request body ---
{"handle":"qa-90ca3846c1ef","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-049e6368-e414-4369-a462-a37f3aa7693f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-049e6368-e414-4369-a462-a37f3aa7693f"}
```
