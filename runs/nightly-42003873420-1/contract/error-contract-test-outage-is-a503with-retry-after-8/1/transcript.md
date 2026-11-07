# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-d5eb92de-3781-4351-8951-6b44b2abc00c` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-9d48069e-c7ab-4bef-a5e5-ce529b2119ce` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-9bd26095-87ef-4c61-8eba-1cfea9718f80` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-488dfb6b-2e30-401a-91ac-1d94f71fcc7e` |
| 5 | `GET /v1/conversations/{id}` | 503 | 17 | `qa-3dfcc175-cf6a-4464-92c2-c0ca75b52b4e` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-8be0e888-a1c2-4084-9802-b82b9529e019` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-3055444f-3799-40bc-9b09-95a84f41826f` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-527be3e7-06e1-41fe-973a-9400f19d8b80` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-825e4101-cc5c-4fe6-8571-f99a9a7b410c` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-4ccdab5c-cb97-4756-958a-7c947820ac48` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d5eb92de-3781-4351-8951-6b44b2abc00c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5eb92de-3781-4351-8951-6b44b2abc00c
Content-Type: application/json

--- request body ---
{"handle":"qa-ad141928a193","displayName":"QA ad141928a193","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5eb92de-3781-4351-8951-6b44b2abc00c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Location: /v1/accounts/qa-ad141928a193
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eae17776-506c-4964-8793-3dbbe5a19f33","handle":"qa-ad141928a193","displayName":"QA ad141928a193","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.980126126Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9d48069e-c7ab-4bef-a5e5-ce529b2119ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d48069e-c7ab-4bef-a5e5-ce529b2119ce
Content-Type: application/json

--- request body ---
{"handle":"qa-3f18ff281688","displayName":"QA 3f18ff281688","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d48069e-c7ab-4bef-a5e5-ce529b2119ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Location: /v1/accounts/qa-3f18ff281688
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5738baf3-ed58-4a6a-832f-f26325f6b90a","handle":"qa-3f18ff281688","displayName":"QA 3f18ff281688","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.027398483Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9bd26095-87ef-4c61-8eba-1cfea9718f80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bd26095-87ef-4c61-8eba-1cfea9718f80
Content-Type: application/json

--- request body ---
{"handle":"qa-ad141928a193","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bd26095-87ef-4c61-8eba-1cfea9718f80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eae17776-506c-4964-8793-3dbbe5a19f33"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-488dfb6b-2e30-401a-91ac-1d94f71fcc7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-488dfb6b-2e30-401a-91ac-1d94f71fcc7e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3f18ff281688","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-488dfb6b-2e30-401a-91ac-1d94f71fcc7e
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
Location: /v1/conversations/cnv_0e30ca01-6862-4b38-b925-6cd3118ad12c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0e30ca01-6862-4b38-b925-6cd3118ad12c","subject":"Error contract","status":"open","region":"eu","participants":["qa-ad141928a193","qa-3f18ff281688"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.100532050Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_0e30ca01-6862-4b38-b925-6cd3118ad12c
correlation: qa-3dfcc175-cf6a-4464-92c2-c0ca75b52b4e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c9d25ccc-f40d-40b8-9337-ad8cb74c7792
X-Correlation-Id: qa-3dfcc175-cf6a-4464-92c2-c0ca75b52b4e
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dfcc175-cf6a-4464-92c2-c0ca75b52b4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_0e30ca01-6862-4b38-b925-6cd3118ad12c","correlationId":"qa-3dfcc175-cf6a-4464-92c2-c0ca75b52b4e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8be0e888-a1c2-4084-9802-b82b9529e019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8be0e888-a1c2-4084-9802-b82b9529e019
Content-Type: application/json

--- request body ---
{"handle":"qa-3f18ff281688","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8be0e888-a1c2-4084-9802-b82b9529e019
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5738baf3-ed58-4a6a-832f-f26325f6b90a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3055444f-3799-40bc-9b09-95a84f41826f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3055444f-3799-40bc-9b09-95a84f41826f
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3055444f-3799-40bc-9b09-95a84f41826f
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
correlation: qa-527be3e7-06e1-41fe-973a-9400f19d8b80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-527be3e7-06e1-41fe-973a-9400f19d8b80
Content-Type: application/json

--- request body ---
{"handle":"qa-3f18ff281688","password":"****"}

--- response: 401 in 36 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-527be3e7-06e1-41fe-973a-9400f19d8b80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-527be3e7-06e1-41fe-973a-9400f19d8b80"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-825e4101-cc5c-4fe6-8571-f99a9a7b410c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-825e4101-cc5c-4fe6-8571-f99a9a7b410c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-825e4101-cc5c-4fe6-8571-f99a9a7b410c
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
correlation: qa-4ccdab5c-cb97-4756-958a-7c947820ac48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ccdab5c-cb97-4756-958a-7c947820ac48
Content-Type: application/json

--- request body ---
{"handle":"qa-ad141928a193","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ccdab5c-cb97-4756-958a-7c947820ac48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4ccdab5c-cb97-4756-958a-7c947820ac48"}
```
