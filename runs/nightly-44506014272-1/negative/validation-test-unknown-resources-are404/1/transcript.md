# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 433 | `qa-6e4ef029-eccb-4d1e-88ed-0dfe21011db5` |
| 2 | `POST /v1/auth/token` | 200 | 50 | `qa-5b81bd2c-b3ef-4f63-aea5-3dc00520f49f` |
| 3 | `GET /v1/conversations/{id}` | 404 | 82 | `qa-af281dcb-0634-490d-9552-9d4c1fcb8380` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 26 | `qa-75d4da07-0c2a-4929-ac13-c70cf57d0a23` |
| 5 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-3f810fd2-5db8-4b0b-9ca6-f78a205ab5a1` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-bd9c5acd-b75e-4e67-bc5e-f9c9073262de` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e4ef029-eccb-4d1e-88ed-0dfe21011db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4ef029-eccb-4d1e-88ed-0dfe21011db5
Content-Type: application/json

--- request body ---
{"handle":"qa-0dd1446ceab1","displayName":"QA 0dd1446ceab1","password":"****","region":"eu"}

--- response: 201 in 433 ms ---
Date: Thu, 19 Nov 2026 10:29:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e4ef029-eccb-4d1e-88ed-0dfe21011db5
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
Location: /v1/accounts/qa-0dd1446ceab1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7076b942-5eb1-42fc-a604-3756e983559b","handle":"qa-0dd1446ceab1","displayName":"QA 0dd1446ceab1","region":"eu","role":"user","createdAt":"2026-11-19T10:29:19.141739260Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5b81bd2c-b3ef-4f63-aea5-3dc00520f49f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b81bd2c-b3ef-4f63-aea5-3dc00520f49f
Content-Type: application/json

--- request body ---
{"handle":"qa-0dd1446ceab1","password":"****"}

--- response: 200 in 50 ms ---
Date: Thu, 19 Nov 2026 10:29:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b81bd2c-b3ef-4f63-aea5-3dc00520f49f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7076b942-5eb1-42fc-a604-3756e983559b"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-af281dcb-0634-490d-9552-9d4c1fcb8380

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af281dcb-0634-490d-9552-9d4c1fcb8380
Content-Type: application/json

--- response: 404 in 82 ms ---
Date: Thu, 19 Nov 2026 10:29:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af281dcb-0634-490d-9552-9d4c1fcb8380
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-af281dcb-0634-490d-9552-9d4c1fcb8380"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-75d4da07-0c2a-4929-ac13-c70cf57d0a23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75d4da07-0c2a-4929-ac13-c70cf57d0a23
Content-Type: application/json

--- response: 404 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75d4da07-0c2a-4929-ac13-c70cf57d0a23
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-75d4da07-0c2a-4929-ac13-c70cf57d0a23"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f810fd2-5db8-4b0b-9ca6-f78a205ab5a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f810fd2-5db8-4b0b-9ca6-f78a205ab5a1
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f810fd2-5db8-4b0b-9ca6-f78a205ab5a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bd9c5acd-b75e-4e67-bc5e-f9c9073262de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd9c5acd-b75e-4e67-bc5e-f9c9073262de
Content-Type: application/json

--- request body ---
{"handle":"qa-0dd1446ceab1","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd9c5acd-b75e-4e67-bc5e-f9c9073262de
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd9c5acd-b75e-4e67-bc5e-f9c9073262de"}
```
