# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-4e0d9d24-1530-4e0f-863d-139e8797a868` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-2b972771-4c1e-4a02-b4b1-55403345da5c` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 13 | `qa-08096988-e387-437b-af6d-f0c8e358fb75` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-8ee4e354-2eb7-4d68-b9cb-7fd166506b13` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-9eabfaa6-31d6-4db5-8c09-3894f9feb6e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4e0d9d24-1530-4e0f-863d-139e8797a868

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e0d9d24-1530-4e0f-863d-139e8797a868
Content-Type: application/json

--- request body ---
{"handle":"qa-dcc6a8dff3c1","displayName":"QA dcc6a8dff3c1","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e0d9d24-1530-4e0f-863d-139e8797a868
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 5
Location: /v1/accounts/qa-dcc6a8dff3c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a046e14b-3e47-415e-ae6a-cbcdbf4274d9","handle":"qa-dcc6a8dff3c1","displayName":"QA dcc6a8dff3c1","region":"eu","role":"user","createdAt":"2026-11-21T09:57:13.172679806Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2b972771-4c1e-4a02-b4b1-55403345da5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b972771-4c1e-4a02-b4b1-55403345da5c
Content-Type: application/json

--- request body ---
{"handle":"qa-dcc6a8dff3c1","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b972771-4c1e-4a02-b4b1-55403345da5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a046e14b-3e47-415e-ae6a-cbcdbf4274d9"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-08096988-e387-437b-af6d-f0c8e358fb75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08096988-e387-437b-af6d-f0c8e358fb75
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08096988-e387-437b-af6d-f0c8e358fb75
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-08096988-e387-437b-af6d-f0c8e358fb75"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ee4e354-2eb7-4d68-b9cb-7fd166506b13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ee4e354-2eb7-4d68-b9cb-7fd166506b13
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ee4e354-2eb7-4d68-b9cb-7fd166506b13
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9eabfaa6-31d6-4db5-8c09-3894f9feb6e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eabfaa6-31d6-4db5-8c09-3894f9feb6e0
Content-Type: application/json

--- request body ---
{"handle":"qa-dcc6a8dff3c1","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9eabfaa6-31d6-4db5-8c09-3894f9feb6e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9eabfaa6-31d6-4db5-8c09-3894f9feb6e0"}
```
