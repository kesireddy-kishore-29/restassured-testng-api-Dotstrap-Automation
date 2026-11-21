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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-a5e2a7d3-6a90-4459-abd7-e984844e637d` |
| 2 | `POST /v1/auth/token` | 200 | 31 | `qa-6d58ef1f-c0c9-46f2-b3ef-bcfb75b862ef` |
| 3 | `GET /v1/accounts/me` | error | 822 | `qa-7fdef84e-b1b9-4426-9363-a5742cbdf094` |
| 4 | `GET /v1/accounts/me` | error | 805 | `qa-27ffc51a-b4a4-4e32-8015-6318cd5fead5` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9d79a4ff-a73b-4072-93d0-3d44d1a22d66` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-25714fb6-1c4f-4fd5-ab8f-15222affaa3d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a5e2a7d3-6a90-4459-abd7-e984844e637d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e2a7d3-6a90-4459-abd7-e984844e637d
Content-Type: application/json

--- request body ---
{"handle":"qa-9d4e9c2118cf","displayName":"QA 9d4e9c2118cf","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5e2a7d3-6a90-4459-abd7-e984844e637d
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
Location: /v1/accounts/qa-9d4e9c2118cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41732994-557e-4384-b17d-5075e0393df5","handle":"qa-9d4e9c2118cf","displayName":"QA 9d4e9c2118cf","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.352006173Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6d58ef1f-c0c9-46f2-b3ef-bcfb75b862ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d58ef1f-c0c9-46f2-b3ef-bcfb75b862ef
Content-Type: application/json

--- request body ---
{"handle":"qa-9d4e9c2118cf","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d58ef1f-c0c9-46f2-b3ef-bcfb75b862ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41732994-557e-4384-b17d-5075e0393df5"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-7fdef84e-b1b9-4426-9363-a5742cbdf094

--- request headers ---
Accept: application/json
X-Fault-Key: 41ebe504-0030-4859-bef1-d04ab97efca4
X-Fault: latency=4000
X-Correlation-Id: qa-7fdef84e-b1b9-4426-9363-a5742cbdf094
Content-Type: application/json

--- response: none in 822 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-27ffc51a-b4a4-4e32-8015-6318cd5fead5

--- request headers ---
Accept: application/json
X-Fault-Key: 41ebe504-0030-4859-bef1-d04ab97efca4
X-Fault: latency=4000
X-Correlation-Id: qa-27ffc51a-b4a4-4e32-8015-6318cd5fead5
Content-Type: application/json

--- response: none in 805 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d79a4ff-a73b-4072-93d0-3d44d1a22d66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d79a4ff-a73b-4072-93d0-3d44d1a22d66
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d79a4ff-a73b-4072-93d0-3d44d1a22d66
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
correlation: qa-25714fb6-1c4f-4fd5-ab8f-15222affaa3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25714fb6-1c4f-4fd5-ab8f-15222affaa3d
Content-Type: application/json

--- request body ---
{"handle":"qa-9d4e9c2118cf","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25714fb6-1c4f-4fd5-ab8f-15222affaa3d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25714fb6-1c4f-4fd5-ab8f-15222affaa3d"}
```
