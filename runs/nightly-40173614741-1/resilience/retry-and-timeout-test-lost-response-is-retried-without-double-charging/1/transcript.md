# Transcript: A lost response is retried with the same key and the purchase is charged once

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#lostResponseIsRetriedWithoutDoubleCharging` |
| Features | FEAT-RES-01, FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 470 | `qa-b80074a5-879d-4eb0-bfa6-68cd1c27d507` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-c8d1f117-d358-4f69-8b77-dd43dc957b4b` |
| 3 | `POST /v1/credits/purchases` | 503 | 56 | `qa-38f15648-9dda-415d-9187-1bff103a0542` |
| 4 | `POST /v1/credits/purchases` | 200 | 15 | `qa-555e7389-33bd-41d2-b4f4-bb849702fbfa` |
| 5 | `GET /v1/credits/ledger` | 200 | 31 | `qa-e7b586a4-b011-4834-8d21-7f4ad3df55fa` |
| 6 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-4d7c0662-1e65-4df1-9ac5-4a309ea638c7` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-85099e52-bc4b-4c7d-8ba6-0e07357bc5fa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b80074a5-879d-4eb0-bfa6-68cd1c27d507

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b80074a5-879d-4eb0-bfa6-68cd1c27d507
Content-Type: application/json

--- request body ---
{"handle":"qa-ad3fa958771b","displayName":"QA ad3fa958771b","password":"****","region":"eu"}

--- response: 201 in 470 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b80074a5-879d-4eb0-bfa6-68cd1c27d507
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-ad3fa958771b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2378eae7-a55d-44f5-af93-201f160f500f","handle":"qa-ad3fa958771b","displayName":"QA ad3fa958771b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.245989296Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c8d1f117-d358-4f69-8b77-dd43dc957b4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8d1f117-d358-4f69-8b77-dd43dc957b4b
Content-Type: application/json

--- request body ---
{"handle":"qa-ad3fa958771b","password":"****"}

--- response: 200 in 49 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8d1f117-d358-4f69-8b77-dd43dc957b4b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2378eae7-a55d-44f5-af93-201f160f500f"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-38f15648-9dda-415d-9187-1bff103a0542

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3f102f5babbe426babcb3ad2cac9b8a5
X-Fault-Key: a58e1c21-0483-4f02-8649-8ff198429faf
X-Fault: drop-response
X-Correlation-Id: qa-38f15648-9dda-415d-9187-1bff103a0542
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 56 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-38f15648-9dda-415d-9187-1bff103a0542
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
Location: /v1/credits/purchases/pur_843f4ca4-d67a-41d6-abbf-3094bdc62ec3
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-38f15648-9dda-415d-9187-1bff103a0542"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-555e7389-33bd-41d2-b4f4-bb849702fbfa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3f102f5babbe426babcb3ad2cac9b8a5
X-Fault-Key: a58e1c21-0483-4f02-8649-8ff198429faf
X-Fault: drop-response
X-Correlation-Id: qa-555e7389-33bd-41d2-b4f4-bb849702fbfa
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-555e7389-33bd-41d2-b4f4-bb849702fbfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
Location: /v1/credits/purchases/pur_843f4ca4-d67a-41d6-abbf-3094bdc62ec3
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_843f4ca4-d67a-41d6-abbf-3094bdc62ec3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:27.944271304Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-e7b586a4-b011-4834-8d21-7f4ad3df55fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7b586a4-b011-4834-8d21-7f4ad3df55fa
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7b586a4-b011-4834-8d21-7f4ad3df55fa
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
Content-Length: 398

{"items":[{"id":"led_a7a6c6c2-347a-4623-aa59-7267e1f9faa7","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-25T07:40:27.246001007Z"},{"id":"led_89a5f56d-59eb-42d3-83b8-190da6cfbf66","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_843f4ca4-d67a-41d6-abbf-3094bdc62ec3","createdAt":"2026-10-25T07:40:27.944271304Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d7c0662-1e65-4df1-9ac5-4a309ea638c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d7c0662-1e65-4df1-9ac5-4a309ea638c7
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d7c0662-1e65-4df1-9ac5-4a309ea638c7
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
correlation: qa-85099e52-bc4b-4c7d-8ba6-0e07357bc5fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85099e52-bc4b-4c7d-8ba6-0e07357bc5fa
Content-Type: application/json

--- request body ---
{"handle":"qa-ad3fa958771b","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85099e52-bc4b-4c7d-8ba6-0e07357bc5fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-85099e52-bc4b-4c7d-8ba6-0e07357bc5fa"}
```
