# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-b0a3c34d-a6ac-4042-aad3-a55ece47ce72` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-6e5407b8-fec6-4866-8605-b3a81cad9367` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-4c803ce7-c948-49fd-b067-a1d51cc334d9` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-3559479e-6d61-49db-b76f-731a3e384fc0` |
| 5 | `POST /v1/auth/token` | 503 | 12 | `qa-c341db38-3374-407d-bb23-2aeb333adc02` |
| 6 | `POST /v1/auth/token` | 200 | 65 | `qa-c64ffc86-87c5-499a-ab7d-8cb6839958a6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-c771788c-a4eb-43f9-9f72-b9622046c98e` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-195eeca6-c08d-4491-a52e-132cf65295af` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-55a2ba8c-72b9-4cdc-9a67-d4a5888cfd1a` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-9adb258a-a2d1-4da4-b4a1-c219cae0268f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b0a3c34d-a6ac-4042-aad3-a55ece47ce72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0a3c34d-a6ac-4042-aad3-a55ece47ce72
Content-Type: application/json

--- request body ---
{"handle":"qa-f08644ba733b","displayName":"QA f08644ba733b","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0a3c34d-a6ac-4042-aad3-a55ece47ce72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-f08644ba733b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_09182a11-9ad4-42eb-a263-5c7e5a02b9c0","handle":"qa-f08644ba733b","displayName":"QA f08644ba733b","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.388214865Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6e5407b8-fec6-4866-8605-b3a81cad9367

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e5407b8-fec6-4866-8605-b3a81cad9367
Content-Type: application/json

--- request body ---
{"handle":"qa-46c257affdcc","displayName":"QA 46c257affdcc","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e5407b8-fec6-4866-8605-b3a81cad9367
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-46c257affdcc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9909564-4a12-44b0-8f76-70707c77910b","handle":"qa-46c257affdcc","displayName":"QA 46c257affdcc","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.419644191Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4c803ce7-c948-49fd-b067-a1d51cc334d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c803ce7-c948-49fd-b067-a1d51cc334d9
Content-Type: application/json

--- request body ---
{"handle":"qa-f08644ba733b","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c803ce7-c948-49fd-b067-a1d51cc334d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_09182a11-9ad4-42eb-a263-5c7e5a02b9c0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3559479e-6d61-49db-b76f-731a3e384fc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3559479e-6d61-49db-b76f-731a3e384fc0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-46c257affdcc","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-3559479e-6d61-49db-b76f-731a3e384fc0
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
Location: /v1/conversations/cnv_1b181fdf-c7e0-4e05-901e-084d8c3b0d70
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1b181fdf-c7e0-4e05-901e-084d8c3b0d70","subject":"Error contract","status":"open","region":"eu","participants":["qa-f08644ba733b","qa-46c257affdcc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.459021132Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c341db38-3374-407d-bb23-2aeb333adc02

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 89392ba2-2e53-48fc-8ebb-8458ae07066b
X-Correlation-Id: qa-c341db38-3374-407d-bb23-2aeb333adc02
Content-Type: application/json

--- request body ---
{"handle":"qa-f08644ba733b","password":"****"}

--- response: 503 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c341db38-3374-407d-bb23-2aeb333adc02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-c341db38-3374-407d-bb23-2aeb333adc02"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c64ffc86-87c5-499a-ab7d-8cb6839958a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c64ffc86-87c5-499a-ab7d-8cb6839958a6
Content-Type: application/json

--- request body ---
{"handle":"qa-46c257affdcc","password":"****"}

--- response: 200 in 65 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-c64ffc86-87c5-499a-ab7d-8cb6839958a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9909564-4a12-44b0-8f76-70707c77910b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c771788c-a4eb-43f9-9f72-b9622046c98e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c771788c-a4eb-43f9-9f72-b9622046c98e
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c771788c-a4eb-43f9-9f72-b9622046c98e
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
correlation: qa-195eeca6-c08d-4491-a52e-132cf65295af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-195eeca6-c08d-4491-a52e-132cf65295af
Content-Type: application/json

--- request body ---
{"handle":"qa-46c257affdcc","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-195eeca6-c08d-4491-a52e-132cf65295af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-195eeca6-c08d-4491-a52e-132cf65295af"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55a2ba8c-72b9-4cdc-9a67-d4a5888cfd1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55a2ba8c-72b9-4cdc-9a67-d4a5888cfd1a
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55a2ba8c-72b9-4cdc-9a67-d4a5888cfd1a
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
correlation: qa-9adb258a-a2d1-4da4-b4a1-c219cae0268f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9adb258a-a2d1-4da4-b4a1-c219cae0268f
Content-Type: application/json

--- request body ---
{"handle":"qa-f08644ba733b","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9adb258a-a2d1-4da4-b4a1-c219cae0268f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9adb258a-a2d1-4da4-b4a1-c219cae0268f"}
```
