# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-b663b9d4-7c25-40fc-b327-484a3628db0d` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-70600fa3-b6e0-4ca4-8379-a9c62c13de9d` |
| 3 | `GET /v1/accounts/me` | error | 812 | `qa-de769a54-88fe-4954-9942-5711348f11d6` |
| 4 | `GET /v1/accounts/me` | error | 805 | `qa-152f9931-89df-4611-a302-f1d4ef0b6dde` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e1b4b74c-1317-415d-b6f8-d9de9a3f97e6` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-36d65984-b1a9-449d-84a3-ae55d03708b9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b663b9d4-7c25-40fc-b327-484a3628db0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b663b9d4-7c25-40fc-b327-484a3628db0d
Content-Type: application/json

--- request body ---
{"handle":"qa-cb9214400c6a","displayName":"QA cb9214400c6a","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b663b9d4-7c25-40fc-b327-484a3628db0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-cb9214400c6a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c183574-7ce2-46a8-adb8-ce61a455355b","handle":"qa-cb9214400c6a","displayName":"QA cb9214400c6a","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.968527493Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-70600fa3-b6e0-4ca4-8379-a9c62c13de9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70600fa3-b6e0-4ca4-8379-a9c62c13de9d
Content-Type: application/json

--- request body ---
{"handle":"qa-cb9214400c6a","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-70600fa3-b6e0-4ca4-8379-a9c62c13de9d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c183574-7ce2-46a8-adb8-ce61a455355b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-de769a54-88fe-4954-9942-5711348f11d6

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: c950c4c2-e55e-4c48-a9d3-6e105242e3f1
X-Correlation-Id: qa-de769a54-88fe-4954-9942-5711348f11d6
Content-Type: application/json

--- response: none in 812 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-152f9931-89df-4611-a302-f1d4ef0b6dde

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: c950c4c2-e55e-4c48-a9d3-6e105242e3f1
X-Correlation-Id: qa-152f9931-89df-4611-a302-f1d4ef0b6dde
Content-Type: application/json

--- response: none in 805 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1b4b74c-1317-415d-b6f8-d9de9a3f97e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1b4b74c-1317-415d-b6f8-d9de9a3f97e6
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1b4b74c-1317-415d-b6f8-d9de9a3f97e6
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-36d65984-b1a9-449d-84a3-ae55d03708b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36d65984-b1a9-449d-84a3-ae55d03708b9
Content-Type: application/json

--- request body ---
{"handle":"qa-cb9214400c6a","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36d65984-b1a9-449d-84a3-ae55d03708b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-36d65984-b1a9-449d-84a3-ae55d03708b9"}
```
