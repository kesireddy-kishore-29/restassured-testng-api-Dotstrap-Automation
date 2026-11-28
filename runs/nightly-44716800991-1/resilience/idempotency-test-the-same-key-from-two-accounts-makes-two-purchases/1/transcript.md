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
| 1 | `POST /v1/accounts` | 201 | 451 | `qa-0a9b4ec0-302e-469b-96be-aef2d15e4b36` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-aea4d4fe-5b99-4d83-8c95-2eef695c3085` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-e42e64e5-ef1f-48a8-965d-bab91df2af86` |
| 4 | `POST /v1/credits/purchases` | 201 | 65 | `qa-fe753796-6004-48fc-86a7-920f7db0d3bb` |
| 5 | `POST /v1/auth/token` | 200 | 34 | `qa-a2aa91b0-739e-4231-8e13-02d2f6c1e6f8` |
| 6 | `POST /v1/credits/purchases` | 201 | 30 | `qa-4aadec20-3965-4239-9e7b-2eb1c388e7f9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-b508d3b1-a777-4002-b15d-137acb83a5a1` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-e26522c0-2d78-474d-af8f-8dc5d0a3e394` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b62254f2-edc6-4cdf-bc09-1ca416002495` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-95e8d71d-6162-4f08-9d9a-3398391c40a8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0a9b4ec0-302e-469b-96be-aef2d15e4b36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a9b4ec0-302e-469b-96be-aef2d15e4b36
Content-Type: application/json

--- request body ---
{"handle":"qa-d80faebcece7","displayName":"QA d80faebcece7","password":"****","region":"eu"}

--- response: 201 in 451 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a9b4ec0-302e-469b-96be-aef2d15e4b36
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
Location: /v1/accounts/qa-d80faebcece7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_034688d8-7640-4efe-bc24-5561accf0a3e","handle":"qa-d80faebcece7","displayName":"QA d80faebcece7","region":"eu","role":"user","createdAt":"2026-11-20T10:10:01.404210388Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-aea4d4fe-5b99-4d83-8c95-2eef695c3085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aea4d4fe-5b99-4d83-8c95-2eef695c3085
Content-Type: application/json

--- request body ---
{"handle":"qa-7d87700ef4bd","displayName":"QA 7d87700ef4bd","password":"****","region":"us"}

--- response: 201 in 49 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-aea4d4fe-5b99-4d83-8c95-2eef695c3085
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
Location: /v1/accounts/qa-7d87700ef4bd
X-Served-Region: us
Content-Length: 181

{"id":"acc_a2f24070-f995-4158-948b-c021756e988a","handle":"qa-7d87700ef4bd","displayName":"QA 7d87700ef4bd","region":"us","role":"user","createdAt":"2026-11-20T10:10:01.854437939Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e42e64e5-ef1f-48a8-965d-bab91df2af86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42e64e5-ef1f-48a8-965d-bab91df2af86
Content-Type: application/json

--- request body ---
{"handle":"qa-d80faebcece7","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e42e64e5-ef1f-48a8-965d-bab91df2af86
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034688d8-7640-4efe-bc24-5561accf0a3e"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fe753796-6004-48fc-86a7-920f7db0d3bb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6740450ce65d4da5ac8c2dc00aa27b5d
X-Correlation-Id: qa-fe753796-6004-48fc-86a7-920f7db0d3bb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 65 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe753796-6004-48fc-86a7-920f7db0d3bb
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
Location: /v1/credits/purchases/pur_4aa605c8-b391-445e-a2b0-e5caf55f26a1
Content-Length: 144

{"id":"pur_4aa605c8-b391-445e-a2b0-e5caf55f26a1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.028113098Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a2aa91b0-739e-4231-8e13-02d2f6c1e6f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2aa91b0-739e-4231-8e13-02d2f6c1e6f8
Content-Type: application/json

--- request body ---
{"handle":"qa-7d87700ef4bd","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2aa91b0-739e-4231-8e13-02d2f6c1e6f8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2f24070-f995-4158-948b-c021756e988a"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4aadec20-3965-4239-9e7b-2eb1c388e7f9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6740450ce65d4da5ac8c2dc00aa27b5d
X-Correlation-Id: qa-4aadec20-3965-4239-9e7b-2eb1c388e7f9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aadec20-3965-4239-9e7b-2eb1c388e7f9
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
Location: /v1/credits/purchases/pur_1a3f1693-bd34-4645-9818-1c830fdd9752
Content-Length: 144

{"id":"pur_1a3f1693-bd34-4645-9818-1c830fdd9752","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:02.141378811Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b508d3b1-a777-4002-b15d-137acb83a5a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b508d3b1-a777-4002-b15d-137acb83a5a1
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b508d3b1-a777-4002-b15d-137acb83a5a1
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
correlation: qa-e26522c0-2d78-474d-af8f-8dc5d0a3e394

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e26522c0-2d78-474d-af8f-8dc5d0a3e394
Content-Type: application/json

--- request body ---
{"handle":"qa-7d87700ef4bd","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e26522c0-2d78-474d-af8f-8dc5d0a3e394
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e26522c0-2d78-474d-af8f-8dc5d0a3e394"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b62254f2-edc6-4cdf-bc09-1ca416002495

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b62254f2-edc6-4cdf-bc09-1ca416002495
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b62254f2-edc6-4cdf-bc09-1ca416002495
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
correlation: qa-95e8d71d-6162-4f08-9d9a-3398391c40a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95e8d71d-6162-4f08-9d9a-3398391c40a8
Content-Type: application/json

--- request body ---
{"handle":"qa-d80faebcece7","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95e8d71d-6162-4f08-9d9a-3398391c40a8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95e8d71d-6162-4f08-9d9a-3398391c40a8"}
```
