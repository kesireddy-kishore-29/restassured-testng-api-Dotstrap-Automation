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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-d146fb33-bdc2-4d4c-b7b3-26dd6c047469` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-685dabdf-582b-4ab7-a3e9-e23f7ddaef89` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-5604f9c5-4431-4a4a-b09c-ad27f0824b95` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-d6f1e383-f278-4e0a-8811-e15e2837465e` |
| 5 | `POST /v1/conversations` | 503 | 24 | `qa-ad99a93b-b4d8-4189-a0fc-ad526c8cefd6` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-b33f3101-2280-43b3-98f9-adf1c0e98cf2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-ef5d7499-6b1e-450b-81a0-a767a4dee9c7` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-8bb1861d-848c-4d1a-9bc8-ccce3555c892` |
| 9 | `DELETE /v1/accounts/me` | 204 | 49 | `qa-c783502f-a85f-4723-b45b-3d80ff1cb0a4` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-1ec37743-81c8-4469-95d1-faf072c884bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d146fb33-bdc2-4d4c-b7b3-26dd6c047469

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d146fb33-bdc2-4d4c-b7b3-26dd6c047469
Content-Type: application/json

--- request body ---
{"handle":"qa-07342abc9294","displayName":"QA 07342abc9294","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d146fb33-bdc2-4d4c-b7b3-26dd6c047469
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Location: /v1/accounts/qa-07342abc9294
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ca19806-1943-4730-831e-48aa7032b3f9","handle":"qa-07342abc9294","displayName":"QA 07342abc9294","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.363786039Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-685dabdf-582b-4ab7-a3e9-e23f7ddaef89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-685dabdf-582b-4ab7-a3e9-e23f7ddaef89
Content-Type: application/json

--- request body ---
{"handle":"qa-24dc94cc4047","displayName":"QA 24dc94cc4047","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-685dabdf-582b-4ab7-a3e9-e23f7ddaef89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-24dc94cc4047
X-Served-Region: eu
Content-Length: 181

{"id":"acc_593dced3-4deb-4deb-85fc-cf496c7c327f","handle":"qa-24dc94cc4047","displayName":"QA 24dc94cc4047","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.410604554Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5604f9c5-4431-4a4a-b09c-ad27f0824b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5604f9c5-4431-4a4a-b09c-ad27f0824b95
Content-Type: application/json

--- request body ---
{"handle":"qa-07342abc9294","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5604f9c5-4431-4a4a-b09c-ad27f0824b95
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ca19806-1943-4730-831e-48aa7032b3f9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d6f1e383-f278-4e0a-8811-e15e2837465e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6f1e383-f278-4e0a-8811-e15e2837465e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-24dc94cc4047","subject":"Error contract","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6f1e383-f278-4e0a-8811-e15e2837465e
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
Location: /v1/conversations/cnv_6637b02a-eff3-49ee-b3b4-49cd6d81e626
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6637b02a-eff3-49ee-b3b4-49cd6d81e626","subject":"Error contract","status":"open","region":"eu","participants":["qa-07342abc9294","qa-24dc94cc4047"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.517166951Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ad99a93b-b4d8-4189-a0fc-ad526c8cefd6

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b98694eb-c689-4eeb-9299-13c294acdd48
X-Correlation-Id: qa-ad99a93b-b4d8-4189-a0fc-ad526c8cefd6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-07342abc9294","subject":"Probe","message":"Hi"}

--- response: 503 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad99a93b-b4d8-4189-a0fc-ad526c8cefd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-ad99a93b-b4d8-4189-a0fc-ad526c8cefd6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b33f3101-2280-43b3-98f9-adf1c0e98cf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b33f3101-2280-43b3-98f9-adf1c0e98cf2
Content-Type: application/json

--- request body ---
{"handle":"qa-24dc94cc4047","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b33f3101-2280-43b3-98f9-adf1c0e98cf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_593dced3-4deb-4deb-85fc-cf496c7c327f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef5d7499-6b1e-450b-81a0-a767a4dee9c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef5d7499-6b1e-450b-81a0-a767a4dee9c7
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef5d7499-6b1e-450b-81a0-a767a4dee9c7
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
correlation: qa-8bb1861d-848c-4d1a-9bc8-ccce3555c892

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bb1861d-848c-4d1a-9bc8-ccce3555c892
Content-Type: application/json

--- request body ---
{"handle":"qa-24dc94cc4047","password":"****"}

--- response: 401 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bb1861d-848c-4d1a-9bc8-ccce3555c892
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bb1861d-848c-4d1a-9bc8-ccce3555c892"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c783502f-a85f-4723-b45b-3d80ff1cb0a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c783502f-a85f-4723-b45b-3d80ff1cb0a4
Content-Type: application/json

--- response: 204 in 49 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c783502f-a85f-4723-b45b-3d80ff1cb0a4
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
correlation: qa-1ec37743-81c8-4469-95d1-faf072c884bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ec37743-81c8-4469-95d1-faf072c884bf
Content-Type: application/json

--- request body ---
{"handle":"qa-07342abc9294","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ec37743-81c8-4469-95d1-faf072c884bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ec37743-81c8-4469-95d1-faf072c884bf"}
```
