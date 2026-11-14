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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-f74d79ab-1c12-4edb-935a-e05b022290fa` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-981f29ee-18bc-4421-8940-7e296e1da769` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-f591381f-4451-4609-b224-ace99b453580` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-c73ac3c0-78cf-45ad-bc62-0de524ea61fb` |
| 5 | `GET /v1/conversations` | 503 | 31 | `qa-c394ef10-ab90-4cd2-b81e-a6031823f27b` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-3d07cfcd-6b47-4bec-816d-5268047693c8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c83566b8-a28d-4d12-b097-dff29d142c79` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-8383c0fd-d8f5-4fe6-9843-2fdaa306a158` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-58e252fd-a57d-4746-bca0-4424670eb963` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-9053902e-00a1-43ca-9576-20f5b720c91c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f74d79ab-1c12-4edb-935a-e05b022290fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f74d79ab-1c12-4edb-935a-e05b022290fa
Content-Type: application/json

--- request body ---
{"handle":"qa-e5a535d27eb2","displayName":"QA e5a535d27eb2","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f74d79ab-1c12-4edb-935a-e05b022290fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-e5a535d27eb2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3267f3a4-8311-44ea-90a9-67a01643f2dc","handle":"qa-e5a535d27eb2","displayName":"QA e5a535d27eb2","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.066981431Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-981f29ee-18bc-4421-8940-7e296e1da769

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-981f29ee-18bc-4421-8940-7e296e1da769
Content-Type: application/json

--- request body ---
{"handle":"qa-bedc2b3f3394","displayName":"QA bedc2b3f3394","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-981f29ee-18bc-4421-8940-7e296e1da769
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
Location: /v1/accounts/qa-bedc2b3f3394
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9534c1ef-368f-4aec-ae53-fdfbf24a75c9","handle":"qa-bedc2b3f3394","displayName":"QA bedc2b3f3394","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.121872077Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f591381f-4451-4609-b224-ace99b453580

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f591381f-4451-4609-b224-ace99b453580
Content-Type: application/json

--- request body ---
{"handle":"qa-e5a535d27eb2","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f591381f-4451-4609-b224-ace99b453580
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3267f3a4-8311-44ea-90a9-67a01643f2dc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c73ac3c0-78cf-45ad-bc62-0de524ea61fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c73ac3c0-78cf-45ad-bc62-0de524ea61fb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bedc2b3f3394","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c73ac3c0-78cf-45ad-bc62-0de524ea61fb
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
Location: /v1/conversations/cnv_e48db6ea-82c7-4428-852f-cd2da5fd28d3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e48db6ea-82c7-4428-852f-cd2da5fd28d3","subject":"Error contract","status":"open","region":"eu","participants":["qa-e5a535d27eb2","qa-bedc2b3f3394"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.207587364Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-c394ef10-ab90-4cd2-b81e-a6031823f27b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 133a21f2-406d-41cd-bd23-314cf834180d
X-Correlation-Id: qa-c394ef10-ab90-4cd2-b81e-a6031823f27b
Content-Type: application/json

--- response: 503 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c394ef10-ab90-4cd2-b81e-a6031823f27b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-c394ef10-ab90-4cd2-b81e-a6031823f27b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3d07cfcd-6b47-4bec-816d-5268047693c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d07cfcd-6b47-4bec-816d-5268047693c8
Content-Type: application/json

--- request body ---
{"handle":"qa-bedc2b3f3394","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d07cfcd-6b47-4bec-816d-5268047693c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9534c1ef-368f-4aec-ae53-fdfbf24a75c9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c83566b8-a28d-4d12-b097-dff29d142c79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c83566b8-a28d-4d12-b097-dff29d142c79
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c83566b8-a28d-4d12-b097-dff29d142c79
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
correlation: qa-8383c0fd-d8f5-4fe6-9843-2fdaa306a158

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8383c0fd-d8f5-4fe6-9843-2fdaa306a158
Content-Type: application/json

--- request body ---
{"handle":"qa-bedc2b3f3394","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8383c0fd-d8f5-4fe6-9843-2fdaa306a158
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8383c0fd-d8f5-4fe6-9843-2fdaa306a158"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58e252fd-a57d-4746-bca0-4424670eb963

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58e252fd-a57d-4746-bca0-4424670eb963
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58e252fd-a57d-4746-bca0-4424670eb963
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
correlation: qa-9053902e-00a1-43ca-9576-20f5b720c91c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9053902e-00a1-43ca-9576-20f5b720c91c
Content-Type: application/json

--- request body ---
{"handle":"qa-e5a535d27eb2","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9053902e-00a1-43ca-9576-20f5b720c91c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9053902e-00a1-43ca-9576-20f5b720c91c"}
```
