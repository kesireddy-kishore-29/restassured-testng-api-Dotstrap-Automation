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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-8f0438a1-f936-4de9-9e43-586b7e53b7b2` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-7ac54935-e3a7-4003-aeda-6224abcfc41a` |
| 3 | `GET /v1/accounts/me` | error | 812 | `qa-bf72dcbd-2abf-4969-aa30-f9f78cb78ea4` |
| 4 | `GET /v1/accounts/me` | error | 806 | `qa-3b7e4a1f-75e3-42f0-9478-d336c7b1b3cc` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-27e67393-6b7c-4840-a949-9a4273b144d4` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-7e857179-bfd7-4fe4-b5ee-e15ac3468d53` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f0438a1-f936-4de9-9e43-586b7e53b7b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f0438a1-f936-4de9-9e43-586b7e53b7b2
Content-Type: application/json

--- request body ---
{"handle":"qa-9bc823a6ac81","displayName":"QA 9bc823a6ac81","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f0438a1-f936-4de9-9e43-586b7e53b7b2
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
Location: /v1/accounts/qa-9bc823a6ac81
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae4265ad-3bab-4ae6-9482-65f2850da0fc","handle":"qa-9bc823a6ac81","displayName":"QA 9bc823a6ac81","region":"eu","role":"user","createdAt":"2026-11-13T09:42:09.539927804Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7ac54935-e3a7-4003-aeda-6224abcfc41a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ac54935-e3a7-4003-aeda-6224abcfc41a
Content-Type: application/json

--- request body ---
{"handle":"qa-9bc823a6ac81","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ac54935-e3a7-4003-aeda-6224abcfc41a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae4265ad-3bab-4ae6-9482-65f2850da0fc"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf72dcbd-2abf-4969-aa30-f9f78cb78ea4

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 918d830e-7468-4dc2-8f9f-003b36280ebc
X-Correlation-Id: qa-bf72dcbd-2abf-4969-aa30-f9f78cb78ea4
Content-Type: application/json

--- response: none in 812 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b7e4a1f-75e3-42f0-9478-d336c7b1b3cc

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 918d830e-7468-4dc2-8f9f-003b36280ebc
X-Correlation-Id: qa-3b7e4a1f-75e3-42f0-9478-d336c7b1b3cc
Content-Type: application/json

--- response: none in 806 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27e67393-6b7c-4840-a949-9a4273b144d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27e67393-6b7c-4840-a949-9a4273b144d4
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27e67393-6b7c-4840-a949-9a4273b144d4
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
correlation: qa-7e857179-bfd7-4fe4-b5ee-e15ac3468d53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e857179-bfd7-4fe4-b5ee-e15ac3468d53
Content-Type: application/json

--- request body ---
{"handle":"qa-9bc823a6ac81","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e857179-bfd7-4fe4-b5ee-e15ac3468d53
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e857179-bfd7-4fe4-b5ee-e15ac3468d53"}
```
