# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-7860edef-a8e4-4a59-b332-d0de951c82a5` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-4b99319c-b630-442f-b0ea-a42ace50bc2e` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-e0827d3c-13a0-4990-9364-c33321779dcc` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-cf5772b0-53c7-4f9a-9c3b-a684b608c50e` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 12 | `qa-336e4a0f-6f33-473e-bf0f-bcfae3dc44c9` |
| 6 | `POST /v1/auth/token` | 200 | 69 | `qa-812bc22c-7476-43fb-a80e-a52f146c9b46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-f1e225e4-4266-430a-ad9c-1ab1e3240960` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-c5adfe4c-2d04-4ab9-9d8a-3a85710b7491` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a0538ee9-cd0c-47b7-a035-ed53416599c4` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-11389d6c-5b26-417e-b61f-7f0ec0f26efc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7860edef-a8e4-4a59-b332-d0de951c82a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7860edef-a8e4-4a59-b332-d0de951c82a5
Content-Type: application/json

--- request body ---
{"handle":"qa-31d9f512372f","displayName":"QA 31d9f512372f","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7860edef-a8e4-4a59-b332-d0de951c82a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Location: /v1/accounts/qa-31d9f512372f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_904cc55a-4574-45e4-8f24-ab339ef63e07","handle":"qa-31d9f512372f","displayName":"QA 31d9f512372f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.931882116Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4b99319c-b630-442f-b0ea-a42ace50bc2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b99319c-b630-442f-b0ea-a42ace50bc2e
Content-Type: application/json

--- request body ---
{"handle":"qa-04443bbe64b7","displayName":"QA 04443bbe64b7","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b99319c-b630-442f-b0ea-a42ace50bc2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Location: /v1/accounts/qa-04443bbe64b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_772cfd4a-faa0-4464-9435-7b582c5ba7bd","handle":"qa-04443bbe64b7","displayName":"QA 04443bbe64b7","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.975479552Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e0827d3c-13a0-4990-9364-c33321779dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0827d3c-13a0-4990-9364-c33321779dcc
Content-Type: application/json

--- request body ---
{"handle":"qa-31d9f512372f","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0827d3c-13a0-4990-9364-c33321779dcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_904cc55a-4574-45e4-8f24-ab339ef63e07"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cf5772b0-53c7-4f9a-9c3b-a684b608c50e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf5772b0-53c7-4f9a-9c3b-a684b608c50e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-04443bbe64b7","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf5772b0-53c7-4f9a-9c3b-a684b608c50e
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
Location: /v1/conversations/cnv_1336f21e-d661-4678-8a20-bc5e64e077c2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1336f21e-d661-4678-8a20-bc5e64e077c2","subject":"Error contract","status":"open","region":"eu","participants":["qa-31d9f512372f","qa-04443bbe64b7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.055666435Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1336f21e-d661-4678-8a20-bc5e64e077c2/read
correlation: qa-336e4a0f-6f33-473e-bf0f-bcfae3dc44c9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ef81fb57-7c4b-4cbe-82cb-9bfd2d8f4434
X-Correlation-Id: qa-336e4a0f-6f33-473e-bf0f-bcfae3dc44c9
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-336e4a0f-6f33-473e-bf0f-bcfae3dc44c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_1336f21e-d661-4678-8a20-bc5e64e077c2/read","correlationId":"qa-336e4a0f-6f33-473e-bf0f-bcfae3dc44c9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-812bc22c-7476-43fb-a80e-a52f146c9b46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-812bc22c-7476-43fb-a80e-a52f146c9b46
Content-Type: application/json

--- request body ---
{"handle":"qa-04443bbe64b7","password":"****"}

--- response: 200 in 69 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-812bc22c-7476-43fb-a80e-a52f146c9b46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_772cfd4a-faa0-4464-9435-7b582c5ba7bd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1e225e4-4266-430a-ad9c-1ab1e3240960

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1e225e4-4266-430a-ad9c-1ab1e3240960
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1e225e4-4266-430a-ad9c-1ab1e3240960
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
correlation: qa-c5adfe4c-2d04-4ab9-9d8a-3a85710b7491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5adfe4c-2d04-4ab9-9d8a-3a85710b7491
Content-Type: application/json

--- request body ---
{"handle":"qa-04443bbe64b7","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5adfe4c-2d04-4ab9-9d8a-3a85710b7491
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5adfe4c-2d04-4ab9-9d8a-3a85710b7491"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0538ee9-cd0c-47b7-a035-ed53416599c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0538ee9-cd0c-47b7-a035-ed53416599c4
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0538ee9-cd0c-47b7-a035-ed53416599c4
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
correlation: qa-11389d6c-5b26-417e-b61f-7f0ec0f26efc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11389d6c-5b26-417e-b61f-7f0ec0f26efc
Content-Type: application/json

--- request body ---
{"handle":"qa-31d9f512372f","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11389d6c-5b26-417e-b61f-7f0ec0f26efc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-11389d6c-5b26-417e-b61f-7f0ec0f26efc"}
```
