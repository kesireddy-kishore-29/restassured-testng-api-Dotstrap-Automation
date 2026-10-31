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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-bd6277b4-2259-44eb-99e7-94ae4b335089` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-5044ba69-fda8-4042-82dd-5d00c4281aab` |
| 3 | `POST /v1/credits/purchases` | 201 | 7 | `qa-fca29811-3bf9-4102-a12b-4d301de6e550` |
| 4 | `POST /v1/credits/purchases` | 409 | 6 | `qa-91096f02-5612-497f-bcd3-4b4e1459a786` |
| 5 | `GET /v1/credits/balance` | 200 | 16 | `qa-e5ae23a6-d20d-41e4-b8d4-faa6f8fb63d9` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-8cb690a0-e5e4-4fe4-9efa-15eca9d80e61` |
| 7 | `POST /v1/auth/token` | 401 | 13 | `qa-5cfa5b46-df89-4fb5-9068-e285a232ebaa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd6277b4-2259-44eb-99e7-94ae4b335089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd6277b4-2259-44eb-99e7-94ae4b335089
Content-Type: application/json

--- request body ---
{"handle":"qa-003e7b56fc26","displayName":"QA 003e7b56fc26","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd6277b4-2259-44eb-99e7-94ae4b335089
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
Location: /v1/accounts/qa-003e7b56fc26
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4e810e71-48d1-4702-b28c-bf711fe4c4be","handle":"qa-003e7b56fc26","displayName":"QA 003e7b56fc26","region":"eu","role":"user","createdAt":"2026-10-23T07:41:16.091154938Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5044ba69-fda8-4042-82dd-5d00c4281aab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5044ba69-fda8-4042-82dd-5d00c4281aab
Content-Type: application/json

--- request body ---
{"handle":"qa-003e7b56fc26","password":"****"}

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-5044ba69-fda8-4042-82dd-5d00c4281aab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4e810e71-48d1-4702-b28c-bf711fe4c4be"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fca29811-3bf9-4102-a12b-4d301de6e550

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4d01d99b36d249298c89f96e35fa6d76
X-Correlation-Id: qa-fca29811-3bf9-4102-a12b-4d301de6e550
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-fca29811-3bf9-4102-a12b-4d301de6e550
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
Location: /v1/credits/purchases/pur_27155ed9-2e0b-45d4-9783-56294bbba9c5
Content-Length: 144

{"id":"pur_27155ed9-2e0b-45d4-9783-56294bbba9c5","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-23T07:41:16.123637875Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-91096f02-5612-497f-bcd3-4b4e1459a786

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4d01d99b36d249298c89f96e35fa6d76
X-Correlation-Id: qa-91096f02-5612-497f-bcd3-4b4e1459a786
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91096f02-5612-497f-bcd3-4b4e1459a786
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-91096f02-5612-497f-bcd3-4b4e1459a786"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-e5ae23a6-d20d-41e4-b8d4-faa6f8fb63d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5ae23a6-d20d-41e4-b8d4-faa6f8fb63d9
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5ae23a6-d20d-41e4-b8d4-faa6f8fb63d9
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

{"balance":15,"currency":"credits","accountId":"acc_4e810e71-48d1-4702-b28c-bf711fe4c4be"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cb690a0-e5e4-4fe4-9efa-15eca9d80e61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cb690a0-e5e4-4fe4-9efa-15eca9d80e61
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cb690a0-e5e4-4fe4-9efa-15eca9d80e61
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
correlation: qa-5cfa5b46-df89-4fb5-9068-e285a232ebaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cfa5b46-df89-4fb5-9068-e285a232ebaa
Content-Type: application/json

--- request body ---
{"handle":"qa-003e7b56fc26","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cfa5b46-df89-4fb5-9068-e285a232ebaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5cfa5b46-df89-4fb5-9068-e285a232ebaa"}
```
