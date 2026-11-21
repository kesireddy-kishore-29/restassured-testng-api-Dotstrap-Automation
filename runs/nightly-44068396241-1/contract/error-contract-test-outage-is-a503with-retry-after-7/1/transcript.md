# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 68 | `qa-9429d2b2-4adb-407a-a2f1-baef43a71266` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-9aa61462-5eda-4956-9373-f811d102ee44` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-72e755d9-e0bf-416e-9a93-d6ad0d52b868` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-462d5377-ed08-4e50-9dc0-b855f566052b` |
| 5 | `GET /v1/conversations` | 503 | 19 | `qa-f1af9e4f-7396-47e1-b50b-8676bf99eb75` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-49081b7f-3628-426b-910f-0076008e863c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-76042e16-cae2-4148-abbc-615b245299cc` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-02bb8abf-208b-469b-8df9-93fce30f88a1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-4f0e4937-e313-4544-9e03-33cc76e8c714` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-3d57399d-a1e9-4324-b3e8-a8b657fa000b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9429d2b2-4adb-407a-a2f1-baef43a71266

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9429d2b2-4adb-407a-a2f1-baef43a71266
Content-Type: application/json

--- request body ---
{"handle":"qa-47870f698a4a","displayName":"QA 47870f698a4a","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-9429d2b2-4adb-407a-a2f1-baef43a71266
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-47870f698a4a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27dfd7ee-9f3a-4b16-a532-9ac90d437de2","handle":"qa-47870f698a4a","displayName":"QA 47870f698a4a","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.989720020Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9aa61462-5eda-4956-9373-f811d102ee44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aa61462-5eda-4956-9373-f811d102ee44
Content-Type: application/json

--- request body ---
{"handle":"qa-93d38df0ffe6","displayName":"QA 93d38df0ffe6","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aa61462-5eda-4956-9373-f811d102ee44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Location: /v1/accounts/qa-93d38df0ffe6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89c96008-16a4-447d-b6e9-1501160215f2","handle":"qa-93d38df0ffe6","displayName":"QA 93d38df0ffe6","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.038443829Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-72e755d9-e0bf-416e-9a93-d6ad0d52b868

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72e755d9-e0bf-416e-9a93-d6ad0d52b868
Content-Type: application/json

--- request body ---
{"handle":"qa-47870f698a4a","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-72e755d9-e0bf-416e-9a93-d6ad0d52b868
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27dfd7ee-9f3a-4b16-a532-9ac90d437de2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-462d5377-ed08-4e50-9dc0-b855f566052b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-462d5377-ed08-4e50-9dc0-b855f566052b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93d38df0ffe6","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-462d5377-ed08-4e50-9dc0-b855f566052b
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
Location: /v1/conversations/cnv_4460453b-b166-41eb-b26f-39c54195befe
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4460453b-b166-41eb-b26f-39c54195befe","subject":"Error contract","status":"open","region":"eu","participants":["qa-47870f698a4a","qa-93d38df0ffe6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.095332865Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-f1af9e4f-7396-47e1-b50b-8676bf99eb75

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 32b4b5be-6f9b-48fe-8b45-a75dae06e6d3
X-Correlation-Id: qa-f1af9e4f-7396-47e1-b50b-8676bf99eb75
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1af9e4f-7396-47e1-b50b-8676bf99eb75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-f1af9e4f-7396-47e1-b50b-8676bf99eb75"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-49081b7f-3628-426b-910f-0076008e863c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49081b7f-3628-426b-910f-0076008e863c
Content-Type: application/json

--- request body ---
{"handle":"qa-93d38df0ffe6","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-49081b7f-3628-426b-910f-0076008e863c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89c96008-16a4-447d-b6e9-1501160215f2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76042e16-cae2-4148-abbc-615b245299cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76042e16-cae2-4148-abbc-615b245299cc
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76042e16-cae2-4148-abbc-615b245299cc
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
correlation: qa-02bb8abf-208b-469b-8df9-93fce30f88a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02bb8abf-208b-469b-8df9-93fce30f88a1
Content-Type: application/json

--- request body ---
{"handle":"qa-93d38df0ffe6","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02bb8abf-208b-469b-8df9-93fce30f88a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02bb8abf-208b-469b-8df9-93fce30f88a1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f0e4937-e313-4544-9e03-33cc76e8c714

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f0e4937-e313-4544-9e03-33cc76e8c714
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f0e4937-e313-4544-9e03-33cc76e8c714
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
correlation: qa-3d57399d-a1e9-4324-b3e8-a8b657fa000b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d57399d-a1e9-4324-b3e8-a8b657fa000b
Content-Type: application/json

--- request body ---
{"handle":"qa-47870f698a4a","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d57399d-a1e9-4324-b3e8-a8b657fa000b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d57399d-a1e9-4324-b3e8-a8b657fa000b"}
```
