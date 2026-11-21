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
| 1 | `POST /v1/accounts` | 201 | 527 | `qa-9c7258bf-7c3c-4526-96e7-7a6c901c32f5` |
| 2 | `POST /v1/accounts` | 409 | 23 | `qa-2163348b-7678-4df5-8b6f-2777a7b87b01` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-97d5304d-7855-4efb-90fe-62d6f9d5e606` |
| 4 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-c809c60c-884b-4ccd-9409-e6f5e033d12b` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-b1a7d1d6-382e-41e5-a4c7-d8a0593908d7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9c7258bf-7c3c-4526-96e7-7a6c901c32f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c7258bf-7c3c-4526-96e7-7a6c901c32f5
Content-Type: application/json

--- request body ---
{"handle":"qa-95f78119c456","displayName":"QA 95f78119c456","password":"****","region":"eu"}

--- response: 201 in 527 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c7258bf-7c3c-4526-96e7-7a6c901c32f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-95f78119c456
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1309cf1d-7da4-4995-ac5b-16b891ba3ed9","handle":"qa-95f78119c456","displayName":"QA 95f78119c456","region":"eu","role":"user","createdAt":"2026-11-14T09:05:20.213731655Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2163348b-7678-4df5-8b6f-2777a7b87b01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2163348b-7678-4df5-8b6f-2777a7b87b01
Content-Type: application/json

--- request body ---
{"handle":"qa-95f78119c456","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2163348b-7678-4df5-8b6f-2777a7b87b01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-95f78119c456' is in use.","instance":"/v1/accounts","correlationId":"qa-2163348b-7678-4df5-8b6f-2777a7b87b01"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-97d5304d-7855-4efb-90fe-62d6f9d5e606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97d5304d-7855-4efb-90fe-62d6f9d5e606
Content-Type: application/json

--- request body ---
{"handle":"qa-95f78119c456","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-97d5304d-7855-4efb-90fe-62d6f9d5e606
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1309cf1d-7da4-4995-ac5b-16b891ba3ed9"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c809c60c-884b-4ccd-9409-e6f5e033d12b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c809c60c-884b-4ccd-9409-e6f5e033d12b
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c809c60c-884b-4ccd-9409-e6f5e033d12b
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
correlation: qa-b1a7d1d6-382e-41e5-a4c7-d8a0593908d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1a7d1d6-382e-41e5-a4c7-d8a0593908d7
Content-Type: application/json

--- request body ---
{"handle":"qa-95f78119c456","password":"****"}

--- response: 401 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1a7d1d6-382e-41e5-a4c7-d8a0593908d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1a7d1d6-382e-41e5-a4c7-d8a0593908d7"}
```
