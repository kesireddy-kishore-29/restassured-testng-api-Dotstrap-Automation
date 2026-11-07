# Transcript: Requests are served by the home region, whichever edge they arrive at [IN, eu]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[0]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 654 | `qa-e567cf36-8259-4310-aa03-7826572d7d54` |
| 2 | `POST /v1/auth/token` | 200 | 64 | `qa-262c72de-c426-439a-a9f5-99da0e397b20` |
| 3 | `GET /v1/accounts/me` | 200 | 47 | `qa-992efb0e-8d64-403b-a96f-eb3eed96ff9a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-4ab584ac-40e9-4691-829c-341d6d67613d` |
| 5 | `POST /v1/auth/token` | 401 | 39 | `qa-f009b480-2300-41b9-a2c0-ff119e675b94` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e567cf36-8259-4310-aa03-7826572d7d54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e567cf36-8259-4310-aa03-7826572d7d54
Content-Type: application/json

--- request body ---
{"handle":"qa-08d8a99cd6e8","displayName":"QA 08d8a99cd6e8","password":"****","region":"in"}

--- response: 201 in 654 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e567cf36-8259-4310-aa03-7826572d7d54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-08d8a99cd6e8
X-Served-Region: in
Content-Length: 181

{"id":"acc_71ad8a94-58c0-4827-bcbd-818a2b226862","handle":"qa-08d8a99cd6e8","displayName":"QA 08d8a99cd6e8","region":"in","role":"user","createdAt":"2026-10-31T08:31:35.657227545Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-262c72de-c426-439a-a9f5-99da0e397b20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-262c72de-c426-439a-a9f5-99da0e397b20
Content-Type: application/json

--- request body ---
{"handle":"qa-08d8a99cd6e8","password":"****"}

--- response: 200 in 64 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-262c72de-c426-439a-a9f5-99da0e397b20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71ad8a94-58c0-4827-bcbd-818a2b226862"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-992efb0e-8d64-403b-a96f-eb3eed96ff9a

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-992efb0e-8d64-403b-a96f-eb3eed96ff9a
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-992efb0e-8d64-403b-a96f-eb3eed96ff9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: eu
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 181

{"id":"acc_71ad8a94-58c0-4827-bcbd-818a2b226862","handle":"qa-08d8a99cd6e8","displayName":"QA 08d8a99cd6e8","region":"in","role":"user","createdAt":"2026-10-31T08:31:35.657227545Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ab584ac-40e9-4691-829c-341d6d67613d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ab584ac-40e9-4691-829c-341d6d67613d
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ab584ac-40e9-4691-829c-341d6d67613d
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f009b480-2300-41b9-a2c0-ff119e675b94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f009b480-2300-41b9-a2c0-ff119e675b94
Content-Type: application/json

--- request body ---
{"handle":"qa-08d8a99cd6e8","password":"****"}

--- response: 401 in 39 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f009b480-2300-41b9-a2c0-ff119e675b94
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f009b480-2300-41b9-a2c0-ff119e675b94"}
```
