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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-8d14b8a0-5c75-4ce3-acd4-48b48057dc4f` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-9d9e1fa5-e4e1-4253-89ec-25af40a8479e` |
| 3 | `POST /v1/credits/purchases` | 201 | 7 | `qa-1688f4d3-5a53-4847-aa23-51421cf75bef` |
| 4 | `POST /v1/credits/purchases` | 409 | 10 | `qa-25a43da8-50cb-49f8-9255-2bbbdbd22353` |
| 5 | `GET /v1/credits/balance` | 200 | 7 | `qa-5dd5c560-01dc-4e11-8ecf-62de62f29046` |
| 6 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-5d01bb09-0c62-41ea-ba26-5a24f9163632` |
| 7 | `POST /v1/auth/token` | 401 | 10 | `qa-3c04fedb-33ac-4c54-8166-d3d31b7f6ba4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8d14b8a0-5c75-4ce3-acd4-48b48057dc4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d14b8a0-5c75-4ce3-acd4-48b48057dc4f
Content-Type: application/json

--- request body ---
{"handle":"qa-45eab8c942fa","displayName":"QA 45eab8c942fa","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d14b8a0-5c75-4ce3-acd4-48b48057dc4f
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
Location: /v1/accounts/qa-45eab8c942fa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_140d7d1d-7eed-4515-8772-7ea5c441b539","handle":"qa-45eab8c942fa","displayName":"QA 45eab8c942fa","region":"eu","role":"user","createdAt":"2026-11-03T09:41:39.517406088Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9d9e1fa5-e4e1-4253-89ec-25af40a8479e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d9e1fa5-e4e1-4253-89ec-25af40a8479e
Content-Type: application/json

--- request body ---
{"handle":"qa-45eab8c942fa","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d9e1fa5-e4e1-4253-89ec-25af40a8479e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_140d7d1d-7eed-4515-8772-7ea5c441b539"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1688f4d3-5a53-4847-aa23-51421cf75bef

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d0ffbc59ea3e48de8a8f591d381451c9
X-Correlation-Id: qa-1688f4d3-5a53-4847-aa23-51421cf75bef
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-1688f4d3-5a53-4847-aa23-51421cf75bef
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
Location: /v1/credits/purchases/pur_92138f50-931c-457b-ba31-f9e62fd8a812
Content-Length: 144

{"id":"pur_92138f50-931c-457b-ba31-f9e62fd8a812","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:39.549371392Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-25a43da8-50cb-49f8-9255-2bbbdbd22353

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d0ffbc59ea3e48de8a8f591d381451c9
X-Correlation-Id: qa-25a43da8-50cb-49f8-9255-2bbbdbd22353
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 409 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25a43da8-50cb-49f8-9255-2bbbdbd22353
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

{"type":"https://reference-service.example/problems/idempotency-key-reused","title":"Idempotency-Key reused with a different request","status":409,"detail":"This key already completed a different purchase. Use a new key for a new purchase.","instance":"/v1/credits/purchases","correlationId":"qa-25a43da8-50cb-49f8-9255-2bbbdbd22353"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-5dd5c560-01dc-4e11-8ecf-62de62f29046

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dd5c560-01dc-4e11-8ecf-62de62f29046
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dd5c560-01dc-4e11-8ecf-62de62f29046
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

{"balance":15,"currency":"credits","accountId":"acc_140d7d1d-7eed-4515-8772-7ea5c441b539"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5d01bb09-0c62-41ea-ba26-5a24f9163632

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d01bb09-0c62-41ea-ba26-5a24f9163632
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5d01bb09-0c62-41ea-ba26-5a24f9163632
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
correlation: qa-3c04fedb-33ac-4c54-8166-d3d31b7f6ba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c04fedb-33ac-4c54-8166-d3d31b7f6ba4
Content-Type: application/json

--- request body ---
{"handle":"qa-45eab8c942fa","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c04fedb-33ac-4c54-8166-d3d31b7f6ba4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c04fedb-33ac-4c54-8166-d3d31b7f6ba4"}
```
