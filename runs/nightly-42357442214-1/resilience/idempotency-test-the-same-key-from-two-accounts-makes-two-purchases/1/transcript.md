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
| 1 | `POST /v1/accounts` | 201 | 450 | `qa-44411887-0e6f-4b2e-bfb1-75062c3570a8` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-22ab7f99-a308-4724-8ec5-93474a07b6f0` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-b154d046-d43d-4eb2-8022-2cd3a02a1782` |
| 4 | `POST /v1/credits/purchases` | 201 | 81 | `qa-e84c410f-f413-47e7-852d-87c7c95fa4ea` |
| 5 | `POST /v1/auth/token` | 200 | 28 | `qa-1fe4dda6-710e-4d14-bd8f-21ecdc0a5987` |
| 6 | `POST /v1/credits/purchases` | 201 | 7 | `qa-081e435f-c90a-4eae-868e-e869be1148d5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-41112cf5-8d93-4d48-87cb-1a3d0b12a9b7` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-387b168e-c28b-43dc-88cb-e3f0fe3872d8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-bd5b4d06-17de-4426-873b-907d2a2baac9` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-f3d574bc-32d5-4c15-94cd-caac225c6d8f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-44411887-0e6f-4b2e-bfb1-75062c3570a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44411887-0e6f-4b2e-bfb1-75062c3570a8
Content-Type: application/json

--- request body ---
{"handle":"qa-665676fbd16e","displayName":"QA 665676fbd16e","password":"****","region":"eu"}

--- response: 201 in 450 ms ---
Date: Sat, 07 Nov 2026 08:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-44411887-0e6f-4b2e-bfb1-75062c3570a8
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
Location: /v1/accounts/qa-665676fbd16e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25959e37-9e88-4105-a6f7-0b6a47e708f8","handle":"qa-665676fbd16e","displayName":"QA 665676fbd16e","region":"eu","role":"user","createdAt":"2026-11-07T08:55:02.773438936Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-22ab7f99-a308-4724-8ec5-93474a07b6f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22ab7f99-a308-4724-8ec5-93474a07b6f0
Content-Type: application/json

--- request body ---
{"handle":"qa-66ab246dd646","displayName":"QA 66ab246dd646","password":"****","region":"us"}

--- response: 201 in 43 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-22ab7f99-a308-4724-8ec5-93474a07b6f0
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
Location: /v1/accounts/qa-66ab246dd646
X-Served-Region: us
Content-Length: 181

{"id":"acc_7a90dce2-a5f0-4033-b9fa-12ca2b206d50","handle":"qa-66ab246dd646","displayName":"QA 66ab246dd646","region":"us","role":"user","createdAt":"2026-11-07T08:55:03.174177305Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b154d046-d43d-4eb2-8022-2cd3a02a1782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b154d046-d43d-4eb2-8022-2cd3a02a1782
Content-Type: application/json

--- request body ---
{"handle":"qa-665676fbd16e","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b154d046-d43d-4eb2-8022-2cd3a02a1782
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25959e37-9e88-4105-a6f7-0b6a47e708f8"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e84c410f-f413-47e7-852d-87c7c95fa4ea

--- request headers ---
Accept: application/json
Idempotency-Key: qa-36b724b1ca544f31bd11e9ff25460286
X-Correlation-Id: qa-e84c410f-f413-47e7-852d-87c7c95fa4ea
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 81 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e84c410f-f413-47e7-852d-87c7c95fa4ea
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
Location: /v1/credits/purchases/pur_29ceaf48-407a-41e0-9e43-4628512a3ab1
Content-Length: 144

{"id":"pur_29ceaf48-407a-41e0-9e43-4628512a3ab1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.393329028Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1fe4dda6-710e-4d14-bd8f-21ecdc0a5987

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fe4dda6-710e-4d14-bd8f-21ecdc0a5987
Content-Type: application/json

--- request body ---
{"handle":"qa-66ab246dd646","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fe4dda6-710e-4d14-bd8f-21ecdc0a5987
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a90dce2-a5f0-4033-b9fa-12ca2b206d50"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-081e435f-c90a-4eae-868e-e869be1148d5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-36b724b1ca544f31bd11e9ff25460286
X-Correlation-Id: qa-081e435f-c90a-4eae-868e-e869be1148d5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-081e435f-c90a-4eae-868e-e869be1148d5
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
Location: /v1/credits/purchases/pur_bbc3854a-9a99-4e08-9510-37fe587ed1ff
Content-Length: 144

{"id":"pur_bbc3854a-9a99-4e08-9510-37fe587ed1ff","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-07T08:55:03.499878218Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41112cf5-8d93-4d48-87cb-1a3d0b12a9b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41112cf5-8d93-4d48-87cb-1a3d0b12a9b7
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41112cf5-8d93-4d48-87cb-1a3d0b12a9b7
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
correlation: qa-387b168e-c28b-43dc-88cb-e3f0fe3872d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-387b168e-c28b-43dc-88cb-e3f0fe3872d8
Content-Type: application/json

--- request body ---
{"handle":"qa-66ab246dd646","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-387b168e-c28b-43dc-88cb-e3f0fe3872d8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-387b168e-c28b-43dc-88cb-e3f0fe3872d8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd5b4d06-17de-4426-873b-907d2a2baac9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd5b4d06-17de-4426-873b-907d2a2baac9
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd5b4d06-17de-4426-873b-907d2a2baac9
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
correlation: qa-f3d574bc-32d5-4c15-94cd-caac225c6d8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3d574bc-32d5-4c15-94cd-caac225c6d8f
Content-Type: application/json

--- request body ---
{"handle":"qa-665676fbd16e","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3d574bc-32d5-4c15-94cd-caac225c6d8f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3d574bc-32d5-4c15-94cd-caac225c6d8f"}
```
