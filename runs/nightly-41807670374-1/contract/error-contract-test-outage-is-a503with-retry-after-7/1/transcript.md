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
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-114a564a-a425-4cac-89c9-04f4cb22f9f6` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-796acae4-1a32-4c80-a811-0bcff3618990` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-9849461d-dce3-48e6-98b5-42f7dc741d5d` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-fe4bcb98-91fe-48b6-9682-b59e517d1306` |
| 5 | `GET /v1/conversations` | 503 | 9 | `qa-5d87d32a-8da3-4103-9ada-c17ab809b979` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-1852ed5d-3dc1-404e-84ca-25de00e2aee3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-8b43d936-5316-4f13-a73f-ea4a3a99f64b` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-94583453-b7e5-4120-b913-8f57ab9a4689` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-08a0957e-a152-44b3-9346-9f81ee8d78e3` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-00a3578d-31bf-4130-bfbd-bcc70fbe21e7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-114a564a-a425-4cac-89c9-04f4cb22f9f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-114a564a-a425-4cac-89c9-04f4cb22f9f6
Content-Type: application/json

--- request body ---
{"handle":"qa-2575f55fdd12","displayName":"QA 2575f55fdd12","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-114a564a-a425-4cac-89c9-04f4cb22f9f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Location: /v1/accounts/qa-2575f55fdd12
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b79ecf2-55b7-45e6-96d7-6f765459bbe4","handle":"qa-2575f55fdd12","displayName":"QA 2575f55fdd12","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.410217627Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-796acae4-1a32-4c80-a811-0bcff3618990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-796acae4-1a32-4c80-a811-0bcff3618990
Content-Type: application/json

--- request body ---
{"handle":"qa-8f618ec32ac8","displayName":"QA 8f618ec32ac8","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-796acae4-1a32-4c80-a811-0bcff3618990
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Location: /v1/accounts/qa-8f618ec32ac8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6322723-aad6-4555-b906-37de8310073e","handle":"qa-8f618ec32ac8","displayName":"QA 8f618ec32ac8","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.445301340Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9849461d-dce3-48e6-98b5-42f7dc741d5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9849461d-dce3-48e6-98b5-42f7dc741d5d
Content-Type: application/json

--- request body ---
{"handle":"qa-2575f55fdd12","password":"****"}

--- response: 200 in 45 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9849461d-dce3-48e6-98b5-42f7dc741d5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b79ecf2-55b7-45e6-96d7-6f765459bbe4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fe4bcb98-91fe-48b6-9682-b59e517d1306

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe4bcb98-91fe-48b6-9682-b59e517d1306
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8f618ec32ac8","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe4bcb98-91fe-48b6-9682-b59e517d1306
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
Location: /v1/conversations/cnv_f0d401c1-771d-4667-8a0a-af5f702a8255
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f0d401c1-771d-4667-8a0a-af5f702a8255","subject":"Error contract","status":"open","region":"eu","participants":["qa-2575f55fdd12","qa-8f618ec32ac8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.550678268Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-5d87d32a-8da3-4103-9ada-c17ab809b979

--- request headers ---
Accept: application/json
X-Fault-Key: 04fc6ca7-1e97-4f8f-8fa6-d4778c1b3e4f
X-Fault: unavailable-once
X-Correlation-Id: qa-5d87d32a-8da3-4103-9ada-c17ab809b979
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d87d32a-8da3-4103-9ada-c17ab809b979
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-5d87d32a-8da3-4103-9ada-c17ab809b979"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1852ed5d-3dc1-404e-84ca-25de00e2aee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1852ed5d-3dc1-404e-84ca-25de00e2aee3
Content-Type: application/json

--- request body ---
{"handle":"qa-8f618ec32ac8","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1852ed5d-3dc1-404e-84ca-25de00e2aee3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6322723-aad6-4555-b906-37de8310073e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b43d936-5316-4f13-a73f-ea4a3a99f64b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b43d936-5316-4f13-a73f-ea4a3a99f64b
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b43d936-5316-4f13-a73f-ea4a3a99f64b
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
correlation: qa-94583453-b7e5-4120-b913-8f57ab9a4689

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94583453-b7e5-4120-b913-8f57ab9a4689
Content-Type: application/json

--- request body ---
{"handle":"qa-8f618ec32ac8","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94583453-b7e5-4120-b913-8f57ab9a4689
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94583453-b7e5-4120-b913-8f57ab9a4689"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08a0957e-a152-44b3-9346-9f81ee8d78e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a0957e-a152-44b3-9346-9f81ee8d78e3
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08a0957e-a152-44b3-9346-9f81ee8d78e3
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
correlation: qa-00a3578d-31bf-4130-bfbd-bcc70fbe21e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00a3578d-31bf-4130-bfbd-bcc70fbe21e7
Content-Type: application/json

--- request body ---
{"handle":"qa-2575f55fdd12","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00a3578d-31bf-4130-bfbd-bcc70fbe21e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-00a3578d-31bf-4130-bfbd-bcc70fbe21e7"}
```
