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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-0591ec2b-6041-419f-a739-64b2f9c44b49` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-a296c567-9e9a-4c6b-ad48-0149e166ffec` |
| 3 | `GET /v1/accounts/me` | 503 | 9 | `qa-5c74d870-e533-44dd-bb65-53e02a1f2cc3` |
| 4 | `GET /v1/accounts/me` | 200 | 5 | `qa-fd7c84e2-a3e4-460e-b6b7-69793dc7aa13` |
| 5 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-dc67af5f-41b1-4ed3-beff-2bd01bf329c2` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-1ceeef58-0730-4739-8dfc-e3fb07bf394f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0591ec2b-6041-419f-a739-64b2f9c44b49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0591ec2b-6041-419f-a739-64b2f9c44b49
Content-Type: application/json

--- request body ---
{"handle":"qa-71d81bb73394","displayName":"QA 71d81bb73394","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-0591ec2b-6041-419f-a739-64b2f9c44b49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-71d81bb73394
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85a4d33d-7dd3-4bc2-a759-73543ba2cf33","handle":"qa-71d81bb73394","displayName":"QA 71d81bb73394","region":"eu","role":"user","createdAt":"2026-11-10T09:59:28.725453945Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a296c567-9e9a-4c6b-ad48-0149e166ffec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a296c567-9e9a-4c6b-ad48-0149e166ffec
Content-Type: application/json

--- request body ---
{"handle":"qa-71d81bb73394","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-a296c567-9e9a-4c6b-ad48-0149e166ffec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85a4d33d-7dd3-4bc2-a759-73543ba2cf33"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c74d870-e533-44dd-bb65-53e02a1f2cc3

--- request headers ---
Accept: application/json
X-Fault-Key: 2ea7eb4e-b3d4-4ddc-9fc1-5061d98ab664
X-Fault: unavailable-once
X-Correlation-Id: qa-5c74d870-e533-44dd-bb65-53e02a1f2cc3
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c74d870-e533-44dd-bb65-53e02a1f2cc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-5c74d870-e533-44dd-bb65-53e02a1f2cc3"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd7c84e2-a3e4-460e-b6b7-69793dc7aa13

--- request headers ---
Accept: application/json
X-Fault-Key: 2ea7eb4e-b3d4-4ddc-9fc1-5061d98ab664
X-Fault: unavailable-once
X-Correlation-Id: qa-fd7c84e2-a3e4-460e-b6b7-69793dc7aa13
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd7c84e2-a3e4-460e-b6b7-69793dc7aa13
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

{"id":"acc_85a4d33d-7dd3-4bc2-a759-73543ba2cf33","handle":"qa-71d81bb73394","displayName":"QA 71d81bb73394","region":"eu","role":"user","createdAt":"2026-11-10T09:59:28.725453945Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc67af5f-41b1-4ed3-beff-2bd01bf329c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc67af5f-41b1-4ed3-beff-2bd01bf329c2
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc67af5f-41b1-4ed3-beff-2bd01bf329c2
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
correlation: qa-1ceeef58-0730-4739-8dfc-e3fb07bf394f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ceeef58-0730-4739-8dfc-e3fb07bf394f
Content-Type: application/json

--- request body ---
{"handle":"qa-71d81bb73394","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ceeef58-0730-4739-8dfc-e3fb07bf394f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ceeef58-0730-4739-8dfc-e3fb07bf394f"}
```
