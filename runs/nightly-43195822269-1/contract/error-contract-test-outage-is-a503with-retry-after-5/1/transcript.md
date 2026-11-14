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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-85f760c7-84f9-4eeb-9d7e-1b8972b17000` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-38a0d723-7278-432d-b06f-f835e9af66fc` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-41fd4437-ed47-440e-b6a3-21e7a79f2085` |
| 4 | `POST /v1/conversations` | 201 | 51 | `qa-d188ca91-3ffa-4560-b1e7-fb3b23a927e3` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 31 | `qa-f58b3c7d-d96d-421e-8fa0-bbab72bd8073` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-5acb070e-0da3-47aa-ac73-89ccaf893c51` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-9c65ea5e-c90b-4c51-8a77-c2be3955b3d7` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-20734d73-57e2-419d-8d59-10a5c47709c0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e2e63424-307f-4592-af04-cc652c05dc5b` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-c07f4450-e1d2-4bac-8829-4461e01f75ec` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-85f760c7-84f9-4eeb-9d7e-1b8972b17000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85f760c7-84f9-4eeb-9d7e-1b8972b17000
Content-Type: application/json

--- request body ---
{"handle":"qa-328a05681d93","displayName":"QA 328a05681d93","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-85f760c7-84f9-4eeb-9d7e-1b8972b17000
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 9
Location: /v1/accounts/qa-328a05681d93
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60496b4c-2012-41ea-aa42-8229dceca1c9","handle":"qa-328a05681d93","displayName":"QA 328a05681d93","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.069456747Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-38a0d723-7278-432d-b06f-f835e9af66fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38a0d723-7278-432d-b06f-f835e9af66fc
Content-Type: application/json

--- request body ---
{"handle":"qa-f82b3c1101a5","displayName":"QA f82b3c1101a5","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-38a0d723-7278-432d-b06f-f835e9af66fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 9
Location: /v1/accounts/qa-f82b3c1101a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_230c7dc9-a986-4281-8b07-d882709eecb6","handle":"qa-f82b3c1101a5","displayName":"QA f82b3c1101a5","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.087026984Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-41fd4437-ed47-440e-b6a3-21e7a79f2085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41fd4437-ed47-440e-b6a3-21e7a79f2085
Content-Type: application/json

--- request body ---
{"handle":"qa-328a05681d93","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-41fd4437-ed47-440e-b6a3-21e7a79f2085
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60496b4c-2012-41ea-aa42-8229dceca1c9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d188ca91-3ffa-4560-b1e7-fb3b23a927e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d188ca91-3ffa-4560-b1e7-fb3b23a927e3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f82b3c1101a5","subject":"Error contract","message":"Hi"}

--- response: 201 in 51 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d188ca91-3ffa-4560-b1e7-fb3b23a927e3
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
Location: /v1/conversations/cnv_a930809e-1434-4ee8-9f3a-c35c3bcffa59
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a930809e-1434-4ee8-9f3a-c35c3bcffa59","subject":"Error contract","status":"open","region":"eu","participants":["qa-328a05681d93","qa-f82b3c1101a5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.194036937Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-328a05681d93
correlation: qa-f58b3c7d-d96d-421e-8fa0-bbab72bd8073

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f22e7586-889e-4db7-b877-e90dbeaf7348
X-Correlation-Id: qa-f58b3c7d-d96d-421e-8fa0-bbab72bd8073
Content-Type: application/json

--- response: 503 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f58b3c7d-d96d-421e-8fa0-bbab72bd8073
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-328a05681d93","correlationId":"qa-f58b3c7d-d96d-421e-8fa0-bbab72bd8073"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5acb070e-0da3-47aa-ac73-89ccaf893c51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5acb070e-0da3-47aa-ac73-89ccaf893c51
Content-Type: application/json

--- request body ---
{"handle":"qa-f82b3c1101a5","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5acb070e-0da3-47aa-ac73-89ccaf893c51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_230c7dc9-a986-4281-8b07-d882709eecb6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9c65ea5e-c90b-4c51-8a77-c2be3955b3d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c65ea5e-c90b-4c51-8a77-c2be3955b3d7
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9c65ea5e-c90b-4c51-8a77-c2be3955b3d7
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
correlation: qa-20734d73-57e2-419d-8d59-10a5c47709c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20734d73-57e2-419d-8d59-10a5c47709c0
Content-Type: application/json

--- request body ---
{"handle":"qa-f82b3c1101a5","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20734d73-57e2-419d-8d59-10a5c47709c0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-20734d73-57e2-419d-8d59-10a5c47709c0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2e63424-307f-4592-af04-cc652c05dc5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e63424-307f-4592-af04-cc652c05dc5b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2e63424-307f-4592-af04-cc652c05dc5b
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
correlation: qa-c07f4450-e1d2-4bac-8829-4461e01f75ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c07f4450-e1d2-4bac-8829-4461e01f75ec
Content-Type: application/json

--- request body ---
{"handle":"qa-328a05681d93","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c07f4450-e1d2-4bac-8829-4461e01f75ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c07f4450-e1d2-4bac-8829-4461e01f75ec"}
```
