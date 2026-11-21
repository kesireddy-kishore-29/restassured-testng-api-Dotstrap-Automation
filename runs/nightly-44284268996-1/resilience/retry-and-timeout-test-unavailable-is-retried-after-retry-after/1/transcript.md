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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-900fae23-1304-4ae7-b7ec-6222f2138d30` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-4272d6b7-7abd-4926-880b-81e8c5ba32c5` |
| 3 | `GET /v1/accounts/me` | 503 | 17 | `qa-3d0becb6-025e-45bf-9843-322116e199bf` |
| 4 | `GET /v1/accounts/me` | 200 | 7 | `qa-9e4005c4-0662-48c5-94c7-8b250f354400` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f1c556f2-34a0-4fe6-bb76-2510c1f08e92` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-cb393fde-a144-4d61-bf5c-805ef02ff234` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-900fae23-1304-4ae7-b7ec-6222f2138d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900fae23-1304-4ae7-b7ec-6222f2138d30
Content-Type: application/json

--- request body ---
{"handle":"qa-cd9abb549751","displayName":"QA cd9abb549751","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-900fae23-1304-4ae7-b7ec-6222f2138d30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-cd9abb549751
X-Served-Region: eu
Content-Length: 181

{"id":"acc_97745a15-74b4-4943-923a-56e59806c83b","handle":"qa-cd9abb549751","displayName":"QA cd9abb549751","region":"eu","role":"user","createdAt":"2026-11-18T10:19:38.464764427Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4272d6b7-7abd-4926-880b-81e8c5ba32c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4272d6b7-7abd-4926-880b-81e8c5ba32c5
Content-Type: application/json

--- request body ---
{"handle":"qa-cd9abb549751","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4272d6b7-7abd-4926-880b-81e8c5ba32c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_97745a15-74b4-4943-923a-56e59806c83b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d0becb6-025e-45bf-9843-322116e199bf

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 483ece53-f68a-4d3c-9412-ec2d627bae93
X-Correlation-Id: qa-3d0becb6-025e-45bf-9843-322116e199bf
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d0becb6-025e-45bf-9843-322116e199bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-3d0becb6-025e-45bf-9843-322116e199bf"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e4005c4-0662-48c5-94c7-8b250f354400

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 483ece53-f68a-4d3c-9412-ec2d627bae93
X-Correlation-Id: qa-9e4005c4-0662-48c5-94c7-8b250f354400
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e4005c4-0662-48c5-94c7-8b250f354400
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

{"id":"acc_97745a15-74b4-4943-923a-56e59806c83b","handle":"qa-cd9abb549751","displayName":"QA cd9abb549751","region":"eu","role":"user","createdAt":"2026-11-18T10:19:38.464764427Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1c556f2-34a0-4fe6-bb76-2510c1f08e92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1c556f2-34a0-4fe6-bb76-2510c1f08e92
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1c556f2-34a0-4fe6-bb76-2510c1f08e92
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
correlation: qa-cb393fde-a144-4d61-bf5c-805ef02ff234

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb393fde-a144-4d61-bf5c-805ef02ff234
Content-Type: application/json

--- request body ---
{"handle":"qa-cd9abb549751","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb393fde-a144-4d61-bf5c-805ef02ff234
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb393fde-a144-4d61-bf5c-805ef02ff234"}
```
