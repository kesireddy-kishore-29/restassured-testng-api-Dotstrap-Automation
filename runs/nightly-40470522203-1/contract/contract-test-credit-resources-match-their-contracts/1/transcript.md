# Transcript: Balance, ledger and purchase match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 441 | `qa-2267a6ea-99b3-4c08-b576-81155d8faa4b` |
| 2 | `POST /v1/auth/token` | 200 | 63 | `qa-aa6799f0-b7e6-4808-908b-d4ee5a45f7b2` |
| 3 | `GET /v1/credits/balance` | 200 | 42 | `qa-04d452ea-7c0c-4608-b472-1721221bd147` |
| 4 | `POST /v1/credits/purchases` | 201 | 60 | `qa-adaf4a30-25cd-41c4-8da9-fab5075f1fda` |
| 5 | `GET /v1/credits/ledger` | 200 | 39 | `qa-3f00fbd7-c898-4001-bfa9-3a3a6f7afe0b` |
| 6 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d7589809-207e-4f93-8435-b5173141025d` |
| 7 | `POST /v1/auth/token` | 401 | 31 | `qa-62494f39-0b26-42c0-985e-33cbb0b49758` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2267a6ea-99b3-4c08-b576-81155d8faa4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2267a6ea-99b3-4c08-b576-81155d8faa4b
Content-Type: application/json

--- request body ---
{"handle":"qa-264a67e4d10b","displayName":"QA 264a67e4d10b","password":"****","region":"in"}

--- response: 201 in 441 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2267a6ea-99b3-4c08-b576-81155d8faa4b
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
Location: /v1/accounts/qa-264a67e4d10b
X-Served-Region: in
Content-Length: 181

{"id":"acc_b15eb1a7-350c-4afd-be31-c7192a331728","handle":"qa-264a67e4d10b","displayName":"QA 264a67e4d10b","region":"in","role":"user","createdAt":"2026-10-27T08:00:31.274708272Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-aa6799f0-b7e6-4808-908b-d4ee5a45f7b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa6799f0-b7e6-4808-908b-d4ee5a45f7b2
Content-Type: application/json

--- request body ---
{"handle":"qa-264a67e4d10b","password":"****"}

--- response: 200 in 63 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa6799f0-b7e6-4808-908b-d4ee5a45f7b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b15eb1a7-350c-4afd-be31-c7192a331728"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-04d452ea-7c0c-4608-b472-1721221bd147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d452ea-7c0c-4608-b472-1721221bd147
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-04d452ea-7c0c-4608-b472-1721221bd147
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
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_b15eb1a7-350c-4afd-be31-c7192a331728"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-adaf4a30-25cd-41c4-8da9-fab5075f1fda

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a6087c44962e438b91b75142da9ee717
X-Correlation-Id: qa-adaf4a30-25cd-41c4-8da9-fab5075f1fda
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 60 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-adaf4a30-25cd-41c4-8da9-fab5075f1fda
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
X-Served-Region: in
Location: /v1/credits/purchases/pur_2b486343-239c-4029-b6f3-e934bfc00f64
Content-Length: 144

{"id":"pur_2b486343-239c-4029-b6f3-e934bfc00f64","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-27T08:00:31.971101627Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3f00fbd7-c898-4001-bfa9-3a3a6f7afe0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f00fbd7-c898-4001-bfa9-3a3a6f7afe0b
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f00fbd7-c898-4001-bfa9-3a3a6f7afe0b
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
X-Served-Region: in
Content-Length: 398

{"items":[{"id":"led_947e2f63-195b-4364-b453-157a78887c42","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-27T08:00:31.274725043Z"},{"id":"led_ea635c1a-1968-4789-915f-1e2fa2ffaea7","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_2b486343-239c-4029-b6f3-e934bfc00f64","createdAt":"2026-10-27T08:00:31.971101627Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7589809-207e-4f93-8435-b5173141025d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7589809-207e-4f93-8435-b5173141025d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7589809-207e-4f93-8435-b5173141025d
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
X-Served-Region: in
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-62494f39-0b26-42c0-985e-33cbb0b49758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62494f39-0b26-42c0-985e-33cbb0b49758
Content-Type: application/json

--- request body ---
{"handle":"qa-264a67e4d10b","password":"****"}

--- response: 401 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62494f39-0b26-42c0-985e-33cbb0b49758
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62494f39-0b26-42c0-985e-33cbb0b49758"}
```
