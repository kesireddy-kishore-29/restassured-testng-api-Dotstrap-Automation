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
| 1 | `POST /v1/accounts` | 201 | 303 | `qa-17b70b7f-7006-4b6c-960e-1827ad819886` |
| 2 | `POST /v1/auth/token` | 200 | 51 | `qa-fdc4d345-0bfe-4d93-9a5e-81d9018afb99` |
| 3 | `GET /v1/accounts/me` | 503 | 55 | `qa-7fd782e3-3c43-4dd1-b6a1-2f6ffdc1d4ba` |
| 4 | `GET /v1/accounts/me` | 200 | 5 | `qa-b0ef4c79-9ab7-4097-9207-fdadaf90f60d` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-6465b3d1-151b-4984-8bc3-cfb4bc573a02` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-c56329ae-079e-4378-a0ae-cfc8629675ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-17b70b7f-7006-4b6c-960e-1827ad819886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17b70b7f-7006-4b6c-960e-1827ad819886
Content-Type: application/json

--- request body ---
{"handle":"qa-2abe73835460","displayName":"QA 2abe73835460","password":"****","region":"eu"}

--- response: 201 in 303 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-17b70b7f-7006-4b6c-960e-1827ad819886
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
Location: /v1/accounts/qa-2abe73835460
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c17f19cf-65fb-4e56-9a4b-6447adf3abb8","handle":"qa-2abe73835460","displayName":"QA 2abe73835460","region":"eu","role":"user","createdAt":"2026-10-30T08:45:48.604479923Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fdc4d345-0bfe-4d93-9a5e-81d9018afb99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdc4d345-0bfe-4d93-9a5e-81d9018afb99
Content-Type: application/json

--- request body ---
{"handle":"qa-2abe73835460","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdc4d345-0bfe-4d93-9a5e-81d9018afb99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c17f19cf-65fb-4e56-9a4b-6447adf3abb8"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-7fd782e3-3c43-4dd1-b6a1-2f6ffdc1d4ba

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e9540f2c-93b8-477f-89f5-061119a05d92
X-Correlation-Id: qa-7fd782e3-3c43-4dd1-b6a1-2f6ffdc1d4ba
Content-Type: application/json

--- response: 503 in 55 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7fd782e3-3c43-4dd1-b6a1-2f6ffdc1d4ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-7fd782e3-3c43-4dd1-b6a1-2f6ffdc1d4ba"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0ef4c79-9ab7-4097-9207-fdadaf90f60d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e9540f2c-93b8-477f-89f5-061119a05d92
X-Correlation-Id: qa-b0ef4c79-9ab7-4097-9207-fdadaf90f60d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0ef4c79-9ab7-4097-9207-fdadaf90f60d
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

{"id":"acc_c17f19cf-65fb-4e56-9a4b-6447adf3abb8","handle":"qa-2abe73835460","displayName":"QA 2abe73835460","region":"eu","role":"user","createdAt":"2026-10-30T08:45:48.604479923Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6465b3d1-151b-4984-8bc3-cfb4bc573a02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6465b3d1-151b-4984-8bc3-cfb4bc573a02
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6465b3d1-151b-4984-8bc3-cfb4bc573a02
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
correlation: qa-c56329ae-079e-4378-a0ae-cfc8629675ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c56329ae-079e-4378-a0ae-cfc8629675ac
Content-Type: application/json

--- request body ---
{"handle":"qa-2abe73835460","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c56329ae-079e-4378-a0ae-cfc8629675ac
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c56329ae-079e-4378-a0ae-cfc8629675ac"}
```
