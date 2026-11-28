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
| 1 | `POST /v1/accounts` | 201 | 450 | `qa-9e86b679-7c03-4f14-bf43-44160d60b234` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-f2a4ae04-0d60-4a30-806c-ab83ef3aa815` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-c56bd800-4784-4f88-a41e-b3cc9f4ca976` |
| 4 | `POST /v1/credits/purchases` | 201 | 92 | `qa-be5c9bb4-a642-4333-bdb7-f265390759a5` |
| 5 | `POST /v1/auth/token` | 200 | 25 | `qa-999f09fa-44f5-49e4-a6d7-790a1daa72f0` |
| 6 | `POST /v1/credits/purchases` | 201 | 15 | `qa-eec7bc32-65c0-4e9a-99d6-4b00c35876f0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 45 | `qa-e2cfed1f-e6a2-45cc-9cc5-8539dffdf14c` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-76e69d88-265a-4faf-b305-30a4d01a8267` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-463b3225-c78f-4d01-8cab-76d0b1c0f858` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-f9911e7a-f927-4c26-905c-e283d47a8d82` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e86b679-7c03-4f14-bf43-44160d60b234

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e86b679-7c03-4f14-bf43-44160d60b234
Content-Type: application/json

--- request body ---
{"handle":"qa-5b1b4bd6de9b","displayName":"QA 5b1b4bd6de9b","password":"****","region":"eu"}

--- response: 201 in 450 ms ---
Date: Sun, 22 Nov 2026 09:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e86b679-7c03-4f14-bf43-44160d60b234
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
Location: /v1/accounts/qa-5b1b4bd6de9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_82fdb69e-afdb-4ab0-acea-c56c372d2e3e","handle":"qa-5b1b4bd6de9b","displayName":"QA 5b1b4bd6de9b","region":"eu","role":"user","createdAt":"2026-11-22T09:54:53.103970904Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f2a4ae04-0d60-4a30-806c-ab83ef3aa815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2a4ae04-0d60-4a30-806c-ab83ef3aa815
Content-Type: application/json

--- request body ---
{"handle":"qa-4fee0ee66bdb","displayName":"QA 4fee0ee66bdb","password":"****","region":"us"}

--- response: 201 in 58 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2a4ae04-0d60-4a30-806c-ab83ef3aa815
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
Location: /v1/accounts/qa-4fee0ee66bdb
X-Served-Region: us
Content-Length: 181

{"id":"acc_73625b78-fffc-43e4-b3ff-f18fb9409b9d","handle":"qa-4fee0ee66bdb","displayName":"QA 4fee0ee66bdb","region":"us","role":"user","createdAt":"2026-11-22T09:54:53.486865501Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c56bd800-4784-4f88-a41e-b3cc9f4ca976

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c56bd800-4784-4f88-a41e-b3cc9f4ca976
Content-Type: application/json

--- request body ---
{"handle":"qa-5b1b4bd6de9b","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c56bd800-4784-4f88-a41e-b3cc9f4ca976
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_82fdb69e-afdb-4ab0-acea-c56c372d2e3e"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-be5c9bb4-a642-4333-bdb7-f265390759a5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bdb07059f2c241d7bb0df750612291cd
X-Correlation-Id: qa-be5c9bb4-a642-4333-bdb7-f265390759a5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 92 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-be5c9bb4-a642-4333-bdb7-f265390759a5
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
Location: /v1/credits/purchases/pur_ae581293-57ea-4fd6-8a77-214785e3af42
Content-Length: 144

{"id":"pur_ae581293-57ea-4fd6-8a77-214785e3af42","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.688722892Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-999f09fa-44f5-49e4-a6d7-790a1daa72f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999f09fa-44f5-49e4-a6d7-790a1daa72f0
Content-Type: application/json

--- request body ---
{"handle":"qa-4fee0ee66bdb","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-999f09fa-44f5-49e4-a6d7-790a1daa72f0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_73625b78-fffc-43e4-b3ff-f18fb9409b9d"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-eec7bc32-65c0-4e9a-99d6-4b00c35876f0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bdb07059f2c241d7bb0df750612291cd
X-Correlation-Id: qa-eec7bc32-65c0-4e9a-99d6-4b00c35876f0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-eec7bc32-65c0-4e9a-99d6-4b00c35876f0
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
Location: /v1/credits/purchases/pur_dcc61343-5ce1-4615-a2a5-548177e0259a
Content-Length: 144

{"id":"pur_dcc61343-5ce1-4615-a2a5-548177e0259a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:53.813931172Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2cfed1f-e6a2-45cc-9cc5-8539dffdf14c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2cfed1f-e6a2-45cc-9cc5-8539dffdf14c
Content-Type: application/json

--- response: 204 in 45 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2cfed1f-e6a2-45cc-9cc5-8539dffdf14c
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
correlation: qa-76e69d88-265a-4faf-b305-30a4d01a8267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76e69d88-265a-4faf-b305-30a4d01a8267
Content-Type: application/json

--- request body ---
{"handle":"qa-4fee0ee66bdb","password":"****"}

--- response: 401 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76e69d88-265a-4faf-b305-30a4d01a8267
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76e69d88-265a-4faf-b305-30a4d01a8267"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-463b3225-c78f-4d01-8cab-76d0b1c0f858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-463b3225-c78f-4d01-8cab-76d0b1c0f858
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-463b3225-c78f-4d01-8cab-76d0b1c0f858
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
correlation: qa-f9911e7a-f927-4c26-905c-e283d47a8d82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9911e7a-f927-4c26-905c-e283d47a8d82
Content-Type: application/json

--- request body ---
{"handle":"qa-5b1b4bd6de9b","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9911e7a-f927-4c26-905c-e283d47a8d82
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9911e7a-f927-4c26-905c-e283d47a8d82"}
```
