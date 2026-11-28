# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-925e8121-faf5-4f87-9949-b5890c83bd71` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-5868f61e-b8c8-4f09-b05a-e6f89acc069e` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-2a587beb-9ce6-4718-bcfb-f4022045ae35` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-023255f0-fe8f-4e0d-a519-ed5ae315f8dc` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 21 | `qa-48089f9c-5cc3-4c2a-b9a9-afdb434c783a` |
| 6 | `POST /v1/auth/token` | 200 | 54 | `qa-62f6f276-202d-4416-a1ed-c8e422de1d7f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-219da74a-7518-466f-966a-91c2063c3ca0` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-221d696a-e4b2-4a7c-bac7-64eccc3d11dd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-dcfac677-fc88-4616-a20b-b05123b9ee7e` |
| 10 | `POST /v1/auth/token` | 401 | 45 | `qa-08eb0dad-a3e8-4262-99c4-253bb78b68f7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-925e8121-faf5-4f87-9949-b5890c83bd71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-925e8121-faf5-4f87-9949-b5890c83bd71
Content-Type: application/json

--- request body ---
{"handle":"qa-4ff924f869bb","displayName":"QA 4ff924f869bb","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-925e8121-faf5-4f87-9949-b5890c83bd71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Location: /v1/accounts/qa-4ff924f869bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4300d794-833e-4df3-b7d2-4652842885f7","handle":"qa-4ff924f869bb","displayName":"QA 4ff924f869bb","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.044678896Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5868f61e-b8c8-4f09-b05a-e6f89acc069e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5868f61e-b8c8-4f09-b05a-e6f89acc069e
Content-Type: application/json

--- request body ---
{"handle":"qa-a7e578244a97","displayName":"QA a7e578244a97","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5868f61e-b8c8-4f09-b05a-e6f89acc069e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Location: /v1/accounts/qa-a7e578244a97
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e0ea787-cb6a-4bf8-b4fa-774a6dade60a","handle":"qa-a7e578244a97","displayName":"QA a7e578244a97","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.105656202Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2a587beb-9ce6-4718-bcfb-f4022045ae35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a587beb-9ce6-4718-bcfb-f4022045ae35
Content-Type: application/json

--- request body ---
{"handle":"qa-4ff924f869bb","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a587beb-9ce6-4718-bcfb-f4022045ae35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4300d794-833e-4df3-b7d2-4652842885f7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-023255f0-fe8f-4e0d-a519-ed5ae315f8dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-023255f0-fe8f-4e0d-a519-ed5ae315f8dc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a7e578244a97","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-023255f0-fe8f-4e0d-a519-ed5ae315f8dc
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
Location: /v1/conversations/cnv_e195aa81-6f16-48f8-a6b3-9c7709a543e4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e195aa81-6f16-48f8-a6b3-9c7709a543e4","subject":"Error contract","status":"open","region":"eu","participants":["qa-4ff924f869bb","qa-a7e578244a97"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.223509248Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_e195aa81-6f16-48f8-a6b3-9c7709a543e4/messages
correlation: qa-48089f9c-5cc3-4c2a-b9a9-afdb434c783a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 074b5e57-37b9-43e1-975d-ba3783832d93
X-Correlation-Id: qa-48089f9c-5cc3-4c2a-b9a9-afdb434c783a
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48089f9c-5cc3-4c2a-b9a9-afdb434c783a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_e195aa81-6f16-48f8-a6b3-9c7709a543e4/messages","correlationId":"qa-48089f9c-5cc3-4c2a-b9a9-afdb434c783a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-62f6f276-202d-4416-a1ed-c8e422de1d7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62f6f276-202d-4416-a1ed-c8e422de1d7f
Content-Type: application/json

--- request body ---
{"handle":"qa-a7e578244a97","password":"****"}

--- response: 200 in 54 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-62f6f276-202d-4416-a1ed-c8e422de1d7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e0ea787-cb6a-4bf8-b4fa-774a6dade60a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-219da74a-7518-466f-966a-91c2063c3ca0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-219da74a-7518-466f-966a-91c2063c3ca0
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-219da74a-7518-466f-966a-91c2063c3ca0
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
correlation: qa-221d696a-e4b2-4a7c-bac7-64eccc3d11dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-221d696a-e4b2-4a7c-bac7-64eccc3d11dd
Content-Type: application/json

--- request body ---
{"handle":"qa-a7e578244a97","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-221d696a-e4b2-4a7c-bac7-64eccc3d11dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-221d696a-e4b2-4a7c-bac7-64eccc3d11dd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dcfac677-fc88-4616-a20b-b05123b9ee7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcfac677-fc88-4616-a20b-b05123b9ee7e
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dcfac677-fc88-4616-a20b-b05123b9ee7e
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
correlation: qa-08eb0dad-a3e8-4262-99c4-253bb78b68f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08eb0dad-a3e8-4262-99c4-253bb78b68f7
Content-Type: application/json

--- request body ---
{"handle":"qa-4ff924f869bb","password":"****"}

--- response: 401 in 45 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08eb0dad-a3e8-4262-99c4-253bb78b68f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08eb0dad-a3e8-4262-99c4-253bb78b68f7"}
```
