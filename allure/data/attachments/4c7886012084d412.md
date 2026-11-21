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
| 1 | `POST /v1/accounts` | 201 | 478 | `qa-afd28613-073e-4bba-9ff5-1de71c59774b` |
| 2 | `POST /v1/auth/token` | 200 | 63 | `qa-434fba5e-f3a8-4b6c-81a9-6e13ddb8240a` |
| 3 | `POST /v1/credits/purchases` | 201 | 58 | `qa-10138bf2-1ef7-4695-86f3-dc01bf5a1424` |
| 4 | `POST /v1/credits/purchases` | 409 | 39 | `qa-7a6eda60-264e-414e-b5d6-0cdec4acc0bb` |
| 5 | `GET /v1/credits/balance` | 200 | 10 | `qa-31b7206d-d8df-4d09-8b07-00067e230879` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5edf71cf-ae32-4214-8839-eaa9166f6a89` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-1d3ea1a9-dd90-4fd5-981c-b9a8264031db` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-afd28613-073e-4bba-9ff5-1de71c59774b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afd28613-073e-4bba-9ff5-1de71c59774b
Content-Type: application/json

--- request body ---
{"handle":"qa-d0307c17e1f8","displayName":"QA d0307c17e1f8","password":"****","region":"eu"}

--- response: 201 in 478 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-afd28613-073e-4bba-9ff5-1de71c59774b
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
Location: /v1/accounts/qa-d0307c17e1f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28cdeb3a-77b7-4a8c-a885-6a607a155dee","handle":"qa-d0307c17e1f8","displayName":"QA d0307c17e1f8","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.182379487Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-434fba5e-f3a8-4b6c-81a9-6e13ddb8240a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-434fba5e-f3a8-4b6c-81a9-6e13ddb8240a
Content-Type: application/json

--- request body ---
{"handle":"qa-d0307c17e1f8","password":"****"}

--- response: 200 in 63 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-434fba5e-f3a8-4b6c-81a9-6e13ddb8240a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28cdeb3a-77b7-4a8c-a885-6a607a155dee"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-10138bf2-1ef7-4695-86f3-dc01bf5a1424

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d0b8ede9164247c992cc9b3e5c9820b6
X-Correlation-Id: qa-10138bf2-1ef7-4695-86f3-dc01bf5a1424
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 58 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-10138bf2-1ef7-4695-86f3-dc01bf5a1424
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
Location: /v1/credits/purchases/pur_131cbda1-b6d8-4764-8502-56e2b66eda38
Content-Length: 144

{"id":"pur_131cbda1-b6d8-4764-8502-56e2b66eda38","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:10.971925003Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7a6eda60-264e-414e-b5d6-0cdec4acc0bb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d0b8ede9164247c992cc9b3e5c9820b6
X-Correlation-Id: qa-7a6eda60-264e-414e-b5d6-0cdec4acc0bb
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a6eda60-264e-414e-b5d6-0cdec4acc0bb
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-7a6eda60-264e-414e-b5d6-0cdec4acc0bb"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-31b7206d-d8df-4d09-8b07-00067e230879

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31b7206d-d8df-4d09-8b07-00067e230879
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-31b7206d-d8df-4d09-8b07-00067e230879
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

{"balance":15,"currency":"credits","accountId":"acc_28cdeb3a-77b7-4a8c-a885-6a607a155dee"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5edf71cf-ae32-4214-8839-eaa9166f6a89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5edf71cf-ae32-4214-8839-eaa9166f6a89
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5edf71cf-ae32-4214-8839-eaa9166f6a89
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
correlation: qa-1d3ea1a9-dd90-4fd5-981c-b9a8264031db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d3ea1a9-dd90-4fd5-981c-b9a8264031db
Content-Type: application/json

--- request body ---
{"handle":"qa-d0307c17e1f8","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d3ea1a9-dd90-4fd5-981c-b9a8264031db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d3ea1a9-dd90-4fd5-981c-b9a8264031db"}
```
