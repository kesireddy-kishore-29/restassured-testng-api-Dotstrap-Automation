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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-d8a52a8f-7825-4177-b2a4-a85abbb89886` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-0326a9ee-bec6-464f-9d2c-1afb772aed56` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-a0eff5ee-b4a2-4f64-8118-89e4a8aa9291` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-a607390b-666e-456c-a4cb-8aac13c8fd81` |
| 5 | `DELETE /v1/accounts/me` | 503 | 15 | `qa-21d27ae6-f907-4b05-9304-3d8f5ed6b7cf` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-9fc8aef4-a329-4b17-8855-2047deaae4f8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-666f239b-10ea-4989-af14-9d6919878262` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-277424b2-31be-4913-b1b3-0004ec44897b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1699762c-2a65-4b47-b953-d66580428bd5` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-f7bf77dc-b504-4173-8a85-575101fae19b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d8a52a8f-7825-4177-b2a4-a85abbb89886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8a52a8f-7825-4177-b2a4-a85abbb89886
Content-Type: application/json

--- request body ---
{"handle":"qa-0c7dbf89b4d4","displayName":"QA 0c7dbf89b4d4","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8a52a8f-7825-4177-b2a4-a85abbb89886
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
Location: /v1/accounts/qa-0c7dbf89b4d4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_240871d9-e91c-45ca-8a6e-031beb6406d0","handle":"qa-0c7dbf89b4d4","displayName":"QA 0c7dbf89b4d4","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.533727777Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0326a9ee-bec6-464f-9d2c-1afb772aed56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0326a9ee-bec6-464f-9d2c-1afb772aed56
Content-Type: application/json

--- request body ---
{"handle":"qa-f38b829ee0ec","displayName":"QA f38b829ee0ec","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0326a9ee-bec6-464f-9d2c-1afb772aed56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-f38b829ee0ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b0dc4dc-9ef9-4635-9386-65a8b868a3c4","handle":"qa-f38b829ee0ec","displayName":"QA f38b829ee0ec","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.564559391Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a0eff5ee-b4a2-4f64-8118-89e4a8aa9291

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0eff5ee-b4a2-4f64-8118-89e4a8aa9291
Content-Type: application/json

--- request body ---
{"handle":"qa-0c7dbf89b4d4","password":"****"}

--- response: 200 in 43 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0eff5ee-b4a2-4f64-8118-89e4a8aa9291
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_240871d9-e91c-45ca-8a6e-031beb6406d0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a607390b-666e-456c-a4cb-8aac13c8fd81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a607390b-666e-456c-a4cb-8aac13c8fd81
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f38b829ee0ec","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a607390b-666e-456c-a4cb-8aac13c8fd81
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
Location: /v1/conversations/cnv_d77c24d1-3cda-4764-b2d2-cc4bc5ab45a9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d77c24d1-3cda-4764-b2d2-cc4bc5ab45a9","subject":"Error contract","status":"open","region":"eu","participants":["qa-0c7dbf89b4d4","qa-f38b829ee0ec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.635098657Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21d27ae6-f907-4b05-9304-3d8f5ed6b7cf

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 28a13f5d-1e98-4650-98f6-75e8f4e81086
X-Correlation-Id: qa-21d27ae6-f907-4b05-9304-3d8f5ed6b7cf
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21d27ae6-f907-4b05-9304-3d8f5ed6b7cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-21d27ae6-f907-4b05-9304-3d8f5ed6b7cf"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9fc8aef4-a329-4b17-8855-2047deaae4f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fc8aef4-a329-4b17-8855-2047deaae4f8
Content-Type: application/json

--- request body ---
{"handle":"qa-f38b829ee0ec","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fc8aef4-a329-4b17-8855-2047deaae4f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b0dc4dc-9ef9-4635-9386-65a8b868a3c4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-666f239b-10ea-4989-af14-9d6919878262

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666f239b-10ea-4989-af14-9d6919878262
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-666f239b-10ea-4989-af14-9d6919878262
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
correlation: qa-277424b2-31be-4913-b1b3-0004ec44897b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-277424b2-31be-4913-b1b3-0004ec44897b
Content-Type: application/json

--- request body ---
{"handle":"qa-f38b829ee0ec","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-277424b2-31be-4913-b1b3-0004ec44897b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-277424b2-31be-4913-b1b3-0004ec44897b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1699762c-2a65-4b47-b953-d66580428bd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1699762c-2a65-4b47-b953-d66580428bd5
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1699762c-2a65-4b47-b953-d66580428bd5
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
correlation: qa-f7bf77dc-b504-4173-8a85-575101fae19b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7bf77dc-b504-4173-8a85-575101fae19b
Content-Type: application/json

--- request body ---
{"handle":"qa-0c7dbf89b4d4","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7bf77dc-b504-4173-8a85-575101fae19b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7bf77dc-b504-4173-8a85-575101fae19b"}
```
