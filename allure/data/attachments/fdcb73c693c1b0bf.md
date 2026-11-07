# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 336 | `qa-502eadf4-da8a-4a4b-b3f5-831b6f17c25a` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-b37cbc45-c4e5-4b1e-a5cc-362c1d621ca9` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-958c1a7c-ac78-4ff9-b78c-d5e40f0add4a` |
| 4 | `POST /v1/auth/token` | 200 | 22 | `qa-0b635f85-29c0-4765-b164-f35c01dd916c` |
| 5 | `GET /v1/accounts/me` | 200 | 29 | `qa-df0fb186-624e-4733-8664-82927e36459b` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 36 | `qa-cafbd816-3a5e-470d-87c8-6302973ed331` |
| 7 | `POST /v1/auth/token` | 200 | 14 | `qa-8d91fb56-9f7b-4aca-8a8d-460e6174b9ed` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e2e61bf8-6a89-413b-814f-7bf8ad346b29` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-bf75bdfb-03ed-49d3-afa3-c0c34e3560ea` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-626db859-1f18-43e3-8bf2-f84260aea60f` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-8f80e446-5d3e-45d0-8eb5-25486cabeb49` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-502eadf4-da8a-4a4b-b3f5-831b6f17c25a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-502eadf4-da8a-4a4b-b3f5-831b6f17c25a
Content-Type: application/json

--- request body ---
{"handle":"qa-489c780af6f5","displayName":"QA 489c780af6f5","password":"****","region":"eu"}

--- response: 201 in 336 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-502eadf4-da8a-4a4b-b3f5-831b6f17c25a
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
Location: /v1/accounts/qa-489c780af6f5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b745e681-45ad-4554-a694-0409138f012f","handle":"qa-489c780af6f5","displayName":"QA 489c780af6f5","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.639550066Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b37cbc45-c4e5-4b1e-a5cc-362c1d621ca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b37cbc45-c4e5-4b1e-a5cc-362c1d621ca9
Content-Type: application/json

--- request body ---
{"handle":"qa-319f76efd569","displayName":"QA 319f76efd569","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b37cbc45-c4e5-4b1e-a5cc-362c1d621ca9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-319f76efd569
X-Served-Region: us
Content-Length: 181

{"id":"acc_5ebf3152-ecfe-4ee4-9a5e-8e23503148fe","handle":"qa-319f76efd569","displayName":"QA 319f76efd569","region":"us","role":"user","createdAt":"2026-11-07T08:54:56.940263512Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-958c1a7c-ac78-4ff9-b78c-d5e40f0add4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-958c1a7c-ac78-4ff9-b78c-d5e40f0add4a
Content-Type: application/json

--- request body ---
{"handle":"qa-489c780af6f5","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-958c1a7c-ac78-4ff9-b78c-d5e40f0add4a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b745e681-45ad-4554-a694-0409138f012f"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0b635f85-29c0-4765-b164-f35c01dd916c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b635f85-29c0-4765-b164-f35c01dd916c
Content-Type: application/json

--- request body ---
{"handle":"qa-489c780af6f5","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b635f85-29c0-4765-b164-f35c01dd916c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b745e681-45ad-4554-a694-0409138f012f"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-df0fb186-624e-4733-8664-82927e36459b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df0fb186-624e-4733-8664-82927e36459b
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-df0fb186-624e-4733-8664-82927e36459b
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
Content-Length: 181

{"id":"acc_b745e681-45ad-4554-a694-0409138f012f","handle":"qa-489c780af6f5","displayName":"QA 489c780af6f5","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.639550066Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-319f76efd569
correlation: qa-cafbd816-3a5e-470d-87c8-6302973ed331

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cafbd816-3a5e-470d-87c8-6302973ed331
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-cafbd816-3a5e-470d-87c8-6302973ed331
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
Content-Length: 74

{"handle":"qa-319f76efd569","displayName":"QA 319f76efd569","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-8d91fb56-9f7b-4aca-8a8d-460e6174b9ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d91fb56-9f7b-4aca-8a8d-460e6174b9ed
Content-Type: application/json

--- request body ---
{"handle":"qa-319f76efd569","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d91fb56-9f7b-4aca-8a8d-460e6174b9ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ebf3152-ecfe-4ee4-9a5e-8e23503148fe"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2e61bf8-6a89-413b-814f-7bf8ad346b29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e61bf8-6a89-413b-814f-7bf8ad346b29
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2e61bf8-6a89-413b-814f-7bf8ad346b29
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-bf75bdfb-03ed-49d3-afa3-c0c34e3560ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf75bdfb-03ed-49d3-afa3-c0c34e3560ea
Content-Type: application/json

--- request body ---
{"handle":"qa-319f76efd569","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf75bdfb-03ed-49d3-afa3-c0c34e3560ea
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf75bdfb-03ed-49d3-afa3-c0c34e3560ea"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-626db859-1f18-43e3-8bf2-f84260aea60f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-626db859-1f18-43e3-8bf2-f84260aea60f
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-626db859-1f18-43e3-8bf2-f84260aea60f
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-8f80e446-5d3e-45d0-8eb5-25486cabeb49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f80e446-5d3e-45d0-8eb5-25486cabeb49
Content-Type: application/json

--- request body ---
{"handle":"qa-489c780af6f5","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f80e446-5d3e-45d0-8eb5-25486cabeb49
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f80e446-5d3e-45d0-8eb5-25486cabeb49"}
```
