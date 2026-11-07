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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-289f9bc9-b126-4238-9386-6367b73e96c0` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-b6a7c460-8afe-4e1a-b0dd-3c5639ea0d1e` |
| 3 | `POST /v1/credits/purchases` | 201 | 6 | `qa-6b3dc48b-1547-4293-8c7b-eca15d7ec932` |
| 4 | `POST /v1/credits/purchases` | 409 | 6 | `qa-2504fb4a-608f-4c5d-9170-632f27a273b6` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-4bc53a6d-e187-442c-ba4c-3d93fef55160` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e218483a-6328-47a5-ae51-1b6cb1e84187` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-f6258f59-c294-4df6-b5f3-70781a5b528a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-289f9bc9-b126-4238-9386-6367b73e96c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-289f9bc9-b126-4238-9386-6367b73e96c0
Content-Type: application/json

--- request body ---
{"handle":"qa-860b90c42b53","displayName":"QA 860b90c42b53","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-289f9bc9-b126-4238-9386-6367b73e96c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-860b90c42b53
X-Served-Region: eu
Content-Length: 181

{"id":"acc_877cdaff-df5c-4595-97ad-bb0d46c1d44e","handle":"qa-860b90c42b53","displayName":"QA 860b90c42b53","region":"eu","role":"user","createdAt":"2026-10-30T08:45:49.431691395Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b6a7c460-8afe-4e1a-b0dd-3c5639ea0d1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6a7c460-8afe-4e1a-b0dd-3c5639ea0d1e
Content-Type: application/json

--- request body ---
{"handle":"qa-860b90c42b53","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6a7c460-8afe-4e1a-b0dd-3c5639ea0d1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_877cdaff-df5c-4595-97ad-bb0d46c1d44e"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6b3dc48b-1547-4293-8c7b-eca15d7ec932

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cb5a53006fbb4750baf616834f2e1772
X-Correlation-Id: qa-6b3dc48b-1547-4293-8c7b-eca15d7ec932
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b3dc48b-1547-4293-8c7b-eca15d7ec932
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
Location: /v1/credits/purchases/pur_9555fc63-635c-4325-ae09-884c9159ba6b
Content-Length: 144

{"id":"pur_9555fc63-635c-4325-ae09-884c9159ba6b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.461993072Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2504fb4a-608f-4c5d-9170-632f27a273b6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cb5a53006fbb4750baf616834f2e1772
X-Correlation-Id: qa-2504fb4a-608f-4c5d-9170-632f27a273b6
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2504fb4a-608f-4c5d-9170-632f27a273b6
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-2504fb4a-608f-4c5d-9170-632f27a273b6"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-4bc53a6d-e187-442c-ba4c-3d93fef55160

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bc53a6d-e187-442c-ba4c-3d93fef55160
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bc53a6d-e187-442c-ba4c-3d93fef55160
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

{"balance":15,"currency":"credits","accountId":"acc_877cdaff-df5c-4595-97ad-bb0d46c1d44e"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e218483a-6328-47a5-ae51-1b6cb1e84187

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e218483a-6328-47a5-ae51-1b6cb1e84187
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e218483a-6328-47a5-ae51-1b6cb1e84187
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
correlation: qa-f6258f59-c294-4df6-b5f3-70781a5b528a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6258f59-c294-4df6-b5f3-70781a5b528a
Content-Type: application/json

--- request body ---
{"handle":"qa-860b90c42b53","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6258f59-c294-4df6-b5f3-70781a5b528a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6258f59-c294-4df6-b5f3-70781a5b528a"}
```
