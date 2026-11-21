# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-a7b9440e-a841-4077-9775-3d6a7b890a2e` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-a6e13835-3d9d-404f-b3c6-f070c1b3685a` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-8503ab5e-c9bb-4937-a313-9aa5f94dbf14` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-66f2f8a7-55e0-4c18-a21f-49ef78bb6815` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 9 | `qa-dcb3ddcd-bfb5-425d-b254-6774c5f2b259` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-ebe86a7e-8f1c-45e7-a1f5-3399aee69f23` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-44885930-b9fe-48be-b02c-329310f1a10f` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-f0230434-688e-4c24-9f2d-454014f7f156` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-813f6999-b7f5-4067-a669-29929f7499ce` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-f6cba518-ceaf-4689-96c0-1cd59f700fe1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a7b9440e-a841-4077-9775-3d6a7b890a2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7b9440e-a841-4077-9775-3d6a7b890a2e
Content-Type: application/json

--- request body ---
{"handle":"qa-66bb662a42e7","displayName":"QA 66bb662a42e7","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7b9440e-a841-4077-9775-3d6a7b890a2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Location: /v1/accounts/qa-66bb662a42e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_35a09b05-10f4-4632-ad08-7d036cf7736e","handle":"qa-66bb662a42e7","displayName":"QA 66bb662a42e7","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.801181116Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a6e13835-3d9d-404f-b3c6-f070c1b3685a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6e13835-3d9d-404f-b3c6-f070c1b3685a
Content-Type: application/json

--- request body ---
{"handle":"qa-c29c2f0fb47e","displayName":"QA c29c2f0fb47e","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6e13835-3d9d-404f-b3c6-f070c1b3685a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Location: /v1/accounts/qa-c29c2f0fb47e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b794480-bb49-49e6-8014-ccb0049301cc","handle":"qa-c29c2f0fb47e","displayName":"QA c29c2f0fb47e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.846031108Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8503ab5e-c9bb-4937-a313-9aa5f94dbf14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8503ab5e-c9bb-4937-a313-9aa5f94dbf14
Content-Type: application/json

--- request body ---
{"handle":"qa-66bb662a42e7","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8503ab5e-c9bb-4937-a313-9aa5f94dbf14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_35a09b05-10f4-4632-ad08-7d036cf7736e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-66f2f8a7-55e0-4c18-a21f-49ef78bb6815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66f2f8a7-55e0-4c18-a21f-49ef78bb6815
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c29c2f0fb47e","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-66f2f8a7-55e0-4c18-a21f-49ef78bb6815
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
Location: /v1/conversations/cnv_ebd67368-2c15-4686-88e5-f33f10938eb2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ebd67368-2c15-4686-88e5-f33f10938eb2","subject":"Error contract","status":"open","region":"eu","participants":["qa-66bb662a42e7","qa-c29c2f0fb47e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.900277442Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ebd67368-2c15-4686-88e5-f33f10938eb2/close
correlation: qa-dcb3ddcd-bfb5-425d-b254-6774c5f2b259

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7f0a0e42-e278-422f-9a6a-5d3bbbdc5db2
X-Correlation-Id: qa-dcb3ddcd-bfb5-425d-b254-6774c5f2b259
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dcb3ddcd-bfb5-425d-b254-6774c5f2b259
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ebd67368-2c15-4686-88e5-f33f10938eb2/close","correlationId":"qa-dcb3ddcd-bfb5-425d-b254-6774c5f2b259"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ebe86a7e-8f1c-45e7-a1f5-3399aee69f23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebe86a7e-8f1c-45e7-a1f5-3399aee69f23
Content-Type: application/json

--- request body ---
{"handle":"qa-c29c2f0fb47e","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebe86a7e-8f1c-45e7-a1f5-3399aee69f23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b794480-bb49-49e6-8014-ccb0049301cc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-44885930-b9fe-48be-b02c-329310f1a10f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44885930-b9fe-48be-b02c-329310f1a10f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-44885930-b9fe-48be-b02c-329310f1a10f
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
correlation: qa-f0230434-688e-4c24-9f2d-454014f7f156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0230434-688e-4c24-9f2d-454014f7f156
Content-Type: application/json

--- request body ---
{"handle":"qa-c29c2f0fb47e","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0230434-688e-4c24-9f2d-454014f7f156
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f0230434-688e-4c24-9f2d-454014f7f156"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-813f6999-b7f5-4067-a669-29929f7499ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-813f6999-b7f5-4067-a669-29929f7499ce
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-813f6999-b7f5-4067-a669-29929f7499ce
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
correlation: qa-f6cba518-ceaf-4689-96c0-1cd59f700fe1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6cba518-ceaf-4689-96c0-1cd59f700fe1
Content-Type: application/json

--- request body ---
{"handle":"qa-66bb662a42e7","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6cba518-ceaf-4689-96c0-1cd59f700fe1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6cba518-ceaf-4689-96c0-1cd59f700fe1"}
```
