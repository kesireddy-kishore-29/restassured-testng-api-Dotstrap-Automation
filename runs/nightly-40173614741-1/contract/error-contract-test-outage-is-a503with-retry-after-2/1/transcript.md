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
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-1c00a3c4-bd20-458b-b5a0-682d8ec67255` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-1db2b73b-2ed5-482d-8830-30145297978d` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-4073da3e-7724-47fd-a969-8b6517f6bb17` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-c5f83c4c-b535-46bb-b1f1-334351fdb51c` |
| 5 | `GET /v1/accounts/me` | 503 | 13 | `qa-3a23e649-bdd1-4785-a54a-2923c9e5e675` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-bf5ba031-bb4e-4619-bd46-9a1a5324d7cc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-1da8df8f-2808-4539-a46c-3c7e57e955ae` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-3bbc5758-89b7-4234-9f1e-64e8ccfbf20b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-c612c97f-476c-4ea4-9b53-ebc80301933d` |
| 10 | `POST /v1/auth/token` | 401 | 33 | `qa-29ba2a80-fbe8-4202-8e7e-259d767b590e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1c00a3c4-bd20-458b-b5a0-682d8ec67255

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c00a3c4-bd20-458b-b5a0-682d8ec67255
Content-Type: application/json

--- request body ---
{"handle":"qa-94d18530c28d","displayName":"QA 94d18530c28d","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c00a3c4-bd20-458b-b5a0-682d8ec67255
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-94d18530c28d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2dfb68b3-96db-48ae-a69a-f74432c2d598","handle":"qa-94d18530c28d","displayName":"QA 94d18530c28d","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.106095234Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1db2b73b-2ed5-482d-8830-30145297978d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1db2b73b-2ed5-482d-8830-30145297978d
Content-Type: application/json

--- request body ---
{"handle":"qa-d5359bf08d00","displayName":"QA d5359bf08d00","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1db2b73b-2ed5-482d-8830-30145297978d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-d5359bf08d00
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ceadbbe6-00d2-44a4-b7ad-56b37d0a0b6f","handle":"qa-d5359bf08d00","displayName":"QA d5359bf08d00","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.148830234Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4073da3e-7724-47fd-a969-8b6517f6bb17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4073da3e-7724-47fd-a969-8b6517f6bb17
Content-Type: application/json

--- request body ---
{"handle":"qa-94d18530c28d","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4073da3e-7724-47fd-a969-8b6517f6bb17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2dfb68b3-96db-48ae-a69a-f74432c2d598"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c5f83c4c-b535-46bb-b1f1-334351fdb51c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5f83c4c-b535-46bb-b1f1-334351fdb51c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d5359bf08d00","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5f83c4c-b535-46bb-b1f1-334351fdb51c
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
Location: /v1/conversations/cnv_63402c70-cf54-41c2-8bc8-f4a967cf254c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_63402c70-cf54-41c2-8bc8-f4a967cf254c","subject":"Error contract","status":"open","region":"eu","participants":["qa-94d18530c28d","qa-d5359bf08d00"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.214713286Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a23e649-bdd1-4785-a54a-2923c9e5e675

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1f03c619-02b8-4a32-b572-2e86692897fe
X-Correlation-Id: qa-3a23e649-bdd1-4785-a54a-2923c9e5e675
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a23e649-bdd1-4785-a54a-2923c9e5e675
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-3a23e649-bdd1-4785-a54a-2923c9e5e675"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bf5ba031-bb4e-4619-bd46-9a1a5324d7cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf5ba031-bb4e-4619-bd46-9a1a5324d7cc
Content-Type: application/json

--- request body ---
{"handle":"qa-d5359bf08d00","password":"****"}

--- response: 200 in 62 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf5ba031-bb4e-4619-bd46-9a1a5324d7cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ceadbbe6-00d2-44a4-b7ad-56b37d0a0b6f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1da8df8f-2808-4539-a46c-3c7e57e955ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1da8df8f-2808-4539-a46c-3c7e57e955ae
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1da8df8f-2808-4539-a46c-3c7e57e955ae
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
correlation: qa-3bbc5758-89b7-4234-9f1e-64e8ccfbf20b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bbc5758-89b7-4234-9f1e-64e8ccfbf20b
Content-Type: application/json

--- request body ---
{"handle":"qa-d5359bf08d00","password":"****"}

--- response: 401 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bbc5758-89b7-4234-9f1e-64e8ccfbf20b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3bbc5758-89b7-4234-9f1e-64e8ccfbf20b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c612c97f-476c-4ea4-9b53-ebc80301933d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c612c97f-476c-4ea4-9b53-ebc80301933d
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c612c97f-476c-4ea4-9b53-ebc80301933d
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
correlation: qa-29ba2a80-fbe8-4202-8e7e-259d767b590e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29ba2a80-fbe8-4202-8e7e-259d767b590e
Content-Type: application/json

--- request body ---
{"handle":"qa-94d18530c28d","password":"****"}

--- response: 401 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29ba2a80-fbe8-4202-8e7e-259d767b590e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29ba2a80-fbe8-4202-8e7e-259d767b590e"}
```
