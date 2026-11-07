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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-570a9386-c1aa-488a-9d3e-6e7b4dce1f63` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-4a9cdec1-5f49-4088-874d-604c0f708474` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-fbc338a7-1154-4d6f-bfa1-6629eac147f7` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-9717b485-034d-4560-9eb0-4cb7588984fb` |
| 5 | `DELETE /v1/accounts/me` | 503 | 22 | `qa-6781456f-0447-4c9e-8dd3-44e7df0e99e7` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-22526202-4964-4feb-bab9-94d21ce64517` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-a7c795ab-5ae0-4f95-86dc-ba7a56ed693f` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-b16429b4-7708-49c6-aad8-eebd5b9f6b74` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c35df11d-8278-4355-b797-c98796defd50` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-b18aa44d-9692-4241-87b0-3674902288ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-570a9386-c1aa-488a-9d3e-6e7b4dce1f63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-570a9386-c1aa-488a-9d3e-6e7b4dce1f63
Content-Type: application/json

--- request body ---
{"handle":"qa-1f5f6aa59dc1","displayName":"QA 1f5f6aa59dc1","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-570a9386-c1aa-488a-9d3e-6e7b4dce1f63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Location: /v1/accounts/qa-1f5f6aa59dc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30b8cf83-cd4c-4a5d-8303-d94f6e89aa05","handle":"qa-1f5f6aa59dc1","displayName":"QA 1f5f6aa59dc1","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.327300829Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4a9cdec1-5f49-4088-874d-604c0f708474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a9cdec1-5f49-4088-874d-604c0f708474
Content-Type: application/json

--- request body ---
{"handle":"qa-c5adc4facbf0","displayName":"QA c5adc4facbf0","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a9cdec1-5f49-4088-874d-604c0f708474
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Location: /v1/accounts/qa-c5adc4facbf0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd0ff624-e45b-495d-bebb-7173f727712e","handle":"qa-c5adc4facbf0","displayName":"QA c5adc4facbf0","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.369461159Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fbc338a7-1154-4d6f-bfa1-6629eac147f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbc338a7-1154-4d6f-bfa1-6629eac147f7
Content-Type: application/json

--- request body ---
{"handle":"qa-1f5f6aa59dc1","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbc338a7-1154-4d6f-bfa1-6629eac147f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30b8cf83-cd4c-4a5d-8303-d94f6e89aa05"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9717b485-034d-4560-9eb0-4cb7588984fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9717b485-034d-4560-9eb0-4cb7588984fb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5adc4facbf0","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9717b485-034d-4560-9eb0-4cb7588984fb
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
Location: /v1/conversations/cnv_282dc3be-9703-4e7d-9b2f-a6bbeb9a6101
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_282dc3be-9703-4e7d-9b2f-a6bbeb9a6101","subject":"Error contract","status":"open","region":"eu","participants":["qa-1f5f6aa59dc1","qa-c5adc4facbf0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.467846413Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6781456f-0447-4c9e-8dd3-44e7df0e99e7

--- request headers ---
Accept: application/json
X-Fault-Key: c7c53f40-46cd-4d14-a897-83364810ee3e
X-Fault: unavailable-once
X-Correlation-Id: qa-6781456f-0447-4c9e-8dd3-44e7df0e99e7
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6781456f-0447-4c9e-8dd3-44e7df0e99e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-6781456f-0447-4c9e-8dd3-44e7df0e99e7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-22526202-4964-4feb-bab9-94d21ce64517

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22526202-4964-4feb-bab9-94d21ce64517
Content-Type: application/json

--- request body ---
{"handle":"qa-c5adc4facbf0","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-22526202-4964-4feb-bab9-94d21ce64517
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd0ff624-e45b-495d-bebb-7173f727712e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7c795ab-5ae0-4f95-86dc-ba7a56ed693f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7c795ab-5ae0-4f95-86dc-ba7a56ed693f
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7c795ab-5ae0-4f95-86dc-ba7a56ed693f
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
correlation: qa-b16429b4-7708-49c6-aad8-eebd5b9f6b74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16429b4-7708-49c6-aad8-eebd5b9f6b74
Content-Type: application/json

--- request body ---
{"handle":"qa-c5adc4facbf0","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b16429b4-7708-49c6-aad8-eebd5b9f6b74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b16429b4-7708-49c6-aad8-eebd5b9f6b74"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c35df11d-8278-4355-b797-c98796defd50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c35df11d-8278-4355-b797-c98796defd50
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c35df11d-8278-4355-b797-c98796defd50
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
correlation: qa-b18aa44d-9692-4241-87b0-3674902288ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b18aa44d-9692-4241-87b0-3674902288ac
Content-Type: application/json

--- request body ---
{"handle":"qa-1f5f6aa59dc1","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b18aa44d-9692-4241-87b0-3674902288ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b18aa44d-9692-4241-87b0-3674902288ac"}
```
