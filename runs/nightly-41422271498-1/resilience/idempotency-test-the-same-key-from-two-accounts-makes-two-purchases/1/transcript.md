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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-7e958306-babe-41c8-a413-17c0b1a9fb1b` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-edc76199-d6d0-4d68-9559-4a45c4be38ad` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-9f1a137e-68f1-4421-ad47-0d0a4c27560d` |
| 4 | `POST /v1/credits/purchases` | 201 | 10 | `qa-83da4b2a-2e27-4148-94fd-df4f0ba2d731` |
| 5 | `POST /v1/auth/token` | 200 | 11 | `qa-4ea83e29-1633-4ce2-9d9d-7abd7daecba5` |
| 6 | `POST /v1/credits/purchases` | 201 | 6 | `qa-fbcd6854-43cb-4f7a-858d-ea637c62cf92` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f918f887-ebae-4573-8c7b-9cec8783ca35` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-4ccc64d3-806c-4e5a-83df-2d013c9d3df6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-8d9783a9-3c31-432a-8bd6-dfe2ac929bbf` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-589bd2b1-cb70-4198-82dd-c75da634aabb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7e958306-babe-41c8-a413-17c0b1a9fb1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e958306-babe-41c8-a413-17c0b1a9fb1b
Content-Type: application/json

--- request body ---
{"handle":"qa-421e757d75a5","displayName":"QA 421e757d75a5","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e958306-babe-41c8-a413-17c0b1a9fb1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-421e757d75a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd0163d6-c723-42e2-b6b3-5d96331284d0","handle":"qa-421e757d75a5","displayName":"QA 421e757d75a5","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.932575137Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-edc76199-d6d0-4d68-9559-4a45c4be38ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edc76199-d6d0-4d68-9559-4a45c4be38ad
Content-Type: application/json

--- request body ---
{"handle":"qa-665da1a7f5f1","displayName":"QA 665da1a7f5f1","password":"****","region":"us"}

--- response: 201 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-edc76199-d6d0-4d68-9559-4a45c4be38ad
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
Location: /v1/accounts/qa-665da1a7f5f1
X-Served-Region: us
Content-Length: 181

{"id":"acc_dec7a555-ebe0-40e2-9730-9a3389ff284d","handle":"qa-665da1a7f5f1","displayName":"QA 665da1a7f5f1","region":"us","role":"user","createdAt":"2026-11-02T09:38:44.953848090Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9f1a137e-68f1-4421-ad47-0d0a4c27560d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f1a137e-68f1-4421-ad47-0d0a4c27560d
Content-Type: application/json

--- request body ---
{"handle":"qa-421e757d75a5","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f1a137e-68f1-4421-ad47-0d0a4c27560d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd0163d6-c723-42e2-b6b3-5d96331284d0"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-83da4b2a-2e27-4148-94fd-df4f0ba2d731

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1949f7e2fdc24f079d8f28f93cc4026c
X-Correlation-Id: qa-83da4b2a-2e27-4148-94fd-df4f0ba2d731
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-83da4b2a-2e27-4148-94fd-df4f0ba2d731
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
Location: /v1/credits/purchases/pur_36638d22-ad4a-4d88-bc0a-16f63ca973fc
Content-Length: 144

{"id":"pur_36638d22-ad4a-4d88-bc0a-16f63ca973fc","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:45.002571340Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4ea83e29-1633-4ce2-9d9d-7abd7daecba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ea83e29-1633-4ce2-9d9d-7abd7daecba5
Content-Type: application/json

--- request body ---
{"handle":"qa-665da1a7f5f1","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ea83e29-1633-4ce2-9d9d-7abd7daecba5
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dec7a555-ebe0-40e2-9730-9a3389ff284d"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fbcd6854-43cb-4f7a-858d-ea637c62cf92

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1949f7e2fdc24f079d8f28f93cc4026c
X-Correlation-Id: qa-fbcd6854-43cb-4f7a-858d-ea637c62cf92
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbcd6854-43cb-4f7a-858d-ea637c62cf92
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
Location: /v1/credits/purchases/pur_afec2251-00f0-468f-9638-2fc7875ffda0
Content-Length: 144

{"id":"pur_afec2251-00f0-468f-9638-2fc7875ffda0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-02T09:38:45.034131489Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f918f887-ebae-4573-8c7b-9cec8783ca35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f918f887-ebae-4573-8c7b-9cec8783ca35
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f918f887-ebae-4573-8c7b-9cec8783ca35
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
correlation: qa-4ccc64d3-806c-4e5a-83df-2d013c9d3df6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ccc64d3-806c-4e5a-83df-2d013c9d3df6
Content-Type: application/json

--- request body ---
{"handle":"qa-665da1a7f5f1","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ccc64d3-806c-4e5a-83df-2d013c9d3df6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4ccc64d3-806c-4e5a-83df-2d013c9d3df6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d9783a9-3c31-432a-8bd6-dfe2ac929bbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d9783a9-3c31-432a-8bd6-dfe2ac929bbf
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d9783a9-3c31-432a-8bd6-dfe2ac929bbf
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
correlation: qa-589bd2b1-cb70-4198-82dd-c75da634aabb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-589bd2b1-cb70-4198-82dd-c75da634aabb
Content-Type: application/json

--- request body ---
{"handle":"qa-421e757d75a5","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-589bd2b1-cb70-4198-82dd-c75da634aabb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-589bd2b1-cb70-4198-82dd-c75da634aabb"}
```
