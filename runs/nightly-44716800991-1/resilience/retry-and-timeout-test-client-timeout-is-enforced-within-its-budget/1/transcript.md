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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-c8f11201-c7c4-4b81-9694-b7616fb48faf` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-c5eb523b-cf12-4dba-89bb-41eee8616758` |
| 3 | `GET /v1/accounts/me` | error | 823 | `qa-07659e7a-22cd-43f1-b2c5-2ca1f1ead96d` |
| 4 | `GET /v1/accounts/me` | error | 806 | `qa-5477ab57-3aac-4337-9785-c702e24a2bd4` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-11298642-a3f7-411c-9325-9e2c38439652` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-72777693-f09e-490d-9359-b23d7f2976df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c8f11201-c7c4-4b81-9694-b7616fb48faf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8f11201-c7c4-4b81-9694-b7616fb48faf
Content-Type: application/json

--- request body ---
{"handle":"qa-ada4d0bd3e62","displayName":"QA ada4d0bd3e62","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8f11201-c7c4-4b81-9694-b7616fb48faf
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
Location: /v1/accounts/qa-ada4d0bd3e62
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3e37eb6-6324-408c-a2fc-380030eb656f","handle":"qa-ada4d0bd3e62","displayName":"QA ada4d0bd3e62","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.540101380Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c5eb523b-cf12-4dba-89bb-41eee8616758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5eb523b-cf12-4dba-89bb-41eee8616758
Content-Type: application/json

--- request body ---
{"handle":"qa-ada4d0bd3e62","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5eb523b-cf12-4dba-89bb-41eee8616758
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3e37eb6-6324-408c-a2fc-380030eb656f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-07659e7a-22cd-43f1-b2c5-2ca1f1ead96d

--- request headers ---
Accept: application/json
X-Fault-Key: 6cd64e04-6eda-44ed-a574-b659dfb2cbae
X-Fault: latency=4000
X-Correlation-Id: qa-07659e7a-22cd-43f1-b2c5-2ca1f1ead96d
Content-Type: application/json

--- response: none in 823 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-5477ab57-3aac-4337-9785-c702e24a2bd4

--- request headers ---
Accept: application/json
X-Fault-Key: 6cd64e04-6eda-44ed-a574-b659dfb2cbae
X-Fault: latency=4000
X-Correlation-Id: qa-5477ab57-3aac-4337-9785-c702e24a2bd4
Content-Type: application/json

--- response: none in 806 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11298642-a3f7-411c-9325-9e2c38439652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11298642-a3f7-411c-9325-9e2c38439652
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11298642-a3f7-411c-9325-9e2c38439652
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
correlation: qa-72777693-f09e-490d-9359-b23d7f2976df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72777693-f09e-490d-9359-b23d7f2976df
Content-Type: application/json

--- request body ---
{"handle":"qa-ada4d0bd3e62","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72777693-f09e-490d-9359-b23d7f2976df
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-72777693-f09e-490d-9359-b23d7f2976df"}
```
