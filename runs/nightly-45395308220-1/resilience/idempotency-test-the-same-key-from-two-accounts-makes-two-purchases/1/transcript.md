# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 320 | `qa-b4bc90d3-e4eb-49ae-aafe-2443c336af4d` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-e814b971-f203-4ee8-9052-0280b553e882` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-b0c46d21-c7b9-44fd-b618-d1fab037a6f0` |
| 4 | `POST /v1/credits/purchases` | 201 | 27 | `qa-4702df70-14c1-4584-b5e2-edebf379f58a` |
| 5 | `POST /v1/auth/token` | 200 | 10 | `qa-c3cb7f58-13e5-4e96-b0eb-6d6166c26dc1` |
| 6 | `POST /v1/credits/purchases` | 201 | 9 | `qa-45b527c1-0b85-4148-9aaf-4e058e3e7159` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-a6877717-939b-4fc8-8fd1-f42aa855f091` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-da3f3ff8-9b1c-4efb-ac68-8d10f43678d7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d2d93d88-d881-4dce-af1b-4acd2354ebbd` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-e4c33a10-8480-42a6-a5d0-52a692f192a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b4bc90d3-e4eb-49ae-aafe-2443c336af4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4bc90d3-e4eb-49ae-aafe-2443c336af4d
Content-Type: application/json

--- request body ---
{"handle":"qa-f60a68580394","displayName":"QA f60a68580394","password":"****","region":"eu"}

--- response: 201 in 320 ms ---
Date: Tue, 24 Nov 2026 12:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4bc90d3-e4eb-49ae-aafe-2443c336af4d
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
Location: /v1/accounts/qa-f60a68580394
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9d86cc-6af1-4e02-adcc-48f48b1691ed","handle":"qa-f60a68580394","displayName":"QA f60a68580394","region":"eu","role":"user","createdAt":"2026-11-24T12:37:58.830152880Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e814b971-f203-4ee8-9052-0280b553e882

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e814b971-f203-4ee8-9052-0280b553e882
Content-Type: application/json

--- request body ---
{"handle":"qa-e6962e1b5171","displayName":"QA e6962e1b5171","password":"****","region":"us"}

--- response: 201 in 33 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e814b971-f203-4ee8-9052-0280b553e882
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
Location: /v1/accounts/qa-e6962e1b5171
X-Served-Region: us
Content-Length: 181

{"id":"acc_c74768b7-071b-4bba-bf9b-df53b0c324c1","handle":"qa-e6962e1b5171","displayName":"QA e6962e1b5171","region":"us","role":"user","createdAt":"2026-11-24T12:37:59.099601783Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b0c46d21-c7b9-44fd-b618-d1fab037a6f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0c46d21-c7b9-44fd-b618-d1fab037a6f0
Content-Type: application/json

--- request body ---
{"handle":"qa-f60a68580394","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0c46d21-c7b9-44fd-b618-d1fab037a6f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f9d86cc-6af1-4e02-adcc-48f48b1691ed"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4702df70-14c1-4584-b5e2-edebf379f58a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1902a828c1234f3897f9fd22352b9fad
X-Correlation-Id: qa-4702df70-14c1-4584-b5e2-edebf379f58a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 27 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4702df70-14c1-4584-b5e2-edebf379f58a
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
Location: /v1/credits/purchases/pur_452794ec-7944-41e2-a7b1-5ceae02964e4
Content-Length: 144

{"id":"pur_452794ec-7944-41e2-a7b1-5ceae02964e4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.200223697Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c3cb7f58-13e5-4e96-b0eb-6d6166c26dc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3cb7f58-13e5-4e96-b0eb-6d6166c26dc1
Content-Type: application/json

--- request body ---
{"handle":"qa-e6962e1b5171","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3cb7f58-13e5-4e96-b0eb-6d6166c26dc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c74768b7-071b-4bba-bf9b-df53b0c324c1"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-45b527c1-0b85-4148-9aaf-4e058e3e7159

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1902a828c1234f3897f9fd22352b9fad
X-Correlation-Id: qa-45b527c1-0b85-4148-9aaf-4e058e3e7159
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 9 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-45b527c1-0b85-4148-9aaf-4e058e3e7159
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_b3f8ce16-e310-432b-b300-848d35595760
Content-Length: 144

{"id":"pur_b3f8ce16-e310-432b-b300-848d35595760","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.250832217Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a6877717-939b-4fc8-8fd1-f42aa855f091

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6877717-939b-4fc8-8fd1-f42aa855f091
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a6877717-939b-4fc8-8fd1-f42aa855f091
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
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-da3f3ff8-9b1c-4efb-ac68-8d10f43678d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da3f3ff8-9b1c-4efb-ac68-8d10f43678d7
Content-Type: application/json

--- request body ---
{"handle":"qa-e6962e1b5171","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da3f3ff8-9b1c-4efb-ac68-8d10f43678d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da3f3ff8-9b1c-4efb-ac68-8d10f43678d7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d2d93d88-d881-4dce-af1b-4acd2354ebbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2d93d88-d881-4dce-af1b-4acd2354ebbd
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d2d93d88-d881-4dce-af1b-4acd2354ebbd
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e4c33a10-8480-42a6-a5d0-52a692f192a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4c33a10-8480-42a6-a5d0-52a692f192a5
Content-Type: application/json

--- request body ---
{"handle":"qa-f60a68580394","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4c33a10-8480-42a6-a5d0-52a692f192a5
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4c33a10-8480-42a6-a5d0-52a692f192a5"}
```
