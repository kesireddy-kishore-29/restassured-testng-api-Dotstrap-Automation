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
| 1 | `POST /v1/accounts` | 201 | 256 | `qa-9f54c72b-1db5-4ecf-aa8c-611c6ce1c6aa` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-972a3c13-54cb-4ef5-bcd1-d7a87509546f` |
| 3 | `GET /v1/accounts/me` | 503 | 67 | `qa-2e36f294-7596-4bb9-b95d-abd05af126ee` |
| 4 | `GET /v1/accounts/me` | 200 | 5 | `qa-b92ef794-b8fe-48c1-a04a-7d5ab8863e8f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-de4f85a0-9093-4de1-b9d9-b6cb32b6bc29` |
| 6 | `POST /v1/auth/token` | 401 | 3 | `qa-314a0134-6a45-491c-bc26-b560f795525f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9f54c72b-1db5-4ecf-aa8c-611c6ce1c6aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f54c72b-1db5-4ecf-aa8c-611c6ce1c6aa
Content-Type: application/json

--- request body ---
{"handle":"qa-157ed4df81d8","displayName":"QA 157ed4df81d8","password":"****","region":"eu"}

--- response: 201 in 256 ms ---
Date: Tue, 27 Oct 2026 08:00:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f54c72b-1db5-4ecf-aa8c-611c6ce1c6aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-157ed4df81d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72a03569-5a7e-4f54-b84c-5e9ddadeab5f","handle":"qa-157ed4df81d8","displayName":"QA 157ed4df81d8","region":"eu","role":"user","createdAt":"2026-10-27T08:00:18.919266904Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-972a3c13-54cb-4ef5-bcd1-d7a87509546f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-972a3c13-54cb-4ef5-bcd1-d7a87509546f
Content-Type: application/json

--- request body ---
{"handle":"qa-157ed4df81d8","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-972a3c13-54cb-4ef5-bcd1-d7a87509546f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72a03569-5a7e-4f54-b84c-5e9ddadeab5f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e36f294-7596-4bb9-b95d-abd05af126ee

--- request headers ---
Accept: application/json
X-Fault-Key: 2783a00f-4a95-455c-b391-c96d25d205c8
X-Fault: unavailable-once
X-Correlation-Id: qa-2e36f294-7596-4bb9-b95d-abd05af126ee
Content-Type: application/json

--- response: 503 in 67 ms ---
Date: Tue, 27 Oct 2026 08:00:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e36f294-7596-4bb9-b95d-abd05af126ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-2e36f294-7596-4bb9-b95d-abd05af126ee"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b92ef794-b8fe-48c1-a04a-7d5ab8863e8f

--- request headers ---
Accept: application/json
X-Fault-Key: 2783a00f-4a95-455c-b391-c96d25d205c8
X-Fault: unavailable-once
X-Correlation-Id: qa-b92ef794-b8fe-48c1-a04a-7d5ab8863e8f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b92ef794-b8fe-48c1-a04a-7d5ab8863e8f
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

{"id":"acc_72a03569-5a7e-4f54-b84c-5e9ddadeab5f","handle":"qa-157ed4df81d8","displayName":"QA 157ed4df81d8","region":"eu","role":"user","createdAt":"2026-10-27T08:00:18.919266904Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de4f85a0-9093-4de1-b9d9-b6cb32b6bc29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de4f85a0-9093-4de1-b9d9-b6cb32b6bc29
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de4f85a0-9093-4de1-b9d9-b6cb32b6bc29
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
correlation: qa-314a0134-6a45-491c-bc26-b560f795525f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-314a0134-6a45-491c-bc26-b560f795525f
Content-Type: application/json

--- request body ---
{"handle":"qa-157ed4df81d8","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-314a0134-6a45-491c-bc26-b560f795525f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-314a0134-6a45-491c-bc26-b560f795525f"}
```
