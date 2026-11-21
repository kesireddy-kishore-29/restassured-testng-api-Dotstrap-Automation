# Transcript: A 503 with Retry-After is retried after the wait

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#unavailableIsRetriedAfterRetryAfter` |
| Features | FEAT-RES-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-35a28aed-bc7f-4c42-8dca-c7a85c8ee96a` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-5df14f8b-8291-4760-ac09-9f3ca8c7e810` |
| 3 | `GET /v1/accounts/me` | 503 | 22 | `qa-b07871d7-a659-45ca-bf4d-dc3e84ae22d7` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-c4c69f82-c4c7-4cfb-ab8d-f8302e73f449` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-1602579e-928f-4ade-8a81-20771f4ab1cd` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-c7288008-73e3-48fa-a624-a3607f0fe2fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-35a28aed-bc7f-4c42-8dca-c7a85c8ee96a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a28aed-bc7f-4c42-8dca-c7a85c8ee96a
Content-Type: application/json

--- request body ---
{"handle":"qa-8c0c47a83fa6","displayName":"QA 8c0c47a83fa6","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-35a28aed-bc7f-4c42-8dca-c7a85c8ee96a
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
Location: /v1/accounts/qa-8c0c47a83fa6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce0a7ad6-5b39-413c-a563-8ac8d74da506","handle":"qa-8c0c47a83fa6","displayName":"QA 8c0c47a83fa6","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.576472763Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5df14f8b-8291-4760-ac09-9f3ca8c7e810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5df14f8b-8291-4760-ac09-9f3ca8c7e810
Content-Type: application/json

--- request body ---
{"handle":"qa-8c0c47a83fa6","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-5df14f8b-8291-4760-ac09-9f3ca8c7e810
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0a7ad6-5b39-413c-a563-8ac8d74da506"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b07871d7-a659-45ca-bf4d-dc3e84ae22d7

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 616f77d7-bf7c-4890-b25d-a2a1000b1d24
X-Correlation-Id: qa-b07871d7-a659-45ca-bf4d-dc3e84ae22d7
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b07871d7-a659-45ca-bf4d-dc3e84ae22d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b07871d7-a659-45ca-bf4d-dc3e84ae22d7"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-c4c69f82-c4c7-4cfb-ab8d-f8302e73f449

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 616f77d7-bf7c-4890-b25d-a2a1000b1d24
X-Correlation-Id: qa-c4c69f82-c4c7-4cfb-ab8d-f8302e73f449
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4c69f82-c4c7-4cfb-ab8d-f8302e73f449
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

{"id":"acc_ce0a7ad6-5b39-413c-a563-8ac8d74da506","handle":"qa-8c0c47a83fa6","displayName":"QA 8c0c47a83fa6","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.576472763Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1602579e-928f-4ade-8a81-20771f4ab1cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1602579e-928f-4ade-8a81-20771f4ab1cd
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1602579e-928f-4ade-8a81-20771f4ab1cd
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c7288008-73e3-48fa-a624-a3607f0fe2fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7288008-73e3-48fa-a624-a3607f0fe2fb
Content-Type: application/json

--- request body ---
{"handle":"qa-8c0c47a83fa6","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7288008-73e3-48fa-a624-a3607f0fe2fb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7288008-73e3-48fa-a624-a3607f0fe2fb"}
```
