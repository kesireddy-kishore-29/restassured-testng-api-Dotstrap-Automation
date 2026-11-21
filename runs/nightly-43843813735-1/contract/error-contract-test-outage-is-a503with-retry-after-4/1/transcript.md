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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-91f42e47-5019-4e0f-951a-9c2a0f28e4e0` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-1b08883a-a516-4f63-a840-5ff3f805d08f` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-7c2cda0a-aea1-431d-a342-c4d3267d9777` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-2404153e-d8d5-464d-a050-fbacf54eef69` |
| 5 | `DELETE /v1/accounts/me` | 503 | 13 | `qa-316671c8-a020-4cf2-8968-31792560358f` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-568a7ffe-be99-4835-b551-e0fe3bfb8678` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-eaaade4a-ac36-4120-aaf8-ba82ea2367d3` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-2bc3aa52-edcb-4d89-ae92-dda60811c5d6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-abe39ba4-4e47-4a03-94c3-6362dd7c5052` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-59594bbb-3a98-47b2-9aa9-238cc3c7cadf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-91f42e47-5019-4e0f-951a-9c2a0f28e4e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91f42e47-5019-4e0f-951a-9c2a0f28e4e0
Content-Type: application/json

--- request body ---
{"handle":"qa-78b497ea062c","displayName":"QA 78b497ea062c","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-91f42e47-5019-4e0f-951a-9c2a0f28e4e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Location: /v1/accounts/qa-78b497ea062c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_57507c98-5d02-46a1-8a8e-b3ce1ae70489","handle":"qa-78b497ea062c","displayName":"QA 78b497ea062c","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.115601637Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1b08883a-a516-4f63-a840-5ff3f805d08f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b08883a-a516-4f63-a840-5ff3f805d08f
Content-Type: application/json

--- request body ---
{"handle":"qa-40a4fff3fbc1","displayName":"QA 40a4fff3fbc1","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b08883a-a516-4f63-a840-5ff3f805d08f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-40a4fff3fbc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_659a91a1-719d-439c-a8a0-1efeea0b0b97","handle":"qa-40a4fff3fbc1","displayName":"QA 40a4fff3fbc1","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.159857691Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7c2cda0a-aea1-431d-a342-c4d3267d9777

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c2cda0a-aea1-431d-a342-c4d3267d9777
Content-Type: application/json

--- request body ---
{"handle":"qa-78b497ea062c","password":"****"}

--- response: 200 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c2cda0a-aea1-431d-a342-c4d3267d9777
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_57507c98-5d02-46a1-8a8e-b3ce1ae70489"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2404153e-d8d5-464d-a050-fbacf54eef69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2404153e-d8d5-464d-a050-fbacf54eef69
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-40a4fff3fbc1","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2404153e-d8d5-464d-a050-fbacf54eef69
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
Location: /v1/conversations/cnv_2cb98187-ac6a-4ea5-b236-b8019b0dfba8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2cb98187-ac6a-4ea5-b236-b8019b0dfba8","subject":"Error contract","status":"open","region":"eu","participants":["qa-78b497ea062c","qa-40a4fff3fbc1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.255801557Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-316671c8-a020-4cf2-8968-31792560358f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b0abbc85-0bd4-4eda-9683-72f743023fbe
X-Correlation-Id: qa-316671c8-a020-4cf2-8968-31792560358f
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-316671c8-a020-4cf2-8968-31792560358f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-316671c8-a020-4cf2-8968-31792560358f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-568a7ffe-be99-4835-b551-e0fe3bfb8678

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-568a7ffe-be99-4835-b551-e0fe3bfb8678
Content-Type: application/json

--- request body ---
{"handle":"qa-40a4fff3fbc1","password":"****"}

--- response: 200 in 51 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-568a7ffe-be99-4835-b551-e0fe3bfb8678
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_659a91a1-719d-439c-a8a0-1efeea0b0b97"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eaaade4a-ac36-4120-aaf8-ba82ea2367d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaaade4a-ac36-4120-aaf8-ba82ea2367d3
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eaaade4a-ac36-4120-aaf8-ba82ea2367d3
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
correlation: qa-2bc3aa52-edcb-4d89-ae92-dda60811c5d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc3aa52-edcb-4d89-ae92-dda60811c5d6
Content-Type: application/json

--- request body ---
{"handle":"qa-40a4fff3fbc1","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bc3aa52-edcb-4d89-ae92-dda60811c5d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2bc3aa52-edcb-4d89-ae92-dda60811c5d6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-abe39ba4-4e47-4a03-94c3-6362dd7c5052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abe39ba4-4e47-4a03-94c3-6362dd7c5052
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-abe39ba4-4e47-4a03-94c3-6362dd7c5052
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
correlation: qa-59594bbb-3a98-47b2-9aa9-238cc3c7cadf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59594bbb-3a98-47b2-9aa9-238cc3c7cadf
Content-Type: application/json

--- request body ---
{"handle":"qa-78b497ea062c","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59594bbb-3a98-47b2-9aa9-238cc3c7cadf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59594bbb-3a98-47b2-9aa9-238cc3c7cadf"}
```
