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
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-f4f8741e-f61a-4d1f-b336-31606ae276c2` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-a1c1ff78-380a-4c16-b3a0-dfd9ccfc647e` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-d9d5ab49-331b-43d5-81b3-6d50568dd272` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-b2df95d5-a557-4a59-bba4-82f20a50334d` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 29 | `qa-678202bf-93bd-4b9e-9bfe-5fca508e0797` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-674a0bf3-3b3a-4d27-9f2c-5e2d2ab89b12` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-29bb9e2a-02f2-41c5-8a31-e3deacc1a9fd` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-34bedfa3-6030-44fa-bded-f872a95b9c6f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-1c09164f-6f54-4bed-9c67-7a8c72875adb` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-93b7d1cf-1b14-46c8-b09e-7283fb65bc0f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f4f8741e-f61a-4d1f-b336-31606ae276c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4f8741e-f61a-4d1f-b336-31606ae276c2
Content-Type: application/json

--- request body ---
{"handle":"qa-14a5e0471caa","displayName":"QA 14a5e0471caa","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4f8741e-f61a-4d1f-b336-31606ae276c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Location: /v1/accounts/qa-14a5e0471caa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cca5d4cd-5352-4efa-ae76-d57f10519aaa","handle":"qa-14a5e0471caa","displayName":"QA 14a5e0471caa","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.764879523Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1c1ff78-380a-4c16-b3a0-dfd9ccfc647e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1c1ff78-380a-4c16-b3a0-dfd9ccfc647e
Content-Type: application/json

--- request body ---
{"handle":"qa-e232ab622e8d","displayName":"QA e232ab622e8d","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1c1ff78-380a-4c16-b3a0-dfd9ccfc647e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Location: /v1/accounts/qa-e232ab622e8d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_46ea659a-2844-411d-804b-caa3edf05ffd","handle":"qa-e232ab622e8d","displayName":"QA e232ab622e8d","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.827455618Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d9d5ab49-331b-43d5-81b3-6d50568dd272

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9d5ab49-331b-43d5-81b3-6d50568dd272
Content-Type: application/json

--- request body ---
{"handle":"qa-14a5e0471caa","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9d5ab49-331b-43d5-81b3-6d50568dd272
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cca5d4cd-5352-4efa-ae76-d57f10519aaa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b2df95d5-a557-4a59-bba4-82f20a50334d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2df95d5-a557-4a59-bba4-82f20a50334d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e232ab622e8d","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2df95d5-a557-4a59-bba4-82f20a50334d
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
Location: /v1/conversations/cnv_0dc013a4-1aec-4226-954c-1838e4e131ac
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0dc013a4-1aec-4226-954c-1838e4e131ac","subject":"Error contract","status":"open","region":"eu","participants":["qa-14a5e0471caa","qa-e232ab622e8d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:59.938117893Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-14a5e0471caa
correlation: qa-678202bf-93bd-4b9e-9bfe-5fca508e0797

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f117c172-cb90-4e50-9ca0-56aebe135492
X-Correlation-Id: qa-678202bf-93bd-4b9e-9bfe-5fca508e0797
Content-Type: application/json

--- response: 503 in 29 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-678202bf-93bd-4b9e-9bfe-5fca508e0797
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-14a5e0471caa","correlationId":"qa-678202bf-93bd-4b9e-9bfe-5fca508e0797"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-674a0bf3-3b3a-4d27-9f2c-5e2d2ab89b12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-674a0bf3-3b3a-4d27-9f2c-5e2d2ab89b12
Content-Type: application/json

--- request body ---
{"handle":"qa-e232ab622e8d","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-674a0bf3-3b3a-4d27-9f2c-5e2d2ab89b12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46ea659a-2844-411d-804b-caa3edf05ffd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29bb9e2a-02f2-41c5-8a31-e3deacc1a9fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29bb9e2a-02f2-41c5-8a31-e3deacc1a9fd
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29bb9e2a-02f2-41c5-8a31-e3deacc1a9fd
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
correlation: qa-34bedfa3-6030-44fa-bded-f872a95b9c6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34bedfa3-6030-44fa-bded-f872a95b9c6f
Content-Type: application/json

--- request body ---
{"handle":"qa-e232ab622e8d","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34bedfa3-6030-44fa-bded-f872a95b9c6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-34bedfa3-6030-44fa-bded-f872a95b9c6f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c09164f-6f54-4bed-9c67-7a8c72875adb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c09164f-6f54-4bed-9c67-7a8c72875adb
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c09164f-6f54-4bed-9c67-7a8c72875adb
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
correlation: qa-93b7d1cf-1b14-46c8-b09e-7283fb65bc0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93b7d1cf-1b14-46c8-b09e-7283fb65bc0f
Content-Type: application/json

--- request body ---
{"handle":"qa-14a5e0471caa","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93b7d1cf-1b14-46c8-b09e-7283fb65bc0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93b7d1cf-1b14-46c8-b09e-7283fb65bc0f"}
```
