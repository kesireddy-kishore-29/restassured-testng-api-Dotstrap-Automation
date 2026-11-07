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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-f1360737-511b-4761-aed8-155140f7b13b` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-352b8f63-41e4-48ba-ab86-e471507b2e95` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-30635766-3972-48cd-b6ae-511d8f70bf33` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-df315fed-9435-4953-a36b-5bc897ed7965` |
| 5 | `POST /v1/conversations` | 503 | 15 | `qa-f1c36e59-6427-4575-927e-af97e293c435` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-780a9610-8b47-465e-8f54-27e7d16f45cb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e4f545a8-11fe-4b9b-953d-39955bfadac5` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-2154d94e-7748-48c8-9ba6-3b8a34706d23` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d98faa5a-327f-448a-88d2-b51ebd72aa0f` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-a66b823c-5f33-4057-8fd2-7640657c4d42` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1360737-511b-4761-aed8-155140f7b13b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1360737-511b-4761-aed8-155140f7b13b
Content-Type: application/json

--- request body ---
{"handle":"qa-9844ac76c413","displayName":"QA 9844ac76c413","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1360737-511b-4761-aed8-155140f7b13b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Location: /v1/accounts/qa-9844ac76c413
X-Served-Region: eu
Content-Length: 181

{"id":"acc_73fdc6f7-4070-424e-8ef4-5af7ec6a9e9e","handle":"qa-9844ac76c413","displayName":"QA 9844ac76c413","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.408575639Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-352b8f63-41e4-48ba-ab86-e471507b2e95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-352b8f63-41e4-48ba-ab86-e471507b2e95
Content-Type: application/json

--- request body ---
{"handle":"qa-7b7eae49c980","displayName":"QA 7b7eae49c980","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-352b8f63-41e4-48ba-ab86-e471507b2e95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 9
Location: /v1/accounts/qa-7b7eae49c980
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f010086c-36d0-45d4-9e7e-eecfa8164f43","handle":"qa-7b7eae49c980","displayName":"QA 7b7eae49c980","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.483904293Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-30635766-3972-48cd-b6ae-511d8f70bf33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30635766-3972-48cd-b6ae-511d8f70bf33
Content-Type: application/json

--- request body ---
{"handle":"qa-9844ac76c413","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-30635766-3972-48cd-b6ae-511d8f70bf33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_73fdc6f7-4070-424e-8ef4-5af7ec6a9e9e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-df315fed-9435-4953-a36b-5bc897ed7965

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df315fed-9435-4953-a36b-5bc897ed7965
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7b7eae49c980","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-df315fed-9435-4953-a36b-5bc897ed7965
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
Location: /v1/conversations/cnv_1a5971d3-6cb9-43a9-b9ba-29a08389fc8f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1a5971d3-6cb9-43a9-b9ba-29a08389fc8f","subject":"Error contract","status":"open","region":"eu","participants":["qa-9844ac76c413","qa-7b7eae49c980"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.539491830Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f1c36e59-6427-4575-927e-af97e293c435

--- request headers ---
Accept: application/json
X-Fault-Key: e7e5c40c-f779-447e-8f10-b44badaf5d58
X-Fault: unavailable-once
X-Correlation-Id: qa-f1c36e59-6427-4575-927e-af97e293c435
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9844ac76c413","subject":"Probe","message":"Hi"}

--- response: 503 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1c36e59-6427-4575-927e-af97e293c435
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-f1c36e59-6427-4575-927e-af97e293c435"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-780a9610-8b47-465e-8f54-27e7d16f45cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-780a9610-8b47-465e-8f54-27e7d16f45cb
Content-Type: application/json

--- request body ---
{"handle":"qa-7b7eae49c980","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-780a9610-8b47-465e-8f54-27e7d16f45cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f010086c-36d0-45d4-9e7e-eecfa8164f43"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e4f545a8-11fe-4b9b-953d-39955bfadac5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4f545a8-11fe-4b9b-953d-39955bfadac5
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e4f545a8-11fe-4b9b-953d-39955bfadac5
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
correlation: qa-2154d94e-7748-48c8-9ba6-3b8a34706d23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2154d94e-7748-48c8-9ba6-3b8a34706d23
Content-Type: application/json

--- request body ---
{"handle":"qa-7b7eae49c980","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2154d94e-7748-48c8-9ba6-3b8a34706d23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2154d94e-7748-48c8-9ba6-3b8a34706d23"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d98faa5a-327f-448a-88d2-b51ebd72aa0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d98faa5a-327f-448a-88d2-b51ebd72aa0f
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d98faa5a-327f-448a-88d2-b51ebd72aa0f
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
correlation: qa-a66b823c-5f33-4057-8fd2-7640657c4d42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a66b823c-5f33-4057-8fd2-7640657c4d42
Content-Type: application/json

--- request body ---
{"handle":"qa-9844ac76c413","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a66b823c-5f33-4057-8fd2-7640657c4d42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a66b823c-5f33-4057-8fd2-7640657c4d42"}
```
