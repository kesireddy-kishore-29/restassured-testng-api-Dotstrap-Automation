# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-9d2a5947-baed-4aa3-a76d-57f0cdaafcb0` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-5276f153-9637-4d63-9e26-42529087f058` |
| 3 | `POST /v1/auth/token` | 200 | 59 | `qa-4f52489f-90a7-47a6-b897-82730655c80b` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-b3ca1c1a-a440-41d3-aa6a-87512d251a77` |
| 5 | `POST /v1/conversations` | 503 | 27 | `qa-4004f041-2ed3-4c2e-9236-0c63eb674e75` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-c7914db2-cbbe-4351-a92b-937164c64f3c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-b72e21fb-a26f-46e2-a055-7b16c3966d3f` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-12bce92a-b9e1-4ac5-a6bc-f58bc23fecb9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-1330d2f7-90b3-4303-a8bf-e9be85300577` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-d98ba7c0-958c-4abf-bc42-8066bde0dfe9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9d2a5947-baed-4aa3-a76d-57f0cdaafcb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d2a5947-baed-4aa3-a76d-57f0cdaafcb0
Content-Type: application/json

--- request body ---
{"handle":"qa-1410e934ee39","displayName":"QA 1410e934ee39","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d2a5947-baed-4aa3-a76d-57f0cdaafcb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Location: /v1/accounts/qa-1410e934ee39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff85fbec-d5ab-4ba4-8ce1-5458cafd0011","handle":"qa-1410e934ee39","displayName":"QA 1410e934ee39","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.192154618Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5276f153-9637-4d63-9e26-42529087f058

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5276f153-9637-4d63-9e26-42529087f058
Content-Type: application/json

--- request body ---
{"handle":"qa-52bb02a747bd","displayName":"QA 52bb02a747bd","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-5276f153-9637-4d63-9e26-42529087f058
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-52bb02a747bd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_addd9828-2647-4da4-ba32-51e0c8d1e84a","handle":"qa-52bb02a747bd","displayName":"QA 52bb02a747bd","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.256752861Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4f52489f-90a7-47a6-b897-82730655c80b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f52489f-90a7-47a6-b897-82730655c80b
Content-Type: application/json

--- request body ---
{"handle":"qa-1410e934ee39","password":"****"}

--- response: 200 in 59 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f52489f-90a7-47a6-b897-82730655c80b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff85fbec-d5ab-4ba4-8ce1-5458cafd0011"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b3ca1c1a-a440-41d3-aa6a-87512d251a77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3ca1c1a-a440-41d3-aa6a-87512d251a77
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-52bb02a747bd","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3ca1c1a-a440-41d3-aa6a-87512d251a77
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
Location: /v1/conversations/cnv_40e0a15f-7a56-4cd5-ae10-eda8b0bfa8be
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_40e0a15f-7a56-4cd5-ae10-eda8b0bfa8be","subject":"Error contract","status":"open","region":"eu","participants":["qa-1410e934ee39","qa-52bb02a747bd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.410408111Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-4004f041-2ed3-4c2e-9236-0c63eb674e75

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 58f2912a-f60d-4816-8af8-7211522e0add
X-Correlation-Id: qa-4004f041-2ed3-4c2e-9236-0c63eb674e75
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1410e934ee39","subject":"Probe","message":"Hi"}

--- response: 503 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4004f041-2ed3-4c2e-9236-0c63eb674e75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-4004f041-2ed3-4c2e-9236-0c63eb674e75"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c7914db2-cbbe-4351-a92b-937164c64f3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7914db2-cbbe-4351-a92b-937164c64f3c
Content-Type: application/json

--- request body ---
{"handle":"qa-52bb02a747bd","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7914db2-cbbe-4351-a92b-937164c64f3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_addd9828-2647-4da4-ba32-51e0c8d1e84a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b72e21fb-a26f-46e2-a055-7b16c3966d3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b72e21fb-a26f-46e2-a055-7b16c3966d3f
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b72e21fb-a26f-46e2-a055-7b16c3966d3f
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
correlation: qa-12bce92a-b9e1-4ac5-a6bc-f58bc23fecb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12bce92a-b9e1-4ac5-a6bc-f58bc23fecb9
Content-Type: application/json

--- request body ---
{"handle":"qa-52bb02a747bd","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12bce92a-b9e1-4ac5-a6bc-f58bc23fecb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12bce92a-b9e1-4ac5-a6bc-f58bc23fecb9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1330d2f7-90b3-4303-a8bf-e9be85300577

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1330d2f7-90b3-4303-a8bf-e9be85300577
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1330d2f7-90b3-4303-a8bf-e9be85300577
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
correlation: qa-d98ba7c0-958c-4abf-bc42-8066bde0dfe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d98ba7c0-958c-4abf-bc42-8066bde0dfe9
Content-Type: application/json

--- request body ---
{"handle":"qa-1410e934ee39","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d98ba7c0-958c-4abf-bc42-8066bde0dfe9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d98ba7c0-958c-4abf-bc42-8066bde0dfe9"}
```
