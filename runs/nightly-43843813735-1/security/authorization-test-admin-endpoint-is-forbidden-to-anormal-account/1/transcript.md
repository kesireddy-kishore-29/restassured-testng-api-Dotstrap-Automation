# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 462 | `qa-eaedaa94-68ab-439c-90b0-f5615b6ff8da` |
| 2 | `POST /v1/auth/token` | 200 | 66 | `qa-d578369a-c2df-4f07-b401-aa820271d610` |
| 3 | `GET /v1/admin/stats` | 403 | 68 | `qa-cc816914-0b40-405d-9b14-e7b3c0852761` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-33dfbd42-566a-4664-acad-d1a1167b19f9` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-1b7f46ce-1a57-421b-b5d5-868ca4356dcb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eaedaa94-68ab-439c-90b0-f5615b6ff8da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaedaa94-68ab-439c-90b0-f5615b6ff8da
Content-Type: application/json

--- request body ---
{"handle":"qa-abccd81095de","displayName":"QA abccd81095de","password":"****","region":"eu"}

--- response: 201 in 462 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaedaa94-68ab-439c-90b0-f5615b6ff8da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-abccd81095de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5461894e-8e3e-4d34-b2ef-d89e3006bf59","handle":"qa-abccd81095de","displayName":"QA abccd81095de","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.250592249Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d578369a-c2df-4f07-b401-aa820271d610

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d578369a-c2df-4f07-b401-aa820271d610
Content-Type: application/json

--- request body ---
{"handle":"qa-abccd81095de","password":"****"}

--- response: 200 in 66 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d578369a-c2df-4f07-b401-aa820271d610
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5461894e-8e3e-4d34-b2ef-d89e3006bf59"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-cc816914-0b40-405d-9b14-e7b3c0852761

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc816914-0b40-405d-9b14-e7b3c0852761
Content-Type: application/json

--- response: 403 in 68 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc816914-0b40-405d-9b14-e7b3c0852761
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-cc816914-0b40-405d-9b14-e7b3c0852761"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-33dfbd42-566a-4664-acad-d1a1167b19f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33dfbd42-566a-4664-acad-d1a1167b19f9
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-33dfbd42-566a-4664-acad-d1a1167b19f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1b7f46ce-1a57-421b-b5d5-868ca4356dcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b7f46ce-1a57-421b-b5d5-868ca4356dcb
Content-Type: application/json

--- request body ---
{"handle":"qa-abccd81095de","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b7f46ce-1a57-421b-b5d5-868ca4356dcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b7f46ce-1a57-421b-b5d5-868ca4356dcb"}
```
