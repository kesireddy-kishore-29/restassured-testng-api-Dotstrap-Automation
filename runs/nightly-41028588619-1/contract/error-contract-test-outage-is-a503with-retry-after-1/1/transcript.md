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
| 1 | `POST /v1/accounts` | 201 | 520 | `qa-01752c69-ab59-41fd-bd37-8ce8c84ccfec` |
| 2 | `POST /v1/accounts` | 201 | 84 | `qa-6a05f835-52e5-429e-9f9f-c077a0a2af59` |
| 3 | `POST /v1/auth/token` | 200 | 72 | `qa-435ef100-57d3-4959-a64c-50cc437f3962` |
| 4 | `POST /v1/conversations` | 201 | 93 | `qa-885eec45-32ba-4208-b02f-4968df892db0` |
| 5 | `POST /v1/accounts` | 503 | 20 | `qa-3c619921-d27b-4492-a96d-1b9712c27d03` |
| 6 | `POST /v1/auth/token` | 200 | 69 | `qa-e6e7ccad-dcf2-473f-8d16-fc3aeedfd8de` |
| 7 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-2cabb306-5997-4350-bd7d-850542454d0e` |
| 8 | `POST /v1/auth/token` | 401 | 43 | `qa-1c99896d-4e12-4441-b396-cd2fdbb04d09` |
| 9 | `DELETE /v1/accounts/me` | 204 | 56 | `qa-e3a43c53-2750-4f7a-aacd-8b97c713c4b2` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-8bcbe733-14b2-40df-9c0a-2182d94579e6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01752c69-ab59-41fd-bd37-8ce8c84ccfec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01752c69-ab59-41fd-bd37-8ce8c84ccfec
Content-Type: application/json

--- request body ---
{"handle":"qa-b6050b354bf5","displayName":"QA b6050b354bf5","password":"****","region":"eu"}

--- response: 201 in 520 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-01752c69-ab59-41fd-bd37-8ce8c84ccfec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-b6050b354bf5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db47419a-573d-41a2-af9b-e5948dde57da","handle":"qa-b6050b354bf5","displayName":"QA b6050b354bf5","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.403228668Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6a05f835-52e5-429e-9f9f-c077a0a2af59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a05f835-52e5-429e-9f9f-c077a0a2af59
Content-Type: application/json

--- request body ---
{"handle":"qa-5fd6718bded0","displayName":"QA 5fd6718bded0","password":"****","region":"eu"}

--- response: 201 in 84 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a05f835-52e5-429e-9f9f-c077a0a2af59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-5fd6718bded0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_621cdf40-8301-4f6c-b758-d98e09b7b705","handle":"qa-5fd6718bded0","displayName":"QA 5fd6718bded0","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.888358222Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-435ef100-57d3-4959-a64c-50cc437f3962

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-435ef100-57d3-4959-a64c-50cc437f3962
Content-Type: application/json

--- request body ---
{"handle":"qa-b6050b354bf5","password":"****"}

--- response: 200 in 72 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-435ef100-57d3-4959-a64c-50cc437f3962
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db47419a-573d-41a2-af9b-e5948dde57da"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-885eec45-32ba-4208-b02f-4968df892db0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-885eec45-32ba-4208-b02f-4968df892db0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5fd6718bded0","subject":"Error contract","message":"Hi"}

--- response: 201 in 93 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-885eec45-32ba-4208-b02f-4968df892db0
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
Location: /v1/conversations/cnv_85a338a1-6a59-4925-857f-bd057b2c67e0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_85a338a1-6a59-4925-857f-bd057b2c67e0","subject":"Error contract","status":"open","region":"eu","participants":["qa-b6050b354bf5","qa-5fd6718bded0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.198059632Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-3c619921-d27b-4492-a96d-1b9712c27d03

--- request headers ---
Accept: application/json
X-Fault-Key: fa6cc395-8b84-4e13-b71e-105d9e1ebafb
X-Fault: unavailable-once
X-Correlation-Id: qa-3c619921-d27b-4492-a96d-1b9712c27d03
Content-Type: application/json

--- request body ---
{"handle":"qa-fd99e700c4e0","displayName":"QA fd99e700c4e0","password":"****","region":"eu"}

--- response: 503 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c619921-d27b-4492-a96d-1b9712c27d03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-3c619921-d27b-4492-a96d-1b9712c27d03"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e6e7ccad-dcf2-473f-8d16-fc3aeedfd8de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6e7ccad-dcf2-473f-8d16-fc3aeedfd8de
Content-Type: application/json

--- request body ---
{"handle":"qa-5fd6718bded0","password":"****"}

--- response: 200 in 69 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6e7ccad-dcf2-473f-8d16-fc3aeedfd8de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_621cdf40-8301-4f6c-b758-d98e09b7b705"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2cabb306-5997-4350-bd7d-850542454d0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cabb306-5997-4350-bd7d-850542454d0e
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2cabb306-5997-4350-bd7d-850542454d0e
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
correlation: qa-1c99896d-4e12-4441-b396-cd2fdbb04d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c99896d-4e12-4441-b396-cd2fdbb04d09
Content-Type: application/json

--- request body ---
{"handle":"qa-5fd6718bded0","password":"****"}

--- response: 401 in 43 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c99896d-4e12-4441-b396-cd2fdbb04d09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c99896d-4e12-4441-b396-cd2fdbb04d09"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3a43c53-2750-4f7a-aacd-8b97c713c4b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3a43c53-2750-4f7a-aacd-8b97c713c4b2
Content-Type: application/json

--- response: 204 in 56 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3a43c53-2750-4f7a-aacd-8b97c713c4b2
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8bcbe733-14b2-40df-9c0a-2182d94579e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bcbe733-14b2-40df-9c0a-2182d94579e6
Content-Type: application/json

--- request body ---
{"handle":"qa-b6050b354bf5","password":"****"}

--- response: 401 in 28 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bcbe733-14b2-40df-9c0a-2182d94579e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bcbe733-14b2-40df-9c0a-2182d94579e6"}
```
