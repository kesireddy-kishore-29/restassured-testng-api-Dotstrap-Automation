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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-8fe1e8f7-6fcf-4419-b26f-8cab99142916` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-0dc1dd89-3209-44af-b2a3-ef339087e861` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-47964946-9974-484c-b098-c3b8cedea482` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-29863878-2466-4dd2-9357-93b60f318318` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 14 | `qa-90971eaf-a611-4e91-bb4f-df845da1470a` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-c21eb41e-aa99-4754-a497-23fe3a104957` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-6d2544d1-2c61-480d-88b8-5dc4a4d1e6a3` |
| 8 | `POST /v1/auth/token` | 401 | 41 | `qa-a8bdb151-a654-4fab-af0f-245a9a5e3f93` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-112c4d6a-ebf0-4f9c-8745-0161da35ad36` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-06c152e9-b64d-47e4-bf4a-ee3da68f7546` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8fe1e8f7-6fcf-4419-b26f-8cab99142916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fe1e8f7-6fcf-4419-b26f-8cab99142916
Content-Type: application/json

--- request body ---
{"handle":"qa-31f4d9608067","displayName":"QA 31f4d9608067","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fe1e8f7-6fcf-4419-b26f-8cab99142916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Location: /v1/accounts/qa-31f4d9608067
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8349a35d-26ce-4448-b3fc-2868e539cee9","handle":"qa-31f4d9608067","displayName":"QA 31f4d9608067","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.832517575Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0dc1dd89-3209-44af-b2a3-ef339087e861

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dc1dd89-3209-44af-b2a3-ef339087e861
Content-Type: application/json

--- request body ---
{"handle":"qa-8ffccaeebeb4","displayName":"QA 8ffccaeebeb4","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dc1dd89-3209-44af-b2a3-ef339087e861
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-8ffccaeebeb4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0d90158-fc11-4159-9463-7d9378bf1fd7","handle":"qa-8ffccaeebeb4","displayName":"QA 8ffccaeebeb4","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.877375427Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-47964946-9974-484c-b098-c3b8cedea482

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47964946-9974-484c-b098-c3b8cedea482
Content-Type: application/json

--- request body ---
{"handle":"qa-31f4d9608067","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-47964946-9974-484c-b098-c3b8cedea482
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8349a35d-26ce-4448-b3fc-2868e539cee9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-29863878-2466-4dd2-9357-93b60f318318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29863878-2466-4dd2-9357-93b60f318318
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8ffccaeebeb4","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-29863878-2466-4dd2-9357-93b60f318318
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
Location: /v1/conversations/cnv_70ef8c31-4514-492e-bbba-3a444d104a34
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_70ef8c31-4514-492e-bbba-3a444d104a34","subject":"Error contract","status":"open","region":"eu","participants":["qa-31f4d9608067","qa-8ffccaeebeb4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.946738594Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_70ef8c31-4514-492e-bbba-3a444d104a34/messages
correlation: qa-90971eaf-a611-4e91-bb4f-df845da1470a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 33c67168-6709-4890-b151-2d86d12817ae
X-Correlation-Id: qa-90971eaf-a611-4e91-bb4f-df845da1470a
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90971eaf-a611-4e91-bb4f-df845da1470a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_70ef8c31-4514-492e-bbba-3a444d104a34/messages","correlationId":"qa-90971eaf-a611-4e91-bb4f-df845da1470a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c21eb41e-aa99-4754-a497-23fe3a104957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c21eb41e-aa99-4754-a497-23fe3a104957
Content-Type: application/json

--- request body ---
{"handle":"qa-8ffccaeebeb4","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c21eb41e-aa99-4754-a497-23fe3a104957
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0d90158-fc11-4159-9463-7d9378bf1fd7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d2544d1-2c61-480d-88b8-5dc4a4d1e6a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d2544d1-2c61-480d-88b8-5dc4a4d1e6a3
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d2544d1-2c61-480d-88b8-5dc4a4d1e6a3
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
correlation: qa-a8bdb151-a654-4fab-af0f-245a9a5e3f93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8bdb151-a654-4fab-af0f-245a9a5e3f93
Content-Type: application/json

--- request body ---
{"handle":"qa-8ffccaeebeb4","password":"****"}

--- response: 401 in 41 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8bdb151-a654-4fab-af0f-245a9a5e3f93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8bdb151-a654-4fab-af0f-245a9a5e3f93"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-112c4d6a-ebf0-4f9c-8745-0161da35ad36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-112c4d6a-ebf0-4f9c-8745-0161da35ad36
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-112c4d6a-ebf0-4f9c-8745-0161da35ad36
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
correlation: qa-06c152e9-b64d-47e4-bf4a-ee3da68f7546

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06c152e9-b64d-47e4-bf4a-ee3da68f7546
Content-Type: application/json

--- request body ---
{"handle":"qa-31f4d9608067","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06c152e9-b64d-47e4-bf4a-ee3da68f7546
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-06c152e9-b64d-47e4-bf4a-ee3da68f7546"}
```
