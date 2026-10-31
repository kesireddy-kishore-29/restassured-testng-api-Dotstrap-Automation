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
| 1 | `POST /v1/accounts` | 201 | 71 | `qa-9403262a-66c4-4df4-ac02-8f106cda37ab` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-59e7720b-2e19-4f07-b7ab-ac13870e3c41` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-34a1003b-a737-420b-8cbd-4076cf5d2074` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-7e78a82e-986c-470b-8dab-7ffe1d68a2aa` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 24 | `qa-2980dcca-e18a-4a37-8cb9-a9383f576dc8` |
| 6 | `POST /v1/auth/token` | 200 | 56 | `qa-a34d451e-56cc-4195-9ed5-4a52472eda30` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-6651fafe-6c93-49fa-be43-672405b6242e` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-75d8d326-1fab-48e4-80ee-ccc8d38b5464` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-3edd5d85-22d2-4dd8-a837-1314ce2c3aa1` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-bd97d413-9ca1-4de7-8e32-05e4b33aeb89` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9403262a-66c4-4df4-ac02-8f106cda37ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9403262a-66c4-4df4-ac02-8f106cda37ab
Content-Type: application/json

--- request body ---
{"handle":"qa-78301e6b4ac2","displayName":"QA 78301e6b4ac2","password":"****","region":"eu"}

--- response: 201 in 71 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9403262a-66c4-4df4-ac02-8f106cda37ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-78301e6b4ac2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8365202-27cc-4e54-ab18-5d4e6b618f58","handle":"qa-78301e6b4ac2","displayName":"QA 78301e6b4ac2","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.472574569Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-59e7720b-2e19-4f07-b7ab-ac13870e3c41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59e7720b-2e19-4f07-b7ab-ac13870e3c41
Content-Type: application/json

--- request body ---
{"handle":"qa-f5d90c3e4b30","displayName":"QA f5d90c3e4b30","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-59e7720b-2e19-4f07-b7ab-ac13870e3c41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 7
Location: /v1/accounts/qa-f5d90c3e4b30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d89007f3-63a7-484f-8d3f-257c3c08b646","handle":"qa-f5d90c3e4b30","displayName":"QA f5d90c3e4b30","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.541995627Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-34a1003b-a737-420b-8cbd-4076cf5d2074

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34a1003b-a737-420b-8cbd-4076cf5d2074
Content-Type: application/json

--- request body ---
{"handle":"qa-78301e6b4ac2","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-34a1003b-a737-420b-8cbd-4076cf5d2074
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8365202-27cc-4e54-ab18-5d4e6b618f58"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7e78a82e-986c-470b-8dab-7ffe1d68a2aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e78a82e-986c-470b-8dab-7ffe1d68a2aa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f5d90c3e4b30","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e78a82e-986c-470b-8dab-7ffe1d68a2aa
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
Location: /v1/conversations/cnv_01ac17bb-6d2a-4bc4-99fa-53064af11a14
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_01ac17bb-6d2a-4bc4-99fa-53064af11a14","subject":"Error contract","status":"open","region":"eu","participants":["qa-78301e6b4ac2","qa-f5d90c3e4b30"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.638454591Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-78301e6b4ac2
correlation: qa-2980dcca-e18a-4a37-8cb9-a9383f576dc8

--- request headers ---
Accept: application/json
X-Fault-Key: 9ac5bfd5-edcf-4104-9870-55c4ad6c59b3
X-Fault: unavailable-once
X-Correlation-Id: qa-2980dcca-e18a-4a37-8cb9-a9383f576dc8
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2980dcca-e18a-4a37-8cb9-a9383f576dc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-78301e6b4ac2","correlationId":"qa-2980dcca-e18a-4a37-8cb9-a9383f576dc8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a34d451e-56cc-4195-9ed5-4a52472eda30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a34d451e-56cc-4195-9ed5-4a52472eda30
Content-Type: application/json

--- request body ---
{"handle":"qa-f5d90c3e4b30","password":"****"}

--- response: 200 in 56 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a34d451e-56cc-4195-9ed5-4a52472eda30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d89007f3-63a7-484f-8d3f-257c3c08b646"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6651fafe-6c93-49fa-be43-672405b6242e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6651fafe-6c93-49fa-be43-672405b6242e
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6651fafe-6c93-49fa-be43-672405b6242e
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
correlation: qa-75d8d326-1fab-48e4-80ee-ccc8d38b5464

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75d8d326-1fab-48e4-80ee-ccc8d38b5464
Content-Type: application/json

--- request body ---
{"handle":"qa-f5d90c3e4b30","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75d8d326-1fab-48e4-80ee-ccc8d38b5464
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75d8d326-1fab-48e4-80ee-ccc8d38b5464"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3edd5d85-22d2-4dd8-a837-1314ce2c3aa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3edd5d85-22d2-4dd8-a837-1314ce2c3aa1
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3edd5d85-22d2-4dd8-a837-1314ce2c3aa1
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
correlation: qa-bd97d413-9ca1-4de7-8e32-05e4b33aeb89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd97d413-9ca1-4de7-8e32-05e4b33aeb89
Content-Type: application/json

--- request body ---
{"handle":"qa-78301e6b4ac2","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd97d413-9ca1-4de7-8e32-05e4b33aeb89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd97d413-9ca1-4de7-8e32-05e4b33aeb89"}
```
