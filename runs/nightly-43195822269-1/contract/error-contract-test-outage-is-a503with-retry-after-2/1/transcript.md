# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-388e2a13-33fa-4d81-bed0-170e7fa19d5e` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-69533dfc-4d22-4c70-8414-f9fb75035f93` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-e338f9c3-f332-4a55-9851-b54a95768621` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-0e0acd38-3c40-4386-9b72-c56d6290d2cf` |
| 5 | `GET /v1/accounts/me` | 503 | 15 | `qa-70bdbaf2-27ed-4409-8812-c747b6e9605e` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-5370e9c3-ef9a-498b-b423-1c2370f8e6cb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-112456c8-28b4-429f-a094-4b20763faccf` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-c660287b-f30b-4084-b0d8-396edc59de8f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ff178ff5-aa15-40e6-b09f-b91dddcc2ad2` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-fcab3220-623c-4c60-997b-f440b55ed840` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-388e2a13-33fa-4d81-bed0-170e7fa19d5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-388e2a13-33fa-4d81-bed0-170e7fa19d5e
Content-Type: application/json

--- request body ---
{"handle":"qa-c497cd34ab5a","displayName":"QA c497cd34ab5a","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-388e2a13-33fa-4d81-bed0-170e7fa19d5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-c497cd34ab5a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cbd072e9-d748-4981-8ffb-19e4a8abb0a9","handle":"qa-c497cd34ab5a","displayName":"QA c497cd34ab5a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.051993592Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-69533dfc-4d22-4c70-8414-f9fb75035f93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69533dfc-4d22-4c70-8414-f9fb75035f93
Content-Type: application/json

--- request body ---
{"handle":"qa-ccc538a3941e","displayName":"QA ccc538a3941e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-69533dfc-4d22-4c70-8414-f9fb75035f93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-ccc538a3941e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_befd6889-03a5-4b62-b431-be851e9694e9","handle":"qa-ccc538a3941e","displayName":"QA ccc538a3941e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.096115013Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e338f9c3-f332-4a55-9851-b54a95768621

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e338f9c3-f332-4a55-9851-b54a95768621
Content-Type: application/json

--- request body ---
{"handle":"qa-c497cd34ab5a","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e338f9c3-f332-4a55-9851-b54a95768621
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cbd072e9-d748-4981-8ffb-19e4a8abb0a9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0e0acd38-3c40-4386-9b72-c56d6290d2cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e0acd38-3c40-4386-9b72-c56d6290d2cf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ccc538a3941e","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e0acd38-3c40-4386-9b72-c56d6290d2cf
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
Location: /v1/conversations/cnv_947390c7-b4b3-4df6-81ba-55279137b595
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_947390c7-b4b3-4df6-81ba-55279137b595","subject":"Error contract","status":"open","region":"eu","participants":["qa-c497cd34ab5a","qa-ccc538a3941e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.169192115Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-70bdbaf2-27ed-4409-8812-c747b6e9605e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3e263e66-d4e1-47f9-b01f-27352b31da51
X-Correlation-Id: qa-70bdbaf2-27ed-4409-8812-c747b6e9605e
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70bdbaf2-27ed-4409-8812-c747b6e9605e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-70bdbaf2-27ed-4409-8812-c747b6e9605e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5370e9c3-ef9a-498b-b423-1c2370f8e6cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5370e9c3-ef9a-498b-b423-1c2370f8e6cb
Content-Type: application/json

--- request body ---
{"handle":"qa-ccc538a3941e","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-5370e9c3-ef9a-498b-b423-1c2370f8e6cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_befd6889-03a5-4b62-b431-be851e9694e9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-112456c8-28b4-429f-a094-4b20763faccf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-112456c8-28b4-429f-a094-4b20763faccf
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-112456c8-28b4-429f-a094-4b20763faccf
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
correlation: qa-c660287b-f30b-4084-b0d8-396edc59de8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c660287b-f30b-4084-b0d8-396edc59de8f
Content-Type: application/json

--- request body ---
{"handle":"qa-ccc538a3941e","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c660287b-f30b-4084-b0d8-396edc59de8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c660287b-f30b-4084-b0d8-396edc59de8f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff178ff5-aa15-40e6-b09f-b91dddcc2ad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff178ff5-aa15-40e6-b09f-b91dddcc2ad2
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff178ff5-aa15-40e6-b09f-b91dddcc2ad2
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
correlation: qa-fcab3220-623c-4c60-997b-f440b55ed840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcab3220-623c-4c60-997b-f440b55ed840
Content-Type: application/json

--- request body ---
{"handle":"qa-c497cd34ab5a","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fcab3220-623c-4c60-997b-f440b55ed840
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fcab3220-623c-4c60-997b-f440b55ed840"}
```
