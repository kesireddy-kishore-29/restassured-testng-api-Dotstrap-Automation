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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-8a42e2db-cfe8-4938-8f8e-d4bd5a544928` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-ae2c940c-eb01-48e5-8199-2d9a1b9f0f49` |
| 3 | `GET /v1/accounts/me` | 503 | 10 | `qa-d3e832f9-b22a-4678-9d19-f8103f04f8b3` |
| 4 | `GET /v1/accounts/me` | 200 | 8 | `qa-b2c14023-bed3-4b13-9cce-2634a1907339` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-92d5e51e-c5b5-4f12-9c17-0c2660876c90` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-970dbc48-ee81-4aa9-a599-baf7cf0ae068` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8a42e2db-cfe8-4938-8f8e-d4bd5a544928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a42e2db-cfe8-4938-8f8e-d4bd5a544928
Content-Type: application/json

--- request body ---
{"handle":"qa-7e9c08b9d2ec","displayName":"QA 7e9c08b9d2ec","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a42e2db-cfe8-4938-8f8e-d4bd5a544928
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
Location: /v1/accounts/qa-7e9c08b9d2ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b9b3721-413e-4b2d-9725-ed2b1167c68f","handle":"qa-7e9c08b9d2ec","displayName":"QA 7e9c08b9d2ec","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.289719348Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ae2c940c-eb01-48e5-8199-2d9a1b9f0f49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae2c940c-eb01-48e5-8199-2d9a1b9f0f49
Content-Type: application/json

--- request body ---
{"handle":"qa-7e9c08b9d2ec","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae2c940c-eb01-48e5-8199-2d9a1b9f0f49
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b9b3721-413e-4b2d-9725-ed2b1167c68f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3e832f9-b22a-4678-9d19-f8103f04f8b3

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bd8d3be0-8f0f-46a8-9584-3713fc1a3004
X-Correlation-Id: qa-d3e832f9-b22a-4678-9d19-f8103f04f8b3
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d3e832f9-b22a-4678-9d19-f8103f04f8b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-d3e832f9-b22a-4678-9d19-f8103f04f8b3"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2c14023-bed3-4b13-9cce-2634a1907339

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bd8d3be0-8f0f-46a8-9584-3713fc1a3004
X-Correlation-Id: qa-b2c14023-bed3-4b13-9cce-2634a1907339
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2c14023-bed3-4b13-9cce-2634a1907339
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

{"id":"acc_0b9b3721-413e-4b2d-9725-ed2b1167c68f","handle":"qa-7e9c08b9d2ec","displayName":"QA 7e9c08b9d2ec","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.289719348Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-92d5e51e-c5b5-4f12-9c17-0c2660876c90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92d5e51e-c5b5-4f12-9c17-0c2660876c90
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-92d5e51e-c5b5-4f12-9c17-0c2660876c90
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
correlation: qa-970dbc48-ee81-4aa9-a599-baf7cf0ae068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-970dbc48-ee81-4aa9-a599-baf7cf0ae068
Content-Type: application/json

--- request body ---
{"handle":"qa-7e9c08b9d2ec","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-970dbc48-ee81-4aa9-a599-baf7cf0ae068
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-970dbc48-ee81-4aa9-a599-baf7cf0ae068"}
```
