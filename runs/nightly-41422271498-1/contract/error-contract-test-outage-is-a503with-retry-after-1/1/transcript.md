# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 426 | `qa-9ab0a832-2e0f-430b-90fc-b832d7d20ca6` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-9504c72d-36bc-4721-bb9c-f95f474e702d` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-e978da23-4893-4ac3-a531-28aa01afdec0` |
| 4 | `POST /v1/conversations` | 201 | 64 | `qa-af8eb580-1dd5-4f0a-a461-308a94cf8d64` |
| 5 | `POST /v1/accounts` | 503 | 28 | `qa-83f1b64d-a2d9-4d2e-b2d3-bd8914db2772` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-43f2bdf9-238f-4e72-a5fe-cba5129efabd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-22c80dab-00af-499c-a7f4-c0398353f083` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-b667618b-fad9-4f6b-a398-df4a1bf96f75` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-bb4534bf-e48e-4406-8ed6-4f82e55a728e` |
| 10 | `POST /v1/auth/token` | 401 | 51 | `qa-4371abc5-6598-4667-b9ff-05f3cd12e180` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ab0a832-2e0f-430b-90fc-b832d7d20ca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ab0a832-2e0f-430b-90fc-b832d7d20ca6
Content-Type: application/json

--- request body ---
{"handle":"qa-c283b58380ef","displayName":"QA c283b58380ef","password":"****","region":"eu"}

--- response: 201 in 426 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ab0a832-2e0f-430b-90fc-b832d7d20ca6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Location: /v1/accounts/qa-c283b58380ef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74b6213d-39e2-4b7c-9d7f-9dab47b7cd4b","handle":"qa-c283b58380ef","displayName":"QA c283b58380ef","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.714864283Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9504c72d-36bc-4721-bb9c-f95f474e702d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9504c72d-36bc-4721-bb9c-f95f474e702d
Content-Type: application/json

--- request body ---
{"handle":"qa-bba9669de3e7","displayName":"QA bba9669de3e7","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9504c72d-36bc-4721-bb9c-f95f474e702d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-bba9669de3e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a6759db-f333-4325-9ac3-6d8377bb0978","handle":"qa-bba9669de3e7","displayName":"QA bba9669de3e7","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.985010435Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e978da23-4893-4ac3-a531-28aa01afdec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e978da23-4893-4ac3-a531-28aa01afdec0
Content-Type: application/json

--- request body ---
{"handle":"qa-c283b58380ef","password":"****"}

--- response: 200 in 39 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e978da23-4893-4ac3-a531-28aa01afdec0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74b6213d-39e2-4b7c-9d7f-9dab47b7cd4b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-af8eb580-1dd5-4f0a-a461-308a94cf8d64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af8eb580-1dd5-4f0a-a461-308a94cf8d64
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bba9669de3e7","subject":"Error contract","message":"Hi"}

--- response: 201 in 64 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-af8eb580-1dd5-4f0a-a461-308a94cf8d64
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
Location: /v1/conversations/cnv_0c65e6ad-e02e-4562-8187-2e00313eb768
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0c65e6ad-e02e-4562-8187-2e00313eb768","subject":"Error contract","status":"open","region":"eu","participants":["qa-c283b58380ef","qa-bba9669de3e7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.177058877Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-83f1b64d-a2d9-4d2e-b2d3-bd8914db2772

--- request headers ---
Accept: application/json
X-Fault-Key: 9f5dd0c3-d03f-4eaf-bf33-fe8594f89009
X-Fault: unavailable-once
X-Correlation-Id: qa-83f1b64d-a2d9-4d2e-b2d3-bd8914db2772
Content-Type: application/json

--- request body ---
{"handle":"qa-2690de251e00","displayName":"QA 2690de251e00","password":"****","region":"eu"}

--- response: 503 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83f1b64d-a2d9-4d2e-b2d3-bd8914db2772
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-83f1b64d-a2d9-4d2e-b2d3-bd8914db2772"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-43f2bdf9-238f-4e72-a5fe-cba5129efabd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43f2bdf9-238f-4e72-a5fe-cba5129efabd
Content-Type: application/json

--- request body ---
{"handle":"qa-bba9669de3e7","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-43f2bdf9-238f-4e72-a5fe-cba5129efabd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a6759db-f333-4325-9ac3-6d8377bb0978"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22c80dab-00af-499c-a7f4-c0398353f083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22c80dab-00af-499c-a7f4-c0398353f083
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22c80dab-00af-499c-a7f4-c0398353f083
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
correlation: qa-b667618b-fad9-4f6b-a398-df4a1bf96f75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b667618b-fad9-4f6b-a398-df4a1bf96f75
Content-Type: application/json

--- request body ---
{"handle":"qa-bba9669de3e7","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b667618b-fad9-4f6b-a398-df4a1bf96f75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b667618b-fad9-4f6b-a398-df4a1bf96f75"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb4534bf-e48e-4406-8ed6-4f82e55a728e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb4534bf-e48e-4406-8ed6-4f82e55a728e
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb4534bf-e48e-4406-8ed6-4f82e55a728e
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
correlation: qa-4371abc5-6598-4667-b9ff-05f3cd12e180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4371abc5-6598-4667-b9ff-05f3cd12e180
Content-Type: application/json

--- request body ---
{"handle":"qa-c283b58380ef","password":"****"}

--- response: 401 in 51 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4371abc5-6598-4667-b9ff-05f3cd12e180
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4371abc5-6598-4667-b9ff-05f3cd12e180"}
```
