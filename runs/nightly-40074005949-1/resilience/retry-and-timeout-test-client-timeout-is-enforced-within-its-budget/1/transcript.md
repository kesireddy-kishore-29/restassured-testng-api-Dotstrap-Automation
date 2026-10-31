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
| 1 | `POST /v1/accounts` | 201 | 421 | `qa-e76615ce-d723-4833-a184-7ca2c6384dd3` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-3808643f-1a85-4aa3-aa7a-01a4a31d8b4c` |
| 3 | `GET /v1/accounts/me` | error | 818 | `qa-d23fae4e-9644-445d-862d-84adf540497d` |
| 4 | `GET /v1/accounts/me` | error | 808 | `qa-845aba3e-4b47-4685-bd1d-0460322e5072` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-795407f7-ab06-4f01-a950-42db99f292b2` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-ef61b670-adf0-420a-a3de-4de96022db4e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e76615ce-d723-4833-a184-7ca2c6384dd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e76615ce-d723-4833-a184-7ca2c6384dd3
Content-Type: application/json

--- request body ---
{"handle":"qa-2d1d81ebc4a8","displayName":"QA 2d1d81ebc4a8","password":"****","region":"eu"}

--- response: 201 in 421 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e76615ce-d723-4833-a184-7ca2c6384dd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-2d1d81ebc4a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ef762f7c-f1f6-47f5-9ef1-1c3b518f1d87","handle":"qa-2d1d81ebc4a8","displayName":"QA 2d1d81ebc4a8","region":"eu","role":"user","createdAt":"2026-10-24T07:25:05.523865922Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3808643f-1a85-4aa3-aa7a-01a4a31d8b4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3808643f-1a85-4aa3-aa7a-01a4a31d8b4c
Content-Type: application/json

--- request body ---
{"handle":"qa-2d1d81ebc4a8","password":"****"}

--- response: 200 in 48 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3808643f-1a85-4aa3-aa7a-01a4a31d8b4c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ef762f7c-f1f6-47f5-9ef1-1c3b518f1d87"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d23fae4e-9644-445d-862d-84adf540497d

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 46a2f520-3fc5-475b-8353-67a63e5ecd50
X-Correlation-Id: qa-d23fae4e-9644-445d-862d-84adf540497d
Content-Type: application/json

--- response: none in 818 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-845aba3e-4b47-4685-bd1d-0460322e5072

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 46a2f520-3fc5-475b-8353-67a63e5ecd50
X-Correlation-Id: qa-845aba3e-4b47-4685-bd1d-0460322e5072
Content-Type: application/json

--- response: none in 808 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-795407f7-ab06-4f01-a950-42db99f292b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-795407f7-ab06-4f01-a950-42db99f292b2
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-795407f7-ab06-4f01-a950-42db99f292b2
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
correlation: qa-ef61b670-adf0-420a-a3de-4de96022db4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef61b670-adf0-420a-a3de-4de96022db4e
Content-Type: application/json

--- request body ---
{"handle":"qa-2d1d81ebc4a8","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef61b670-adf0-420a-a3de-4de96022db4e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef61b670-adf0-420a-a3de-4de96022db4e"}
```
