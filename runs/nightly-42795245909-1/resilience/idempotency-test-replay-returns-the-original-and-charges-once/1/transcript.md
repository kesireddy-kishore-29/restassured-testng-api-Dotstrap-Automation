# Transcript: Same key + same body replays the original purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 281 | `qa-02798334-8779-4dc5-b38d-34288d99a85b` |
| 2 | `POST /v1/auth/token` | 200 | 50 | `qa-daa06b29-b864-40bd-a081-c556d1ef3f7f` |
| 3 | `POST /v1/credits/purchases` | 201 | 40 | `qa-9e492c0e-913e-4ee3-bd1a-b34dc94176de` |
| 4 | `POST /v1/credits/purchases` | 200 | 17 | `qa-cc7c633b-933b-42bb-ad41-a240eff4d006` |
| 5 | `GET /v1/credits/balance` | 200 | 17 | `qa-a48f6644-2922-4548-aa9c-a863d79bb533` |
| 6 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-42e55017-a50a-474d-88fa-ccab4ff1f29b` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-7bd79651-3150-47e1-bdb0-0d61cbfcaf87` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-02798334-8779-4dc5-b38d-34288d99a85b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02798334-8779-4dc5-b38d-34288d99a85b
Content-Type: application/json

--- request body ---
{"handle":"qa-08695977211f","displayName":"QA 08695977211f","password":"****","region":"eu"}

--- response: 201 in 281 ms ---
Date: Tue, 10 Nov 2026 09:59:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-02798334-8779-4dc5-b38d-34288d99a85b
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
Location: /v1/accounts/qa-08695977211f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f812537d-22db-48d9-88c9-15ff0d58be07","handle":"qa-08695977211f","displayName":"QA 08695977211f","region":"eu","role":"user","createdAt":"2026-11-10T09:59:27.975891782Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-daa06b29-b864-40bd-a081-c556d1ef3f7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daa06b29-b864-40bd-a081-c556d1ef3f7f
Content-Type: application/json

--- request body ---
{"handle":"qa-08695977211f","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-daa06b29-b864-40bd-a081-c556d1ef3f7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f812537d-22db-48d9-88c9-15ff0d58be07"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9e492c0e-913e-4ee3-bd1a-b34dc94176de

--- request headers ---
Accept: application/json
Idempotency-Key: qa-846e6f3eee004077a251ce20b55da120
X-Correlation-Id: qa-9e492c0e-913e-4ee3-bd1a-b34dc94176de
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 40 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e492c0e-913e-4ee3-bd1a-b34dc94176de
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
Location: /v1/credits/purchases/pur_b4e1ad5f-389d-4545-94ca-ed2a23ae4488
Content-Length: 144

{"id":"pur_b4e1ad5f-389d-4545-94ca-ed2a23ae4488","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.372680931Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cc7c633b-933b-42bb-ad41-a240eff4d006

--- request headers ---
Accept: application/json
Idempotency-Key: qa-846e6f3eee004077a251ce20b55da120
X-Correlation-Id: qa-cc7c633b-933b-42bb-ad41-a240eff4d006
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc7c633b-933b-42bb-ad41-a240eff4d006
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
Location: /v1/credits/purchases/pur_b4e1ad5f-389d-4545-94ca-ed2a23ae4488
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_b4e1ad5f-389d-4545-94ca-ed2a23ae4488","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.372680931Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-a48f6644-2922-4548-aa9c-a863d79bb533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a48f6644-2922-4548-aa9c-a863d79bb533
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-a48f6644-2922-4548-aa9c-a863d79bb533
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

{"balance":15,"currency":"credits","accountId":"acc_f812537d-22db-48d9-88c9-15ff0d58be07"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42e55017-a50a-474d-88fa-ccab4ff1f29b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42e55017-a50a-474d-88fa-ccab4ff1f29b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42e55017-a50a-474d-88fa-ccab4ff1f29b
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
correlation: qa-7bd79651-3150-47e1-bdb0-0d61cbfcaf87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bd79651-3150-47e1-bdb0-0d61cbfcaf87
Content-Type: application/json

--- request body ---
{"handle":"qa-08695977211f","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bd79651-3150-47e1-bdb0-0d61cbfcaf87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7bd79651-3150-47e1-bdb0-0d61cbfcaf87"}
```
