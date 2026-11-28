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
| 1 | `POST /v1/accounts` | 201 | 102 | `qa-3d0f4f45-2a90-4ad8-a590-d0605515a39f` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-f76339e1-3264-4ddb-9a0b-0e7b875b15bc` |
| 3 | `POST /v1/auth/token` | 200 | 83 | `qa-5799cf9b-fd9b-48da-9cc2-79750777f9eb` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-298e88a9-efb7-479c-877f-8a99910dd28c` |
| 5 | `DELETE /v1/accounts/me` | 503 | 49 | `qa-89c3d7be-4e1a-4018-88e7-4852bea1c1bb` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-85b688c6-ef6e-4492-93fd-5ba010c3674c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d00db897-99bc-4449-beaa-fdafd3cc2059` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-5cbbe39b-480d-437e-b93d-9c96bafa79ca` |
| 9 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-b9d668a9-ed28-4351-8976-207067073b8c` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-c5587e1d-629d-4a9f-a5ba-828e106d899e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d0f4f45-2a90-4ad8-a590-d0605515a39f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d0f4f45-2a90-4ad8-a590-d0605515a39f
Content-Type: application/json

--- request body ---
{"handle":"qa-ed47efada4e7","displayName":"QA ed47efada4e7","password":"****","region":"eu"}

--- response: 201 in 102 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d0f4f45-2a90-4ad8-a590-d0605515a39f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-ed47efada4e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ec698375-b05a-40d9-b013-5f344c3264d7","handle":"qa-ed47efada4e7","displayName":"QA ed47efada4e7","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.616855432Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f76339e1-3264-4ddb-9a0b-0e7b875b15bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f76339e1-3264-4ddb-9a0b-0e7b875b15bc
Content-Type: application/json

--- request body ---
{"handle":"qa-7f8b2c3ec5d2","displayName":"QA 7f8b2c3ec5d2","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f76339e1-3264-4ddb-9a0b-0e7b875b15bc
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
Location: /v1/accounts/qa-7f8b2c3ec5d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5bafb754-e27b-460e-bd16-0aa8994802f4","handle":"qa-7f8b2c3ec5d2","displayName":"QA 7f8b2c3ec5d2","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.682151842Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5799cf9b-fd9b-48da-9cc2-79750777f9eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5799cf9b-fd9b-48da-9cc2-79750777f9eb
Content-Type: application/json

--- request body ---
{"handle":"qa-ed47efada4e7","password":"****"}

--- response: 200 in 83 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5799cf9b-fd9b-48da-9cc2-79750777f9eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ec698375-b05a-40d9-b013-5f344c3264d7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-298e88a9-efb7-479c-877f-8a99910dd28c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-298e88a9-efb7-479c-877f-8a99910dd28c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7f8b2c3ec5d2","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-298e88a9-efb7-479c-877f-8a99910dd28c
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
Location: /v1/conversations/cnv_265cac5d-6343-479f-adfa-fefac12f64e9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_265cac5d-6343-479f-adfa-fefac12f64e9","subject":"Error contract","status":"open","region":"eu","participants":["qa-ed47efada4e7","qa-7f8b2c3ec5d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:58.822496848Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89c3d7be-4e1a-4018-88e7-4852bea1c1bb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 059596fa-cf23-4ce1-a6b0-d479ac93122d
X-Correlation-Id: qa-89c3d7be-4e1a-4018-88e7-4852bea1c1bb
Content-Type: application/json

--- response: 503 in 49 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89c3d7be-4e1a-4018-88e7-4852bea1c1bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-89c3d7be-4e1a-4018-88e7-4852bea1c1bb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-85b688c6-ef6e-4492-93fd-5ba010c3674c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b688c6-ef6e-4492-93fd-5ba010c3674c
Content-Type: application/json

--- request body ---
{"handle":"qa-7f8b2c3ec5d2","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-85b688c6-ef6e-4492-93fd-5ba010c3674c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5bafb754-e27b-460e-bd16-0aa8994802f4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d00db897-99bc-4449-beaa-fdafd3cc2059

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d00db897-99bc-4449-beaa-fdafd3cc2059
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d00db897-99bc-4449-beaa-fdafd3cc2059
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
correlation: qa-5cbbe39b-480d-437e-b93d-9c96bafa79ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cbbe39b-480d-437e-b93d-9c96bafa79ca
Content-Type: application/json

--- request body ---
{"handle":"qa-7f8b2c3ec5d2","password":"****"}

--- response: 401 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cbbe39b-480d-437e-b93d-9c96bafa79ca
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5cbbe39b-480d-437e-b93d-9c96bafa79ca"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9d668a9-ed28-4351-8976-207067073b8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9d668a9-ed28-4351-8976-207067073b8c
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9d668a9-ed28-4351-8976-207067073b8c
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
correlation: qa-c5587e1d-629d-4a9f-a5ba-828e106d899e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5587e1d-629d-4a9f-a5ba-828e106d899e
Content-Type: application/json

--- request body ---
{"handle":"qa-ed47efada4e7","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5587e1d-629d-4a9f-a5ba-828e106d899e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5587e1d-629d-4a9f-a5ba-828e106d899e"}
```
