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
| 1 | `POST /v1/accounts` | 201 | 428 | `qa-f0b935cb-b99a-49ee-bbe2-7ea10c91d108` |
| 2 | `POST /v1/accounts` | 409 | 12 | `qa-41f2e87e-b8c3-4f4b-8221-63e8ec287520` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-17dbfcad-53d4-441a-a5c2-9b4fba9e4b6f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-5d55aeef-f517-493f-862c-b2d4f6bd10fe` |
| 5 | `POST /v1/auth/token` | 401 | 30 | `qa-80c6a6e2-f4d5-4f3f-90cd-0b6f24a9ba7f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f0b935cb-b99a-49ee-bbe2-7ea10c91d108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0b935cb-b99a-49ee-bbe2-7ea10c91d108
Content-Type: application/json

--- request body ---
{"handle":"qa-db42cbd3c674","displayName":"QA db42cbd3c674","password":"****","region":"eu"}

--- response: 201 in 428 ms ---
Date: Fri, 06 Nov 2026 09:30:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0b935cb-b99a-49ee-bbe2-7ea10c91d108
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
Location: /v1/accounts/qa-db42cbd3c674
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d3a86876-20b2-4914-a381-344af0ecbd72","handle":"qa-db42cbd3c674","displayName":"QA db42cbd3c674","region":"eu","role":"user","createdAt":"2026-11-06T09:30:28.192668615Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-41f2e87e-b8c3-4f4b-8221-63e8ec287520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41f2e87e-b8c3-4f4b-8221-63e8ec287520
Content-Type: application/json

--- request body ---
{"handle":"qa-db42cbd3c674","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41f2e87e-b8c3-4f4b-8221-63e8ec287520
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-db42cbd3c674' is in use.","instance":"/v1/accounts","correlationId":"qa-41f2e87e-b8c3-4f4b-8221-63e8ec287520"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-17dbfcad-53d4-441a-a5c2-9b4fba9e4b6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17dbfcad-53d4-441a-a5c2-9b4fba9e4b6f
Content-Type: application/json

--- request body ---
{"handle":"qa-db42cbd3c674","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-17dbfcad-53d4-441a-a5c2-9b4fba9e4b6f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3a86876-20b2-4914-a381-344af0ecbd72"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5d55aeef-f517-493f-862c-b2d4f6bd10fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d55aeef-f517-493f-862c-b2d4f6bd10fe
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5d55aeef-f517-493f-862c-b2d4f6bd10fe
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
correlation: qa-80c6a6e2-f4d5-4f3f-90cd-0b6f24a9ba7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80c6a6e2-f4d5-4f3f-90cd-0b6f24a9ba7f
Content-Type: application/json

--- request body ---
{"handle":"qa-db42cbd3c674","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80c6a6e2-f4d5-4f3f-90cd-0b6f24a9ba7f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80c6a6e2-f4d5-4f3f-90cd-0b6f24a9ba7f"}
```
