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
| 1 | `POST /v1/accounts` | 201 | 309 | `qa-137b17ae-c1a8-45f1-982b-0a5c1d94f96c` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-a4b3c5a4-25a3-4206-bb37-ceea0edce2d6` |
| 3 | `GET /v1/accounts/me` | error | 820 | `qa-55bc4bd2-d142-4034-8c15-8c122df41a39` |
| 4 | `GET /v1/accounts/me` | error | 803 | `qa-d1364558-becb-423d-8169-bbe3fe0ae31b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-e2bcec8c-afab-42d4-961d-3bbf8f8cd49b` |
| 6 | `POST /v1/auth/token` | 401 | 2 | `qa-a8058327-b5bd-4ed5-8799-213582f329a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-137b17ae-c1a8-45f1-982b-0a5c1d94f96c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-137b17ae-c1a8-45f1-982b-0a5c1d94f96c
Content-Type: application/json

--- request body ---
{"handle":"qa-e750b1239382","displayName":"QA e750b1239382","password":"****","region":"eu"}

--- response: 201 in 309 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-137b17ae-c1a8-45f1-982b-0a5c1d94f96c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-e750b1239382
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4226b133-7ede-4d14-a595-ee431a070621","handle":"qa-e750b1239382","displayName":"QA e750b1239382","region":"eu","role":"user","createdAt":"2026-10-31T08:31:29.538926342Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a4b3c5a4-25a3-4206-bb37-ceea0edce2d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4b3c5a4-25a3-4206-bb37-ceea0edce2d6
Content-Type: application/json

--- request body ---
{"handle":"qa-e750b1239382","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4b3c5a4-25a3-4206-bb37-ceea0edce2d6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4226b133-7ede-4d14-a595-ee431a070621"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-55bc4bd2-d142-4034-8c15-8c122df41a39

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 90f57ee8-4109-4a41-8aec-1eeef94208d9
X-Correlation-Id: qa-55bc4bd2-d142-4034-8c15-8c122df41a39
Content-Type: application/json

--- response: none in 820 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1364558-becb-423d-8169-bbe3fe0ae31b

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 90f57ee8-4109-4a41-8aec-1eeef94208d9
X-Correlation-Id: qa-d1364558-becb-423d-8169-bbe3fe0ae31b
Content-Type: application/json

--- response: none in 803 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2bcec8c-afab-42d4-961d-3bbf8f8cd49b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2bcec8c-afab-42d4-961d-3bbf8f8cd49b
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2bcec8c-afab-42d4-961d-3bbf8f8cd49b
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
correlation: qa-a8058327-b5bd-4ed5-8799-213582f329a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8058327-b5bd-4ed5-8799-213582f329a1
Content-Type: application/json

--- request body ---
{"handle":"qa-e750b1239382","password":"****"}

--- response: 401 in 2 ms ---
Date: Sat, 31 Oct 2026 08:31:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8058327-b5bd-4ed5-8799-213582f329a1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8058327-b5bd-4ed5-8799-213582f329a1"}
```
