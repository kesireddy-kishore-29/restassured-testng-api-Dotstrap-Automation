# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-687c56e2-165e-42d5-8d52-ad840063fa2c` |
| 2 | `POST /v1/accounts` | 409 | 17 | `qa-5d25f50f-b517-48ae-b95d-ad27b3890842` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-666a2d97-9c66-40f4-9a5c-db9dec428d87` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d2027100-2c36-42ee-9cb3-d1f66afe864d` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-0cd8aba8-1291-4e67-8ecc-ed7576cc02b1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-687c56e2-165e-42d5-8d52-ad840063fa2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-687c56e2-165e-42d5-8d52-ad840063fa2c
Content-Type: application/json

--- request body ---
{"handle":"qa-fea5b56b2c63","displayName":"QA fea5b56b2c63","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-687c56e2-165e-42d5-8d52-ad840063fa2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 8
Location: /v1/accounts/qa-fea5b56b2c63
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5627aa97-f024-4f76-8e8a-48ed53266556","handle":"qa-fea5b56b2c63","displayName":"QA fea5b56b2c63","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.390654322Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5d25f50f-b517-48ae-b95d-ad27b3890842

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d25f50f-b517-48ae-b95d-ad27b3890842
Content-Type: application/json

--- request body ---
{"handle":"qa-fea5b56b2c63","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d25f50f-b517-48ae-b95d-ad27b3890842
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 8
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-fea5b56b2c63' is in use.","instance":"/v1/accounts","correlationId":"qa-5d25f50f-b517-48ae-b95d-ad27b3890842"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-666a2d97-9c66-40f4-9a5c-db9dec428d87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666a2d97-9c66-40f4-9a5c-db9dec428d87
Content-Type: application/json

--- request body ---
{"handle":"qa-fea5b56b2c63","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-666a2d97-9c66-40f4-9a5c-db9dec428d87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5627aa97-f024-4f76-8e8a-48ed53266556"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d2027100-2c36-42ee-9cb3-d1f66afe864d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2027100-2c36-42ee-9cb3-d1f66afe864d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d2027100-2c36-42ee-9cb3-d1f66afe864d
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0cd8aba8-1291-4e67-8ecc-ed7576cc02b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cd8aba8-1291-4e67-8ecc-ed7576cc02b1
Content-Type: application/json

--- request body ---
{"handle":"qa-fea5b56b2c63","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cd8aba8-1291-4e67-8ecc-ed7576cc02b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0cd8aba8-1291-4e67-8ecc-ed7576cc02b1"}
```
