# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-4811e36c-6d6d-4f5f-a1c7-3d58200330eb` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-3a4b6a26-4d2d-417d-97fe-505cbfd78bee` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-1b6f05d6-9ed2-4091-84c5-b8773fd39181` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-f6d62ff6-5f72-46e1-94e9-d4dca3cbf8e9` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 83 | `qa-683807d4-552e-4ffa-9c49-d78eda098abf` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-455e1900-98ea-4f73-9a48-aa7ecc906ba6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-9a0cbfa2-a1e3-4f3c-9a76-387b2a7b62df` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-6ef9d74d-8478-4abc-8789-7a7927529fd6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4f47c184-70a7-44b4-b40c-3f718990243a` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-9c3eaa78-3c12-4b80-9933-0f4fbf1a5dc6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4811e36c-6d6d-4f5f-a1c7-3d58200330eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4811e36c-6d6d-4f5f-a1c7-3d58200330eb
Content-Type: application/json

--- request body ---
{"handle":"qa-ea1b9abd918b","displayName":"QA ea1b9abd918b","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-4811e36c-6d6d-4f5f-a1c7-3d58200330eb
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
Location: /v1/accounts/qa-ea1b9abd918b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65844fe6-60cc-4b63-a492-1850a8fa7259","handle":"qa-ea1b9abd918b","displayName":"QA ea1b9abd918b","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.313318450Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a4b6a26-4d2d-417d-97fe-505cbfd78bee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a4b6a26-4d2d-417d-97fe-505cbfd78bee
Content-Type: application/json

--- request body ---
{"handle":"qa-b1cfa188c220","displayName":"QA b1cfa188c220","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a4b6a26-4d2d-417d-97fe-505cbfd78bee
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
Location: /v1/accounts/qa-b1cfa188c220
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f195dd0-9605-48ae-8a3e-fadb25680e6e","handle":"qa-b1cfa188c220","displayName":"QA b1cfa188c220","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.377482518Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1b6f05d6-9ed2-4091-84c5-b8773fd39181

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b6f05d6-9ed2-4091-84c5-b8773fd39181
Content-Type: application/json

--- request body ---
{"handle":"qa-ea1b9abd918b","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b6f05d6-9ed2-4091-84c5-b8773fd39181
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65844fe6-60cc-4b63-a492-1850a8fa7259"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f6d62ff6-5f72-46e1-94e9-d4dca3cbf8e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6d62ff6-5f72-46e1-94e9-d4dca3cbf8e9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b1cfa188c220","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6d62ff6-5f72-46e1-94e9-d4dca3cbf8e9
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
Location: /v1/conversations/cnv_f14cffa1-aca9-431b-b27a-6ef7fd2230a5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f14cffa1-aca9-431b-b27a-6ef7fd2230a5","subject":"Error contract","status":"open","region":"eu","participants":["qa-ea1b9abd918b","qa-b1cfa188c220"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.483112408Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-ea1b9abd918b
correlation: qa-683807d4-552e-4ffa-9c49-d78eda098abf

--- request headers ---
Accept: application/json
X-Fault-Key: f7365f96-ddc2-4fdf-9be7-fa0d3e65d64a
X-Fault: unavailable-once
X-Correlation-Id: qa-683807d4-552e-4ffa-9c49-d78eda098abf
Content-Type: application/json

--- response: 503 in 83 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-683807d4-552e-4ffa-9c49-d78eda098abf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-ea1b9abd918b","correlationId":"qa-683807d4-552e-4ffa-9c49-d78eda098abf"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-455e1900-98ea-4f73-9a48-aa7ecc906ba6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-455e1900-98ea-4f73-9a48-aa7ecc906ba6
Content-Type: application/json

--- request body ---
{"handle":"qa-b1cfa188c220","password":"****"}

--- response: 200 in 62 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-455e1900-98ea-4f73-9a48-aa7ecc906ba6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f195dd0-9605-48ae-8a3e-fadb25680e6e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a0cbfa2-a1e3-4f3c-9a76-387b2a7b62df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a0cbfa2-a1e3-4f3c-9a76-387b2a7b62df
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a0cbfa2-a1e3-4f3c-9a76-387b2a7b62df
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
correlation: qa-6ef9d74d-8478-4abc-8789-7a7927529fd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ef9d74d-8478-4abc-8789-7a7927529fd6
Content-Type: application/json

--- request body ---
{"handle":"qa-b1cfa188c220","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ef9d74d-8478-4abc-8789-7a7927529fd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ef9d74d-8478-4abc-8789-7a7927529fd6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f47c184-70a7-44b4-b40c-3f718990243a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f47c184-70a7-44b4-b40c-3f718990243a
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f47c184-70a7-44b4-b40c-3f718990243a
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
correlation: qa-9c3eaa78-3c12-4b80-9933-0f4fbf1a5dc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c3eaa78-3c12-4b80-9933-0f4fbf1a5dc6
Content-Type: application/json

--- request body ---
{"handle":"qa-ea1b9abd918b","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c3eaa78-3c12-4b80-9933-0f4fbf1a5dc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c3eaa78-3c12-4b80-9933-0f4fbf1a5dc6"}
```
