# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-8c075a80-90b0-4f61-97c1-b11a0ba503d7` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-3b71a9e9-c164-452d-a794-72adcb2b654f` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 19 | `qa-4d60a31c-cb23-4c1e-8719-7ed9ceb6390f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-247010fb-aad7-44b0-a1d2-35dee47e91b8` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-d4aabb37-3b64-413f-9239-c2b757c500a8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c075a80-90b0-4f61-97c1-b11a0ba503d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c075a80-90b0-4f61-97c1-b11a0ba503d7
Content-Type: application/json

--- request body ---
{"handle":"qa-1635c383e0ac","displayName":"QA 1635c383e0ac","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c075a80-90b0-4f61-97c1-b11a0ba503d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Location: /v1/accounts/qa-1635c383e0ac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1daf9258-88cc-48f0-9fc6-1c83d98b60fc","handle":"qa-1635c383e0ac","displayName":"QA 1635c383e0ac","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.326624222Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3b71a9e9-c164-452d-a794-72adcb2b654f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b71a9e9-c164-452d-a794-72adcb2b654f
Content-Type: application/json

--- request body ---
{"handle":"qa-1635c383e0ac","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b71a9e9-c164-452d-a794-72adcb2b654f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1daf9258-88cc-48f0-9fc6-1c83d98b60fc"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-4d60a31c-cb23-4c1e-8719-7ed9ceb6390f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d60a31c-cb23-4c1e-8719-7ed9ceb6390f
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d60a31c-cb23-4c1e-8719-7ed9ceb6390f
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-4d60a31c-cb23-4c1e-8719-7ed9ceb6390f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-247010fb-aad7-44b0-a1d2-35dee47e91b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-247010fb-aad7-44b0-a1d2-35dee47e91b8
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-247010fb-aad7-44b0-a1d2-35dee47e91b8
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
correlation: qa-d4aabb37-3b64-413f-9239-c2b757c500a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4aabb37-3b64-413f-9239-c2b757c500a8
Content-Type: application/json

--- request body ---
{"handle":"qa-1635c383e0ac","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4aabb37-3b64-413f-9239-c2b757c500a8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4aabb37-3b64-413f-9239-c2b757c500a8"}
```
