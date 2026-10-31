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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-af657d28-6924-4c73-bcdf-bc03290f3131` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-adc49bfa-5cbd-45a2-b344-e02236970bcb` |
| 3 | `POST /v1/credits/purchases` | 201 | 6 | `qa-7e732d2f-5128-4c7a-a9fc-11c7ed32649b` |
| 4 | `POST /v1/credits/purchases` | 200 | 5 | `qa-c03ffde9-46fd-4215-aef5-70d5afb23f61` |
| 5 | `GET /v1/credits/balance` | 200 | 5 | `qa-b9f97c41-f388-485c-8106-13071c11d024` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-65a57edb-2307-4943-b200-b72a26a01c71` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-eece7a5c-0234-4414-b6cf-0c26ce1f7cae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-af657d28-6924-4c73-bcdf-bc03290f3131

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af657d28-6924-4c73-bcdf-bc03290f3131
Content-Type: application/json

--- request body ---
{"handle":"qa-1b767884cda2","displayName":"QA 1b767884cda2","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-af657d28-6924-4c73-bcdf-bc03290f3131
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Location: /v1/accounts/qa-1b767884cda2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_021381de-bb68-4658-aeb1-cc404ed106de","handle":"qa-1b767884cda2","displayName":"QA 1b767884cda2","region":"eu","role":"user","createdAt":"2026-10-27T08:00:19.498428251Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-adc49bfa-5cbd-45a2-b344-e02236970bcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adc49bfa-5cbd-45a2-b344-e02236970bcb
Content-Type: application/json

--- request body ---
{"handle":"qa-1b767884cda2","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-adc49bfa-5cbd-45a2-b344-e02236970bcb
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_021381de-bb68-4658-aeb1-cc404ed106de"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7e732d2f-5128-4c7a-a9fc-11c7ed32649b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cda0990ef5b84f7a82483e97536fa23e
X-Correlation-Id: qa-7e732d2f-5128-4c7a-a9fc-11c7ed32649b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e732d2f-5128-4c7a-a9fc-11c7ed32649b
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
Location: /v1/credits/purchases/pur_3826d93d-b944-4588-aa32-3dbcc66f0ab1
Content-Length: 144

{"id":"pur_3826d93d-b944-4588-aa32-3dbcc66f0ab1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.526448134Z"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c03ffde9-46fd-4215-aef5-70d5afb23f61

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cda0990ef5b84f7a82483e97536fa23e
X-Correlation-Id: qa-c03ffde9-46fd-4215-aef5-70d5afb23f61
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-c03ffde9-46fd-4215-aef5-70d5afb23f61
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
Location: /v1/credits/purchases/pur_3826d93d-b944-4588-aa32-3dbcc66f0ab1
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_3826d93d-b944-4588-aa32-3dbcc66f0ab1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:19.526448134Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-b9f97c41-f388-485c-8106-13071c11d024

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9f97c41-f388-485c-8106-13071c11d024
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9f97c41-f388-485c-8106-13071c11d024
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

{"balance":15,"currency":"credits","accountId":"acc_021381de-bb68-4658-aeb1-cc404ed106de"}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65a57edb-2307-4943-b200-b72a26a01c71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65a57edb-2307-4943-b200-b72a26a01c71
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65a57edb-2307-4943-b200-b72a26a01c71
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
correlation: qa-eece7a5c-0234-4414-b6cf-0c26ce1f7cae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eece7a5c-0234-4414-b6cf-0c26ce1f7cae
Content-Type: application/json

--- request body ---
{"handle":"qa-1b767884cda2","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eece7a5c-0234-4414-b6cf-0c26ce1f7cae
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eece7a5c-0234-4414-b6cf-0c26ce1f7cae"}
```
