# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-7f3739f8-97df-4845-b9ec-b32a9eb503d7` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-488b78c7-4873-439c-9b46-2b7878849b05` |
| 3 | `POST /v1/auth/token` | 200 | 59 | `qa-bd18de85-7e3d-4849-8f77-185d0bbbe2cc` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-3d717ea6-d055-44e9-9540-697155be77d1` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 17 | `qa-82788396-4fdf-455a-a868-cf6e4e1aca07` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-8548b7e6-edeb-496d-8ba7-cfb94785d20f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-b8a13921-5a49-44cf-90f2-0bbcf25eec5a` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-8909e25b-fe8c-4960-8fba-9fa520342622` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-2a6c11e5-f9c1-4a39-a762-8ed5a102d53c` |
| 10 | `POST /v1/auth/token` | 401 | 57 | `qa-b08b643a-68bf-400c-b603-236cec37311c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7f3739f8-97df-4845-b9ec-b32a9eb503d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f3739f8-97df-4845-b9ec-b32a9eb503d7
Content-Type: application/json

--- request body ---
{"handle":"qa-29fd24c63fcb","displayName":"QA 29fd24c63fcb","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f3739f8-97df-4845-b9ec-b32a9eb503d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Location: /v1/accounts/qa-29fd24c63fcb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_07c4e722-1a80-47ec-9673-91503fe70b09","handle":"qa-29fd24c63fcb","displayName":"QA 29fd24c63fcb","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.852051566Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-488b78c7-4873-439c-9b46-2b7878849b05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-488b78c7-4873-439c-9b46-2b7878849b05
Content-Type: application/json

--- request body ---
{"handle":"qa-14fcf5d27a43","displayName":"QA 14fcf5d27a43","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-488b78c7-4873-439c-9b46-2b7878849b05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Location: /v1/accounts/qa-14fcf5d27a43
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d574b732-794c-44df-b1d8-c4bbca3e8a41","handle":"qa-14fcf5d27a43","displayName":"QA 14fcf5d27a43","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.897270337Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bd18de85-7e3d-4849-8f77-185d0bbbe2cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd18de85-7e3d-4849-8f77-185d0bbbe2cc
Content-Type: application/json

--- request body ---
{"handle":"qa-29fd24c63fcb","password":"****"}

--- response: 200 in 59 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd18de85-7e3d-4849-8f77-185d0bbbe2cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_07c4e722-1a80-47ec-9673-91503fe70b09"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d717ea6-d055-44e9-9540-697155be77d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d717ea6-d055-44e9-9540-697155be77d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-14fcf5d27a43","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d717ea6-d055-44e9-9540-697155be77d1
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
Location: /v1/conversations/cnv_8b210977-b81d-4581-869e-d5cddf3a6b96
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8b210977-b81d-4581-869e-d5cddf3a6b96","subject":"Error contract","status":"open","region":"eu","participants":["qa-29fd24c63fcb","qa-14fcf5d27a43"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.002331716Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8b210977-b81d-4581-869e-d5cddf3a6b96/messages
correlation: qa-82788396-4fdf-455a-a868-cf6e4e1aca07

--- request headers ---
Accept: application/json
X-Fault-Key: 735c793d-8cbb-426e-a35d-17f8209c3ed2
X-Fault: unavailable-once
X-Correlation-Id: qa-82788396-4fdf-455a-a868-cf6e4e1aca07
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82788396-4fdf-455a-a868-cf6e4e1aca07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_8b210977-b81d-4581-869e-d5cddf3a6b96/messages","correlationId":"qa-82788396-4fdf-455a-a868-cf6e4e1aca07"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8548b7e6-edeb-496d-8ba7-cfb94785d20f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8548b7e6-edeb-496d-8ba7-cfb94785d20f
Content-Type: application/json

--- request body ---
{"handle":"qa-14fcf5d27a43","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8548b7e6-edeb-496d-8ba7-cfb94785d20f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d574b732-794c-44df-b1d8-c4bbca3e8a41"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8a13921-5a49-44cf-90f2-0bbcf25eec5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8a13921-5a49-44cf-90f2-0bbcf25eec5a
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8a13921-5a49-44cf-90f2-0bbcf25eec5a
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
correlation: qa-8909e25b-fe8c-4960-8fba-9fa520342622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8909e25b-fe8c-4960-8fba-9fa520342622
Content-Type: application/json

--- request body ---
{"handle":"qa-14fcf5d27a43","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8909e25b-fe8c-4960-8fba-9fa520342622
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8909e25b-fe8c-4960-8fba-9fa520342622"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2a6c11e5-f9c1-4a39-a762-8ed5a102d53c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a6c11e5-f9c1-4a39-a762-8ed5a102d53c
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2a6c11e5-f9c1-4a39-a762-8ed5a102d53c
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
correlation: qa-b08b643a-68bf-400c-b603-236cec37311c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b08b643a-68bf-400c-b603-236cec37311c
Content-Type: application/json

--- request body ---
{"handle":"qa-29fd24c63fcb","password":"****"}

--- response: 401 in 57 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b08b643a-68bf-400c-b603-236cec37311c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b08b643a-68bf-400c-b603-236cec37311c"}
```
