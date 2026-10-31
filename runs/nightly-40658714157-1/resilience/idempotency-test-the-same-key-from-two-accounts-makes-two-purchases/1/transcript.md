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
| 1 | `POST /v1/accounts` | 201 | 7 | `qa-3a13d0c2-d63e-41f1-a8b5-990797deac0e` |
| 2 | `POST /v1/accounts` | 201 | 7 | `qa-fbdb7f60-5037-47c0-aa83-7d9c46cbbc4f` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-286b1ee3-1325-4f1e-ac02-0123af670e6c` |
| 4 | `POST /v1/credits/purchases` | 201 | 5 | `qa-9ff1a7c7-3755-4ecb-92d2-50db40b3b67e` |
| 5 | `POST /v1/auth/token` | 200 | 7 | `qa-e56fd4e0-a50d-48ae-a99e-5625a70a40c8` |
| 6 | `POST /v1/credits/purchases` | 201 | 4 | `qa-4557df8b-a043-49d0-b28b-898948945328` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-81da5fee-4558-4f40-83ae-8767eecb99af` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-30cd1347-375f-4aae-ab5d-6645d1423b2e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-5810d006-a836-43cd-a236-d7ab23ca080d` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-aa8441c9-a654-490d-9d0b-0f59e5d831d7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a13d0c2-d63e-41f1-a8b5-990797deac0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a13d0c2-d63e-41f1-a8b5-990797deac0e
Content-Type: application/json

--- request body ---
{"handle":"qa-c018cb3b81cf","displayName":"QA c018cb3b81cf","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a13d0c2-d63e-41f1-a8b5-990797deac0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-c018cb3b81cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a06bc96-7446-4714-977b-52b22cd3b4b2","handle":"qa-c018cb3b81cf","displayName":"QA c018cb3b81cf","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.692624362Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fbdb7f60-5037-47c0-aa83-7d9c46cbbc4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbdb7f60-5037-47c0-aa83-7d9c46cbbc4f
Content-Type: application/json

--- request body ---
{"handle":"qa-31b624327a10","displayName":"QA 31b624327a10","password":"****","region":"us"}

--- response: 201 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbdb7f60-5037-47c0-aa83-7d9c46cbbc4f
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
Location: /v1/accounts/qa-31b624327a10
X-Served-Region: us
Content-Length: 181

{"id":"acc_51e6a120-7104-46f5-9eef-9f590c395616","handle":"qa-31b624327a10","displayName":"QA 31b624327a10","region":"us","role":"user","createdAt":"2026-10-28T08:42:52.705815167Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-286b1ee3-1325-4f1e-ac02-0123af670e6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-286b1ee3-1325-4f1e-ac02-0123af670e6c
Content-Type: application/json

--- request body ---
{"handle":"qa-c018cb3b81cf","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-286b1ee3-1325-4f1e-ac02-0123af670e6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a06bc96-7446-4714-977b-52b22cd3b4b2"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9ff1a7c7-3755-4ecb-92d2-50db40b3b67e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a9c9bb3a875a446fab9ee1fb0ac34e51
X-Correlation-Id: qa-9ff1a7c7-3755-4ecb-92d2-50db40b3b67e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ff1a7c7-3755-4ecb-92d2-50db40b3b67e
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
Location: /v1/credits/purchases/pur_eff9a68c-794c-4b1e-b5ba-0bde11045796
Content-Length: 144

{"id":"pur_eff9a68c-794c-4b1e-b5ba-0bde11045796","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:52.727360584Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e56fd4e0-a50d-48ae-a99e-5625a70a40c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e56fd4e0-a50d-48ae-a99e-5625a70a40c8
Content-Type: application/json

--- request body ---
{"handle":"qa-31b624327a10","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e56fd4e0-a50d-48ae-a99e-5625a70a40c8
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51e6a120-7104-46f5-9eef-9f590c395616"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4557df8b-a043-49d0-b28b-898948945328

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a9c9bb3a875a446fab9ee1fb0ac34e51
X-Correlation-Id: qa-4557df8b-a043-49d0-b28b-898948945328
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4557df8b-a043-49d0-b28b-898948945328
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
Location: /v1/credits/purchases/pur_a36807c4-258d-4eec-863a-7c65471b49f3
Content-Length: 144

{"id":"pur_a36807c4-258d-4eec-863a-7c65471b49f3","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-28T08:42:52.746791589Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81da5fee-4558-4f40-83ae-8767eecb99af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81da5fee-4558-4f40-83ae-8767eecb99af
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81da5fee-4558-4f40-83ae-8767eecb99af
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
correlation: qa-30cd1347-375f-4aae-ab5d-6645d1423b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30cd1347-375f-4aae-ab5d-6645d1423b2e
Content-Type: application/json

--- request body ---
{"handle":"qa-31b624327a10","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30cd1347-375f-4aae-ab5d-6645d1423b2e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-30cd1347-375f-4aae-ab5d-6645d1423b2e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5810d006-a836-43cd-a236-d7ab23ca080d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5810d006-a836-43cd-a236-d7ab23ca080d
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5810d006-a836-43cd-a236-d7ab23ca080d
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
correlation: qa-aa8441c9-a654-490d-9d0b-0f59e5d831d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa8441c9-a654-490d-9d0b-0f59e5d831d7
Content-Type: application/json

--- request body ---
{"handle":"qa-c018cb3b81cf","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa8441c9-a654-490d-9d0b-0f59e5d831d7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa8441c9-a654-490d-9d0b-0f59e5d831d7"}
```
