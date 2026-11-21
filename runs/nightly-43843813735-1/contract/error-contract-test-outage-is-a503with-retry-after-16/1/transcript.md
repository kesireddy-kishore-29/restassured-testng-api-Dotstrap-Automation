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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-2912bc92-934a-4257-bdd3-eb0fd411a3be` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-da5fbd40-81b7-4c3b-affa-9e86307b0074` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-26d5d8cb-23fe-4f5e-a641-f4187c86e3bd` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-28ed3f30-0b17-48b5-b883-b0150acb0a85` |
| 5 | `GET /v1/admin/stats` | 503 | 8 | `qa-4cbcd238-27f3-4ca5-8c72-8ec7962acfe0` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-0c1ff75d-1c36-4dcc-a844-d2efab6eae23` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b5fd9101-2a55-4858-bb59-4543a8eb40a5` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-0b4210f2-2026-41e5-bbd3-42037722ca35` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-071a1732-342a-4bc2-a434-51b4e3b76ed4` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-9b8966fd-1ae2-425f-a2bb-09ca476c332c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2912bc92-934a-4257-bdd3-eb0fd411a3be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2912bc92-934a-4257-bdd3-eb0fd411a3be
Content-Type: application/json

--- request body ---
{"handle":"qa-daa55d4a62c6","displayName":"QA daa55d4a62c6","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-2912bc92-934a-4257-bdd3-eb0fd411a3be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Location: /v1/accounts/qa-daa55d4a62c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8e12206-10db-4c06-8ce5-e85c58692be9","handle":"qa-daa55d4a62c6","displayName":"QA daa55d4a62c6","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.474033212Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-da5fbd40-81b7-4c3b-affa-9e86307b0074

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da5fbd40-81b7-4c3b-affa-9e86307b0074
Content-Type: application/json

--- request body ---
{"handle":"qa-469fdd96c151","displayName":"QA 469fdd96c151","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-da5fbd40-81b7-4c3b-affa-9e86307b0074
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Location: /v1/accounts/qa-469fdd96c151
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bbb1e98d-fd4b-4289-ab9a-d2456932fd89","handle":"qa-469fdd96c151","displayName":"QA 469fdd96c151","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.504818863Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-26d5d8cb-23fe-4f5e-a641-f4187c86e3bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26d5d8cb-23fe-4f5e-a641-f4187c86e3bd
Content-Type: application/json

--- request body ---
{"handle":"qa-daa55d4a62c6","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-26d5d8cb-23fe-4f5e-a641-f4187c86e3bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8e12206-10db-4c06-8ce5-e85c58692be9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-28ed3f30-0b17-48b5-b883-b0150acb0a85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28ed3f30-0b17-48b5-b883-b0150acb0a85
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-469fdd96c151","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-28ed3f30-0b17-48b5-b883-b0150acb0a85
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
Location: /v1/conversations/cnv_17461362-d1b5-4102-922e-23991b6e7ede
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_17461362-d1b5-4102-922e-23991b6e7ede","subject":"Error contract","status":"open","region":"eu","participants":["qa-daa55d4a62c6","qa-469fdd96c151"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.545852303Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-4cbcd238-27f3-4ca5-8c72-8ec7962acfe0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9103f43f-821d-4163-bcff-5a99514a71ef
X-Correlation-Id: qa-4cbcd238-27f3-4ca5-8c72-8ec7962acfe0
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cbcd238-27f3-4ca5-8c72-8ec7962acfe0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-4cbcd238-27f3-4ca5-8c72-8ec7962acfe0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0c1ff75d-1c36-4dcc-a844-d2efab6eae23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c1ff75d-1c36-4dcc-a844-d2efab6eae23
Content-Type: application/json

--- request body ---
{"handle":"qa-469fdd96c151","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c1ff75d-1c36-4dcc-a844-d2efab6eae23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bbb1e98d-fd4b-4289-ab9a-d2456932fd89"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5fd9101-2a55-4858-bb59-4543a8eb40a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5fd9101-2a55-4858-bb59-4543a8eb40a5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5fd9101-2a55-4858-bb59-4543a8eb40a5
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
correlation: qa-0b4210f2-2026-41e5-bbd3-42037722ca35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b4210f2-2026-41e5-bbd3-42037722ca35
Content-Type: application/json

--- request body ---
{"handle":"qa-469fdd96c151","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b4210f2-2026-41e5-bbd3-42037722ca35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b4210f2-2026-41e5-bbd3-42037722ca35"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-071a1732-342a-4bc2-a434-51b4e3b76ed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-071a1732-342a-4bc2-a434-51b4e3b76ed4
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-071a1732-342a-4bc2-a434-51b4e3b76ed4
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
correlation: qa-9b8966fd-1ae2-425f-a2bb-09ca476c332c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b8966fd-1ae2-425f-a2bb-09ca476c332c
Content-Type: application/json

--- request body ---
{"handle":"qa-daa55d4a62c6","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b8966fd-1ae2-425f-a2bb-09ca476c332c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b8966fd-1ae2-425f-a2bb-09ca476c332c"}
```
