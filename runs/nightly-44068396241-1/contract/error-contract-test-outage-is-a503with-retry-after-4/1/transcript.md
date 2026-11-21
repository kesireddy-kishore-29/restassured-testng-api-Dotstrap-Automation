# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-b0e5dc11-d9c6-45cc-9ba2-c465b89a75b3` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-c3547fc8-4b7f-4249-ba2b-3664a44616f9` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-02a9a87e-98d3-4ae5-abd6-fbc97a8334c0` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-932bbd7d-62d7-4844-a6f6-67678b6f0e32` |
| 5 | `DELETE /v1/accounts/me` | 503 | 8 | `qa-21e19dcd-c2a7-4a70-ade0-6038699c51cb` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-fbc0bf01-6746-427c-9cba-17a6953c18e3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-65c8e9e0-c15f-4763-ba6b-9039be70a80b` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-8c6a9dce-8b64-407b-b1e2-c22b865220b4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-c1c85111-ae90-4421-aaf8-ab7db75a7934` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-ccb16393-9ad4-42a6-8cd1-834019a50d74` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b0e5dc11-d9c6-45cc-9ba2-c465b89a75b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0e5dc11-d9c6-45cc-9ba2-c465b89a75b3
Content-Type: application/json

--- request body ---
{"handle":"qa-de50c666c175","displayName":"QA de50c666c175","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0e5dc11-d9c6-45cc-9ba2-c465b89a75b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Location: /v1/accounts/qa-de50c666c175
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f347caf-b60e-4ab0-84b0-409cbc255731","handle":"qa-de50c666c175","displayName":"QA de50c666c175","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.863186962Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c3547fc8-4b7f-4249-ba2b-3664a44616f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3547fc8-4b7f-4249-ba2b-3664a44616f9
Content-Type: application/json

--- request body ---
{"handle":"qa-98df06b375e0","displayName":"QA 98df06b375e0","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3547fc8-4b7f-4249-ba2b-3664a44616f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-98df06b375e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e155176-f597-45d0-a136-b383072e51e2","handle":"qa-98df06b375e0","displayName":"QA 98df06b375e0","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.916577609Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-02a9a87e-98d3-4ae5-abd6-fbc97a8334c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02a9a87e-98d3-4ae5-abd6-fbc97a8334c0
Content-Type: application/json

--- request body ---
{"handle":"qa-de50c666c175","password":"****"}

--- response: 200 in 43 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-02a9a87e-98d3-4ae5-abd6-fbc97a8334c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f347caf-b60e-4ab0-84b0-409cbc255731"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-932bbd7d-62d7-4844-a6f6-67678b6f0e32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-932bbd7d-62d7-4844-a6f6-67678b6f0e32
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-98df06b375e0","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-932bbd7d-62d7-4844-a6f6-67678b6f0e32
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
Location: /v1/conversations/cnv_0e079e5e-3665-4080-a8ec-7e3c29ded876
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0e079e5e-3665-4080-a8ec-7e3c29ded876","subject":"Error contract","status":"open","region":"eu","participants":["qa-de50c666c175","qa-98df06b375e0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.047897570Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21e19dcd-c2a7-4a70-ade0-6038699c51cb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: efff25f1-9b13-4bbb-955c-719949b5bf85
X-Correlation-Id: qa-21e19dcd-c2a7-4a70-ade0-6038699c51cb
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21e19dcd-c2a7-4a70-ade0-6038699c51cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-21e19dcd-c2a7-4a70-ade0-6038699c51cb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fbc0bf01-6746-427c-9cba-17a6953c18e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbc0bf01-6746-427c-9cba-17a6953c18e3
Content-Type: application/json

--- request body ---
{"handle":"qa-98df06b375e0","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbc0bf01-6746-427c-9cba-17a6953c18e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e155176-f597-45d0-a136-b383072e51e2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65c8e9e0-c15f-4763-ba6b-9039be70a80b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65c8e9e0-c15f-4763-ba6b-9039be70a80b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65c8e9e0-c15f-4763-ba6b-9039be70a80b
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-8c6a9dce-8b64-407b-b1e2-c22b865220b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c6a9dce-8b64-407b-b1e2-c22b865220b4
Content-Type: application/json

--- request body ---
{"handle":"qa-98df06b375e0","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c6a9dce-8b64-407b-b1e2-c22b865220b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c6a9dce-8b64-407b-b1e2-c22b865220b4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1c85111-ae90-4421-aaf8-ab7db75a7934

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1c85111-ae90-4421-aaf8-ab7db75a7934
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1c85111-ae90-4421-aaf8-ab7db75a7934
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ccb16393-9ad4-42a6-8cd1-834019a50d74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccb16393-9ad4-42a6-8cd1-834019a50d74
Content-Type: application/json

--- request body ---
{"handle":"qa-de50c666c175","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccb16393-9ad4-42a6-8cd1-834019a50d74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccb16393-9ad4-42a6-8cd1-834019a50d74"}
```
