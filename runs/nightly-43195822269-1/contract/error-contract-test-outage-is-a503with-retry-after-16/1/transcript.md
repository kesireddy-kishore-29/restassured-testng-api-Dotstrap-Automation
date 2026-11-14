# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 7 | `qa-3b3d80a7-bec2-4a82-9381-31f0a2a5e646` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-ddd4e933-ed74-4b06-8de3-d6894f3c056d` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-7eb7fdd0-12eb-4a46-91cb-0723061ce3e8` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-8593f96f-8ff3-4221-84dc-5cb474451651` |
| 5 | `GET /v1/admin/stats` | 503 | 13 | `qa-f75e905a-eaa1-4143-9a56-fde1d8b8439a` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-c4832e00-b1c8-4944-98db-77de8356f89a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-cced1286-28d7-49f3-a5ab-670c00a0c86c` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-70199eef-6643-4278-b7c5-9c60375f5013` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-35a11e8b-de97-4840-8d63-d77e084a6e2b` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-54824091-e440-4530-b432-0adc03971268` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3b3d80a7-bec2-4a82-9381-31f0a2a5e646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b3d80a7-bec2-4a82-9381-31f0a2a5e646
Content-Type: application/json

--- request body ---
{"handle":"qa-cc6124eceb81","displayName":"QA cc6124eceb81","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b3d80a7-bec2-4a82-9381-31f0a2a5e646
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 8
Location: /v1/accounts/qa-cc6124eceb81
X-Served-Region: eu
Content-Length: 181

{"id":"acc_06881d14-e50f-468b-8bf3-fe43521fe01b","handle":"qa-cc6124eceb81","displayName":"QA cc6124eceb81","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.146560083Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ddd4e933-ed74-4b06-8de3-d6894f3c056d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddd4e933-ed74-4b06-8de3-d6894f3c056d
Content-Type: application/json

--- request body ---
{"handle":"qa-9c40db8ab86d","displayName":"QA 9c40db8ab86d","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddd4e933-ed74-4b06-8de3-d6894f3c056d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 8
Location: /v1/accounts/qa-9c40db8ab86d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_034e0c2a-319d-43e7-8c66-e6d55a9767b4","handle":"qa-9c40db8ab86d","displayName":"QA 9c40db8ab86d","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.178142291Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7eb7fdd0-12eb-4a46-91cb-0723061ce3e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eb7fdd0-12eb-4a46-91cb-0723061ce3e8
Content-Type: application/json

--- request body ---
{"handle":"qa-cc6124eceb81","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eb7fdd0-12eb-4a46-91cb-0723061ce3e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_06881d14-e50f-468b-8bf3-fe43521fe01b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8593f96f-8ff3-4221-84dc-5cb474451651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8593f96f-8ff3-4221-84dc-5cb474451651
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c40db8ab86d","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8593f96f-8ff3-4221-84dc-5cb474451651
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
Location: /v1/conversations/cnv_960428bb-cdda-48f7-910c-c302b1a83978
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_960428bb-cdda-48f7-910c-c302b1a83978","subject":"Error contract","status":"open","region":"eu","participants":["qa-cc6124eceb81","qa-9c40db8ab86d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:32.223664089Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-f75e905a-eaa1-4143-9a56-fde1d8b8439a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c87e3978-f641-41fd-84e0-82070ab515b7
X-Correlation-Id: qa-f75e905a-eaa1-4143-9a56-fde1d8b8439a
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f75e905a-eaa1-4143-9a56-fde1d8b8439a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-f75e905a-eaa1-4143-9a56-fde1d8b8439a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c4832e00-b1c8-4944-98db-77de8356f89a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4832e00-b1c8-4944-98db-77de8356f89a
Content-Type: application/json

--- request body ---
{"handle":"qa-9c40db8ab86d","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4832e00-b1c8-4944-98db-77de8356f89a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034e0c2a-319d-43e7-8c66-e6d55a9767b4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cced1286-28d7-49f3-a5ab-670c00a0c86c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cced1286-28d7-49f3-a5ab-670c00a0c86c
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cced1286-28d7-49f3-a5ab-670c00a0c86c
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
correlation: qa-70199eef-6643-4278-b7c5-9c60375f5013

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70199eef-6643-4278-b7c5-9c60375f5013
Content-Type: application/json

--- request body ---
{"handle":"qa-9c40db8ab86d","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70199eef-6643-4278-b7c5-9c60375f5013
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70199eef-6643-4278-b7c5-9c60375f5013"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35a11e8b-de97-4840-8d63-d77e084a6e2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a11e8b-de97-4840-8d63-d77e084a6e2b
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35a11e8b-de97-4840-8d63-d77e084a6e2b
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
correlation: qa-54824091-e440-4530-b432-0adc03971268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54824091-e440-4530-b432-0adc03971268
Content-Type: application/json

--- request body ---
{"handle":"qa-cc6124eceb81","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54824091-e440-4530-b432-0adc03971268
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-54824091-e440-4530-b432-0adc03971268"}
```
