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
| 1 | `POST /v1/accounts` | 201 | 294 | `qa-85c3950f-46a9-4b29-b68e-762fbfe3104a` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-7bea0087-a44e-4802-ab61-db58a33fa809` |
| 3 | `POST /v1/credits/purchases` | 201 | 39 | `qa-a4c0806c-4c3e-4ba4-bc97-248443fa3699` |
| 4 | `POST /v1/credits/purchases` | 409 | 42 | `qa-9dd6c9f2-ec90-4762-9105-b8ca7e61ca11` |
| 5 | `GET /v1/credits/balance` | 200 | 6 | `qa-31b92991-8a20-4156-ab57-42b1e748e6a4` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-b881f569-c4de-4b58-99dd-0754e002db07` |
| 7 | `POST /v1/auth/token` | 401 | 4 | `qa-2253c208-c565-48ed-9fca-fafce2744069` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-85c3950f-46a9-4b29-b68e-762fbfe3104a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85c3950f-46a9-4b29-b68e-762fbfe3104a
Content-Type: application/json

--- request body ---
{"handle":"qa-3679088ec7a2","displayName":"QA 3679088ec7a2","password":"****","region":"eu"}

--- response: 201 in 294 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-85c3950f-46a9-4b29-b68e-762fbfe3104a
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
Location: /v1/accounts/qa-3679088ec7a2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9997d26b-defb-451d-a57d-d7760c15c646","handle":"qa-3679088ec7a2","displayName":"QA 3679088ec7a2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:29.595829051Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7bea0087-a44e-4802-ab61-db58a33fa809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bea0087-a44e-4802-ab61-db58a33fa809
Content-Type: application/json

--- request body ---
{"handle":"qa-3679088ec7a2","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bea0087-a44e-4802-ab61-db58a33fa809
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9997d26b-defb-451d-a57d-d7760c15c646"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a4c0806c-4c3e-4ba4-bc97-248443fa3699

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3ed95780b833474aa23b408cdade64ee
X-Correlation-Id: qa-a4c0806c-4c3e-4ba4-bc97-248443fa3699
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 39 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4c0806c-4c3e-4ba4-bc97-248443fa3699
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
Location: /v1/credits/purchases/pur_eae67407-58a7-4a76-86c2-0105db4e1e66
Content-Length: 144

{"id":"pur_eae67407-58a7-4a76-86c2-0105db4e1e66","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.943415246Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9dd6c9f2-ec90-4762-9105-b8ca7e61ca11

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3ed95780b833474aa23b408cdade64ee
X-Correlation-Id: qa-9dd6c9f2-ec90-4762-9105-b8ca7e61ca11
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 42 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9dd6c9f2-ec90-4762-9105-b8ca7e61ca11
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-9dd6c9f2-ec90-4762-9105-b8ca7e61ca11"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-31b92991-8a20-4156-ab57-42b1e748e6a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31b92991-8a20-4156-ab57-42b1e748e6a4
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-31b92991-8a20-4156-ab57-42b1e748e6a4
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

{"balance":15,"currency":"credits","accountId":"acc_9997d26b-defb-451d-a57d-d7760c15c646"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b881f569-c4de-4b58-99dd-0754e002db07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b881f569-c4de-4b58-99dd-0754e002db07
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b881f569-c4de-4b58-99dd-0754e002db07
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
correlation: qa-2253c208-c565-48ed-9fca-fafce2744069

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2253c208-c565-48ed-9fca-fafce2744069
Content-Type: application/json

--- request body ---
{"handle":"qa-3679088ec7a2","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2253c208-c565-48ed-9fca-fafce2744069
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2253c208-c565-48ed-9fca-fafce2744069"}
```
